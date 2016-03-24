package videoGen.aspects;

import java.util.Map;
import videoGen.Alternatives;
import videoGen.aspects.AlternativesAspectAlternativesAspectProperties;

@SuppressWarnings("all")
public class AlternativesAspectAlternativesAspectContext {
  public final static AlternativesAspectAlternativesAspectContext INSTANCE = new AlternativesAspectAlternativesAspectContext();
  
  public static AlternativesAspectAlternativesAspectProperties getSelf(final Alternatives _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new videoGen.aspects.AlternativesAspectAlternativesAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Alternatives, AlternativesAspectAlternativesAspectProperties> map = new java.util.WeakHashMap<videoGen.Alternatives, videoGen.aspects.AlternativesAspectAlternativesAspectProperties>();
  
  public Map<Alternatives, AlternativesAspectAlternativesAspectProperties> getMap() {
    return map;
  }
}
