package org.irisa.diverse.livemodeling.views.impl

import java.util.ArrayList
import java.util.Comparator
import java.util.List
import java.util.Map
import java.util.stream.Collectors
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.ecore.EObject
import org.irisa.diverse.livemodeling.api.IModelListener
import org.irisa.diverse.livemodeling.extensions.sirius.accessor.extender.LiveEcoreIntrinsicExtender
import org.irisa.diverse.livemodeling.views.constraint.IModelConstraintAdapter
import org.irisa.diverse.videogen.videogenl.aspects.VideoGenAspect
import org.irisa.diverse.videogen.videogenl.videoGen.VideoGen
import java.util.HashMap

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
	
	override List<Integer> getStatisticalValues() {
		// Call the solver to get all possible solutions
		if (model != null) {
			if (!VideoGenAspect.initialized(model)) {
				VideoGenAspect.initializeModel(model, new BasicEList<String>)
			}
			val data = new ArrayList<Integer>()
			VideoGenAspect.solve(model).sortBy[it.value.get(1)].forEach[
				data.add(it.value.get(1))
			]
			println("#####################################################")
			println("#####################################################")
			println(VideoGenAspect.solve(model))
			println(data)
			println("#####################################################")
			println("#####################################################")
			data
		}
		
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
	
	override setConstraints(Integer min, Integer max) {
		model.minUserConstraint = min
		model.maxUserConstraint = max
	}
	
}
