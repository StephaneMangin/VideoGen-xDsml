package org.irisa.diverse.videogen.k3dsa.dependencies.transformations.api

import java.util.List
import java.util.Map
import org.irisa.diverse.videogen.videoGen.Alternatives
import org.irisa.diverse.videogen.videoGen.Generate
import org.irisa.diverse.videogen.videoGen.Initialize
import org.irisa.diverse.videogen.videoGen.Optional
import org.irisa.diverse.videogen.videoGen.Sequence
import org.irisa.diverse.videogen.videoGen.Transition
import org.irisa.diverse.videogen.videoGen.Video

/** 
 * Parse the VideoGen model to give helper methods to retrieve various instances
 * 
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 * 
 */
public interface IVideoGenHelper<T> {
				
	/**
	 * Return the Initialize as the main entry point
	 * 
	 */
	def Initialize getInitialize()
	
	/**
	 * Return the Generate as the main end point
	 * 
	 */
	def Generate getGenerate()
	
 	/**
 	 * Return all transitions contained in a VideoGen instance
 	 * 
 	 */ 
    def List<Transition> allTransitions()
    
 	/**
 	 * Return all sequences contained in a VideoGen instance
 	 * 
 	 */ 
    def List<Sequence> allSequences()
    
 	/**
 	 * Return all videos from all sequences contained in a VideoGen instance
 	 * 
 	 */ 
    def List<Video> allVideos()
    
 	/**
 	 * Return all videos from active sequences contained in a VideoGen instance
 	 * 
 	 */ 
    def List<Video> allActiveVideos()
    
 	/**
 	 * Return all videos from active sequences contained in a VideoGen instance
 	 * 
 	 */ 
    def List<Video> allSelectedVideos()
	
	
	/**
	 * Return a hashmap with corrected probabilities for an Alternatives instance.
	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def Map<Optional, Integer> checkProbabilities(Alternatives alternatives)

	/**
 	 * Process options to find the selectable video
 	 * 
 	 */
	def Optional selectOption(Alternatives alternatives)

	/**
	 * Return all alternatives within model
	 * 
	 */
	def List<Alternatives> getAlternatives()

}
