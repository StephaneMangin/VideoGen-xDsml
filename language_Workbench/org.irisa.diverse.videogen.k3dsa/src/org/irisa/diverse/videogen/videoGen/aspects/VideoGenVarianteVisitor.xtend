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

class VideoGenVarianteVisitor {
	
	public int variantes = 0
		
	def visit(VideoGen vid) {
		println("VideoGen Variante Visitor started...")
		VideoGenHelper.allActiveSequences(vid).forEach[visit]
	}
	
	def private void visit(Sequence seq) {
		println("VideoGen Variante Visitor : " + seq)
		println("VideoGen Variante Visitor : " + variantes)
		if (seq instanceof Optional) {
			seq.visit
		} else if (seq instanceof Alternatives) {
			seq.visit
		}
	}
		
	def private visit(Alternatives alt) {
		if (alt.active) {
			if (variantes == 0) {
				variantes = alt.options.size
			} else {
				variantes *= alt.options.size
			}
		}
	}
	
	def private visit(Optional opt) {
		if (opt.active) {
			if (variantes == 0) {
				variantes = 2
			} else {
			variantes *= 2
			}
		}
	}
}