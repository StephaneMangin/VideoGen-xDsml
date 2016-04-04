package org.irisa.diverse.videogen.videoGen.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.irisa.diverse.videogen.videoGen.Optional;
import org.irisa.diverse.videogen.videoGen.Video;
import org.irisa.diverse.videogen.videoGen.aspects.DistributedRandomNumberGenerator;
import org.irisa.diverse.videogen.videoGen.aspects.OptionalAspectOptionalAspectProperties;
import org.irisa.diverse.videogen.videoGen.aspects.SequenceAspect;
import org.irisa.diverse.videogen.videoGen.aspects.VideoAspect;

@Aspect(className = Optional.class)
@SuppressWarnings("all")
public class OptionalAspect extends SequenceAspect {
  /**
   * Is this video is selectable or not ?
   * applies 50% in case of undefined proba
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   */
  private static Boolean isSelected(final Optional _self) {
    org.irisa.diverse.videogen.videoGen.aspects.OptionalAspectOptionalAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.OptionalAspectOptionalAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_isSelected(_self_, _self);
    return (java.lang.Boolean)result;
  }
  
  @OverrideAspectMethod
  public static void process(final Optional _self) {
    org.irisa.diverse.videogen.videoGen.aspects.OptionalAspectOptionalAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.OptionalAspectOptionalAspectContext.getSelf(_self);
     if (_self instanceof org.irisa.diverse.videogen.videoGen.Optional){
     org.irisa.diverse.videogen.videoGen.aspects.OptionalAspect._privk3_process(_self_, (org.irisa.diverse.videogen.videoGen.Optional)_self);
    } else  if (_self instanceof org.irisa.diverse.videogen.videoGen.Sequence){
     org.irisa.diverse.videogen.videoGen.aspects.SequenceAspect.process((org.irisa.diverse.videogen.videoGen.Sequence)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static Boolean _privk3_isSelected(final OptionalAspectOptionalAspectProperties _self_, final Optional _self) {
    boolean _xblockexpression = false;
    {
      DistributedRandomNumberGenerator drng = new DistributedRandomNumberGenerator();
      float proba = 0;
      proba = 50;
      Integer _probability = _self.getProbability();
      boolean _notEquals = ((_probability).intValue() != 0);
      if (_notEquals) {
        Integer _probability_1 = _self.getProbability();
        proba = (_probability_1).intValue();
      }
      drng.addNumber(1, proba);
      drng.addNumber(0, (100 - proba));
      int _distributedRandomNumber = drng.getDistributedRandomNumber();
      _xblockexpression = (_distributedRandomNumber > 0);
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  private static void super_process(final Optional _self) {
    org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
     org.irisa.diverse.videogen.videoGen.aspects.SequenceAspect._privk3_process(_self_, _self);
  }
  
  protected static void _privk3_process(final OptionalAspectOptionalAspectProperties _self_, final Optional _self) {
    boolean _and = false;
    Boolean _active = _self.getActive();
    if (!(_active).booleanValue()) {
      _and = false;
    } else {
      Boolean _done = SequenceAspect.done(_self);
      boolean _not = (!(_done).booleanValue());
      _and = _not;
    }
    if (_and) {
      String _name = _self.getName();
      String _plus = ("##### Optional \'" + _name);
      String _plus_1 = (_plus + "\' is been processed.");
      InputOutput.<String>println(_plus_1);
      Boolean _isSelected = OptionalAspect.isSelected(_self);
      if ((_isSelected).booleanValue()) {
        Video _video = _self.getVideo();
        VideoAspect.select(_video);
      }
    }
    OptionalAspect.super_process(_self);
  }
}
