/*******************************************************************************
 * Copyright (c) 2007, 2011 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.irisa.diverse.livemodeling.extensions.sirius.accessor.extender;

import org.eclipse.sirius.ecore.extender.business.internal.accessor.ecore.EcoreIntrinsicExtender;

/**
 * This metamodel Extender accesses the intrinsic data of an EObject.
 * 
 * @author cbrun
 * 
 */
@SuppressWarnings("restriction")
public class LiveEcoreIntrinsicExtender extends EcoreIntrinsicExtender {

	public LiveEcoreIntrinsicExtender() {
		super();
		System.out.println("+++++++++++++++++++++++++ INSTANCIATION : LiveEcoreIntrinsicExtender");
	}

	
	
}
