package org.irisa.diverse.videogen.videoGen.aspects

import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper
import org.irisa.diverse.videogen.videoGen.Alternatives
import org.irisa.diverse.videogen.videoGen.Optional
import org.irisa.diverse.videogen.videoGen.Sequence
import org.irisa.diverse.videogen.videoGen.VideoGen

class VideoGenVarianteVisitor {
	
	public int variantes = 0
		
	def visit(VideoGen vid) {
		println("VideoGen Variante Visitor started...")
		VideoGenHelper.allActiveSequences(vid).forEach[visit]
	}
	
	def private void visit(Sequence seq) {
		if (seq.active) {
			println("VideoGen Variante Visitor : " + seq)
			if (seq instanceof Optional) {
				seq.visit
			} else if (seq instanceof Alternatives) {
				seq.visit
			}
			println("VideoGen Variante Visitor : " + variantes)
		}
	}
		
	def private visit(Alternatives alt) {
		val optionSize = alt.options.filter[active].size
		if (variantes == 0) {
			variantes = optionSize
		} else {
			variantes *= optionSize
		}
	}
	
	def private visit(Optional opt) {
		if (variantes == 0) {
			variantes = 2
		} else {
			variantes *= 2
		}
	}
}