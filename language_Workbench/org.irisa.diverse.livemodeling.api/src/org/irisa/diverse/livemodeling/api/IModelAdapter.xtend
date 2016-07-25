package org.irisa.diverse.livemodeling.api

import org.eclipse.emf.ecore.EObject

interface IModelAdapter extends IModelNotifier {
	
	def void setModel(EObject obj)
	
}
