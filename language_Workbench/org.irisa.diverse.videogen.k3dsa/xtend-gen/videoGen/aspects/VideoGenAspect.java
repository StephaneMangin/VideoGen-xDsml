package videoGen.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.irisa.diverse.videogen.transformations.helpers.VideoGenTransform;
import videoGen.Alternatives;
import videoGen.Mandatory;
import videoGen.Optional;
import videoGen.Sequence;
import videoGen.Video;
import videoGen.VideoGen;
import videoGen.aspects.SequenceAspect;
import videoGen.aspects.VideoGenAspectVideoGenAspectProperties;

@Aspect(className = VideoGen.class)
@SuppressWarnings("all")
public class VideoGenAspect {
  @Main
  public static void initialize(final VideoGen _self) {
    videoGen.aspects.VideoGenAspectVideoGenAspectProperties _self_ = videoGen.aspects.VideoGenAspectVideoGenAspectContext.getSelf(_self);
    _privk3_initialize(_self_, _self);
  }
  
  /**
   * Start the computation (model transformation) of all selected video to create the final sequence (PlayList format)
   * 
   * @see : ffmpeg
   */
  @Step
  public static void compute(final VideoGen _self) {
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		videoGen.aspects.VideoGenAspectVideoGenAspectProperties _self_ = videoGen.aspects.VideoGenAspectVideoGenAspectContext.getSelf(_self);
    		_privk3_compute(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"VideoGen","compute");
    } else {
    	command.execute();
    }
  }
  
  protected static void _privk3_initialize(final VideoGenAspectVideoGenAspectProperties _self_, final VideoGen _self) {
    String _name = _self.getName();
    String _plus = ("##### VideoGen \'" + _name);
    String _plus_1 = (_plus + "\' has been initialized.");
    InputOutput.<String>println(_plus_1);
    EList<Sequence> _sequences = _self.getSequences();
    final Sequence sequence = _sequences.get(0);
    SequenceAspect.process(sequence);
    VideoGenAspect.compute(_self);
  }
  
  protected static void _privk3_compute(final VideoGenAspectVideoGenAspectProperties _self_, final VideoGen _self) {
    final HashMap<String, Boolean> videos = new HashMap<String, Boolean>();
    String _name = _self.getName();
    String _plus = ("##### VideoGen \'" + _name);
    String _plus_1 = (_plus + "\' start computation.");
    InputOutput.<String>println(_plus_1);
    InputOutput.<String>println("##### Videos computation result in playlist format : ");
    EList<Sequence> _sequences = _self.getSequences();
    for (final Sequence sequence : _sequences) {
      {
        Video video = null;
        if ((sequence instanceof Mandatory)) {
          Video _video = ((Mandatory)sequence).getVideo();
          video = _video;
        } else {
          if ((sequence instanceof Optional)) {
            Video _video_1 = ((Optional)sequence).getVideo();
            video = _video_1;
          } else {
            if ((sequence instanceof Alternatives)) {
              EList<Optional> _options = ((Alternatives)sequence).getOptions();
              for (final Optional option : _options) {
                Video _video_2 = option.getVideo();
                Boolean _selected = _video_2.getSelected();
                if ((_selected).booleanValue()) {
                  Video _video_3 = option.getVideo();
                  video = _video_3;
                }
              }
            }
          }
        }
        String _name_1 = video.getName();
        Boolean _selected_1 = video.getSelected();
        videos.put(_name_1, _selected_1);
        Boolean _selected_2 = video.getSelected();
        if ((_selected_2).booleanValue()) {
          String _name_2 = video.getName();
          String _plus_2 = ("\t" + _name_2);
          String _plus_3 = (_plus_2 + ": ");
          String _url = video.getUrl();
          String _plus_4 = (_plus_3 + _url);
          InputOutput.<String>println(_plus_4);
        }
      }
    }
    String _m3U = VideoGenTransform.toM3U(_self, Boolean.valueOf(true), videos);
    InputOutput.<String>println(_m3U);
  }
}
