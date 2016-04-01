package org.irisa.diverse.videogen.videoGen.aspects;

import java.util.Map;
import org.irisa.diverse.videogen.videoGen.Conclusion;
import org.irisa.diverse.videogen.videoGen.aspects.ConclusionAspectConclusionAspectProperties;

@SuppressWarnings("all")
public class ConclusionAspectConclusionAspectContext {
  public final static ConclusionAspectConclusionAspectContext INSTANCE = new ConclusionAspectConclusionAspectContext();
  
  public static ConclusionAspectConclusionAspectProperties getSelf(final Conclusion _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.irisa.diverse.videogen.videoGen.aspects.ConclusionAspectConclusionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Conclusion, ConclusionAspectConclusionAspectProperties> map = new java.util.WeakHashMap<org.irisa.diverse.videogen.videoGen.Conclusion, org.irisa.diverse.videogen.videoGen.aspects.ConclusionAspectConclusionAspectProperties>();
  
  public Map<Conclusion, ConclusionAspectConclusionAspectProperties> getMap() {
    return map;
  }
}
