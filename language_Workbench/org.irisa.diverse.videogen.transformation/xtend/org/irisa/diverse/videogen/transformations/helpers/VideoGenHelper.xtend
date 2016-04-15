package org.irisa.diverse.videogen.transformations.helpers

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.irisa.diverse.videogen.videoGen.Alternatives
import org.irisa.diverse.videogen.videoGen.Generate
import org.irisa.diverse.videogen.videoGen.Initialize
import org.irisa.diverse.videogen.videoGen.Sequence
import org.irisa.diverse.videogen.videoGen.Transition
import org.irisa.diverse.videogen.videoGen.Video
import org.irisa.diverse.videogen.videoGen.VideoGen

/** 
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 * 
 */
public class VideoGenHelper {
	
		
	/**
	 * Return the Initialize as the main entry point
	 * 
	 */
	def static Initialize getInitialize(VideoGen videoGen) {
		for (Transition transition : videoGen.transitions) { 
			if (transition instanceof Initialize) {
				return transition
			}
		}
		null
	}
	
	/**
	 * Return the Generate as the main end point
	 * 
	 */
	def static Generate getGenerate(VideoGen videoGen) {
		for (Transition transition : videoGen.transitions) { 
			if (transition instanceof Generate) {
				return transition
			}
		}
		null
	}
	
 	/**
 	 * Return all sequences contained in a VideoGen instance
 	 * 
 	 */ 
    def static List<Sequence> allSequences(VideoGen videoGen) {
		val List<Sequence> sequences = new ArrayList<Sequence>
			
        var Transition transition = getInitialize(videoGen)
        while (transition !== null) {
			transition = transition.nextTransition
			if (transition instanceof Sequence) {
				sequences.add(transition)
			} else if (transition instanceof Initialize || transition instanceof Generate) {
				transition = null
			}
        }
		sequences
    }
 	/**
 	 * Return all active sequences contained in a VideoGen instance
 	 * 
 	 */ 
    def static List<Sequence> allActiveSequences(VideoGen videoGen) {
		val List<Sequence> sequences = new ArrayList<Sequence>
			
		allSequences(videoGen).forEach[sequence |
        	if (sequence.active) {
				sequences.add(sequence)
        	}
		]
		sequences
    }
    
 	/**
 	 * Return all videos from all sequences contained in a VideoGen instance
 	 * 
 	 */ 
    def static List<Video> allVideos(VideoGen videoGen) {
		val List<Video> videos = new ArrayList<Video>
		allSequences(videoGen).forEach[sequence |
			if (sequence instanceof Alternatives) {
				sequence.options.forEach[option |
					videos += option.video
				]
			} else {
				videos += sequence.video
			}
		]	
        videos.filter[video | video !== null].toList
    }
    
 	/**
 	 * Return all videos from active sequences contained in a VideoGen instance
 	 * 
 	 */ 
    def static List<Video> allActiveVideos(VideoGen videoGen) {
		val List<Video> videos = new ArrayList<Video>
		allActiveSequences(videoGen).forEach[sequence |
			if (sequence instanceof Alternatives) {
				sequence.options.forEach[option |
					videos += option.video
				]
			} else {
				videos += sequence.video
			}
		]	
        videos.filter[video | video !== null].toList
    }
    
 	/**
 	 * Return selected videos contained in a VideoGen instance
 	 * 
 	 */ 
    def static List<Video> allSelectedVideos(VideoGen videoGen) {
		val List<Video> videos = new ArrayList<Video>	
        allActiveVideos(videoGen).forEach[video |
        	if (video.selected) {
        		videos += video
        	}
        ]
		videos
    }
    
 	/**
 	 * Return a hashmap with corrected probabilities for an Alternatives instance
 	 * 
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
