package videoGen.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.HashMap
import java.util.Map
import videoGen.Alternatives
import videoGen.Mandatory
import videoGen.Optional
import videoGen.Sequence
import videoGen.Video
import videoGen.VideoGen
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import static extension videoGen.aspects.SequenceAspect.*
import static extension videoGen.aspects.VideoAspect.*
import java.util.ArrayList
import fr.inria.diverse.k3.al.annotationprocessor.Pre

@Aspect(className=VideoGen)
class VideoGenAspect {

	@Main
	def public void initialize() {
		println("##### VideoGen '" + _self.name + "' has been initialized.")
		// Get and process the first sequence
		val sequence = _self.sequences.get(0)
		sequence.process
		// And at the end (sequential so ok !) call the video generation
		_self.compute
	}
	
	/**
	 * Start the computation (model transformation) of all selected video to create the final sequence (PlayList format)
	 * 
	 * @see : ffmpeg
	 */
	@Step
	def public void compute() {
		val videos = new ArrayList
		println("##### VideoGen '" + _self.name + "' start computation.")
		//TODO: re-implement the initial IDM project model transformation. See master branch package 'fr.nemomen.utils'.
		for (Sequence sequence: _self.sequences) {
			if (sequence instanceof Mandatory) {
				videos.add(sequence.video)
			} else if (sequence instanceof Optional) {
				if (sequence.video.selected) {
					videos.add(sequence.video)	
				}
			} else if (sequence instanceof Alternatives) {
				for (Optional option: sequence.options) {
					
					if (option.video.selected) {
						videos.add(option.video)
					}
				}
			}
		}
		// TODO: Manage model transformation here
	}
}

@Aspect(className=Sequence)
abstract class SequenceAspect {

	public Boolean current = false;
	
	/**
	 * Call the sequence processor. Need to be overridden by a inherited class
	 * Be careful to call this super method at the end of the override call.
	 * 	cf: _self.super_process() (kermeta style)
	 * 
	 */
	def public void process() {
		// Call the next sequence in all case
		if (_self.nextSibling != null) {
			//Don't forget to reset current state
			_self.current = false;
			// Before calling next sequence
			_self.nextSibling.process
		}
	}

}

@Aspect(className=Alternatives)
class AlternativesAspect extends SequenceAspect {

	def private Boolean preprivProcess() {
		println("##### Alternatives '" + _self.name + "' pre-processing...")
		_self.current = true
		true
	}
	
	/**
	 * Return a hashmap with corrected probabilities for an Alternatives instance
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
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 */
	def private Video selectVideo() {

		val drng = new DistributedRandomNumberGenerator()
		val proba = _self.checkProbabilities()
		_self.options.map[video.name].forEach [ name |
			drng.addNumber(proba.keySet.toList.indexOf(name), proba.get(name))
		]
		_self.options.get(drng.getDistributedRandomNumber()).video
	}

	@Pre
	@Step
	@OverrideAspectMethod
	def public void process() {
		_self.current = true
		println("##### Alternatives '" + _self.name + "' is been processed.")
		_self.selectVideo.select
		_self.super_process()
	}
}

@Aspect(className=Mandatory)
class MandatoryAspect extends SequenceAspect {

	def private Boolean preprivProcess() {
		println("##### Mandatory '" + _self.name + "' pre-processing...")
		_self.current = true
		true
	}
	
	@Pre
	@Step
	@OverrideAspectMethod
	def public void process() {
		_self.current = true
		println("##### Mandatory '" + _self.name + "' is been processed.")
		_self.video.select
		_self.nextSibling.process
	}
}

@Aspect(className=Optional)
class OptionalAspect extends SequenceAspect {

	def private Boolean preprivProcess() {
		println("##### Optional '" + _self.name + "' pre-processing...")
		_self.current = true
		true
	}
	
	/**
	 * Is this video is selectable or not ?
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

	@Pre
	@Step
	@OverrideAspectMethod
	def public void process() {
		_self.current = true
		println("##### Optional '" + _self.name + "' is been processed.")
		if (_self.isSelected()) {
			_self.video.select
		}
		_self.super_process()
	}
}

@Aspect(className=Video)
class VideoAspect {
	
	def public void select() {
		_self.selected = true
		println("##### Video '" + _self.name + "' has been selected.")
	}
}

/**
 * Randomization helper
 * 
 * @see https://stackoverflow.com/questions/20327958/random-number-with-probabilities/20329901#20329901
 * 
 * @Author http://stackoverflow.com/users/2128755/trylimits
 */
class DistributedRandomNumberGenerator {
	HashMap<Integer, Double> distribution
	double distSum

	new() {
		distribution = new HashMap()
	}

	def void addNumber(int value, double distribution) {
		if (this.distribution.get(value) !== null) {
			distSum -= this.distribution.get(value)
		}
		this.distribution.put(value, distribution)
		distSum += distribution
	}

	def int getDistributedRandomNumber() {
		var double rand = Math.random()
		var double ratio = 1.0f / distSum
		var double tempDist = 0
		for (Integer i : distribution.keySet()) {
			tempDist += distribution.get(i)
			if (rand / ratio <= tempDist) {
				return i
			}

		}
		return 0
	}

}




