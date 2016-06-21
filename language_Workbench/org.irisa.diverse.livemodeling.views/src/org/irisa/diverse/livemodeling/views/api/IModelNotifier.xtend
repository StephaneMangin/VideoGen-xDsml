package org.irisa.diverse.livemodeling.views.api

interface IModelNotifier {

	def void notifyListeners()

	def void addListener(IModelListener listener)

	def void removeListener(IModelListener listener)

}