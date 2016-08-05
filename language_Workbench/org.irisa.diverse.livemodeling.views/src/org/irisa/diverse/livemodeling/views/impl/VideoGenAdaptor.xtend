package org.irisa.diverse.livemodeling.views.impl

import java.util.Comparator
import java.util.Map
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.BasicEMap
import org.eclipse.emf.ecore.EObject
import org.irisa.diverse.livemodeling.api.IModelListener
import org.irisa.diverse.livemodeling.extensions.sirius.accessor.extender.LiveEcoreIntrinsicExtender
import org.irisa.diverse.livemodeling.views.IModelConstraintAdapter
import org.irisa.diverse.videogen.videogenl.aspects.VideoGenAspect
import org.irisa.diverse.videogen.videogenl.videoGen.Sequence
import org.irisa.diverse.videogen.videogenl.videoGen.VideoGen

class VideoGenAdaptor extends LiveEcoreIntrinsicExtender implements IModelConstraintAdapter {
	
	private VideoGen model

	override void addListener(IModelListener listener) {
		super.addListener(listener)
		if (listener instanceof VideoGen) {
			model = listener
		}
	}
	
	override void removeListener(IModelListener listener) {
		if (model.equals(listener)) {
			model = null
		}
		super.removeListener(listener)
	}
	
	override BasicEMap<Long, BasicEList<Integer>> getStatisticalValues() {
		// Call the solver to get all possible solutions
		if (model != null) {
			if (!VideoGenAspect.initialized(model)) {
				VideoGenAspect.initializeModel(model, new BasicEList<String>)
			}
			VideoGenAspect.solve(model)
		} else {
			new BasicEMap	
		}
	}
	
	override Boolean checkState(Map<String, Boolean> states) {
		val newModel = VideoGen.newInstance
		VideoGenAspect.initializeModel(newModel, new BasicEList<String>)
		// Beurk but functional
		newModel.transitions
		.filter[it instanceof Sequence]
		.forEach[
			states.forEach[name, value|
				if (name.equals(it.name)) {
					it.active = value
				}
			]
		]
		!VideoGenAspect.solve(newModel).isNullOrEmpty
	}
	
	override setModel(EObject obj) {
		model = obj as VideoGen
	}
	
	static class MapValueComparator<K,V extends Comparable<V>> implements Comparator<K> {
	
	    private Map<K,V> map;
		
	    new(Map<K,V> map) {
	        super()
	        this.map = map
	    }
	
	    override compare(K o1, K o2) {
	        return map.get(o1).compareTo(map.get(o2));
	    }
	}
	
	def setDurationConstraints(Integer min, Integer max) {
		
		val Map<String, Boolean> states = newHashMap()
		val newModel = VideoGen.newInstance
		VideoGenAspect.initializeModel(newModel, new BasicEList<String>)
		// Beurk but functional
		model.transitions
		.filter[it instanceof Sequence]
		.forEach[
			states.put(it.name, it.active)
		]
		if (checkState(states)) {
			model.minUserConstraint = min
			model.maxUserConstraint = max
		} else {
			throw new Exception("Constraint unstatisfied !")
		}
		
	}
	
}
