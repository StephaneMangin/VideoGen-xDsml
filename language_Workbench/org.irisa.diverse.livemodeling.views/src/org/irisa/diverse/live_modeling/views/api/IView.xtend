package org.irisa.diverse.live_modeling.views.api

import java.util.function.Supplier
import org.eclipse.jface.action.Action
import org.eclipse.ui.IEditorPart
import org.eclipse.swt.widgets.Composite

interface IView extends Supplier<IView> {

	def void dispose()

	interface Command {
		def void execute()
	}

	def void addActionToToolbar(Action action)
	
	def void setFocus()
	 
	def void createPartControl(Composite parent)
	
	def void executeModel()
	
	override get() {
		this
	}
}