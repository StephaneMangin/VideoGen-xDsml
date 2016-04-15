package org.irisa.diverse.videogen.videoGen.aspects

import org.irisa.diverse.videogen.videoGen.VideoGen
import org.irisa.diverse.videogen.videoGen.Sequence
import org.irisa.diverse.videogen.videoGen.Mandatory
import org.irisa.diverse.videogen.videoGen.Alternatives
import org.irisa.diverse.videogen.videoGen.Optional
import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper
import java.util.ArrayList
import java.util.List
import org.irisa.diverse.videogen.videoGen.Transition
import org.irisa.diverse.videogen.videoGen.Initialize
import org.irisa.diverse.videogen.videoGen.Generate

class VideoGenDurationVisitor {
	
	public int minDuration = 0
	public int maxDuration = 0
	
	Boolean selected = false
	List<String> doneTransitions = new ArrayList
	
	new(Boolean selected) {
		this.selected = selected
	}
	
	def visit(VideoGen vid) {
		println("VideoGen Duration Visitor started...")
		VideoGenHelper.allActiveSequences(vid).forEach[visit]
		println(doneTransitions)
	}
	
	def private void visit(Sequence seq) {
		println("VideoGen Duration Visitor : " + seq)
		if (seq instanceof Mandatory) {
			seq.visit
		} else if (seq instanceof Optional) {
			seq.visit
		} else if (seq instanceof Alternatives) {
			seq.visit
		}
	}
	
	def private visit(Mandatory man) {
		minDuration += man.video.duration
		maxDuration += man.video.duration
	}
	
	def private visit(Alternatives alt) {
		if (!selected) {
			var int min = 0
			var int max = 0
			for (Optional opt: alt.options) {
				val duration = opt.video.duration
				if (min == 0) {
					min = duration
				}
				if (min > duration) {
					min = duration
				}	
				if (max < duration) {
					max = duration
				}
			}
			minDuration += min
			maxDuration += max
		} else {
			for (Optional opt: alt.options) {
				if (opt.video == alt.video) {
					visit(opt as Sequence)
				}
			}
		}
	}
	
	def private visit(Optional opt) {
		if (selected && opt.video.selected) {
			maxDuration += opt.video.duration
		} else {
			maxDuration += opt.video.duration
		}
	}
}