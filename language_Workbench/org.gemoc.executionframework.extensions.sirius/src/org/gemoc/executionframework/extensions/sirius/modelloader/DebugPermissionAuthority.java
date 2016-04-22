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
package org.gemoc.executionframework.extensions.sirius.modelloader;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ecore.extender.business.api.permission.IAuthorityListener;
import org.eclipse.sirius.ecore.extender.business.api.permission.LockStatus;
import org.eclipse.sirius.ecore.extender.business.internal.permission.AbstractPermissionAuthority;
import org.gemoc.executionframework.extensions.sirius.debug.DebugSessionFactory;
import org.gemoc.xdsmlframework.api.core.IExecutionCheckpoint;

@SuppressWarnings("restriction")
public class DebugPermissionAuthority extends AbstractPermissionAuthority
		implements IExecutionCheckpoint {

	/**
	 * Strictly positive if allowed.
	 * FIXME we use a map here because of https://support.jira.obeo.fr/browse/VP-2710
	 */
	private static final Map<ResourceSet, Integer> allow = new HashMap<ResourceSet, Integer>();

	public void allow(ResourceSet rs, boolean allow) {
		Integer integer = this.allow.get(rs);
		this.allow.put(rs, Integer.valueOf(1));
		return;
//		if (allow) {
//			if (integer == null) {
//				this.allow.put(rs, Integer.valueOf(1));
//			} else {
//				this.allow.put(rs, Integer.valueOf(integer.intValue() + 1));
//			}
//		} else {
//			if (integer == null) {
//				this.allow.put(rs, Integer.valueOf(-1));
//			} else {
//				this.allow.put(rs, Integer.valueOf(integer.intValue() - 1));
//			}
//		}
	}

	@Override
	public boolean canEditFeature(EObject eObj, String featureName) {
		Integer integer = 1;
//		System.out.println("canEditFeature :");
//		System.out.println(eObj);
		if (eObj != null) {
//			System.out.println(eObj.eResource());
			if (eObj.eResource() != null) {
//				System.out.println(eObj.eResource().getResourceSet());
				integer = allow.get(eObj.eResource().getResourceSet());
			}
		}
		return integer != null && integer.intValue() > 0;
	}

	@Override
	public boolean canEditInstance(EObject eObj) {
		Integer integer = 1;
//		System.out.println("#####################################################################################################");
//		System.out.println("Allow content : ");
		allow.forEach(new BiConsumer<ResourceSet, Integer>() {

			@Override
			public void accept(ResourceSet t, Integer u) {
				// TODO Auto-generated method stub
//				System.out.println("\t" + t + " - " + u);
				t.getResources().forEach(new Consumer<Resource>() {

					@Override
					public void accept(Resource t) {
						// TODO Auto-generated method stub
//						System.out.println("\t\t" + t);
					}
				});
				
			}

		});
//		System.out.println("#####################################################################################################");
//		System.out.println("canEditInstance :");
//		System.out.println(eObj);
		if (eObj != null) {
//			System.out.println(eObj.eResource());
			if (eObj.eResource() != null) {
//				System.out.println(eObj.eResource().getResourceSet());
				integer = allow.get(eObj.eResource().getResourceSet());
			}
		}
		return integer != null && integer.intValue() > 0;
	}

	@Override
	public boolean canCreateIn(EObject eObj) {
		Integer integer = 1;
//		System.out.println("canCreateIn :");
//		System.out.println(eObj);
		if (eObj != null) {
//			System.out.println(eObj.eResource());
			if (eObj.eResource() != null) {
//				System.out.println(eObj.eResource().getResourceSet());
				integer = allow.get(eObj.eResource().getResourceSet());
			}
		}
		return integer != null && integer.intValue() > 0;
	}

	@Override
	public boolean canDeleteInstance(EObject target) {
		Integer integer = 1;
//		System.out.println("canDeleteInstance :");
//		System.out.println(target);
		if (target != null) {
//			System.out.println(target.eResource());
			if (target.eResource() != null) {
//				System.out.println(target.eResource().getResourceSet());
				integer = allow.get(target.eResource().getResourceSet());
			}
		}
		return integer != null && integer.intValue() > 0;
	}

	@Override
	public void notifyInstanceChange(EObject instance) {
		System.out.println("notifyInstanceChange = " + instance);
		// nothing to do here
	}

	@Override
	public void notifyNewInstanceCreation(EObject instance) {
		System.out.println("notifyNewInstanceCreation = " + instance);
		// nothing to do here
	}

	@Override
	public void notifyInstanceDeletion(EObject instance) {
		System.out.println("notifyInstanceDeletion = " + instance);
		// nothing to do here
	}

	@Override
	public void setReportIssues(boolean report) {
		// nothing to do here
	}

	@SuppressWarnings("unchecked")
	@Override
	public void notifyLock(Collection<? extends EObject> elements) {
		for (IAuthorityListener listener : listeners) {
			listener.notifyIsLocked((Collection<EObject>) elements);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void notifyUnlock(Collection<? extends EObject> elements) {
		for (IAuthorityListener listener : listeners) {
			listener.notifyIsReleased((Collection<EObject>) elements);
		}
	}

	@Override
	public LockStatus getLockStatus(EObject element) {
		return LockStatus.NOT_LOCKED;
	}

}
