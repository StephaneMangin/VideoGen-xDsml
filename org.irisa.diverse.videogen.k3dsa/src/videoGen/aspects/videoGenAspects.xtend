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
import java.util.List
import java.util.ArrayList
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

@Aspect(className=VideoGen)
class VideoGenAspect {

	List<Sequence> selectedSequences = new ArrayList

	@Main
	def public void initialize() {
		println("VideoGen " + _self.name + " initialized.")
		// Get and process the first sequence
		val sequence = _self.sequences.get(0)
		sequence.process
	}
}

@Aspect(className=Sequence)
abstract class SequenceAspect {

	@Step
	def public void process() {
		println("Sequence [" + _self.class.simpleName + "] " + _self.name + ": processed.")
		_self.nextSibling.process
	}

}

@Aspect(className=Alternatives)
class AlternativesAspect extends SequenceAspect {

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

	def private Video selectVideo() {

		val drng = new DistributedRandomNumberGenerator()
		val proba = _self.checkProbabilities()
		_self.options.map[video.name].forEach [ name |
			drng.addNumber(proba.keySet.toList.indexOf(name), proba.get(name))
		]
		_self.options.get(drng.getDistributedRandomNumber()).video
	}

	@OverrideAspectMethod
	def public void process() {
		_self.selectVideo.select
	}
}

@Aspect(className=Mandatory)
class MandatoryAspect extends SequenceAspect {

}

@Aspect(className=Optional)
class OptionalAspect extends SequenceAspect {

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
	def public void process() {
		if (_self.isSelected()) {
			_self.video.select
		}
	}
}

@Aspect(className=Video)
class VideoAspect {
	
	Boolean selected = false
	
	@Step
	def public void select() {
		println("Sequence " + _self.name + ": processed.")
		_self.selected = true
	}
}

/**
 * Randomization helper
 * 
 * @see https://stackoverflow.com/questions/20327958/random-number-with-probabilities/20329901#20329901
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




