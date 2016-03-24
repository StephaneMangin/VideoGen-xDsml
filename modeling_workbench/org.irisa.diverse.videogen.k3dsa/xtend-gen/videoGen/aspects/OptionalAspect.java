package videoGen.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import videoGen.Optional;
import videoGen.Video;
import videoGen.aspects.DistributedRandomNumberGenerator;
import videoGen.aspects.OptionalAspectOptionalAspectProperties;
import videoGen.aspects.SequenceAspect;
import videoGen.aspects.VideoAspect;

@Aspect(className = Optional.class)
@SuppressWarnings("all")
public class OptionalAspect extends SequenceAspect {
  private static Boolean isSelected(final Optional _self) {
    videoGen.aspects.OptionalAspectOptionalAspectProperties _self_ = videoGen.aspects.OptionalAspectOptionalAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_isSelected(_self_, _self);
    return (java.lang.Boolean)result;
  }
  
  @OverrideAspectMethod
  public static void process(final Optional _self) {
    videoGen.aspects.OptionalAspectOptionalAspectProperties _self_ = videoGen.aspects.OptionalAspectOptionalAspectContext.getSelf(_self);
     if (_self instanceof videoGen.Optional){
     videoGen.aspects.OptionalAspect._privk3_process(_self_, (videoGen.Optional)_self);
    } else  if (_self instanceof videoGen.Sequence){
     videoGen.aspects.SequenceAspect.process((videoGen.Sequence)_self);
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
    videoGen.aspects.SequenceAspectSequenceAspectProperties _self_ = videoGen.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
     videoGen.aspects.SequenceAspect._privk3_process(_self_, _self);
  }
  
  protected static void _privk3_process(final OptionalAspectOptionalAspectProperties _self_, final Optional _self) {
    Boolean _isSelected = OptionalAspect.isSelected(_self);
    if ((_isSelected).booleanValue()) {
      Video _video = _self.getVideo();
      VideoAspect.select(_video);
    }
    OptionalAspect.super_process(_self);
  }
}
