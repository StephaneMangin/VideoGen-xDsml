package org.irisa.diverse.live_modeling.views.api

import fr.obeo.dsl.debug.ide.launch.AbstractDSLLaunchConfigurationDelegate
import java.util.Map
import org.eclipse.core.runtime.CoreException
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.jface.action.Action
import org.gemoc.executionframework.engine.mse.MseFactory
import org.gemoc.executionframework.ui.views.engine.EngineSelectionDependentViewPart
import org.gemoc.xdsmlframework.api.core.IRunConfiguration

abstract class AbstractView extends EngineSelectionDependentViewPart implements IView {
	
	private Map<String, Object> runConfigurationAttributes = null

	override void addActionToToolbar(Action action) {
		val actionBars = getViewSite().getActionBars()
		val toolBar = actionBars.getToolBarManager()
		toolBar.add(action)
	}
	
	def private void setupRunConfigurationAttributes() {
		val launchConfiguration = MseFactory.eINSTANCE.createLaunchConfiguration
		val attributes = newHashMap()
		
		if (launchConfiguration.languageName != null) {
			attributes.put(IRunConfiguration.LAUNCH_SELECTED_LANGUAGE, launchConfiguration.languageName)
		}
		if (launchConfiguration.resourceURI != null) {
			attributes.put(AbstractDSLLaunchConfigurationDelegate.RESOURCE_URI,launchConfiguration.resourceURI)
		}
		if (launchConfiguration.airdResourceURI != null) {
			attributes.put("airdResource", launchConfiguration.airdResourceURI)
		}
		if (launchConfiguration.methodEntryPoint != null) {
			attributes.put(IRunConfiguration.LAUNCH_METHOD_ENTRY_POINT, launchConfiguration.methodEntryPoint)
		}
		if (launchConfiguration.modelEntryPoint != null) {
			attributes.put(IRunConfiguration.LAUNCH_MODEL_ENTRY_POINT, launchConfiguration.modelEntryPoint)
		}
		if (launchConfiguration.initializationMethod != null) {
			attributes.put(IRunConfiguration.LAUNCH_INITIALIZATION_METHOD, launchConfiguration.initializationMethod)
		}
		if (launchConfiguration.initializationArguments != null) {
			attributes.put(IRunConfiguration.LAUNCH_INITIALIZATION_ARGUMENTS,launchConfiguration.initializationArguments)
		}
		for (String extensionName : launchConfiguration.addonExtensions) {
			attributes.put(extensionName, true)
		}
		if (!attributes.empty) {
			runConfigurationAttributes = attributes;
		}
	}

	override void executeModel() {
		setupRunConfigurationAttributes()
		val manager = DebugPlugin.^default.launchManager
		val launchName = manager.generateLaunchConfigurationName(runConfigurationAttributes.get(IRunConfiguration.LAUNCH_SELECTED_LANGUAGE) as String)
		val type = manager.getLaunchConfigurationType("org.gemoc.execution.sequential.javaengine.ui.launcher")
		try {
			val workingCopy = type.newInstance(null, launchName)
			workingCopy.setAttributes(runConfigurationAttributes)
			workingCopy.launch("debug", null, false, true)
		} catch (CoreException e) {
			e.printStackTrace()
		}
	}
		
}