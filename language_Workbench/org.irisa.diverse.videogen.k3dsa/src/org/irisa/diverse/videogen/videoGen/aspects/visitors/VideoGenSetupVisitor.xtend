package org.irisa.diverse.videogen.videoGen.aspects.visitors

import org.eclipse.core.resources.ResourcesPlugin
import org.irisa.diverse.videogen.transformations.VideoGenTransform
import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper
import org.irisa.diverse.videogen.videoGen.Transition
import org.irisa.diverse.videogen.videoGen.Video
import org.irisa.diverse.videogen.videoGen.VideoGen
import org.irisa.diverse.videogen.videoGen.aspects.TransitionAspect

class VideoGenSetupVisitor {
	
	private var VideoGen videoGen = null
	
	def visit(VideoGen vid) {
		videoGen = vid
		println("VideoGen Setup Visitor started...")
		VideoGenHelper.allTransitions(vid).forEach[visit]
		VideoGenHelper.allVideos(vid).forEach[visit]
	}
	
	def private visit(Transition tra) {
		TransitionAspect.done(tra, false)
		TransitionAspect.videoGen(tra, videoGen)
	}
	
	def private visit(Video video) {
		println("VideoGen Setup Visitor : " + video)
		video.selected = false
		if (!video.url.startsWith("/")) {
			val prefix = ResourcesPlugin.workspace.root.projects.get(0).locationURI.toString.replace("file:", "")
			val newPath = prefix + "/" + video.url
			println("VideoGen Setup Visitor : " + video.url + "=>" + newPath)
			video.setUrl(newPath)
		}
		
		// Add duration and VideoCodec MimeType
		println("Video before => " + video.duration + ", " + video.mimetype)
		VideoGenTransform.addMetadata(video)
		println("Video after => " + video.duration + ", " + video.mimetype)
	}
}