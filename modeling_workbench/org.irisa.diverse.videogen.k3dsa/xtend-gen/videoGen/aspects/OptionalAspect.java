package videoGen.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Pre;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import videoGen.Optional;
import videoGen.Video;
import videoGen.aspects.DistributedRandomNumberGenerator;
import videoGen.aspects.OptionalAspectOptionalAspectProperties;
import videoGen.aspects.SequenceAspect;
import videoGen.aspects.VideoAspect;

@Aspect(className = Optional.class)
@SuppressWarnings("all")
public class OptionalAspect extends SequenceAspect {
  private static Boolean preprivProcess(final Optional _self) {
    videoGen.aspects.OptionalAspectOptionalAspectProperties _self_ = videoGen.aspects.OptionalAspectOptionalAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_preprivProcess(_self_, _self);
    return (java.lang.Boolean)result;
  }
  
  /**
   * Is this video is selectable or not ?
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   */
  private static Boolean isSelected(final Optional _self) {
    videoGen.aspects.OptionalAspectOptionalAspectProperties _self_ = videoGen.aspects.OptionalAspectOptionalAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_isSelected(_self_, _self);
    return (java.lang.Boolean)result;
  }
  
  @Pre
  @Step
  @OverrideAspectMethod
  public static void process(final Optional _self) {
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		videoGen.aspects.OptionalAspectOptionalAspectProperties _self_ = videoGen.aspects.OptionalAspectOptionalAspectContext.getSelf(_self);
    		 if (_self instanceof videoGen.Optional){
    		 videoGen.aspects.OptionalAspect._privk3_process(_self_, (videoGen.Optional)_self);
    		} else  if (_self instanceof videoGen.Sequence){
    		 videoGen.aspects.SequenceAspect.process((videoGen.Sequence)_self);
    		} else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"Optional","process");
    } else {
    	command.execute();
    }
  }
  
  protected static Boolean _privk3_preprivProcess(final OptionalAspectOptionalAspectProperties _self_, final Optional _self) {
    boolean _xblockexpression = false;
    {
      String _name = _self.getName();
      String _plus = ("##### Optional \'" + _name);
      String _plus_1 = (_plus + "\' pre-processing...");
      InputOutput.<String>println(_plus_1);
      SequenceAspect.current(_self, Boolean.valueOf(true));
      _xblockexpression = true;
    }
    return Boolean.valueOf(_xblockexpression);
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
    SequenceAspect.current(_self, Boolean.valueOf(true));
    String _name = _self.getName();
    String _plus = ("##### Optional \'" + _name);
    String _plus_1 = (_plus + "\' is been processed.");
    InputOutput.<String>println(_plus_1);
    Boolean _isSelected = OptionalAspect.isSelected(_self);
    if ((_isSelected).booleanValue()) {
      Video _video = _self.getVideo();
      VideoAspect.select(_video);
    }
    OptionalAspect.super_process(_self);
  }
}
