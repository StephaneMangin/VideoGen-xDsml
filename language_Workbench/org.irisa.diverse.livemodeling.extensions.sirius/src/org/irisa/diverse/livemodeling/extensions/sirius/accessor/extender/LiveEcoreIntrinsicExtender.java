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

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.sirius.ecore.extender.business.internal.accessor.ecore.EcoreIntrinsicExtender;
import org.irisa.diverse.livemodeling.api.IModelListener;
import org.irisa.diverse.livemodeling.api.IModelNotifier;

/**
 * This metamodel Extender accesses the intrinsic data of an EObject.
 * 
 * @author smangin
 * 
 */
@SuppressWarnings("restriction")
public class LiveEcoreIntrinsicExtender extends EcoreIntrinsicExtender implements IModelNotifier {
	
	private final List<IModelListener> listeners = new ArrayList<IModelListener>();
	
	public LiveEcoreIntrinsicExtender() {
		super();
		System.out.println("+++++++++++++++++++++++++ INSTANCIATION : LiveEcoreIntrinsicExtender");
	}

    @Override
    public Object eSet(final EObject instance, final String name, final Object value) {
        Object result = super.eSet(instance, name, value);
        if (result != null) {
        	// Inform the view to update
            System.out.println("#######################################");
            System.out.println("eSet =>" + instance + " - " + name + "=" + value);
            System.out.println("#######################################");
            notifyListeners();
        }
		return result;
    }
    
    @Override
    public Object eRemove(final EObject instance, final String name, final Object value) {
    	Object result = super.eRemove(instance, name, value);
        if (result != null) {
        	// Inform the view to update
            System.out.println("#######################################");
            System.out.println("eRemove =>" + instance + " - " + name + "=" + value);
            System.out.println("#######################################");
            notifyListeners();
        }
        return result;
    }
    
    @Override
    public EObject eDelete(final EObject objectToRemove, final ECrossReferenceAdapter xref) {
    	EObject result = super.eDelete(objectToRemove, xref);
        if (result != null) {
        	// Inform the view to update
            System.out.println("#######################################");
            System.out.println("eDelete =>" + objectToRemove + " - " + xref);
            System.out.println("#######################################");
            notifyListeners();
        }
        return result;
    }

	@Override
	public void notifyListeners() {
		listeners.forEach(new Consumer<IModelListener>() {
			@Override
			public void accept(IModelListener listener) {
				listener.update();
			}
		});
	}

	@Override
	public void addListener(IModelListener listener) {
		listeners.add(listener);
	}

	@Override
	public void removeListener(IModelListener listener) {
		listeners.remove(listener);
	}

}
