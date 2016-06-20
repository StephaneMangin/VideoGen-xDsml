package org.irisa.diverse.live_modeling.views.impl

import java.util.ArrayList
import java.util.List
import java.util.Map
import org.irisa.diverse.live_modeling.views.api.IModelAdapter
import org.irisa.diverse.live_modeling.views.api.IModelListener
import org.irisa.diverse.videogen.videoGen.Sequence
import org.irisa.diverse.videogen.videoGen.VideoGen
import static extension org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspect.*

class ModelAdapterImpl implements IModelAdapter {
	
	private VideoGen model
	
	new(VideoGen model) {
		this.model = model
	}
	
	val List<IModelListener> listeners = new ArrayList

	override void notifyListeners() { listeners.forEach[l|l.update] }

	override void addListener(IModelListener listener) { listeners.add(listener) }

	override void removeListener(IModelListener listener) { listeners.remove(listener) }
		
	override Map<Long, Integer> getValues() {
		// Call the solver to get all possible solutions
		val sequences = model.transitions.filter[active == true].filter[it instanceof Sequence].map[it as Sequence]
		val values = model.solve
		println("################# GET VALUES START")
		println(values)
		println("##### GET VALUES END")
		values
	}
	
}