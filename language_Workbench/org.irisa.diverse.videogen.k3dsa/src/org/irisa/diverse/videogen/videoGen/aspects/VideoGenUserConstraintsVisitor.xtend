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

class VideoGenUserContraintsVisitor {
	
	public int minResult = 0
	public int maxResult = 0
	private int minConstraint = 0
	private int maxConstraint = 0
	private static Logger log = Logger.getLogger("VideoGenUserContraintsVisitor")
	public List<Optional> sequencesToInactivate = new ArrayList
	
	new (Integer min, Integer max) {
		minConstraint = min
		maxConstraint = max
		val FileHandler fh = new FileHandler("/tmp/" + class.name + ".log")
        val formatter = new SimpleFormatter();  
        fh.setFormatter(formatter);
		log.addHandler(fh)
	}
	
	def visit(VideoGen vid) {
		log.info("VideoGen Variante constraints Visitor started...")
		VideoGenHelper.allTransitions(vid).forEach[visit]
		log.info("VideoGen Variante constraints Visitor : minResult=" + minResult)
		log.info("VideoGen Variante constraints Visitor : maxResult=" + maxResult)
		log.info("VideoGen Variante constraints Visitor : minConstraint=" + minConstraint)
		log.info("VideoGen Variante constraints Visitor : maxConstraint=" + maxConstraint)
		log.info("VideoGen Variante constraints Visitor : sequences=" + sequencesToInactivate)
	}
	
	def private void visit(Transition tra) {
		if (tra.active) {
			if (tra instanceof Optional) {
				tra.visit
			} else if (tra instanceof Alternatives) {
				tra.visit
			}
		}
	}
		
	def private visit(Alternatives alt) {
		log.info("VideoGen Variante constraints Visitor : " + alt)
		var done = false
		// Start with the maximum duration video and parse descendingly
		for (Optional option: alt.options.sortBy[video.duration].reverse) {
			log.info("VideoGen Variante constraints Visitor : \t" + option)
			if (
				minResult + option.video.duration < minConstraint
				|| maxResult + option.video.duration > maxConstraint
			) {
				sequencesToInactivate += option
				option.active = false
				log.info("VideoGen Variante constraints Visitor : \tKO")
			} else {
				// This sequence is good, next one will be smaller so don't need to insert the duration anymore
				if (!done) {
					done = true
					minResult += option.video.duration
				}
				log.info("VideoGen Variante constraints Visitor : \tOK")
			}
		}
	}
	
	def private visit(Optional opt) {
		log.info("VideoGen Variante constraints Visitor : " + opt)
		if (
			minResult + opt.video.duration < minConstraint
			|| maxResult + opt.video.duration > maxConstraint
		) {
			sequencesToInactivate += opt
			opt.active = false
			log.info("VideoGen Variante constraints Visitor : KO")
		} else {
			minResult += opt.video.duration
			log.info("VideoGen Variante constraints Visitor : OK")
		}
	}
}