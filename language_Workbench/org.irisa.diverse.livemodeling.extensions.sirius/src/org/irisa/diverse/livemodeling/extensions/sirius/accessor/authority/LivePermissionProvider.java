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
import org.eclipse.sirius.ecore.extender.business.internal.permission.DummyPermissionAuthority;
import org.gemoc.xdsmlframework.api.core.IExecutionCheckpoint;
import org.gemoc.executionframework.extensions.sirius.modelloader.DebugPermissionAuthority;
import org.gemoc.executionframework.extensions.sirius.modelloader.DebugPermissionProvider;

public class LivePermissionProvider extends DebugPermissionProvider {

	public LivePermissionProvider() {
		super();
		System.out.println("+++++++++++++++++++++++++ INSTANCIATION : LivePermissionProvider");
	}
	
	@Override
	public IPermissionAuthority getAuthority(final ResourceSet set) {
		final LivePermissionAuthority res;

//		final LivePermissionAuthority existing = (LivePermissionAuthority) IExecutionCheckpoint.CHECKPOINTS
//				.get(set);
//		if (existing != null) {
//			res = existing;
//		} else {
			res = new LivePermissionAuthority();
			IExecutionCheckpoint.CHECKPOINTS.put(set, res);
			declareResource(set);
//		}

		return res;
	}

	/**
	 * Add listeners to the session for action related changes
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
						System.out.println("############################# Representation notify ################################");
					
						switch (changeKind) {
						
							case SessionListener.CLOSED:
								IExecutionCheckpoint.CHECKPOINTS.remove(set);
								System.out.println("############################# Representation has been closed ################################");
								break;

							case SessionListener.REPRESENTATION_CHANGE:
								System.out.println("############################# Representation has changed ################################");
								break;
								
							case SessionListener.REPRESENTATION_EDITION_PERMISSION_DENIED:
								System.out.println("############################# Representation edition denied ################################");
								break;
								
							case SessionListener.REPRESENTATION_EDITION_PERMISSION_GRANTED:
								System.out.println("############################# Representation edition granted ################################");
								break;
								
							case SessionListener.ABOUT_TO_BE_REPLACED:
								System.out.println("############################# Representation about to be replaced ################################");
								break;
								
							case SessionListener.CLOSING:
								System.out.println("############################# Representation closing ################################");
								break;
								
							case SessionListener.DIRTY:
								System.out.println("############################# Representation dirty ################################");
								break;
								
							case SessionListener.OPENING:
								System.out.println("############################# Representation opening ################################");
								break;
								
							case SessionListener.REPLACED:
								System.out.println("############################# Representation replaced ################################");
								break;
								
							case SessionListener.OTHER:
								System.out.println("############################# Representation other action ################################");
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
