/** 
 * Copyright (c) 2016 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * Inria - initial API and implementation
 */
package org.irisa.diverse.livemodeling.views.videoConstraint

import org.irisa.diverse.livemodeling.views.AbstractView
import org.irisa.diverse.livemodeling.views.IModelConstraintAdapter

class ConstraintView extends AbstractView {
	public final String ID = "org.irisa.diverse.livemodeling.views.videoConstraint.ConstraintView"
	
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
