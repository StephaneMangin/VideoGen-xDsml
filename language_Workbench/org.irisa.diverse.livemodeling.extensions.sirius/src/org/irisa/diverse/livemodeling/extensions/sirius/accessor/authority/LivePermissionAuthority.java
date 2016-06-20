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
import org.eclipse.sirius.ecore.extender.business.internal.permission.DummyPermissionAuthority;
import org.gemoc.xdsmlframework.api.core.IExecutionCheckpoint;

@SuppressWarnings("restriction")
public class LivePermissionAuthority extends DummyPermissionAuthority implements IExecutionCheckpoint {

	public LivePermissionAuthority() {
		super();
		System.out.println("+++++++++++++++++++++++++ INSTANCIATION : LivePermissionAuthority");
	}
	
	@Override
	public void allow(ResourceSet rs, boolean allow) {
		// TODO Auto-generated method stub
		// Nothing to do yet
	}

}
