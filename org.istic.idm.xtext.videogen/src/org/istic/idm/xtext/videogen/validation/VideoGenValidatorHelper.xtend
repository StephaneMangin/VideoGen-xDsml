package org.istic.idm.xtext.videogen.validation;

import java.io.File
import java.util.HashMap
import java.util.List
import java.util.ArrayList
import org.istic.idm.xtext.videogen.videoGen.Sequence
import org.istic.idm.xtext.videogen.videoGen.Optional
import org.istic.idm.xtext.videogen.videoGen.Alternatives
import org.istic.idm.xtext.videogen.utils.VideoGenHelper
import org.istic.idm.xtext.videogen.videoGen.VideoGen

/**
 * Independant VideoGen validator
 * 
 * FIXME: could it be possible to join both UI validator and this one ?
 */
public class VideoGenValidatorHelper {
	
	/**
	 * Helper class to manage null, like java Optional but simpler
	 * It is used in forEach functions that need an immutable object to create result
	 * 
	 */	
	public static class Result {

		private var String result = null;
		
		/**
		 * Set the container's value
		 */
		public def set(String value) {
			result = value
		}
		
		/**
		 * Get the value from the container
		 */
		public def get() {
			result
		}
		
		/**
		 * Indicates if there is a value inside the container
		 * 
		 */
		public def isSet() {
			result != null
		}
		
	}

	def static checkIsUrlExists(List<Sequence> sequences, Sequence sequence) {
		val result = new Result()
		if (!new File(sequence.url).exists) {
			result.set('File not found')
		}
		result
	}
	
	def static checkUniqueDescription(List<Sequence> sequences, Sequence sequence) {
		val result = new Result()
		sequences.takeWhile[seq2 | !seq2.equals(sequence)]
			.forEach[seq2 |
				if (seq2.description.equals(sequence.description)) {
					result.set("Duplicated description.")
				}
			]
		result
	}
	
	def static checkUniqueURL(List<Sequence> sequences, Sequence sequence) {
		val result = new Result()
		sequences.takeWhile[seq2 | !seq2.equals(sequence)]
			.forEach[seq2 |
				if (seq2.url.equals(sequence.url)) {
					result.set("Duplicated url.")
				}
			]
		result
	}
	
	def static checkUniqueIdentifiers(List<Sequence> sequences, Sequence sequence) {
		val result = new Result()
		sequences.takeWhile[seq2 | !seq2.equals(sequence)]
			.forEach[seq2 |
				if (seq2.name.equals(sequence.name)) {
					result.set("Sequence name should be unique.")
				}
			]
		result
	}
	
	def static checkOptionalProbability(Optional optional) {
		val result = new Result()
		if (optional.probability > 100) {
			result.set('Optional probability should not be higher than 100%')
		}
		else if (optional.probability == 100) {
			result.set('Optional probability should not equal 100%, otherwize create a Mandatory sequence instead ;)')
		}
		result
	}
	
	def static checkAlternativesProbability(Alternatives alternatives) {
		val result = new Result()
		var total = 0
		var Optional lastOption
		for (option: alternatives.options) {
			total += option.probability
			lastOption = option
		}	
		if (total > 100) {
			result.set('Probabilities sum inside an Alternatives should not exceed 100%')
		}
		result
	}

	def static checkAll(VideoGen videoGen) {
		val result = new HashMap<String, List<String>>
		result.put('error', new ArrayList<String>)
		result.put('warning', new ArrayList<String>)
		result.put('info', new ArrayList<String>)

		val sequences = videoGen.eResource.allContents.filter(typeof(Sequence)).toList as List<Sequence>
		
		VideoGenHelper.allSequences(videoGen).forEach[sequence |
			var ret = checkIsUrlExists(sequences, sequence)
			if (ret.isSet) {
				result.get("error").add(ret.get)
			}
			ret = checkUniqueDescription(sequences, sequence)
			if (ret.isSet) {
				result.get("warning").add(ret.get)
			}
			ret = checkUniqueURL(sequences, sequence)
			if (ret.isSet) {
				result.get("warning").add(ret.get)
			}
			ret = checkUniqueIdentifiers(sequences, sequence)
			if (ret.isSet) {
				result.get("error").add(ret.get)
			}
		]
		videoGen.statements.forEach[statement |
			if (statement instanceof Optional) {
				var ret = checkOptionalProbability(statement)
				if (ret.isSet) {
					result.get("error").add(ret.get)	
				}
			} else if (statement instanceof Alternatives) {
				var ret = checkAlternativesProbability(statement)
				if (ret.isSet) {
					result.get("error").add(ret.get)	
				}
			}
		]
		result
	}
	
}
