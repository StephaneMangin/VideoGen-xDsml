package videoGen.aspects;

import java.util.Map;
import videoGen.Video;
import videoGen.aspects.VideoAspectVideoAspectProperties;

@SuppressWarnings("all")
public class VideoAspectVideoAspectContext {
  public final static VideoAspectVideoAspectContext INSTANCE = new VideoAspectVideoAspectContext();
  
  public static VideoAspectVideoAspectProperties getSelf(final Video _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new videoGen.aspects.VideoAspectVideoAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Video, VideoAspectVideoAspectProperties> map = new java.util.WeakHashMap<videoGen.Video, videoGen.aspects.VideoAspectVideoAspectProperties>();
  
  public Map<Video, VideoAspectVideoAspectProperties> getMap() {
    return map;
  }
}
