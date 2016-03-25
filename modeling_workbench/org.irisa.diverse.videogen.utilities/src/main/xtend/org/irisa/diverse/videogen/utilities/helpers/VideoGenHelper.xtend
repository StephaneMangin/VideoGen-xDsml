package org.irisa.diverse.videogen.utilities.helpers

import java.util.ArrayList
import java.util.Collection
import java.util.HashMap
import java.util.Map
import videoGen.Alternatives
import videoGen.Mandatory
import videoGen.Optional
import videoGen.Video
import videoGen.VideoGen

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
    def static Collection<Video> allVideos(VideoGen videoGen) {
		val Collection<Video> videos = new ArrayList<Video>
		
        videoGen.sequences.forEach[sequence |
			if (sequence instanceof Alternatives) {
				sequence.options.forEach[option |
					videos += option.sequence
				]
			} else if(sequence instanceof Mandatory) {
				videos += sequence.video
			} else if(statement instanceof Optional) {
				videos += sequence.video
			}
		]
		videos
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
