package videoGen.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.InputOutput;
import videoGen.Video;
import videoGen.aspects.VideoAspectVideoAspectProperties;

@Aspect(className = Video.class)
@SuppressWarnings("all")
public class VideoAspect {
  public static void select(final Video _self) {
    videoGen.aspects.VideoAspectVideoAspectProperties _self_ = videoGen.aspects.VideoAspectVideoAspectContext.getSelf(_self);
    _privk3_select(_self_, _self);
  }
  
  protected static void _privk3_select(final VideoAspectVideoAspectProperties _self_, final Video _self) {
    _self.setSelected(Boolean.valueOf(true));
    String _name = _self.getName();
    String _plus = ("##### Video \'" + _name);
    String _plus_1 = (_plus + "\' has been selected.");
    InputOutput.<String>println(_plus_1);
  }
}
