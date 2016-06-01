package org.irisa.diverse.live_modeling.views.api

interface IModelNotifier {

	def void notifyListeners()

	def void addListener(IModelListener listener)

	def void removeListener(IModelListener listener)

}