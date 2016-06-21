package org.irisa.diverse.livemodeling.views.api

import java.util.Map
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.Platform
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.emf.common.EMFPlugin
import org.eclipse.jface.action.Action
import org.gemoc.executionframework.ui.views.engine.EngineSelectionDependentViewPart
import org.gemoc.xdsmlframework.api.core.IRunConfiguration
import org.irisa.diverse.livemodeling.views.Activator

abstract class AbstractView extends EngineSelectionDependentViewPart implements IView {
	
	private Map<String, Object> runConfigurationAttributes = null
	
	public static IModelAdapter[] modelAdaptors = newArrayOfSize(10)

	new() {
		Activator.^default.viewSupplier = this
	}
    
	override void dispose() {
		Activator.^default.viewSupplier = null;
		super.dispose();
	}
	
	override void addActionToToolbar(Action action) {
		val actionBars = getViewSite().getActionBars()
		val toolBar = actionBars.getToolBarManager()
		toolBar.add(action)
	}
	
	def private void setupRunConfigurationAttributes() {
//		val launchConfiguration = MseFactory.eINSTANCE.createLaunchConfiguration
//		val attributes = newHashMap()
//		
//		if (launchConfiguration.languageName != null) {
//			attributes.put(IRunConfiguration.LAUNCH_SELECTED_LANGUAGE, launchConfiguration.languageName)
//		}
//		if (launchConfiguration.resourceURI != null) {
//			attributes.put(AbstractDSLLaunchConfigurationDelegate.RESOURCE_URI,launchConfiguration.resourceURI)
//		}
//		if (launchConfiguration.airdResourceURI != null) {
//			attributes.put("airdResource", launchConfiguration.airdResourceURI)
//		} else {
//			attributes.put(AbstractDSLLaunchConfigurationDelegate.RESOURCE_URI, "platform:/resource//org.irisa.diverse.videogen/model/VideoGen.ecore")
//		}
//		if (launchConfiguration.methodEntryPoint != null) {
//			attributes.put(IRunConfiguration.LAUNCH_METHOD_ENTRY_POINT, launchConfiguration.methodEntryPoint)
//		}
//		if (launchConfiguration.modelEntryPoint != null) {
//			attributes.put(IRunConfiguration.LAUNCH_MODEL_ENTRY_POINT, launchConfiguration.modelEntryPoint)
//		}
//		if (launchConfiguration.initializationMethod != null) {
//			attributes.put(IRunConfiguration.LAUNCH_INITIALIZATION_METHOD, launchConfiguration.initializationMethod)
//		}
//		if (launchConfiguration.initializationArguments != null) {
//			attributes.put(IRunConfiguration.LAUNCH_INITIALIZATION_ARGUMENTS,launchConfiguration.initializationArguments)
//		}
//		for (String extensionName : launchConfiguration.addonExtensions) {
//			attributes.put(extensionName, true)
//		}
//		if (!attributes.empty) {
//			runConfigurationAttributes = attributes;
//		}
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
	/**
     * This will parse the currently running platform for extensions and store
     * all the match engines that can be found.
     */
    def static void parseExtensionMetadata() {
        if (EMFPlugin.IS_ECLIPSE_RUNNING) {
            val extensions = Platform.getExtensionRegistry().getExtensionPoint(IView.EXTENDER_PROVIDER_EXTENSION_POINT).getExtensions()
            extensions.forEach[
                val configElements = it.getConfigurationElements();
                configElements.forEach[
                    val modelAdaptor = AbstractView.parseEngine(it);
                    if (modelAdaptor != null) {
                        AbstractView.modelAdaptors.add(modelAdaptor);
                    }
                ]
            ]
        }
    }

    def private static IModelAdapter parseEngine(IConfigurationElement configElement) {
        if (!configElement.getName().equals(IView.TAG_ENGINE)) {
            return null;
        }
        configElement.createExecutableExtension("class") as IModelAdapter
    }
}