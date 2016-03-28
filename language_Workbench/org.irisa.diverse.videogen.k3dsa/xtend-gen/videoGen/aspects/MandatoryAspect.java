package videoGen.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import videoGen.Mandatory;
import videoGen.aspects.MandatoryAspectMandatoryAspectProperties;
import videoGen.aspects.SequenceAspect;

@Aspect(className = Mandatory.class)
@SuppressWarnings("all")
public class MandatoryAspect extends SequenceAspect {
  @Step
  @OverrideAspectMethod
  public static void process(final Mandatory _self) {
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		videoGen.aspects.MandatoryAspectMandatoryAspectProperties _self_ = videoGen.aspects.MandatoryAspectMandatoryAspectContext.getSelf(_self);
    		 if (_self instanceof videoGen.Mandatory){
    		 videoGen.aspects.MandatoryAspect._privk3_process(_self_, (videoGen.Mandatory)_self);
    		} else  if (_self instanceof videoGen.Sequence){
    		 videoGen.aspects.SequenceAspect.process((videoGen.Sequence)_self);
    		} else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"Mandatory","process");
    } else {
    	command.execute();
    }
  }
  
  private static void super_process(final Mandatory _self) {
    videoGen.aspects.SequenceAspectSequenceAspectProperties _self_ = videoGen.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
     videoGen.aspects.SequenceAspect._privk3_process(_self_, _self);
  }
  
  protected static void _privk3_process(final MandatoryAspectMandatoryAspectProperties _self_, final Mandatory _self) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method select is undefined for the type MandatoryAspect");
  }
}
