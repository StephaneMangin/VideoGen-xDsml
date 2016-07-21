package org.irisa.diverse.videogen.k3dsa.dependencies.transformations.strategies

import java.nio.file.Path
import org.irisa.diverse.videogen.k3dsa.dependencies.transformations.VideoCodec

interface VideosStrategy {
	
	/**
	 * Create a thumbnail from the given video to the given path
	 * 
	 * TODO: should return a file object to be processed by the caller
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def void createThumbnails(Path fullPath, Path thumbFileName)

	/**
	 * Convert this video conform to the given mimeType
	 *
	 * TODO: add a mimeType instead of a string format parameter
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def void convert(Path fullPath, Path newFullPathName, VideoCodec codec)

	/**
	 * Return the mimeType object for the given video
	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def VideoCodec getMimeType(Path fullPath)
	/**
	 * Return the duration (in seconds) for the given video
	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def int getDuration(Path fullPath)
}