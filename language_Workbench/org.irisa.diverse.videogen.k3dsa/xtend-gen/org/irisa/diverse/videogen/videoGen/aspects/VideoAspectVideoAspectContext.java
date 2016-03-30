package org.irisa.diverse.videogen.videoGen.aspects;

import java.util.Map;
import org.irisa.diverse.videogen.videoGen.Video;
import org.irisa.diverse.videogen.videoGen.aspects.VideoAspectVideoAspectProperties;

@SuppressWarnings("all")
public class VideoAspectVideoAspectContext {
  public final static VideoAspectVideoAspectContext INSTANCE = new VideoAspectVideoAspectContext();
  
  public static VideoAspectVideoAspectProperties getSelf(final Video _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.irisa.diverse.videogen.videoGen.aspects.VideoAspectVideoAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Video, VideoAspectVideoAspectProperties> map = new java.util.WeakHashMap<org.irisa.diverse.videogen.videoGen.Video, org.irisa.diverse.videogen.videoGen.aspects.VideoAspectVideoAspectProperties>();
  
  public Map<Video, VideoAspectVideoAspectProperties> getMap() {
    return map;
  }
}
