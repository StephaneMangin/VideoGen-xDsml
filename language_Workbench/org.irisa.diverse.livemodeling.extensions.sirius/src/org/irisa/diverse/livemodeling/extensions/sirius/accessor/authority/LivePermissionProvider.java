/*******************************************************************************
 * Copyright (c) 2016 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.irisa.diverse.livemodeling.extensions.sirius.accessor.authority;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ecore.extender.business.api.permission.IPermissionAuthority;
import org.gemoc.xdsmlframework.api.core.IExecutionCheckpoint;
import org.gemoc.executionframework.extensions.sirius.modelloader.DebugPermissionProvider;

public class LivePermissionProvider extends DebugPermissionProvider {

	@Override
	public IPermissionAuthority getAuthority(final ResourceSet set) {
		final LivePermissionAuthority res;
		final LivePermissionAuthority existing = (LivePermissionAuthority) IExecutionCheckpoint.CHECKPOINTS.get(set);

		if (existing != null) {
			res = existing;
		} else {
			res = new LivePermissionAuthority();
			IExecutionCheckpoint.CHECKPOINTS.put(set, res);
			declareResource(set);
		}
		
		return res;
	}

	/**
	 * 
	 * 
	 * @param set
	 */
	private void declareResource(final ResourceSet set) {
		List<Resource> resources = set.getResources();
		if (!resources.isEmpty()) {
			final Session session = SessionManager.INSTANCE.getSession(resources.get(0));
			if (session != null) {
				session.addListener(new SessionListener() {
					@Override
					public void notify(int changeKind) {
						switch (changeKind) {
						
							case SessionListener.CLOSED:
								IExecutionCheckpoint.CHECKPOINTS.remove(set);
								break;
								
							case SessionListener.REPRESENTATION_CHANGE:
								System.out.println("############################# Representation has changed ################################");
								break;
								
							default:
								// TODO
						}
					}
				});
			}
		}
	}
}