package org.irisa.diverse.livemodeling.views.impl

import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.irisa.diverse.livemodeling.views.api.IModelAdapter
import org.irisa.diverse.livemodeling.views.api.IModelListener
import org.irisa.diverse.videogen.videogenl.aspects.VideoGenAspect
import org.irisa.diverse.videogen.videogenl.videoGen.VideoGen

class VideoGenAdaptor implements IModelAdapter {
	
	private VideoGen model
	val List<IModelListener> listeners = new ArrayList

	override void notifyListeners() { listeners.forEach[l|l.update] }

	override void addListener(IModelListener listener) { listeners.add(listener) }

	override void removeListener(IModelListener listener) { listeners.remove(listener) }
		
	override List<Integer> getStatisticalValues() {
		// Call the solver to get all possible solutions
		VideoGenAspect.initializeModel(model, {})
		val values = VideoGenAspect.solve(model)
		println("################# GET VALUES START")
		println(values)
		println("##### GET VALUES END")
		values.sort
	}
	
	override Object getExecutionResult() {
		VideoGenAspect.initializeModel(model, {})
		VideoGenAspect.main(model)
		//VideoGenAspect.getResult(model)
		null
	}
	
	override setModel(EObject obj) {
		model = obj as VideoGen
	}
	
}
