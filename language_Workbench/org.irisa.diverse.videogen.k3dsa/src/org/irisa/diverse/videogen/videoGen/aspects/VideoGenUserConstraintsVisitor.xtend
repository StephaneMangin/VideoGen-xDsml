package org.irisa.diverse.videogen.videoGen.aspects

import java.util.ArrayList
import java.util.List
import java.util.logging.FileHandler
import java.util.logging.Logger
import java.util.logging.SimpleFormatter
import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper
import org.irisa.diverse.videogen.videoGen.Alternatives
import org.irisa.diverse.videogen.videoGen.Mandatory
import org.irisa.diverse.videogen.videoGen.Optional
import org.irisa.diverse.videogen.videoGen.Transition
import org.irisa.diverse.videogen.videoGen.VideoGen
import org.irisa.diverse.videogen.videoGen.Sequence

class VideoGenUserContraintsVisitor {
	
	private int result = 0
	private int minConstraint = 0
	private int maxConstraint = 0
	private static Logger log = Logger.getLogger("VideoGenUserContraintsVisitor")
	private List<Optional> sequencesToInactivate = new ArrayList
	
	new (Integer min, Integer max) {
		result = min
		minConstraint = min
		maxConstraint = max
		log.info("minResult=" + result + ", minConstraint=" + minConstraint + ", maxConstraint=" + maxConstraint)
		val FileHandler fh = new FileHandler("/tmp/" + class.name + ".log")
        val formatter = new SimpleFormatter();  
        fh.setFormatter(formatter);
		log.addHandler(fh)
	}
	
	def visit(VideoGen vid) {
		log.info("VideoGen Variante constraints Visitor started...")
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
		for (Optional option: alt.options.sortBy[video.duration].reverse) {
			log.info(option.toString)
			if (
				(result + option.video.duration) < minConstraint
				|| (result + option.video.duration) > maxConstraint
			) {
				sequencesToInactivate += option
				option.active = false
				log.info("\tKO")
				log.info("duration= " + option.video.duration + ", add=" + (result + option.video.duration) + ", minResult=" + result + ", minConstraint=" + minConstraint + ", maxConstraint=" + maxConstraint)
			} else {
				// This sequence is good, next one will be smaller so don't need to insert the duration anymore
				log.info("\tOK")
				if (!done) {
					done = true
					log.info("duration= " + option.video.duration + ", add=" + (result + option.video.duration) + ", minResult=" + result + ", minConstraint=" + minConstraint + ", maxConstraint=" + maxConstraint)
					result += option.video.duration
				}
			}
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
			log.info("\tKO")
			log.info("duration= " + opt.video.duration + ", add=" + (result + opt.video.duration) + ", minResult=" + result + ", minConstraint=" + minConstraint + ", maxConstraint=" + maxConstraint)
		} else {
			log.info("\tOK")
			log.info("duration= " + opt.video.duration + ", add=" + (result + opt.video.duration) + ", minResult=" + result + ", minConstraint=" + minConstraint + ", maxConstraint=" + maxConstraint)
			result += opt.video.duration
		}
	}
}