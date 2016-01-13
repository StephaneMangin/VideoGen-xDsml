package org.istic.idm.xtext.videogen.validation

import org.eclipse.xtext.validation.Check
import java.io.File
import org.istic.idm.xtext.videogen.validation.AbstractVideoGenValidator
import org.istic.idm.xtext.videogen.videoGen.Sequence
import org.istic.idm.xtext.videogen.videoGen.VideoGenPackage.Literals
import org.istic.idm.xtext.videogen.videoGen.Optional
import org.istic.idm.xtext.videogen.videoGen.Alternatives

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class VideoGenValidator extends AbstractVideoGenValidator {

  public static val DUPLICATED_DESCRIPTION = 'duplicatedDescription'
  public static val DUPLICATED_URL = 'duplicatedURL'
  public static val INVALID_NAME = 'invalidName'
  public static val INVALID_URL = 'invalidUrl'
  public static val INVALID_PROBABILITY = 'invalidProbability'

	@Check
	def checkIsUrlExists(Sequence sequence) {
		if (!new File(sequence.url).exists) {
			error('File not found', 
					Literals.SEQUENCE__URL,
					INVALID_URL)
		}
	}
	

	@Check
	def checkUniqueDescription(Sequence sequence) {
		sequence.eResource.allContents
			.filter(typeof(Sequence))
			.takeWhile[seq2 | !seq2.equals(sequence)]
			.forEach[seq2 |
				if (seq2.description.equals(sequence.description)) {
					info('Duplicated description', 
							Literals.SEQUENCE__DESCRIPTION,
							DUPLICATED_DESCRIPTION)
				}
			]
	}
	
	@Check
	def checkUniqueURL(Sequence sequence) {
		sequence.eResource.allContents
			.filter(typeof(Sequence))
			.takeWhile[seq2 | !seq2.equals(sequence)]
			.forEach[seq2 |
				if (seq2.url.equals(sequence.url)) {
					info('Duplicated url', 
							Literals.SEQUENCE__URL,
							DUPLICATED_URL)
				}
			]
	}
	
	@Check
	def checkUniqueIdentifiers(Sequence sequence) {
		sequence.eResource.allContents
			.filter(typeof(Sequence))
			.takeWhile[seq2 | !seq2.equals(sequence)]
			.forEach[seq2 |
				if (seq2.name.equals(sequence.name)) {
					error('Sequence name should be unique.', 
							Literals.SEQUENCE__NAME,
							INVALID_NAME)
				}
			]
	}
	
	@Check
	def checkOptionalProbability(Optional optional) {
		if (optional.probability > 100) {
			error('Optional probability should not be higher than 100%', 
					Literals.OPTIONAL__PROBABILITY,
					INVALID_PROBABILITY)
		}
		else if (optional.probability == 100) {
			warning('Optional probability should not equal 100%, otherwize create a Mandatory sequence instead ;)', 
					Literals.OPTIONAL__PROBABILITY,
					INVALID_PROBABILITY)
		}
	}
	
	@Check
	def checkAlternativesProbability(Alternatives alternatives) {
		var total = 0
		var Optional lastOption
		for (option: alternatives.options) {
			total += option.probability
			lastOption = option
		}	
		if (total > 100) {
			error('Probabilities sum inside an Alternatives should not exceed 100%', 
					Literals.ALTERNATIVES__OPTIONS,
					INVALID_PROBABILITY)
		}
	}
	
}
