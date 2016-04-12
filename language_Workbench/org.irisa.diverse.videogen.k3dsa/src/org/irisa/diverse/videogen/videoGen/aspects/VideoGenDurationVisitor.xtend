package org.irisa.diverse.videogen.videoGen.aspects

import org.irisa.diverse.videogen.videoGen.VideoGen
import org.irisa.diverse.videogen.videoGen.Sequence
import org.irisa.diverse.videogen.videoGen.Mandatory
import org.irisa.diverse.videogen.videoGen.Alternatives
import org.irisa.diverse.videogen.videoGen.Optional
import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper
import java.util.ArrayList
import java.util.List
import org.irisa.diverse.videogen.videoGen.Introduction
import org.irisa.diverse.videogen.videoGen.Conclusion

class VideoGenDurationVisitor {
	
	public int minDuration = 0
	public int maxDuration = 0
	
	Boolean selected = false
	List<String> doneSequences = new ArrayList
	
	new(Boolean selected) {
		this.selected = selected
	}
	
	def visit(VideoGen vid) {
		println("VideoGen Duration Visitor started...")
		visit(VideoGenHelper.getIntroduction(vid as VideoGen) as Sequence)
		println(doneSequences)
	}
	
	def private void visit(Sequence seq) {
		if (doneSequences.contains(seq.name)) {
			return
		}
		if (seq instanceof Mandatory) {
			seq.visit
		} else if (seq instanceof Introduction) {
			seq.visit
		} else if (seq instanceof Conclusion) {
			seq.visit
			return
		} else if (seq instanceof Optional) {
			seq.visit
		} else if (seq instanceof Alternatives) {
			seq.visit
		}
		doneSequences.add(seq.name)
		if (seq.nextSequence !== null) {
			seq.nextSequence.visit
		}
	}
	
	def private visit(Introduction intro) {
		println("VideoGen Duration Visitor : " + intro)
	}
	
	def private visit(Conclusion outro) {
		println("VideoGen Duration Visitor : " + outro)
		println("VideoGen Duration Visitor ended.")
	}
	
	def private visit(Mandatory man) {
		println("VideoGen Duration Visitor : " + man)
		minDuration += man.video.duration
		maxDuration += man.video.duration
	}
	
	def private visit(Alternatives alt) {
		println("VideoGen Duration Visitor : " + alt)
		if (!selected) {
			var int min = 0
			var int max = 0
			for (Optional opt: alt.options) {
				if (doneSequences.contains(opt.name)) {
					return
				}
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
				doneSequences.add(opt.name)
				if (opt.nextSequence !== null) {
					opt.nextSequence.visit
				}
			}
			minDuration += min
			maxDuration += max
		} else {
			for (Optional opt: alt.options) {
				if (opt.video == alt.video) {
					println("##################################### OK ###############################")
					visit(opt as Sequence)
				}
			}
		}
	}
	
	def private visit(Optional opt) {
		println("VideoGen Duration Visitor : " + opt)
		if (selected && opt.video.selected) {
			maxDuration += opt.video.duration
		} else {
			maxDuration += opt.video.duration
		}
	}
}