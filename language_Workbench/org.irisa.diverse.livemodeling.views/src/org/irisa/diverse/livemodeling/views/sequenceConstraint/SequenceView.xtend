/** 
 * Copyright (c) 2016 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * Inria - initial API and implementation
 */
package org.irisa.diverse.livemodeling.views.sequenceConstraint

import javafx.embed.swt.FXCanvas
import javafx.scene.Parent
import javafx.scene.Scene
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Composite
import org.irisa.diverse.livemodeling.views.AbstractView
import org.irisa.diverse.livemodeling.views.IModelConstraintAdapter
import org.irisa.diverse.livemodeling.views.sequenceConstraint.SequenceListener

class SequenceView extends AbstractView {
	
	public static final String ID = "org.irisa.diverse.livemodeling.views.videoConstraint.ConstraintView"
	
	override void createPartControl(Composite parent) {
		fxCanvas = new FXCanvas(parent, SWT.NONE)
		viewListener = new SequenceListener(this)
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
	
	override getValues() {
		val values = newArrayList()
		val model = getModelAdapters().get(0)
		(model as IModelConstraintAdapter).statisticalValues
		.forEach[
			values.add(it.value.get(0))
		]
		values.sort
	}
	
}
