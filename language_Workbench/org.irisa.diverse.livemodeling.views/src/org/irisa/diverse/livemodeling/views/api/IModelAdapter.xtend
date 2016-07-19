package org.irisa.diverse.livemodeling.views.api

import java.util.List
import org.eclipse.emf.ecore.EObject

interface IModelAdapter extends IModelNotifier {
	
	def void setModel(EObject obj)
	
	def List<Integer> getStatisticalValues()
	
	def Object getExecutionResult()
	
}