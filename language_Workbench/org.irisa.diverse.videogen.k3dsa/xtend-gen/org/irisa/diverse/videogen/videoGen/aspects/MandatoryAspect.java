package org.irisa.diverse.videogen.videoGen.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.irisa.diverse.videogen.videoGen.Mandatory;
import org.irisa.diverse.videogen.videoGen.Video;
import org.irisa.diverse.videogen.videoGen.aspects.MandatoryAspectMandatoryAspectProperties;
import org.irisa.diverse.videogen.videoGen.aspects.SequenceAspect;
import org.irisa.diverse.videogen.videoGen.aspects.VideoAspect;

@Aspect(className = Mandatory.class)
@SuppressWarnings("all")
public class MandatoryAspect extends SequenceAspect {
  @Step
  @OverrideAspectMethod
  public static void process(final Mandatory _self) {
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		org.irisa.diverse.videogen.videoGen.aspects.MandatoryAspectMandatoryAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.MandatoryAspectMandatoryAspectContext.getSelf(_self);
    		 if (_self instanceof org.irisa.diverse.videogen.videoGen.Mandatory){
    		 org.irisa.diverse.videogen.videoGen.aspects.MandatoryAspect._privk3_process(_self_, (org.irisa.diverse.videogen.videoGen.Mandatory)_self);
    		} else  if (_self instanceof org.irisa.diverse.videogen.videoGen.Sequence){
    		 org.irisa.diverse.videogen.videoGen.aspects.SequenceAspect.process((org.irisa.diverse.videogen.videoGen.Sequence)_self);
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
    org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
     org.irisa.diverse.videogen.videoGen.aspects.SequenceAspect._privk3_process(_self_, _self);
  }
  
  protected static void _privk3_process(final MandatoryAspectMandatoryAspectProperties _self_, final Mandatory _self) {
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
      String _plus = ("##### Mandatory \'" + _name);
      String _plus_1 = (_plus + "\' is been processed.");
      InputOutput.<String>println(_plus_1);
      Video _video = _self.getVideo();
      VideoAspect.select(_video);
    }
    MandatoryAspect.super_process(_self);
  }
}
