package org.irisa.diverse.videogen.videoGen.aspects.visitors

import org.eclipse.core.resources.ResourcesPlugin
import org.irisa.diverse.videogen.transformations.VideoGenTransform
import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper
import org.irisa.diverse.videogen.videoGen.Transition
import org.irisa.diverse.videogen.videoGen.Video
import org.irisa.diverse.videogen.videoGen.VideoGen
import org.irisa.diverse.videogen.videoGen.aspects.TransitionAspect
import org.irisa.diverse.videogen.videoGen.aspects.utils.LoggableVisitor

class VideoGenSetupVisitor extends LoggableVisitor {
	
	private var VideoGen videoGen = null
	
	def visit(VideoGen vid) {
		videoGen = vid
		log.info("VideoGen Setup Visitor started...")
		VideoGenHelper.allTransitions(vid).forEach[visit]
		VideoGenHelper.allVideos(vid).forEach[visit]
	}
	
	def private visit(Transition tra) {
		TransitionAspect.done(tra, false)
		TransitionAspect.videoGen(tra, videoGen)
	}
	
	def private visit(Video video) {
		log.info(video.toString)
		video.selected = false
		if (!video.url.startsWith("/")) {
			val prefix = ResourcesPlugin.workspace.root.projects.get(0).locationURI.toString.replace("file:", "")
			val newPath = prefix + "/" + video.url
			log.info(video.url + "=>" + newPath)
			video.setUrl(newPath)
		}
		
		// Add duration and VideoCodec MimeType
		log.info("Video before => " + video.duration + ", " + video.mimetype)
		VideoGenTransform.addMetadata(video)
		log.info("Video after => " + video.duration + ", " + video.mimetype)
	}
}