package videoGen.aspects;

import java.util.Map;
import videoGen.Optional;
import videoGen.aspects.OptionalAspectOptionalAspectProperties;

@SuppressWarnings("all")
public class OptionalAspectOptionalAspectContext {
  public final static OptionalAspectOptionalAspectContext INSTANCE = new OptionalAspectOptionalAspectContext();
  
  public static OptionalAspectOptionalAspectProperties getSelf(final Optional _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new videoGen.aspects.OptionalAspectOptionalAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Optional, OptionalAspectOptionalAspectProperties> map = new java.util.WeakHashMap<videoGen.Optional, videoGen.aspects.OptionalAspectOptionalAspectProperties>();
  
  public Map<Optional, OptionalAspectOptionalAspectProperties> getMap() {
    return map;
  }
}
