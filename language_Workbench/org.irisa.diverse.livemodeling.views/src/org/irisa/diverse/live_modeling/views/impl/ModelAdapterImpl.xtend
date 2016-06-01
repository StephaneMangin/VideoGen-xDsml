package org.irisa.diverse.live_modeling.views.impl

import org.eclipse.emf.ecore.resource.Resource
import org.irisa.diverse.live_modeling.views.api.IModelAdapter
import org.irisa.diverse.live_modeling.views.api.IModelListener

class ModelAdapterImpl implements IModelAdapter {
	
	private Resource model
	
	new(Resource model) {
		this.model = model
	}
	
	override notifyListeners() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override addListener(IModelListener listener) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override removeListener(IModelListener listener) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}