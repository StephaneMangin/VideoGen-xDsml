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
			if (set.getResources().size() > 0) {
				final Session session = SessionManager.INSTANCE.getSession(set
						.getResources().get(0));
				if (session != null) {
					session.addListener(new SessionListener() {

						@Override
						public void notify(int changeKind) {
							if (changeKind == SessionListener.CLOSED) {
								IExecutionCheckpoint.CHECKPOINTS.remove(set);
							}
						}
					});
				}
			}
		}

		return res;
	}

}
