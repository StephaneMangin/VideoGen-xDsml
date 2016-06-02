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
package org.irisa.diverse.live_modeling.views.constraint;

import javafx.embed.swt.FXCanvas;
import javafx.scene.Scene;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.gemoc.xdsmlframework.api.core.IBasicExecutionEngine;
import org.irisa.diverse.live_modeling.views.api.AbstractView;

public class View extends AbstractView {

	public final String ID = "org.irisa.diverse.live_modeling.views.constraint.View";

	private FXCanvas fxCanvas;
	private FxListener viewListener;
	
	@Override
	public void setFocus() {
		if (fxCanvas != null) {
			fxCanvas.setFocus();
		}
	}
	
	@Override
	public void createPartControl(Composite parent) {
		fxCanvas = new FXCanvas(parent, SWT.NONE);
		viewListener = new FxListener();
		Scene scene = new Scene(viewListener);
		fxCanvas.setScene(scene);
		parent.getShell().addListener(SWT.Resize, (e) -> {
			viewListener.refresh();
		});
		buildMenu(parent.getShell());
	}

	private void buildMenu(Shell shell) {

	}

	@Override
	public void engineSelectionChanged(IBasicExecutionEngine engine) {
		// TODO Auto-generated method stub
		
	}
}
