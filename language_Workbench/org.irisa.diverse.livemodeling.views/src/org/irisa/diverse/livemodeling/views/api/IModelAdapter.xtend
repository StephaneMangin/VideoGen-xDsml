package org.irisa.diverse.livemodeling.views.api

import java.util.Map

interface IModelAdapter extends IModelNotifier {
	
	def void setModel(Object obj)
	
	def Map<Long, Integer> getValues()
	
}