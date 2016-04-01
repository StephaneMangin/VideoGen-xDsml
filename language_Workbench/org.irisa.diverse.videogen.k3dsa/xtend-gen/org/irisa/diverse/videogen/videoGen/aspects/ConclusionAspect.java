package org.irisa.diverse.videogen.videoGen.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.irisa.diverse.videogen.transformations.VideoGenTransform;
import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper;
import org.irisa.diverse.videogen.videoGen.Conclusion;
import org.irisa.diverse.videogen.videoGen.Video;
import org.irisa.diverse.videogen.videoGen.VideoGen;
import org.irisa.diverse.videogen.videoGen.aspects.ConclusionAspectConclusionAspectProperties;
import org.irisa.diverse.videogen.videoGen.aspects.SequenceAspect;

@Aspect(className = Conclusion.class)
@SuppressWarnings("all")
public class ConclusionAspect extends SequenceAspect {
  public static void compute(final Conclusion _self) {
    org.irisa.diverse.videogen.videoGen.aspects.ConclusionAspectConclusionAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.ConclusionAspectConclusionAspectContext.getSelf(_self);
    _privk3_compute(_self_, _self);
  }
  
  protected static void _privk3_compute(final ConclusionAspectConclusionAspectProperties _self_, final Conclusion _self) {
    final HashMap<String, Boolean> videos = new HashMap<String, Boolean>();
    String _name = _self.getName();
    String _plus = ("##### VideoGen \'" + _name);
    String _plus_1 = (_plus + "\' start computation.");
    InputOutput.<String>println(_plus_1);
    InputOutput.<String>println("##### Videos computation result in playlist format : ");
    VideoGen _videogen = _self.getVideogen();
    List<Video> _allSelectedVideos = VideoGenHelper.allSelectedVideos(_videogen);
    final Consumer<Video> _function = (Video video) -> {
      String _name_1 = video.getName();
      String _plus_2 = ("\t" + _name_1);
      String _plus_3 = (_plus_2 + ": ");
      String _url = video.getUrl();
      String _plus_4 = (_plus_3 + _url);
      InputOutput.<String>println(_plus_4);
      String _name_2 = video.getName();
      videos.put(_name_2, Boolean.valueOf(true));
    };
    _allSelectedVideos.forEach(_function);
    VideoGen _videogen_1 = _self.getVideogen();
    String _m3U = VideoGenTransform.toM3U(_videogen_1, Boolean.valueOf(true), videos);
    InputOutput.<String>println(_m3U);
  }
}
