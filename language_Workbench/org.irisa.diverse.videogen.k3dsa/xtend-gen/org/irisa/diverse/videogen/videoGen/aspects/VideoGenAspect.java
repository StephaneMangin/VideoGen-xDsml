package org.irisa.diverse.videogen.videoGen.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper;
import org.irisa.diverse.videogen.videoGen.Alternatives;
import org.irisa.diverse.videogen.videoGen.Conclusion;
import org.irisa.diverse.videogen.videoGen.Introduction;
import org.irisa.diverse.videogen.videoGen.Mandatory;
import org.irisa.diverse.videogen.videoGen.Optional;
import org.irisa.diverse.videogen.videoGen.Sequence;
import org.irisa.diverse.videogen.videoGen.Video;
import org.irisa.diverse.videogen.videoGen.VideoGen;
import org.irisa.diverse.videogen.videoGen.aspects.AlternativesAspect;
import org.irisa.diverse.videogen.videoGen.aspects.ConclusionAspect;
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
  
  public static void setConstraints(final VideoGen _self, final Integer minDuration, final Integer maxDuration) {
    org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectContext.getSelf(_self);
    _privk3_setConstraints(_self_, _self,minDuration,maxDuration);
  }
  
  public static Integer minDurationConstraint(final VideoGen _self) {
    org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_minDurationConstraint(_self_, _self);
    return (java.lang.Integer)result;
  }
  
  public static void minDurationConstraint(final VideoGen _self, final Integer minDurationConstraint) {
    org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectContext.getSelf(_self);
    _privk3_minDurationConstraint(_self_, _self,minDurationConstraint);
  }
  
  public static Integer maxDurationConstraint(final VideoGen _self) {
    org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_maxDurationConstraint(_self_, _self);
    return (java.lang.Integer)result;
  }
  
  public static void maxDurationConstraint(final VideoGen _self, final Integer maxDurationConstraint) {
    org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectContext.getSelf(_self);
    _privk3_maxDurationConstraint(_self_, _self,maxDurationConstraint);
  }
  
  protected static void _privk3_initialize(final VideoGenAspectVideoGenAspectProperties _self_, final VideoGen _self) {
    String _name = _self.getName();
    String _plus = ("##### VideoGen \'" + _name);
    String _plus_1 = (_plus + "\' has been initialized.");
    InputOutput.<String>println(_plus_1);
    Integer _computeMinDuration = VideoGenAspect.computeMinDuration(_self);
    VideoGenAspect.minDurationConstraint(_self, _computeMinDuration);
    Integer _computeMaxDuration = VideoGenAspect.computeMaxDuration(_self);
    VideoGenAspect.maxDurationConstraint(_self, _computeMaxDuration);
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
      Integer _computeMinDuration = VideoGenAspect.computeMinDuration(_self);
      Integer _minDurationConstraint = VideoGenAspect.minDurationConstraint(_self);
      boolean _lessThan = (_computeMinDuration.compareTo(_minDurationConstraint) < 0);
      if (_lessThan) {
        throw new ConstraintsFailed(ConstraintsType.MIN_DURATION, Boolean.valueOf(true));
      }
      Integer _computeMaxDuration = VideoGenAspect.computeMaxDuration(_self);
      Integer _maxDurationConstraint = VideoGenAspect.maxDurationConstraint(_self);
      boolean _greaterThan = (_computeMaxDuration.compareTo(_maxDurationConstraint) > 0);
      if (_greaterThan) {
        throw new ConstraintsFailed(ConstraintsType.MAX_DURATION, Boolean.valueOf(true));
      }
      Conclusion _conclusion = VideoGenHelper.getConclusion(_self);
      ConclusionAspect.compute(_conclusion);
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
    VideoGenAspect.minDurationConstraint(_self, minDuration);
    VideoGenAspect.maxDurationConstraint(_self, maxDuration);
  }
  
  protected static Integer _privk3_minDurationConstraint(final VideoGenAspectVideoGenAspectProperties _self_, final VideoGen _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getMinDurationConstraint") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Integer) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.minDurationConstraint;
  }
  
  protected static void _privk3_minDurationConstraint(final VideoGenAspectVideoGenAspectProperties _self_, final VideoGen _self, final Integer minDurationConstraint) {
    _self_.minDurationConstraint = minDurationConstraint; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setMinDurationConstraint")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, minDurationConstraint);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static Integer _privk3_maxDurationConstraint(final VideoGenAspectVideoGenAspectProperties _self_, final VideoGen _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getMaxDurationConstraint") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Integer) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.maxDurationConstraint;
  }
  
  protected static void _privk3_maxDurationConstraint(final VideoGenAspectVideoGenAspectProperties _self_, final VideoGen _self, final Integer maxDurationConstraint) {
    _self_.maxDurationConstraint = maxDurationConstraint; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setMaxDurationConstraint")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, maxDurationConstraint);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
