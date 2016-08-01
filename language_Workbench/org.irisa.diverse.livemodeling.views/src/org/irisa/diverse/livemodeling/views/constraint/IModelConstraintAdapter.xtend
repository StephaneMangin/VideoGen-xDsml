package org.irisa.diverse.livemodeling.views.constraint

import java.util.List
import org.irisa.diverse.livemodeling.api.IModelAdapter

interface IModelConstraintAdapter extends IModelAdapter {
	
	def List<Integer> getStatisticalValues()
	
	def void setConstraints(Integer min, Integer max)
}