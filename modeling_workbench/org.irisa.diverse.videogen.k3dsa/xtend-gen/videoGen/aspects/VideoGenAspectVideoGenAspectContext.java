package videoGen.aspects;

import java.util.Map;
import videoGen.VideoGen;
import videoGen.aspects.VideoGenAspectVideoGenAspectProperties;

@SuppressWarnings("all")
public class VideoGenAspectVideoGenAspectContext {
  public final static VideoGenAspectVideoGenAspectContext INSTANCE = new VideoGenAspectVideoGenAspectContext();
  
  public static VideoGenAspectVideoGenAspectProperties getSelf(final VideoGen _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new videoGen.aspects.VideoGenAspectVideoGenAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VideoGen, VideoGenAspectVideoGenAspectProperties> map = new java.util.WeakHashMap<videoGen.VideoGen, videoGen.aspects.VideoGenAspectVideoGenAspectProperties>();
  
  public Map<VideoGen, VideoGenAspectVideoGenAspectProperties> getMap() {
    return map;
  }
}
