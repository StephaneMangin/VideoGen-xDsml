package org.irisa.diverse.livemodeling.views

import java.util.Map
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.BasicEMap
import org.irisa.diverse.livemodeling.api.IModelAdapter

interface IModelConstraintAdapter extends IModelAdapter {
	
	def BasicEMap<Long, BasicEList<Integer>> getStatisticalValues()
		
	def Boolean checkState(Map<String, Boolean> states)
	
}