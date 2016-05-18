package org.irisa.diverse.videogen.videogenl.trace.tracemanager;

import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public class VideoGenTraceEngineAddon extends AbstractTraceAddon {

	private VideoGenTraceStepFactory factory = null;

	@Override
	public fr.inria.diverse.trace.gemoc.api.IGemocTraceManager constructTraceManager(Resource exeModel,
			Resource traceResource) {
		return new VideoGenTraceManager(exeModel, traceResource);
	}

	@Override
	public fr.inria.diverse.trace.gemoc.api.IGemocTraceManager loadTrace(Resource exeModel, Resource traceResource) {
		VideoGenTraceManager manager = new VideoGenTraceManager(exeModel, traceResource);
		manager.loadTrace((videoGenTrace.Trace) traceResource.getContents().get(0));
		return manager;
	}

	@Override
	public IStepFactory getFactory() {
		if (factory == null)
			factory = new VideoGenTraceStepFactory();
		return factory;
	}

	@Override
	public boolean isAddonForTrace(EObject root) {
		return root instanceof videoGenTrace.Trace;
	}

}