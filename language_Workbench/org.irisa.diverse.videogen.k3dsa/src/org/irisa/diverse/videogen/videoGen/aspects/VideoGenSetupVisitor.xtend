package org.irisa.diverse.videogen.videoGen.aspects

import org.eclipse.core.resources.ResourcesPlugin
import org.irisa.diverse.videogen.transformations.VideoGenTransform
import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper
import org.irisa.diverse.videogen.videoGen.Video
import org.irisa.diverse.videogen.videoGen.VideoGen
import fr.inria.diverse.k3.al.annotationprocessor.Step

class VideoGenSetupVisitor {
	
	def visit(VideoGen vid) {
		println("VideoGen Setup Visitor started...")
		VideoGenHelper.allVideos(vid).forEach[visit]
	}
	
	def private visit(Video video) {
		println("VideoGen Setup Visitor : " + video)
		if (!video.url.startsWith("/")) {
			val prefix = ResourcesPlugin.workspace.root.projects.get(0).locationURI.toString.replace("file:", "")
			val newPath = prefix + "/" + video.url
			println(video.url + " => " + newPath)
			VideoAspect.setUrl(video, newPath)
		}
		
		// Add duration and VideoCodec MimeType
		VideoGenTransform.addMetadata(video)
	}
}