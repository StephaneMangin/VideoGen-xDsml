package org.irisa.diverse.videogen.videoGen.aspects;

import java.util.Map;
import org.irisa.diverse.videogen.videoGen.Sequence;
import org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectProperties;

@SuppressWarnings("all")
public class SequenceAspectSequenceAspectContext {
  public final static SequenceAspectSequenceAspectContext INSTANCE = new SequenceAspectSequenceAspectContext();
  
  public static SequenceAspectSequenceAspectProperties getSelf(final Sequence _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Sequence, SequenceAspectSequenceAspectProperties> map = new java.util.WeakHashMap<org.irisa.diverse.videogen.videoGen.Sequence, org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectProperties>();
  
  public Map<Sequence, SequenceAspectSequenceAspectProperties> getMap() {
    return map;
  }
}
