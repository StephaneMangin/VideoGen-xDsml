package org.irisa.diverse.videogen.videoGen.aspects.visitors

import org.eclipse.core.resources.ResourcesPlugin
import org.irisa.diverse.videogen.transformations.VideoGenTransform
import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper
import org.irisa.diverse.videogen.videoGen.Transition
import org.irisa.diverse.videogen.videoGen.Video
import org.irisa.diverse.videogen.videoGen.VideoGen
import org.irisa.diverse.videogen.videoGen.aspects.TransitionAspect
import org.irisa.diverse.videogen.videoGen.aspects.utils.LoggableVisitor
import org.irisa.diverse.videogen.videoGen.Alternatives

class VideoGenSetupVisitor extends LoggableVisitor {
	
	private var VideoGen videoGen
	
	def void visit(VideoGen vid) {
		videoGen = vid
		log.info("VideoGen Setup Visitor started...")
		VideoGenHelper.allTransitions(vid).forEach[visit]
		VideoGenHelper.allSequences(vid).forEach[visit]
		VideoGenHelper.allVideos(vid).forEach[visit]
	}
	
	def private void visit(Transition tra) {
		tra.selected = false
		tra.active = true
		TransitionAspect.executed(tra, false)
		TransitionAspect.videoGen(tra, videoGen)
		if (tra instanceof Alternatives) {
			tra.options.forEach[opt |
				opt.selected = false
				opt.active = true
				TransitionAspect.executed(opt, false)
				TransitionAspect.videoGen(opt, videoGen)
			]
		}
	}
	
	def private void visit(Video video) {
		log.info(video.toString)
		if (!video.url.startsWith("/")) {
			val prefix = ResourcesPlugin.workspace.root.projects.get(0).locationURI.toString.replace("file:", "")
			val newPath = prefix + "/" + video.url
			log.info(video.url + "=>" + newPath)
			video.setUrl(newPath)
		}
		// Add duration and VideoCodec MimeType
		VideoGenTransform.addMetadata(video)
		log.info("Video configured => " + video.duration + ", " + video.mimetype)
	}
}