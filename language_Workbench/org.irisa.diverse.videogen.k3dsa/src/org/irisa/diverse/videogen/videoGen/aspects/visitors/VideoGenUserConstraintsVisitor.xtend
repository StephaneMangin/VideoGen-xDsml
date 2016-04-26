package org.irisa.diverse.videogen.videoGen.aspects.visitors

import java.util.ArrayList
import java.util.List
import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper
import org.irisa.diverse.videogen.videoGen.Alternatives
import org.irisa.diverse.videogen.videoGen.Optional
import org.irisa.diverse.videogen.videoGen.Sequence
import org.irisa.diverse.videogen.videoGen.VideoGen
import org.irisa.diverse.videogen.videoGen.aspects.utils.LoggableVisitor

class VideoGenUserContraintsVisitor extends LoggableVisitor {
	
	private int result = 0 // minimum result at each step of the process
	private int minConstraint = 0 // User defined
	private int maxConstraint = 0 // User defined
	private List<Optional> sequencesToInactivate = new ArrayList
	
	new () {
		super()
		log.info("minResult=" + result + ", minConstraint=" + minConstraint + ", maxConstraint=" + maxConstraint)
	}
	
	def visit(VideoGen vid, int min, int max) {
		result = vid.minUserConstraint
		minConstraint = min
		maxConstraint = max
		log.info("VideoGen User Contraints Visitor started...")
		VideoGenHelper.allSequences(vid).forEach[visit]
		log.info("minResult=" + result + ", minConstraint=" + minConstraint + ", maxConstraint=" + maxConstraint)
		log.info("sequences=" + sequencesToInactivate)
	}
	
	def private void visit(Sequence tra) {
		if (tra.active) {
			if (tra instanceof Optional) {
				tra.visit
			} else if (tra instanceof Alternatives) {
				tra.visit
			}
		}
	}
		
	def private visit(Alternatives alt) {
		log.info(alt.toString)
		var done = false
		// Start with the maximum duration video and parse descendingly
		for (Optional option: alt.options.sortBy[video.duration]) {
			log.info(option.toString)
			if (
				(result + option.video.duration) < minConstraint
				|| (result + option.video.duration) > maxConstraint
			) {
				sequencesToInactivate += option
				option.active = false
				log.info("\tKO ------------------------- ")
			} else {
				// This sequence is good, next one will be smaller so don't need to insert the duration anymore
				log.info("\tOK ++++++++++++++++++++++++++++++ ")
				if (!done) {
					done = true
					result += option.video.duration
				}
			}
			log.info("duration= " + option.video.duration + ", add=" + (result + option.video.duration) + ", minResult=" + result + ", minConstraint=" + minConstraint + ", maxConstraint=" + maxConstraint)		
		}
	}
	
	def private visit(Optional opt) {
		log.info(opt.toString)
		if (
			(result + opt.video.duration) < minConstraint
			|| (result + opt.video.duration) > maxConstraint
		) {
			sequencesToInactivate += opt
			opt.active = false
			log.info("\tKO ------------------------- ")
		} else {
			log.info("\tOK ++++++++++++++++++++++++++++++ ")
			result += opt.video.duration
		}
		log.info("duration= " + opt.video.duration + ", add=" + (result + opt.video.duration) + ", minResult=" + result + ", minConstraint=" + minConstraint + ", maxConstraint=" + maxConstraint)	
	}
}