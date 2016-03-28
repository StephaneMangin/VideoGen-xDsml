package org.irisa.diverse.videogen.xdsml.debug.design.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices;

import videoGen.Optional;
import videoGen.VideoGen;

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
	
	/**
	 * Tells if the given {@link EObject instruction} is a currently debugged
	 * instruction. A debugged instruction in this context is an instruction a
	 * debug target is suspended on.
	 * 
	 * @param instruction
	 *            the {@link EObject instruction}
	 * @return <code>true</code> if the given {@link EObject instruction} is a
	 *         currently selected sequence, <code>false</code> otherwise
	 */
	public boolean isSelectedSequence(EObject instruction) {
		System.out.println("########################################");
		System.out.println(instruction);
		System.out.println("########################################");
		if (instruction instanceof Optional) {
			return ((Optional) instruction).getVideo().getSelected();
		}
		return false;
	}
}
