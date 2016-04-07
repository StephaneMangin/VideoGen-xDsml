package org.irisa.diverse.videogen.transformations.helpers

import java.util.ArrayList
import java.util.Collection
import java.util.HashMap
import java.util.Map
import org.irisa.diverse.videogen.videoGen.Alternatives
import org.irisa.diverse.videogen.videoGen.Conclusion
import org.irisa.diverse.videogen.videoGen.Introduction
import org.irisa.diverse.videogen.videoGen.Mandatory
import org.irisa.diverse.videogen.videoGen.Optional
import org.irisa.diverse.videogen.videoGen.Video
import org.irisa.diverse.videogen.videoGen.VideoGen
import org.irisa.diverse.videogen.videoGen.impl.VideoGenFactoryImpl
import org.irisa.diverse.videogen.videoGen.Mimetypes_Enum
import org.irisa.diverse.videogen.videoGen.Sequence
import java.util.List
import sun.security.jca.GetInstance.Instance

/** 
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 * 
 */
public class VideoGenHelper {
	
		
	/**
	 * Return the introduction as the main entry point
	 * 
	 */
	def static Introduction getIntroduction(VideoGen videoGen) {
		for (Sequence sequence : videoGen.sequences) { 
			if (sequence instanceof Introduction) {
				return sequence
			}
		}
		null
	}
	
	/**
	 * Return the conclusion as the main end point
	 * 
	 */
	def static Conclusion getConclusion(VideoGen videoGen) {
		for (Sequence sequence : videoGen.sequences) { 
			if (sequence instanceof Conclusion) {
				return sequence
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
			
        var Sequence sequence = getIntroduction(videoGen)
        while (sequence !== null) {
			sequences.add(sequence)
			if (sequence instanceof Conclusion) {
				sequence = null
			} else {
				sequence = sequence.nextSequence
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
			} else if(sequence instanceof Mandatory) {
				videos += sequence.video
			} else if(sequence instanceof Optional) {
				videos += sequence.video
			} else if(sequence instanceof Introduction) {
				videos += sequence.video
			} else if(sequence instanceof Conclusion) {
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
			} else if(sequence instanceof Mandatory) {
				videos += sequence.video
			} else if(sequence instanceof Optional) {
				videos += sequence.video
			} else if(sequence instanceof Introduction) {
				videos += sequence.video
			} else if(sequence instanceof Conclusion) {
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
