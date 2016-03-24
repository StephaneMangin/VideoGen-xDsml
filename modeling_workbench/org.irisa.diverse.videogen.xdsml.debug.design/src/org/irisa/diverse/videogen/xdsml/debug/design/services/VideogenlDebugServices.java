package org.irisa.diverse.videogen.xdsml.debug.design.services;

import java.util.ArrayList;
import java.util.List;

import org.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices;

public class VideogenlDebugServices extends AbstractGemocDebuggerServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

		res.add(new StringCouple("VideoGenL", "Debug"));

		return res;
	}
	
	@Override
	public String getModelIdentifier() {
		return org.gemoc.execution.sequential.javaengine.ui.Activator.PLUGIN_ID+".debugModel";
	}
}
