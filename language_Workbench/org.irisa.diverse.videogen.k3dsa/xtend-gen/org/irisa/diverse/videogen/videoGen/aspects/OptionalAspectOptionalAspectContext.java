package org.irisa.diverse.videogen.videoGen.aspects;

import java.util.Map;
import org.irisa.diverse.videogen.videoGen.Optional;
import org.irisa.diverse.videogen.videoGen.aspects.OptionalAspectOptionalAspectProperties;

@SuppressWarnings("all")
public class OptionalAspectOptionalAspectContext {
  public final static OptionalAspectOptionalAspectContext INSTANCE = new OptionalAspectOptionalAspectContext();
  
  public static OptionalAspectOptionalAspectProperties getSelf(final Optional _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.irisa.diverse.videogen.videoGen.aspects.OptionalAspectOptionalAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Optional, OptionalAspectOptionalAspectProperties> map = new java.util.WeakHashMap<org.irisa.diverse.videogen.videoGen.Optional, org.irisa.diverse.videogen.videoGen.aspects.OptionalAspectOptionalAspectProperties>();
  
  public Map<Optional, OptionalAspectOptionalAspectProperties> getMap() {
    return map;
  }
}
