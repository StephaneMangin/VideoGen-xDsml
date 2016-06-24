package org.irisa.diverse.livemodeling.views.api

import org.eclipse.emf.common.util.EList

interface IModelAdapter extends IModelNotifier {
	
	def void setModel(Object obj)
	
	def EList<Integer> getValues()
	
}