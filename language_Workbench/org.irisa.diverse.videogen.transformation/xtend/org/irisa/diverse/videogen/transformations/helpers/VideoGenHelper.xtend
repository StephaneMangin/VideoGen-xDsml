package org.irisa.diverse.videogen.transformations.helpers

import java.util.ArrayList
import java.util.Collection
import java.util.HashMap
import java.util.Map
import org.irisa.diverse.videogen.videoGen.Alternatives
import org.irisa.diverse.videogen.videoGen.Mandatory
import org.irisa.diverse.videogen.videoGen.Optional
import org.irisa.diverse.videogen.videoGen.Video
import org.irisa.diverse.videogen.videoGen.VideoGen

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
			
        var sequence = videoGen.sequences.get(0)
        while (sequence !== null) {
			if (sequence instanceof Alternatives) {
				sequence.options.forEach[option |
					videos += option.video
				]
			} else if(sequence instanceof Mandatory) {
				videos += sequence.video
			} else if(sequence instanceof Optional) {
				videos += sequence.video
			}
			sequence = sequence.nextSibling
        }
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
        	result.put(option.video.name, option.probability)
        }
        for (name: result.keySet) {
        	if (result.get(name) == 0) {
        		result.put(name, (100 - totalProb) / totalOptions)
        	}
        }
        result
    }

}
