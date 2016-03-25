package videoGen.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
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
    EList<Sequence> _sequences = _self.getSequences();
    for (final Sequence sequence : _sequences) {
      if ((sequence instanceof Mandatory)) {
        Video _video = ((Mandatory)sequence).getVideo();
        String _name_1 = _video.getName();
        Video _video_1 = ((Mandatory)sequence).getVideo();
        Boolean _selected = _video_1.getSelected();
        videos.put(_name_1, _selected);
      } else {
        if ((sequence instanceof Optional)) {
          Video _video_2 = ((Optional)sequence).getVideo();
          String _name_2 = _video_2.getName();
          Video _video_3 = ((Optional)sequence).getVideo();
          Boolean _selected_1 = _video_3.getSelected();
          videos.put(_name_2, _selected_1);
        } else {
          if ((sequence instanceof Alternatives)) {
            EList<Optional> _options = ((Alternatives)sequence).getOptions();
            for (final Optional option : _options) {
              Video _video_4 = option.getVideo();
              Boolean _selected_2 = _video_4.getSelected();
              if ((_selected_2).booleanValue()) {
                Video _video_5 = option.getVideo();
                String _name_3 = _video_5.getName();
                Video _video_6 = option.getVideo();
                Boolean _selected_3 = _video_6.getSelected();
                videos.put(_name_3, _selected_3);
              }
            }
          }
        }
      }
    }
    InputOutput.<String>println("##### Videos computation result in playlist format : ");
  }
}
