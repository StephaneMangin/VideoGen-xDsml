package org.istic.idm.xtext.videogen.utils

import java.util.ArrayList
import java.util.Collection
import java.util.HashMap
import java.util.Map
import org.istic.idm.xtext.videogen.videoGen.Alternatives
import org.istic.idm.xtext.videogen.videoGen.Mandatory
import org.istic.idm.xtext.videogen.videoGen.Optional
import org.istic.idm.xtext.videogen.videoGen.Sequence
import org.istic.idm.xtext.videogen.videoGen.VideoGen

/** 
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 * 
 */
public class VideoGenHelper {
	
 	/**
 	 * Return all sequences contained in a VideoGen instance
 	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 */ 
    def static Collection<Sequence> allSequences(VideoGen videoGen) {
		val Collection<Sequence> sequences = new ArrayList<Sequence>
			
        videoGen.statements.forEach[statement |
			if (statement instanceof Alternatives) {
				statement.options.forEach[option |
					sequences += option.sequence
				]
			} else if(statement instanceof Mandatory) {
				sequences += statement.sequence
			} else if(statement instanceof Optional) {
				sequences += statement.sequence
			}
		]
		sequences
    }
    
 	/**
 	 * Return a hashmap with corrected probabilities for an Alternatives instance
 	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 */ 
    def static Map<String, Integer> checkProbabilities(Alternatives alternatives) {
		val result = new HashMap<String, Integer>
        var totalProb = 0
        var totalOptions = 0
        for (option: alternatives.options) {
        	if (option.probability == 0) {
        		totalOptions++
        	}
        	totalProb += option.probability
        	result.put(option.sequence.name, option.probability)
        }
        for (name: result.keySet) {
        	if (result.get(name) == 0) {
        		result.put(name, (100 - totalProb) / totalOptions)
        	}
        }
        result
    }

}
