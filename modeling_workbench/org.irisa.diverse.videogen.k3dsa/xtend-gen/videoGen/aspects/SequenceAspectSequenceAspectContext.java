package videoGen.aspects;

import java.util.Map;
import videoGen.Sequence;
import videoGen.aspects.SequenceAspectSequenceAspectProperties;

@SuppressWarnings("all")
public class SequenceAspectSequenceAspectContext {
  public final static SequenceAspectSequenceAspectContext INSTANCE = new SequenceAspectSequenceAspectContext();
  
  public static SequenceAspectSequenceAspectProperties getSelf(final Sequence _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new videoGen.aspects.SequenceAspectSequenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Sequence, SequenceAspectSequenceAspectProperties> map = new java.util.WeakHashMap<videoGen.Sequence, videoGen.aspects.SequenceAspectSequenceAspectProperties>();
  
  public Map<Sequence, SequenceAspectSequenceAspectProperties> getMap() {
    return map;
  }
}
