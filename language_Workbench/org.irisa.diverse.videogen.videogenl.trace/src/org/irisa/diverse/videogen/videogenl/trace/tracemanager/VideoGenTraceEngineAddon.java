package org.irisa.diverse.videogen.videogenl.trace.tracemanager;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.diverse.trace.gemoc.api.IStepFactory;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;
import fr.inria.diverse.trace.gemoc.api.ITraceExplorer;
import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon;

public class VideoGenTraceEngineAddon extends AbstractTraceAddon {

	private VideoGenTraceStepFactory factory = null;

	@Override
	public ITraceConstructor constructTraceConstructor(Resource modelResource, Resource traceResource,
			Map<EObject, EObject> exeToTraced) {
		return new VideoGenTraceConstructor(modelResource, traceResource, exeToTraced);
	}

	@Override
	public ITraceExplorer loadTrace(Resource traceResource) {
		VideoGenTraceExplorer explorer = new VideoGenTraceExplorer();
		EObject root = traceResource.getContents().get(0);
		if (root instanceof videoGenTrace.SpecificTrace) {
			explorer.loadTrace((videoGenTrace.SpecificTrace) root);
			return explorer;
		}
		return null;
	}

	@Override
	public ITraceExplorer loadTrace(Resource modelResource, Resource traceResource, Map<EObject, EObject> tracedToExe) {
		VideoGenTraceExplorer explorer = new VideoGenTraceExplorer(tracedToExe);
		EObject root = traceResource.getContents().get(0);
		if (root instanceof videoGenTrace.SpecificTrace) {
			explorer.loadTrace(modelResource, (videoGenTrace.SpecificTrace) root);
			return explorer;
		}
		return null;
	}

	@Override
	public IStepFactory getFactory() {
		if (factory == null)
			factory = new VideoGenTraceStepFactory();
		return factory;
	}

	@Override
	public boolean isAddonForTrace(EObject root) {
		return root instanceof videoGenTrace.SpecificTrace;
	}

}