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
import org.irisa.diverse.videogen.transformations.VideoGenTransform
import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper
import org.irisa.diverse.videogen.transformations.utils.DistributedRandomNumberGenerator
import org.irisa.diverse.videogen.videoGen.Alternatives
import org.irisa.diverse.videogen.videoGen.Delay
import org.irisa.diverse.videogen.videoGen.Generate
import org.irisa.diverse.videogen.videoGen.Initialize
import org.irisa.diverse.videogen.videoGen.Mandatory
import org.irisa.diverse.videogen.videoGen.Optional
import org.irisa.diverse.videogen.videoGen.Sequence
import org.irisa.diverse.videogen.videoGen.Transition
import org.irisa.diverse.videogen.videoGen.Video
import org.irisa.diverse.videogen.videoGen.VideoGen
import java.util.logging.Logger
import java.util.logging.FileHandler
import java.util.logging.SimpleFormatter
import org.irisa.diverse.videogen.videoGen.aspects.visitors.VideoGenUserContraintsVisitor
import java.nio.file.Paths
import org.eclipse.core.resources.ResourcesPlugin
import org.irisa.diverse.videogen.transformations.helpers.SystemHelper
import java.nio.file.Path
import org.irisa.diverse.videogen.videoGen.aspects.visitors.VideoGenSetupVisitor
import org.irisa.diverse.videogen.videoGen.aspects.visitors.VideoGenVariantsVisitor
import org.irisa.diverse.videogen.videoGen.aspects.visitors.VideoGenContraintsMinMaxVisitor

@Aspect(className=VideoGen)
class VideoGenAspect {
	
	private VideoGenSetupVisitor setupVisitor = new VideoGenSetupVisitor()
	private VideoGenVariantsVisitor variantsVisitor = new VideoGenVariantsVisitor()
	private VideoGenContraintsMinMaxVisitor durationVisitor = new VideoGenContraintsMinMaxVisitor(false)
	private VideoGenUserContraintsVisitor userConstraintsVisitor = new VideoGenUserContraintsVisitor()
	private Boolean onceSetuped = false
	private long nanotimeStart = 0
	private long nanotimeEnd = 0
	protected static Logger log = Logger.getLogger("VideoGenAspect")
	private static Path workspacePath = Paths.get(ResourcesPlugin.workspace.root.projects.get(0).locationURI)
	private static Path logPath = Paths.get(workspacePath + "/logs")

	@Main
	def void main() {
		while (true) {
			_self.execute
		}
	}
	
	@Step
	def private void reset() {
		_self.minUserConstraint = _self.minDurationConstraint
		_self.maxUserConstraint = _self.maxDurationConstraint
	}
	
	@Step
	def private void setup() {
		val start = System.nanoTime
		
		_self.setupVisitor.visit(_self)
		
		// Initialize self variables
		_self.variantes = _self.variantsVisitor.visit(_self).variants
		// Duration initialization
		_self.durationVisitor.visit(_self)
		// Constraints initialization
		_self.minDurationConstraint = _self.durationVisitor.minDuration
		_self.maxDurationConstraint = _self.durationVisitor.maxDuration
		
		log.info("#### VideoGen, time to setup " + (System.nanoTime - start))
	}
	
	@InitializeModel
	def public void initializeModel(List<String> args){
		_self.setup
		if (!args.contains("noreset")) {
			_self.reset
		}
		if (!_self.onceSetuped) {
			// Log is reset before use
			SystemHelper.mkDirs(logPath)
			val FileHandler fh = new FileHandler(logPath + "/" + log.name + ".log", true)
	        val formatter = new SimpleFormatter()
	        fh.setFormatter(formatter)
			log.addHandler(fh)
			_self.onceSetuped = true
		}
		// First apply the constraint model before execution
		new VideoGenUserContraintsVisitor().visit(_self, _self.minUserConstraint, _self.maxUserConstraint)
		log.info("Initialize model with " + args)
	}
	
	@Step
	def public void execute() {
		// Then process each sequences
		_self.nanotimeStart = System.nanoTime
		TransitionAspect.execute(VideoGenHelper.getInitialize(_self), _self)
		_self.nanotimeEnd = System.nanoTime
		log.info("#### VideoGen, time to execute " + (_self.nanotimeEnd - _self.nanotimeStart))
	}	
	
	/**
	 * Start the computation (model transformation) of all selected video to create the final sequence (PlayList format)
	 * 
	 */
	@Step
	def public void compute() {
		val videos = new HashMap
		log.info("##### VideoGen '" + _self.name + "' start computation.")
		VideoGenHelper.allSelectedVideos(_self).forEach[videos.put(name, true)]
		// TODO: Manage model transformation here
		// TODO: re-implement the initial IDM project model transformation. See master branch package 'fr.nemomen.utils'.
		val content = VideoGenTransform.toM3U(_self, false, videos)
		log.info("##### Videos computation result in M3U format : ")
		log.info(content)
		val playlist = _self.saveGeneratedModel(content)
		//_self.launchReader(playlist)
	}
	
	/**
	 * Save the given playlist content in a temporary file (hashed by content named)
	 * 
	 */
	def private File saveGeneratedModel(String content) {
		// Create the temporary file to receive playlist as M3U
		val playlist = File.createTempFile(String.valueOf(content.hashCode), "-videogen.m3u")
		val writer = new FileWriter(playlist)
		writer.write(content)
		writer.flush
		writer.close
		playlist
	}
	
	/**
	 * Launch vlc instance with the provided playlist
	 * 
	 */
	def private void launchReader(File playlist) {
		// Start VLC
		// TODO: add a new tab inside eclipse to start a video player...
		// If possible (see Jave implementation from org.irisa.diverse.transformations.strategies)
		val p = new ProcessBuilder(
			"vlc",
			"--playlist-autostart",
			"--playlist-tree",
			"--no-overlay",
			playlist.toPath.toString)
		p.start()
	}
	
}

@Aspect(className=Transition)
abstract class TransitionAspect {

	public VideoGen videoGen = null
	public Boolean executed = false
	public Boolean callnextTransition = true
	
	/**
	 * Call the sequence processor. Need to be overridden by a inherited class
	 * Be careful to call this super method at the end of the override call.
	 * 	cf: _self.super_process() (kermeta style)
	 * 
	 */
	@Step
	def public void execute(VideoGen videoGen) {
		VideoGenAspect.log.info("##### '" + _self + "' is being processed.")
		// Stop invariant while looping the model
		if (!_self.executed) {
			// Call the next sequence in all case
			if (_self.nextTransition !== null) {
				//Don't forget to reset current state
				_self.executed = true
				// Before calling next sequence
				if (_self.callnextTransition) {
					_self.nextTransition.execute(videoGen)
				}
			}
		}
	}
}


@Aspect(className=Video)
class VideoAspect {
			
	/**
	 * Select this video and apply any of needed operations (conversion or rename for example)
	 * 
	 */
	@Step
	def public void select() {
		VideoGenAspect.log.info(_self.toString)
		if (!_self.url.startsWith("/")) {
			val prefix = ResourcesPlugin.workspace.root.projects.get(0).locationURI.toString.replace("file:", "")
			val newPath = prefix + "/" + _self.url
			VideoGenAspect.log.info(_self.url + "=>" + newPath)
			_self.url = newPath
		}
		// Add duration and VideoCodec MimeType
		VideoGenTransform.addMetadata(_self)
		VideoGenAspect.log.info("##### Video '" + _self.name + "' has been selected.")
	}
}

@Aspect(className=Delay)
class DelayAspect extends TransitionAspect {
	
	@OverrideAspectMethod
	def void execute(VideoGen videoGen) {
		if (_self.active && !_self.executed) {
			VideoGenAspect.log.info("++++++++++++++++++++++++++++++++++++++++++ A pass has finished")
			//Thread.sleep(_self.value)
		}
		_self.super_execute(videoGen)
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

	@OverrideAspectMethod
	def public void execute(VideoGen videoGen) {
		
		// Selected is always true on Alternatives sequences
		// Optional could be linked together for alterantives management
		// A bind relation could be used to replace this data structure (maybe without common sense)
		_self.selected = true
		val selectedOption = VideoGenHelper.selectOption(_self)
		if (selectedOption != null) {
			selectedOption.selected = true
			_self.video = selectedOption.video
			VideoAspect.select(_self.video)
			// Manage optional next sequence
			_self.options
			.filter[active]
			.filter[video == _self.video]
			.filter[nextTransition != null]
			.forEach[ 
				nextTransition.execute(videoGen)
				// Call of nextTransition.process will not be called in super
				_self.callnextTransition = false
			]
		}
		_self.super_execute(videoGen)
	}
}

@Aspect(className=Mandatory)
class MandatoryAspect extends SequenceAspect {
	
	@OverrideAspectMethod
	def public void execute(VideoGen videoGen) {
		if (_self.active && !_self.executed) {
			VideoAspect.select(_self.video)
			_self.selected = true
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

	@OverrideAspectMethod
	def public void execute(VideoGen videoGen) {
		if (_self.active && !_self.executed) {
			if (_self.isSelected()) {
				VideoAspect.select(_self.video)
				_self.selected = true
			}
		}
		_self.super_execute(videoGen)
	}
}


@Aspect(className=Initialize)
class InitializeAspect extends TransitionAspect {
		
	@OverrideAspectMethod
	def public void execute(VideoGen videoGen) {
		if (!_self.executed) {
			//TODO
		}
		_self.super_execute(videoGen)
	}
}

@Aspect(className=Generate)
class GenerateAspect extends TransitionAspect {
		
	@OverrideAspectMethod
	def public void execute(VideoGen videoGen) {
		if (!_self.executed) {
			_self.compute(videoGen)
			// Reinit the model after computation
			VideoGenAspect.initializeModel(videoGen, newArrayList("noreset"))
		}
		_self.super_execute(videoGen)
	}
	/**
	 * Call VideogGen.compute()
	 */
	@Step
	def public void compute(VideoGen videoGen) {
		VideoGenAspect.compute(videoGen)
	}
}