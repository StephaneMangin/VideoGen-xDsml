/** 
 * Copyright (c) 2016 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * Inria - initial API and implementation
 */
package org.irisa.diverse.livemodeling.views

import javafx.embed.swt.FXCanvas
import javafx.scene.Parent
import javafx.scene.Scene
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.jface.action.Action
import org.eclipse.jface.action.IToolBarManager
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Shell
import org.eclipse.ui.IActionBars
import org.gemoc.xdsmlframework.api.core.IBasicExecutionEngine
import org.irisa.diverse.livemodeling.api.IModelAdapter
import org.irisa.diverse.livemodeling.api.IView
import org.irisa.diverse.livemodeling.views.impl.VideoGenAdaptor
import org.irisa.diverse.livemodeling.views.videoConstraint.ConstraintListener

abstract class AbstractView extends org.irisa.diverse.livemodeling.api.AbstractView {
	FXCanvas fxCanvas = null
	IConstraintListener viewListener = null

	override void addActionToToolbar(Action action) {
		var IActionBars actionBars = getViewSite().getActionBars()
		var IToolBarManager toolBar = actionBars.getToolBarManager()
		toolBar.add(action)
	}

	override void setFocus() {
		if (fxCanvas !== null) {
			fxCanvas.setFocus()
		}
	}

	override void createPartControl(Composite parent) {
		fxCanvas = new FXCanvas(parent, SWT.NONE)
		viewListener = new ConstraintListener(this)
		var Scene scene = new Scene(viewListener as Parent)
		fxCanvas.setScene(scene)
		parent.getShell().addListener(SWT.Expand, [e |
			{
				viewListener.scale()
			}
		])
		parent.getShell().addListener(SWT.Resize, [e |
			{
				viewListener.scale()
			}
		])
		buildMenu(parent.getShell())
	}

	def private void buildMenu(Shell shell) { // No need right now, but keep it for later additions
	}

	override IView get() {
		return this
	}

	override void engineSelectionChanged(IBasicExecutionEngine engine) {
		var IModelAdapter[] modelAdapters = getModelAdapters()
		var IModelAdapter modelAdapter
		if (modelAdapters.length > 0) {
			modelAdapter = modelAdapters.get(0)
		} else {
			modelAdapter = new VideoGenAdaptor()
			System.out.println("No adaptor found for model ! Creating a VideoGen one.")
		}
		var Resource model = engine.getExecutionContext().getResourceModel()
		modelAdapter.setModel(ConstraintEngineAddon.loadModel(model))
		modelAdapter.addListener(viewListener)
		addModelAdapter(modelAdapter)
		viewListener.update()
	}

	override void update() {
		viewListener.update()
	}
	
}
