package org.irisa.diverse.live_modeling.views.api

import java.util.function.Supplier
import org.eclipse.jface.action.Action

interface IView extends Supplier<IView> {

	def void dispose()

	interface Command {
		def void execute()
	}

	def void addActionToToolbar(Action action)
	
	def void executeModel()
	
	override get() {
		this
	}
}