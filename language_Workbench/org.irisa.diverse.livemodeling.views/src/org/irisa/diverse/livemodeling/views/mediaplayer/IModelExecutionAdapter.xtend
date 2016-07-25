package org.irisa.diverse.livemodeling.views.mediaplayer

import org.irisa.diverse.livemodeling.api.IModelAdapter

interface IModelExecutionAdapter extends IModelAdapter {
	
	def Object getExecutionResult()
}