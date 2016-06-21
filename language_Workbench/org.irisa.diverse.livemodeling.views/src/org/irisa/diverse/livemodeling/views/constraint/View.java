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
package org.irisa.diverse.livemodeling.views.constraint;

import javafx.embed.swt.FXCanvas;
import javafx.scene.Scene;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.gemoc.xdsmlframework.api.core.IBasicExecutionEngine;
import org.irisa.diverse.livemodeling.views.Activator;
import org.irisa.diverse.livemodeling.views.api.AbstractView;
import org.irisa.diverse.livemodeling.views.api.IModelAdapter;
import org.irisa.diverse.livemodeling.views.api.IView;
import org.irisa.diverse.videogen.videoGen.VideoGen;

public class View extends AbstractView {

	public final String ID = "org.irisa.diverse.live_modeling.views.constraint.View";

	private FXCanvas fxCanvas = null;
	private FxListener viewListener = null;
	private IModelAdapter modelAdapter = null;

	private IBasicExecutionEngine engine;
		
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
		parent.getShell().addListener(SWT.Expand, (e) -> {
			viewListener.scale();
		});
		parent.getShell().addListener(SWT.Resize, (e) -> {
			viewListener.scale();
		});
		buildMenu(parent.getShell());
	}

	private void buildMenu(Shell shell) {
		// No need right now, but keep it for later additions
	}

	@Override
	public IView get() {
		return this;
	}

	@Override
	public void engineSelectionChanged(IBasicExecutionEngine engine) {
		this.engine = engine;
		System.out.println(AbstractView.modelAdaptors);
		modelAdapter = AbstractView.modelAdaptors[0];
		modelAdapter.setModel((VideoGen)(ConstraintEngineAddon.loadModel(engine.getExecutionContext().getResourceModel())));
		modelAdapter.addListener(viewListener);
		viewListener.setModel(modelAdapter);
		viewListener.refresh();
	}

	public void update() {
		System.out.println("Update viewListener");
		viewListener.refresh();
	}
}
