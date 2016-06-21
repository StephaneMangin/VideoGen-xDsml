package org.irisa.diverse.videogen.transformations.helpers

import java.nio.file.Path
import org.irisa.diverse.videogen.transformations.VideoCodec
import org.irisa.diverse.videogen.transformations.strategies.JaveStrategyImpl
import org.irisa.diverse.videogen.transformations.strategies.VideosStrategy

/** 
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 * 
 */
public class VideosHelper {
  	 
	var static VideosStrategy staticStrategy = new JaveStrategyImpl()
	
	def static setStrategy(VideosStrategy strategy) {
  	 	staticStrategy = strategy
  	 }
  	 
	/**
	 * Create a thumbnail from the given video to the given path
	 * 
	 * TODO: should return a file object to be processed by the caller
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def static void createThumbnails(Path fullPath, Path thumbFileName) {
		staticStrategy.createThumbnails(fullPath, thumbFileName)
	}

	/**
	 * Convert this video conform to the given mimeType
	 *
	 * TODO: add a mimeType instead of a string format parameter
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def static void convert(Path fullPath, Path newFullPathName, VideoCodec codec) {
		staticStrategy.convert(fullPath, newFullPathName, codec)
	}

	/**
	 * Return the mimeType object for the given video
	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def static VideoCodec getMimeType(Path fullPath) {
		staticStrategy.getMimeType(fullPath)
	}
	
	/**
	 * Return the duration (in seconds) for the given video
	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def static int getDuration(Path fullPath) {
		staticStrategy.getDuration(fullPath)
	}
	
}