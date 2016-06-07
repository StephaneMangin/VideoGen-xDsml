package org.irisa.diverse.live_modeling.views.impl

import org.eclipse.emf.ecore.resource.Resource
import org.irisa.diverse.live_modeling.views.api.IModelAdapter
import org.irisa.diverse.live_modeling.views.api.IModelListener
import java.util.List
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import java.util.Map
import org.irisa.diverse.videogen.videoGen.VideoGen

class ModelAdapterImpl implements IModelAdapter {
	
	private Resource model
	
	new(Resource model) {
		this.model = model
	}
	
	val List<IModelListener> listeners = new ArrayList

	override void notifyListeners() { listeners.forEach[l|l.update] }

	override void addListener(IModelListener listener) { listeners.add(listener) }

	override void removeListener(IModelListener listener) { listeners.remove(listener) }
		
	override Map<Object, Object> getValues() {
//		val values = newLinkedHashMap()
//		val objects = model.resourceSet.resources.get(0).contents
//		for (root: objects) {
//			if (root instanceof VideoGen) {
//				for (transition: root.transitions) {
//					
//				}
//			}
//		}
//		values as Map<Number, Number>
	}
	
}