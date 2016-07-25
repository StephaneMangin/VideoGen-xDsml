package org.irisa.diverse.livemodeling.api

import org.irisa.diverse.livemodeling.api.IModelListener

interface IModelNotifier {

	def void notifyListeners()

	def void addListener(IModelListener listener)

	def void removeListener(IModelListener listener)

}
