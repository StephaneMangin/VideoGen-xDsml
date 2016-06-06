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

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.gemoc.xdsmlframework.api.core.IBasicExecutionEngine;
import org.irisa.diverse.live_modeling.views.api.AbstractView;
import org.irisa.diverse.live_modeling.views.api.IView;

public class View extends AbstractView {

	public final String ID = "org.irisa.diverse.live_modeling.views.constraint.View";

	private FXCanvas fxCanvas = null;
	private FxListener viewListener = null;
	
	@Override 
	public void addActionToToolbar(Action action) {
		IActionBars actionBars = getViewSite().getActionBars();
		IToolBarManager toolBar = actionBars.getToolBarManager();
		toolBar.add(action);
	}
	
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
	public IView get() {
		return this;
	}

	@Override
	public void engineSelectionChanged(IBasicExecutionEngine engine) {
		// TODO
	}

}
