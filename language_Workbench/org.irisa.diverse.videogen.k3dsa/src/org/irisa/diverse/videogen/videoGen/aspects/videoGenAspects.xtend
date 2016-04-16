package org.irisa.diverse.videogen.videoGen.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.io.File
import java.io.FileWriter
import java.util.HashMap
import java.util.List
import java.util.Map
import org.irisa.diverse.videogen.transformations.VideoGenTransform
import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper
import org.irisa.diverse.videogen.transformations.utils.DistributedRandomNumberGenerator
import org.irisa.diverse.videogen.videoGen.Alternatives
import org.irisa.diverse.videogen.videoGen.Mandatory
import org.irisa.diverse.videogen.videoGen.Optional
import org.irisa.diverse.videogen.videoGen.Sequence
import org.irisa.diverse.videogen.videoGen.Video
import org.irisa.diverse.videogen.videoGen.VideoGen
import org.irisa.diverse.videogen.videoGen.aspects.exceptions.ConstraintsFailed
import org.irisa.diverse.videogen.videoGen.aspects.exceptions.ConstraintsType

import static extension org.irisa.diverse.videogen.videoGen.aspects.SequenceAspect.*
import static extension org.irisa.diverse.videogen.videoGen.aspects.TransitionAspect.*
import static extension org.irisa.diverse.videogen.videoGen.aspects.VideoAspect.*
import org.irisa.diverse.videogen.videoGen.Delay
import org.irisa.diverse.videogen.videoGen.Transition
import org.irisa.diverse.videogen.videoGen.Initialize
import org.irisa.diverse.videogen.videoGen.Generate

@Aspect(className=VideoGen)
class VideoGenAspect {

	private long nanotimeStart = 0
	private long nanotimeEnd = 0

	@Main
	def void main() {
		_self.execute
	}
	
	@Step
	def public void updateConstraints() {
		// Variante initialization
		val variantesVisitor = new VideoGenVarianteVisitor()
		variantesVisitor.visit(_self)
		_self.variantes = variantesVisitor.variantes
		println("Variantes => " + _self.variantes)
		
		// Duration initialization
		val durationVisitor = new VideoGenDurationVisitor(false)
		durationVisitor.visit(_self)
		// Constraints initialization
		_self.minDurationConstraint = durationVisitor.minDuration
		_self.maxDurationConstraint = durationVisitor.maxDuration
		println("Min duration => " + _self.minDurationConstraint)
		println("Max duration => " + _self.maxDurationConstraint)
	}
	
	@Step
	def public void setup() {
		val start = System.nanoTime
		// Setup initialization
		new VideoGenSetupVisitor().visit(_self)
		
		val stop = System.nanoTime
		println("#### VideoGen, time to setup " + (stop - start))
	}
	
	@InitializeModel
	def public void initializeModel(List<String> args){
		_self.setup
		_self.updateConstraints
	}
	
	def public void execute() {
		_self.nanotimeStart = System.nanoTime
		// Then process each sequences
		VideoGenHelper.getInitialize(_self).execute(_self)
	}	
		/**
	 * Start the computation (model transformation) of all selected video to create the final sequence (PlayList format)
	 * 
	 * @see : ffmpeg
	 */
	def public void compute() {
		val videos = new HashMap
		println("##### VideoGen '" + _self.name + "' start computation.")
		
		// Constraints checking
		val durationVisitor = new VideoGenDurationVisitor(true)
		durationVisitor.visit(_self)
		if (durationVisitor.maxDuration < _self.minDurationConstraint) {
			throw new ConstraintsFailed(ConstraintsType.MIN_DURATION, true)
		}
		if (durationVisitor.maxDuration > _self.maxDurationConstraint) {
			throw new ConstraintsFailed(ConstraintsType.MAX_DURATION, true)
		}
		
		println("##### Videos computation result in playlist format : ")
		//TODO: re-implement the initial IDM project model transformation. See master branch package 'fr.nemomen.utils'.
		VideoGenHelper.allSelectedVideos(_self).forEach[video |
			println("\t" + video.name + ": " + video.url)
			videos.put(video.name, true)
		]
		// TODO: Manage model transformation here
		val content = VideoGenTransform.toM3U(_self, false, videos)
		println(content)
		
		val playlist = File.createTempFile(Long.toString(System.nanoTime()), "-temp.m3u")
		val writer = new FileWriter(playlist)
		writer.write(content)
		writer.flush
		writer.close
		val p = new ProcessBuilder(
			"vlc",
			"--playlist-autostart",
			"--playlist-tree",
			"--no-overlay",
			playlist.toPath.toString)
		p.start()
		_self.nanotimeEnd = System.nanoTime
		println("#### VideoGen, time to execute " + (_self.nanotimeEnd - _self.nanotimeStart))
		_self.nanotimeStart = System.nanoTime
	}
}

@Aspect(className=Transition)
abstract class TransitionAspect {

	public VideoGen videoGen = null;
	public Boolean done = false
	public Boolean callnextTransition = true
	
	/**
	 * Call the sequence processor. Need to be overridden by a inherited class
	 * Be careful to call this super method at the end of the override call.
	 * 	cf: _self.super_process() (kermeta style)
	 * 
	 */
	@Step
	def public void execute(VideoGen videoGen) {
		// If this sequence has already been done, do nothing at all
		if (!_self.done) {
			// Call the next sequence in all case
			if (_self.nextTransition !== null) {
				//Don't forget to reset current state
				_self.done = true;
				// Before calling next sequence
				if (_self.callnextTransition) {
					_self.nextTransition.execute(videoGen)	
				}
			}
		}
	}
}


@Aspect(className=Sequence)
abstract class SequenceAspect extends TransitionAspect {
	
	@OverrideAspectMethod
	def public void execute(VideoGen videoGen) {
		_self.super_execute(videoGen)
	}
}

@Aspect(className=Alternatives)
class AlternativesAspect extends SequenceAspect {
	
	
	/**
	 * Return a hashmap with corrected probabilities for an Alternatives instance.
	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def static Map<String, Integer> checkProbabilities() {
		val result = new HashMap<String, Integer>
		var totalProb = 0
		var totalOptions = 0
		for (option : _self.options) {
			if (option.probability == 0) {
				totalOptions++
			}
			totalProb += option.probability
			result.put(option.video.name, option.probability)
		}
		for (name : result.keySet) {
			if (result.get(name) == 0) {
				result.put(name, (100 - totalProb) / totalOptions)
			}
		}
		result
	}

	/**
 	 * Process options to find the selectable video
 	 * 
 	 */
	def private Video selectVideo() {

		val drng = new DistributedRandomNumberGenerator()
		val proba = _self.checkProbabilities()
		_self.options.map[video.name].forEach [ name |
			drng.addNumber(proba.keySet.toList.indexOf(name), proba.get(name))
		] 
		_self.options.get(drng.getDistributedRandomNumber()).video
	}

	@Step
	@OverrideAspectMethod
	def public void execute(VideoGen videoGen) {
		if (_self.active && !_self.done) {
			println("##### Alternatives '" + _self.name + "' is been processed.")
			_self.video = _self.selectVideo
			_self.video.select
			// Manage optional next sequence
			_self.options.forEach[option | 
				if (option.video == _self.video && option.nextTransition != null) {
					option.nextTransition.execute(videoGen)
					// Call of nextTransition.process will not be called in super
					_self.callnextTransition = false
				}
			]
		}
		_self.super_execute(videoGen)
	}
}

@Aspect(className=Mandatory)
class MandatoryAspect extends SequenceAspect {
	
	@Step
	@OverrideAspectMethod
	def public void execute(VideoGen videoGen) {
		if (_self.active && !_self.done) {
			println("##### Mandatory '" + _self.name + "' is been processed.")
			_self.video.select
		}
		_self.super_execute(videoGen)
	}
}

@Aspect(className=Optional)
class OptionalAspect extends SequenceAspect {
	
	/**
	 * Is this video is selectable or not ?
	 * applies 50% in case of undefined proba
	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def private Boolean isSelected() {

		var drng = new DistributedRandomNumberGenerator()

		var float proba

		proba = 50
		if (_self.probability != 0) {
			proba = _self.probability
		}
		drng.addNumber(1, proba)
		drng.addNumber(0, 100 - proba)

		drng.getDistributedRandomNumber() > 0
	}

	@Step
	@OverrideAspectMethod
	def public void execute(VideoGen videoGen) {
		if (_self.active && !_self.done) {
			println("##### Optional '" + _self.name + "' is been processed.")
			if (_self.isSelected()) {
				_self.video.select
			}
		}
		_self.super_execute(videoGen)
	}
}


@Aspect(className=Initialize)
class InitializeAspect extends TransitionAspect {
	
	@Step
	@OverrideAspectMethod
	def public void execute(VideoGen videoGen) {
		//VideoGenAspect.setup(videoGen)
		//VideoGenAspect.updateConstraints(videoGen)
		_self.super_execute(videoGen)
	}
	
}

@Aspect(className=Generate)
class GenerateAspect extends TransitionAspect {
		
	@OverrideAspectMethod
	def public void execute(VideoGen videoGen) {
		_self.compute(videoGen)
		_self.super_execute(videoGen)
	}
	/**
	 * Call VideogGen.compute() and wait for 1000 ms before the next turn
	 * 
	 * @see : ffmpeg
	 */
	@Step
	def public void compute(VideoGen videoGen) {
		VideoGenAspect.compute(videoGen)
	}
}

@Aspect(className=Video)
class VideoAspect {
	
	public Boolean selected = false
		
	/**
	 * Select this video and apply any of needed operations (conversion or rename for example)
	 * 
	 */
	@Step
	def public void select() {
		println("##### Video '" + _self.name + "' has been selected.")
		_self.selected = true
	}
}

@Aspect(className=Delay)
class DelayAspect extends TransitionAspect {
	
	@Step
	@OverrideAspectMethod
	def void execute(VideoGen videoGen) {
		try {
			Thread.sleep(_self.value)
		} catch (InterruptedException e) {
			e.printStackTrace()
		}
		_self.super_execute(videoGen)
	}
}