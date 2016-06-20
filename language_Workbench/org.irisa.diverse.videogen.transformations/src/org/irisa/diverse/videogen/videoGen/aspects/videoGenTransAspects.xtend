package org.irisa.diverse.videogen.videoGen.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.util.HashMap
import java.util.Map
import org.irisa.diverse.videogen.videoGen.Alternatives
import org.irisa.diverse.videogen.videoGen.Delay
import org.irisa.diverse.videogen.videoGen.Generate
import org.irisa.diverse.videogen.videoGen.Initialize
import org.irisa.diverse.videogen.videoGen.Mandatory
import org.irisa.diverse.videogen.videoGen.NamedElement
import org.irisa.diverse.videogen.videoGen.Optional
import org.irisa.diverse.videogen.videoGen.Sequence
import org.irisa.diverse.videogen.videoGen.Transition
import org.irisa.diverse.videogen.videoGen.Video
import org.irisa.diverse.videogen.videoGen.VideoGen

@Aspect(className=Mandatory)
class MandatoryTransAspect extends SequenceTransAspect {

}

@Aspect(className=Initialize)
class InitializeTransAspect extends TransitionTransAspect {

}

@Aspect(className=VideoGen)
class VideoGenTransAspect extends NamedElementTransAspect {

}

@Aspect(className=Transition)
abstract class TransitionTransAspect extends NamedElementTransAspect {

}

@Aspect(className=NamedElement)
abstract class NamedElementTransAspect {

}

@Aspect(className=Optional)
class OptionalTransAspect extends SequenceTransAspect {
   
 	/**
 	 * Apply the given Optional instance's percentage to allow or not its selectability
 	 *  
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 */ 
    def void isSelected() {
        
        var drng = new DistributedRandomNumberGenerator()
        
        var float proba
        
        proba = 50
        if(_self.probability != 0){
            proba = _self.probability
        }
        
        drng.addNumber(1, proba)
        drng.addNumber(0, 100-proba)
        
        drng.getDistributedRandomNumber() > 0
    }
}

@Aspect(className=Video)
class VideoTransAspect extends NamedElementTransAspect {
}

@Aspect(className=Alternatives)
class AlternativesTransAspect extends SequenceTransAspect {
		
	/**
	 * Return a hashmap with corrected probabilities.
	 * 
	 */
	def private Map<Optional, Integer> checkProbabilities() {
		val result = new HashMap<Optional, Integer>
		var totalProb = 0
		var totalProbLeft = 0
		var totalOptions = 0
		var inactivated = 0
		for (option : _self.options) {
			if (option.active) {
				if (option.probability == 0) {
					totalOptions++
				}
				totalProb += option.probability
				result.put(option, option.probability)
			} else {
				inactivated++
				totalProbLeft += option.probability
			}
		}
		if (result.size != 0) {
			if (result.size == 1) {
				result.replace(result.keySet.get(0), 100)
			} else if (inactivated != 0) {
				for (name : result.keySet) {
					val percentageLeft = totalProbLeft / inactivated
					result.put(name, result.get(name) + percentageLeft)
				}
			} else {
				for (name : result.keySet) {
					if (result.get(name) == 0) {
						val percentageLeft = (100 - totalProb) / totalOptions
						result.put(name, percentageLeft)
					}
				}
			}
		}
		result
	}

	/**
 	 * Process options to find the selectable video
 	 * 
 	 */
	def Optional selectOption() {

		val drng = new DistributedRandomNumberGenerator()
		val checkedProbabilities = _self.checkProbabilities
		if (checkedProbabilities.empty) {
			return null
		}
		checkedProbabilities.forEach[option, proba|
			drng.addNumber(checkedProbabilities.keySet.toList.indexOf(option), proba)
		] 
		checkedProbabilities.keySet.get(drng.getDistributedRandomNumber())
	}
}

@Aspect(className=Generate)
class GenerateTransAspect extends TransitionTransAspect {

}

@Aspect(className=Delay)
class DelayTransAspect extends TransitionTransAspect {

}

@Aspect(className=Sequence)
abstract class SequenceTransAspect extends TransitionTransAspect {

}



