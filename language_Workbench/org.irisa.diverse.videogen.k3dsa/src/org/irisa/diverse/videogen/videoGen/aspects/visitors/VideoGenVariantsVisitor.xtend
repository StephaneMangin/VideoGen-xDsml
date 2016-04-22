package org.irisa.diverse.videogen.videoGen.aspects.visitors

import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper
import org.irisa.diverse.videogen.videoGen.Alternatives
import org.irisa.diverse.videogen.videoGen.Optional
import org.irisa.diverse.videogen.videoGen.Sequence
import org.irisa.diverse.videogen.videoGen.VideoGen

class VideoGenVariantsVisitor {
	
	public int variants = 1
		
	def VideoGenVariantsVisitor visit(VideoGen vid) {
		println("VideoGen Variants Visitor started...")
		VideoGenHelper.allSequences(vid).forEach[visit]
		this
	}
	
	def private visit(Sequence seq) {
		if (seq.active) {
			println("VideoGen Variants Visitor : " + seq)
			if (seq instanceof Optional) {
				seq.visit
			} else if (seq instanceof Alternatives) {
				seq.visit
			}
			println("VideoGen Variants Visitor : " + variants)
		}
	}
		
	def private visit(Alternatives alt) {
		variants *= alt.options.filter[active].size
	}
	
	def private visit(Optional opt) {
		variants *= 2
	}
}