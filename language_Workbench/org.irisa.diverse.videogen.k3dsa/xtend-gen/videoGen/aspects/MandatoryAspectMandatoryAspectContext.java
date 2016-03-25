package videoGen.aspects;

import java.util.Map;
import videoGen.Mandatory;
import videoGen.aspects.MandatoryAspectMandatoryAspectProperties;

@SuppressWarnings("all")
public class MandatoryAspectMandatoryAspectContext {
  public final static MandatoryAspectMandatoryAspectContext INSTANCE = new MandatoryAspectMandatoryAspectContext();
  
  public static MandatoryAspectMandatoryAspectProperties getSelf(final Mandatory _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new videoGen.aspects.MandatoryAspectMandatoryAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Mandatory, MandatoryAspectMandatoryAspectProperties> map = new java.util.WeakHashMap<videoGen.Mandatory, videoGen.aspects.MandatoryAspectMandatoryAspectProperties>();
  
  public Map<Mandatory, MandatoryAspectMandatoryAspectProperties> getMap() {
    return map;
  }
}
