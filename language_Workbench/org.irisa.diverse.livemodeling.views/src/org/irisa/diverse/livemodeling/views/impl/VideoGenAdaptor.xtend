package org.irisa.diverse.livemodeling.views.impl

import java.util.List
import org.eclipse.emf.ecore.EObject
import org.irisa.diverse.livemodeling.api.IModelListener
import org.irisa.diverse.livemodeling.extensions.sirius.accessor.extender.LiveEcoreIntrinsicExtender
import org.irisa.diverse.livemodeling.views.constraint.IModelConstraintAdapter
import org.irisa.diverse.videogen.videogenl.aspects.VideoGenAspect
import org.irisa.diverse.videogen.videogenl.videoGen.VideoGen

class VideoGenAdaptor extends LiveEcoreIntrinsicExtender implements IModelConstraintAdapter {
	
	private VideoGen model

	override void addListener(IModelListener listener) {
		super.addListener(listener)
		if (listener instanceof VideoGen) {
			model = listener
		}
	}
	
	override void removeListener(IModelListener listener) {
		if (model.equals(listener)) {
			model = null
		}
		super.removeListener(listener)
	}
	
	override List<Integer> getStatisticalValues() {
		// Call the solver to get all possible solutions
		if (model != null) {
			val values = VideoGenAspect.solve(model)
			values.sort	
		}
		
	}
	
	override setModel(EObject obj) {
		model = obj as VideoGen
	}
	
}
