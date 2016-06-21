package org.irisa.diverse.videogen.videoGen.aspects.debugViewModelAdaptor

import java.util.ArrayList
import java.util.List
import java.util.Map
import org.irisa.diverse.livemodeling.views.api.IModelAdapter
import org.irisa.diverse.livemodeling.views.api.IModelListener
import org.irisa.diverse.videogen.videoGen.VideoGen

import static extension org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspect.*

class VideoGenAdaptor implements IModelAdapter {
	
	private VideoGen model
	
	new() {
	}
	
	val List<IModelListener> listeners = new ArrayList

	override void notifyListeners() { listeners.forEach[l|l.update] }

	override void addListener(IModelListener listener) { listeners.add(listener) }

	override void removeListener(IModelListener listener) { listeners.remove(listener) }
		
	override Map<Long, Integer> getValues() {
		// Call the solver to get all possible solutions
		val values = model.solve
		println("################# GET VALUES START")
		println(values)
		println("##### GET VALUES END")
		values
	}
	
	override setModel(Object obj) {
		model = obj as VideoGen
	}
	
}