package org.irisa.diverse.live_modeling.views.constraint

import com.google.common.collect.BiMap
import com.google.common.collect.HashBiMap
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.gemoc.executionframework.engine.mse.LaunchConfiguration
import org.gemoc.executionframework.engine.mse.MseFactory
import org.gemoc.xdsmlframework.api.core.IBasicExecutionEngine
import org.gemoc.xdsmlframework.api.core.IExecutionContext
import org.gemoc.xdsmlframework.api.core.IRunConfiguration
import org.gemoc.xdsmlframework.api.engine_addon.IEngineAddon
import org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.BatchModelChangeListenerAddon
import org.irisa.diverse.live_modeling.views.api.IModelListener
import org.irisa.diverse.live_modeling.views.api.IModelNotifier
import org.irisa.diverse.live_modeling.views.impl.ModelAdapterImpl
import org.irisa.diverse.live_modeling.views.api.IModelAdapter

public abstract class ConstraintEngineAddon implements IEngineAddon, IModelListener, IModelNotifier {

	private IExecutionContext _executionContext
	private IModelAdapter modelAdapter

	private BatchModelChangeListenerAddon listenerAddon
	
	//abstract def IModelExplorer loadTrace(Resource traceResource)

	//abstract def IModelExplorer loadTrace(Resource modelResource, Resource traceResource, Map<EObject, EObject> tracedToExe)

	private val List<IModelListener> listeners = new ArrayList

	override void notifyListeners() { listeners.forEach[l|l.update] }

	override void addListener(IModelListener listener) { listeners.add(listener) }

	override void removeListener(IModelListener listener) { listeners.remove(listener) }

	private def LaunchConfiguration setupRunConfigurationAttributes(IRunConfiguration configuration) {
		val LaunchConfiguration launchConfiguration = MseFactory.eINSTANCE.createLaunchConfiguration
		if (configuration.getLanguageName() != "") {
			launchConfiguration.languageName = configuration.getLanguageName
		}
		val modelURI = configuration.getExecutedModelURI();
		if (modelURI != null) {
			val scheme = modelURI.scheme() + ":/resource";
			launchConfiguration.resourceURI = modelURI.toString.substring(scheme.length)
		}
		val animatorURI = configuration.getAnimatorURI();
		if (configuration.getAnimatorURI() != null) {
			val scheme = animatorURI.scheme() + ":/resource";
			launchConfiguration.airdResourceURI = animatorURI.toString.substring(scheme.length);
		}
		if (configuration.getExecutionEntryPoint() != null) {
			launchConfiguration.methodEntryPoint = configuration.getExecutionEntryPoint
		}
		if (configuration.getModelEntryPoint() != null) {
			launchConfiguration.modelEntryPoint = configuration.getModelEntryPoint;
		}
		if (configuration.getModelInitializationMethod() != null) {
			launchConfiguration.initializationMethod = configuration.getModelInitializationMethod
		}
		if (configuration.getModelInitializationArguments() != null) {
			launchConfiguration.initializationArguments = configuration.getModelInitializationArguments
		}
		configuration.getEngineAddonExtensions.forEach[
			extensionPoint|launchConfiguration.addonExtensions.add(extensionPoint.name)
		]
		return launchConfiguration
	}

	/**
	 * Sort-of constructor for the constraint manager.
	 */
	private def void setUp(IBasicExecutionEngine engine) {
		if (_executionContext == null) {
			_executionContext = engine.executionContext

			val modelResource = _executionContext.resourceModel

			// Creating the resource of the trace
			val ResourceSet rs = modelResource.getResourceSet()
			val URI traceModelURI = URI.createPlatformResourceURI(
				_executionContext.getWorkspace().getExecutionPath().toString() + "/execution.trace", false)
			val Resource traceResource = rs.createResource(traceModelURI)

			// We construct a new listener addon if required
			this.listenerAddon = if (engine.hasAddon(BatchModelChangeListenerAddon)) {
				engine.getAddon(BatchModelChangeListenerAddon)
			} else {
				new BatchModelChangeListenerAddon(engine)
			}
			listenerAddon.registerObserver(this)

			val launchConfiguration = setupRunConfigurationAttributes(engine.executionContext.runConfiguration)

			val BiMap<EObject, EObject> exeToTraced = HashBiMap.create
			if (modelAdapter == null) {
				// And we enable trace exploration by loading it in a new trace explorer
				modelAdapter = new ModelAdapterImpl(modelResource)
				listenerAddon.registerObserver(modelAdapter)
			}
		}
	}

	//public def void load(Resource traceModel) {
	//	modelExplorer = loadTrace(traceModel)

	private static def String getEPackageFQN(EPackage p, String separator) {
		val EPackage superP = p.getESuperPackage
		if (superP != null) {
			return getEPackageFQN(superP, separator) + separator + p.name
		} else {
			return p.name.toFirstUpper
		}
	}

	/**
	 * To construct the trace manager
	 */
	override engineAboutToStart(IBasicExecutionEngine engine) {
		setUp(engine)
	}

}