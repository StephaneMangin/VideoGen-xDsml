package org.irisa.diverse.videogen.videoGen.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.irisa.diverse.videogen.transformations.VideoGenTransform;
import org.irisa.diverse.videogen.videoGen.Alternatives;
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
  @Main
  public static void initialize(final VideoGen _self) {
    org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.VideoGenAspectVideoGenAspectContext.getSelf(_self);
    _privk3_initialize(_self_, _self);
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
    EList<Sequence> _sequences = _self.getSequences();
    final Sequence sequence = _sequences.get(0);
    SequenceAspect.process(sequence);
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
      InputOutput.<String>println("##### Videos computation result in playlist format : ");
      EList<Sequence> _sequences = _self.getSequences();
      Sequence sequence = _sequences.get(0);
      while ((sequence != null)) {
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
          Sequence _nextSibling = sequence.getNextSibling();
          sequence = _nextSibling;
        }
      }
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
      EList<Sequence> _sequences = _self.getSequences();
      final Function1<Sequence, Integer> _function = (Sequence sequence) -> {
        Integer _xifexpression = null;
        Boolean _active = SequenceAspect.active(sequence);
        if ((_active).booleanValue()) {
          Integer _xifexpression_1 = null;
          if ((sequence instanceof Mandatory)) {
            Video _video = ((Mandatory)sequence).getVideo();
            _xifexpression_1 = _video.getDuration();
          } else {
            Integer _xifexpression_2 = null;
            if ((sequence instanceof Optional)) {
              Video _video_1 = ((Optional)sequence).getVideo();
              _xifexpression_2 = _video_1.getDuration();
            } else {
              Integer _xifexpression_3 = null;
              if ((sequence instanceof Alternatives)) {
                _xifexpression_3 = AlternativesAspect.computeMaxDuration(((Alternatives)sequence));
              }
              _xifexpression_2 = _xifexpression_3;
            }
            _xifexpression_1 = _xifexpression_2;
          }
          _xifexpression = _xifexpression_1;
        }
        return _xifexpression;
      };
      List<Integer> _map = ListExtensions.<Sequence, Integer>map(_sequences, _function);
      for (final Integer currentDuration : _map) {
        int _duration = duration;
        duration = (_duration + (currentDuration).intValue());
      }
      _xblockexpression = duration;
    }
    return Integer.valueOf(_xblockexpression);
  }
  
  protected static Integer _privk3_computeMinDuration(final VideoGenAspectVideoGenAspectProperties _self_, final VideoGen _self) {
    int _xblockexpression = (int) 0;
    {
      int duration = 0;
      EList<Sequence> _sequences = _self.getSequences();
      final Function1<Sequence, Integer> _function = (Sequence sequence) -> {
        Integer _xifexpression = null;
        if ((sequence instanceof Mandatory)) {
          Video _video = ((Mandatory)sequence).getVideo();
          _xifexpression = _video.getDuration();
        } else {
          Integer _xifexpression_1 = null;
          if ((sequence instanceof Alternatives)) {
            _xifexpression_1 = AlternativesAspect.computeMinDuration(((Alternatives)sequence));
          }
          _xifexpression = _xifexpression_1;
        }
        return _xifexpression;
      };
      List<Integer> _map = ListExtensions.<Sequence, Integer>map(_sequences, _function);
      for (final Integer currentDuration : _map) {
        int _duration = duration;
        duration = (_duration + (currentDuration).intValue());
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
