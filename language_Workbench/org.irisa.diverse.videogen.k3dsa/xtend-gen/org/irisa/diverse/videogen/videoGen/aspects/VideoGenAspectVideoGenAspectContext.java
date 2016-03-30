package org.irisa.diverse.videogen.videoGen.aspects;

import java.util.Map;
import org.irisa.diverse.videogen.videoGen.VideoGen;
import org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectProperties;

@SuppressWarnings("all")
public class VideoGenAspectVideoGenAspectContext {
  public final static VideoGenAspectVideoGenAspectContext INSTANCE = new VideoGenAspectVideoGenAspectContext();
  
  public static VideoGenAspectVideoGenAspectProperties getSelf(final VideoGen _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VideoGen, VideoGenAspectVideoGenAspectProperties> map = new java.util.WeakHashMap<org.irisa.diverse.videogen.videoGen.VideoGen, org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectProperties>();
  
  public Map<VideoGen, VideoGenAspectVideoGenAspectProperties> getMap() {
    return map;
  }
}
