package org.irisa.diverse.live_modeling.views.api

import java.util.Map

interface IModelAdapter extends IModelNotifier {
		
	def Map<Long, Integer> getValues()
	
}