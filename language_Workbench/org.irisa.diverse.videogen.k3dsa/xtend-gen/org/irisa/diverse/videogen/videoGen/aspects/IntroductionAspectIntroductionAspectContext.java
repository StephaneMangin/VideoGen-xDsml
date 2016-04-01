package org.irisa.diverse.videogen.videoGen.aspects;

import java.util.Map;
import org.irisa.diverse.videogen.videoGen.Introduction;
import org.irisa.diverse.videogen.videoGen.aspects.IntroductionAspectIntroductionAspectProperties;

@SuppressWarnings("all")
public class IntroductionAspectIntroductionAspectContext {
  public final static IntroductionAspectIntroductionAspectContext INSTANCE = new IntroductionAspectIntroductionAspectContext();
  
  public static IntroductionAspectIntroductionAspectProperties getSelf(final Introduction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.irisa.diverse.videogen.videoGen.aspects.IntroductionAspectIntroductionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Introduction, IntroductionAspectIntroductionAspectProperties> map = new java.util.WeakHashMap<org.irisa.diverse.videogen.videoGen.Introduction, org.irisa.diverse.videogen.videoGen.aspects.IntroductionAspectIntroductionAspectProperties>();
  
  public Map<Introduction, IntroductionAspectIntroductionAspectProperties> getMap() {
    return map;
  }
}
