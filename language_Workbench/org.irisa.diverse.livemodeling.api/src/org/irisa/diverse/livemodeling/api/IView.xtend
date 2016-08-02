package org.irisa.diverse.livemodeling.api

import java.util.List
import java.util.function.Supplier
import org.eclipse.jface.action.Action
import org.eclipse.swt.widgets.Composite

interface IView extends Supplier<IView> {

	
    /** Name of the extension point to parse for extender providers. */
    static final String EXTENDER_PROVIDER_EXTENSION_POINT = "org.irisa.diverse.livemodeling.views.modelAdaptor"; //$NON-NLS-1$

    /** Externalized here to avoid too many distinct usages. */
    static final String TAG_ENGINE = "liveViewsModelAdaptor"; //$NON-NLS-1$
    
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
	
	def IModelAdapter[] getModelAdapters()
	
	def void update()
	
	def List<Integer> getValues()
}
