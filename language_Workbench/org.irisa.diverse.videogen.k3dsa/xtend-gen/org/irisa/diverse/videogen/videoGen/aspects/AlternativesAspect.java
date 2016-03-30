package org.irisa.diverse.videogen.videoGen.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.irisa.diverse.videogen.videoGen.Alternatives;
import org.irisa.diverse.videogen.videoGen.Optional;
import org.irisa.diverse.videogen.videoGen.Video;
import org.irisa.diverse.videogen.videoGen.aspects.AlternativesAspectAlternativesAspectProperties;
import org.irisa.diverse.videogen.videoGen.aspects.DistributedRandomNumberGenerator;
import org.irisa.diverse.videogen.videoGen.aspects.SequenceAspect;
import org.irisa.diverse.videogen.videoGen.aspects.VideoAspect;

@Aspect(className = Alternatives.class)
@SuppressWarnings("all")
public class AlternativesAspect extends SequenceAspect {
  /**
   * Return a hashmap with corrected probabilities for an Alternatives instance.
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   */
  public static Map<String, Integer> checkProbabilities(final Alternatives _self) {
    org.irisa.diverse.videogen.videoGen.aspects.AlternativesAspectAlternativesAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.AlternativesAspectAlternativesAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_checkProbabilities(_self_, _self);
    return (java.util.Map<java.lang.String, java.lang.Integer>)result;
  }
  
  /**
   * Process options to find the selectable video
   */
  private static Video selectVideo(final Alternatives _self) {
    org.irisa.diverse.videogen.videoGen.aspects.AlternativesAspectAlternativesAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.AlternativesAspectAlternativesAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_selectVideo(_self_, _self);
    return (org.irisa.diverse.videogen.videoGen.Video)result;
  }
  
  @Step
  @OverrideAspectMethod
  public static void process(final Alternatives _self) {
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		org.irisa.diverse.videogen.videoGen.aspects.AlternativesAspectAlternativesAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.AlternativesAspectAlternativesAspectContext.getSelf(_self);
    		 if (_self instanceof org.irisa.diverse.videogen.videoGen.Alternatives){
    		 org.irisa.diverse.videogen.videoGen.aspects.AlternativesAspect._privk3_process(_self_, (org.irisa.diverse.videogen.videoGen.Alternatives)_self);
    		} else  if (_self instanceof org.irisa.diverse.videogen.videoGen.Sequence){
    		 org.irisa.diverse.videogen.videoGen.aspects.SequenceAspect.process((org.irisa.diverse.videogen.videoGen.Sequence)_self);
    		} else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"Alternatives","process");
    } else {
    	command.execute();
    }
  }
  
  /**
   * Return the maximum duration of contained videos
   */
  public static Integer computeMaxDuration(final Alternatives _self) {
    org.irisa.diverse.videogen.videoGen.aspects.AlternativesAspectAlternativesAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.AlternativesAspectAlternativesAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_computeMaxDuration(_self_, _self);
    return (java.lang.Integer)result;
  }
  
  /**
   * Return the minimum duration of contained videos
   */
  public static Integer computeMinDuration(final Alternatives _self) {
    org.irisa.diverse.videogen.videoGen.aspects.AlternativesAspectAlternativesAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.AlternativesAspectAlternativesAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_computeMinDuration(_self_, _self);
    return (java.lang.Integer)result;
  }
  
  protected static Map<String, Integer> _privk3_checkProbabilities(final AlternativesAspectAlternativesAspectProperties _self_, final Alternatives _self) {
    HashMap<String, Integer> _xblockexpression = null;
    {
      final HashMap<String, Integer> result = new HashMap<String, Integer>();
      int totalProb = 0;
      int totalOptions = 0;
      EList<Optional> _options = _self.getOptions();
      for (final Optional option : _options) {
        {
          Integer _probability = option.getProbability();
          boolean _equals = ((_probability).intValue() == 0);
          if (_equals) {
            totalOptions++;
          }
          int _talProb = totalProb;
          Integer _probability_1 = option.getProbability();
          totalProb = (_talProb + (_probability_1).intValue());
          Video _video = option.getVideo();
          String _name = _video.getName();
          Integer _probability_2 = option.getProbability();
          result.put(_name, _probability_2);
        }
      }
      Set<String> _keySet = result.keySet();
      for (final String name : _keySet) {
        Integer _get = result.get(name);
        boolean _equals = ((_get).intValue() == 0);
        if (_equals) {
          result.put(name, Integer.valueOf(((100 - totalProb) / totalOptions)));
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  protected static Video _privk3_selectVideo(final AlternativesAspectAlternativesAspectProperties _self_, final Alternatives _self) {
    Video _xblockexpression = null;
    {
      final DistributedRandomNumberGenerator drng = new DistributedRandomNumberGenerator();
      final Map<String, Integer> proba = AlternativesAspect.checkProbabilities(_self);
      EList<Optional> _options = _self.getOptions();
      final Function1<Optional, String> _function = (Optional it) -> {
        Video _video = it.getVideo();
        return _video.getName();
      };
      List<String> _map = ListExtensions.<Optional, String>map(_options, _function);
      final Consumer<String> _function_1 = (String name) -> {
        Set<String> _keySet = proba.keySet();
        List<String> _list = IterableExtensions.<String>toList(_keySet);
        int _indexOf = _list.indexOf(name);
        Integer _get = proba.get(name);
        drng.addNumber(_indexOf, (_get).intValue());
      };
      _map.forEach(_function_1);
      EList<Optional> _options_1 = _self.getOptions();
      int _distributedRandomNumber = drng.getDistributedRandomNumber();
      Optional _get = _options_1.get(_distributedRandomNumber);
      _xblockexpression = _get.getVideo();
    }
    return _xblockexpression;
  }
  
  private static void super_process(final Alternatives _self) {
    org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
     org.irisa.diverse.videogen.videoGen.aspects.SequenceAspect._privk3_process(_self_, _self);
  }
  
  protected static void _privk3_process(final AlternativesAspectAlternativesAspectProperties _self_, final Alternatives _self) {
    SequenceAspect.current(_self, Boolean.valueOf(true));
    Boolean _active = SequenceAspect.active(_self);
    if ((_active).booleanValue()) {
      String _name = _self.getName();
      String _plus = ("##### Alternatives \'" + _name);
      String _plus_1 = (_plus + "\' is been processed.");
      InputOutput.<String>println(_plus_1);
      Video _selectVideo = AlternativesAspect.selectVideo(_self);
      VideoAspect.select(_selectVideo);
    }
    AlternativesAspect.super_process(_self);
  }
  
  protected static Integer _privk3_computeMaxDuration(final AlternativesAspectAlternativesAspectProperties _self_, final Alternatives _self) {
    Integer _xblockexpression = null;
    {
      String _name = _self.getName();
      String _plus = ("MAX " + _name);
      InputOutput.<String>println(_plus);
      EList<Optional> _options = _self.getOptions();
      final Function1<Optional, Integer> _function = (Optional it) -> {
        Video _video = it.getVideo();
        return _video.getDuration();
      };
      List<Integer> _map = ListExtensions.<Optional, Integer>map(_options, _function);
      _xblockexpression = IterableExtensions.<Integer>max(_map, new Comparator<Integer>() {
        @Override
        public int compare(final Integer o1, final Integer o2) {
          return this.compare(o1, o2);
        }
      });
    }
    return _xblockexpression;
  }
  
  protected static Integer _privk3_computeMinDuration(final AlternativesAspectAlternativesAspectProperties _self_, final Alternatives _self) {
    Integer _xblockexpression = null;
    {
      String _name = _self.getName();
      String _plus = ("MIN " + _name);
      InputOutput.<String>println(_plus);
      EList<Optional> _options = _self.getOptions();
      final Function1<Optional, Integer> _function = (Optional it) -> {
        Video _video = it.getVideo();
        return _video.getDuration();
      };
      List<Integer> _map = ListExtensions.<Optional, Integer>map(_options, _function);
      _xblockexpression = IterableExtensions.<Integer>min(_map, new Comparator<Integer>() {
        @Override
        public int compare(final Integer o1, final Integer o2) {
          return this.compare(o1, o2);
        }
      });
    }
    return _xblockexpression;
  }
}
