package org.irisa.diverse.videogen.videoGen.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.irisa.diverse.videogen.transformations.VideoGenTransform;
import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper;
import org.irisa.diverse.videogen.videoGen.Alternatives;
import org.irisa.diverse.videogen.videoGen.Introduction;
import org.irisa.diverse.videogen.videoGen.Mandatory;
import org.irisa.diverse.videogen.videoGen.Optional;
import org.irisa.diverse.videogen.videoGen.Sequence;
import org.irisa.diverse.videogen.videoGen.Video;
import org.irisa.diverse.videogen.videoGen.VideoGen;
import org.irisa.diverse.videogen.videoGen.aspects.AlternativesAspect;
import org.irisa.diverse.videogen.videoGen.aspects.SequenceAspect;
import org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectProperties;
import org.irisa.diverse.videogen.videoGen.aspects.exceptions.ConstraintsFailed;
import org.irisa.diverse.videogen.videoGen.aspects.exceptions.ConstraintsType;

@Aspect(className = VideoGen.class)
@SuppressWarnings("all")
public class VideoGenAspect {
  public static void initialize(final VideoGen _self) {
    org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectContext.getSelf(_self);
    _privk3_initialize(_self_, _self);
  }
  
  @Main
  public static void process(final VideoGen _self) {
    org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectContext.getSelf(_self);
    _privk3_process(_self_, _self);
  }
  
  /**
   * Start the computation (model transformation) of all selected video to create the final sequence (PlayList format)
   * 
   * @see : ffmpeg
   */
  public static void compute(final VideoGen _self) {
    org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectContext.getSelf(_self);
    _privk3_compute(_self_, _self);
  }
  
  /**
   * Return the maximum duration of a generated sequence.
   */
  public static Integer computeMaxDuration(final VideoGen _self) {
    org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_computeMaxDuration(_self_, _self);
    return (java.lang.Integer)result;
  }
  
  /**
   * Return the minimum duration of a generated sequence.
   */
  public static Integer computeMinDuration(final VideoGen _self) {
    org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_computeMinDuration(_self_, _self);
    return (java.lang.Integer)result;
  }
  
  @Step
  public static void setConstraints(final VideoGen _self, final Integer minDuration, final Integer maxDuration) {
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectContext.getSelf(_self);
    		_privk3_setConstraints(_self_, _self,minDuration,maxDuration);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"VideoGen","setConstraints");
    } else {
    	command.execute();
    }
  }
  
  protected static void _privk3_initialize(final VideoGenAspectVideoGenAspectProperties _self_, final VideoGen _self) {
    String _name = _self.getName();
    String _plus = ("##### VideoGen \'" + _name);
    String _plus_1 = (_plus + "\' has been initialized.");
    InputOutput.<String>println(_plus_1);
    Integer _computeMinDuration = VideoGenAspect.computeMinDuration(_self);
    Integer _computeMaxDuration = VideoGenAspect.computeMaxDuration(_self);
    VideoGenAspect.setConstraints(_self, _computeMinDuration, _computeMaxDuration);
    List<Sequence> _allSequences = VideoGenHelper.allSequences(_self);
    final Consumer<Sequence> _function = (Sequence sequence) -> {
      SequenceAspect.initialize(sequence);
    };
    _allSequences.forEach(_function);
  }
  
  protected static void _privk3_process(final VideoGenAspectVideoGenAspectProperties _self_, final VideoGen _self) {
    VideoGenAspect.initialize(_self);
    Introduction _introduction = VideoGenHelper.getIntroduction(_self);
    SequenceAspect.process(_introduction);
    VideoGenAspect.compute(_self);
  }
  
  protected static void _privk3_compute(final VideoGenAspectVideoGenAspectProperties _self_, final VideoGen _self) {
    try {
      final HashMap<String, Boolean> videos = new HashMap<String, Boolean>();
      String _name = _self.getName();
      String _plus = ("##### VideoGen \'" + _name);
      String _plus_1 = (_plus + "\' start computation.");
      InputOutput.<String>println(_plus_1);
      Integer _computeMinDuration = VideoGenAspect.computeMinDuration(_self);
      Integer _minDurationConstraint = _self.getMinDurationConstraint();
      boolean _lessThan = (_computeMinDuration.compareTo(_minDurationConstraint) < 0);
      if (_lessThan) {
        throw new ConstraintsFailed(ConstraintsType.MIN_DURATION, Boolean.valueOf(true));
      }
      Integer _computeMaxDuration = VideoGenAspect.computeMaxDuration(_self);
      Integer _maxDurationConstraint = _self.getMaxDurationConstraint();
      boolean _greaterThan = (_computeMaxDuration.compareTo(_maxDurationConstraint) > 0);
      if (_greaterThan) {
        throw new ConstraintsFailed(ConstraintsType.MAX_DURATION, Boolean.valueOf(true));
      }
      InputOutput.<String>println("##### Videos computation result in playlist format : ");
      List<Video> _allSelectedVideos = VideoGenHelper.allSelectedVideos(_self);
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
      String _m3U = VideoGenTransform.toM3U(_self, Boolean.valueOf(true), videos);
      InputOutput.<String>println(_m3U);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static Integer _privk3_computeMaxDuration(final VideoGenAspectVideoGenAspectProperties _self_, final VideoGen _self) {
    int _xblockexpression = (int) 0;
    {
      int duration = 0;
      Sequence sequence = VideoGenHelper.getIntroduction(_self);
      while ((sequence != null)) {
        {
          Boolean _active = sequence.getActive();
          if ((_active).booleanValue()) {
            if ((sequence instanceof Mandatory)) {
              int _duration = duration;
              Video _video = ((Mandatory)sequence).getVideo();
              Integer _duration_1 = _video.getDuration();
              duration = (_duration + (_duration_1).intValue());
            } else {
              if ((sequence instanceof Optional)) {
                int _duration_2 = duration;
                Video _video_1 = ((Optional)sequence).getVideo();
                Integer _duration_3 = _video_1.getDuration();
                duration = (_duration_2 + (_duration_3).intValue());
              } else {
                if ((sequence instanceof Alternatives)) {
                  int _duration_4 = duration;
                  Integer _computeMaxDuration = AlternativesAspect.computeMaxDuration(((Alternatives)sequence));
                  duration = (_duration_4 + (_computeMaxDuration).intValue());
                }
              }
            }
          }
          Sequence _nextSequence = sequence.getNextSequence();
          sequence = _nextSequence;
        }
      }
      _xblockexpression = duration;
    }
    return Integer.valueOf(_xblockexpression);
  }
  
  protected static Integer _privk3_computeMinDuration(final VideoGenAspectVideoGenAspectProperties _self_, final VideoGen _self) {
    int _xblockexpression = (int) 0;
    {
      int duration = 0;
      Sequence sequence = VideoGenHelper.getIntroduction(_self);
      while ((sequence != null)) {
        {
          if ((sequence instanceof Mandatory)) {
            int _duration = duration;
            Video _video = ((Mandatory)sequence).getVideo();
            Integer _duration_1 = _video.getDuration();
            duration = (_duration + (_duration_1).intValue());
          } else {
            if ((sequence instanceof Alternatives)) {
              int _duration_2 = duration;
              Integer _computeMinDuration = AlternativesAspect.computeMinDuration(((Alternatives)sequence));
              duration = (_duration_2 + (_computeMinDuration).intValue());
            }
          }
          Sequence _nextSequence = sequence.getNextSequence();
          sequence = _nextSequence;
        }
      }
      _xblockexpression = duration;
    }
    return Integer.valueOf(_xblockexpression);
  }
  
  protected static void _privk3_setConstraints(final VideoGenAspectVideoGenAspectProperties _self_, final VideoGen _self, final Integer minDuration, final Integer maxDuration) {
    _self.setMinDurationConstraint(minDuration);
    _self.setMaxDurationConstraint(maxDuration);
  }
}
