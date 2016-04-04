package org.irisa.diverse.videogen.videoGen.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.irisa.diverse.videogen.videoGen.Sequence;
import org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectProperties;

@Aspect(className = Sequence.class)
@SuppressWarnings("all")
public abstract class SequenceAspect {
  /**
   * Call the sequence processor. Need to be overridden by a inherited class
   * Be careful to call this super method at the end of the override call.
   * 	cf: _self.super_process() (kermeta style)
   */
  @Step
  public static void process(final Sequence _self) {
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
    		 if (_self instanceof org.irisa.diverse.videogen.videoGen.Mandatory){
    		 org.irisa.diverse.videogen.videoGen.aspects.MandatoryAspect.process((org.irisa.diverse.videogen.videoGen.Mandatory)_self);
    		} else  if (_self instanceof org.irisa.diverse.videogen.videoGen.Optional){
    		 org.irisa.diverse.videogen.videoGen.aspects.OptionalAspect.process((org.irisa.diverse.videogen.videoGen.Optional)_self);
    		} else  if (_self instanceof org.irisa.diverse.videogen.videoGen.Alternatives){
    		 org.irisa.diverse.videogen.videoGen.aspects.AlternativesAspect.process((org.irisa.diverse.videogen.videoGen.Alternatives)_self);
    		} else  if (_self instanceof org.irisa.diverse.videogen.videoGen.Sequence){
    		 org.irisa.diverse.videogen.videoGen.aspects.SequenceAspect._privk3_process(_self_, (org.irisa.diverse.videogen.videoGen.Sequence)_self);
    		} else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"Sequence","process");
    } else {
    	command.execute();
    }
  }
  
  public static void initialize(final Sequence _self) {
    org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
     if (_self instanceof org.irisa.diverse.videogen.videoGen.Alternatives){
     org.irisa.diverse.videogen.videoGen.aspects.AlternativesAspect.initialize((org.irisa.diverse.videogen.videoGen.Alternatives)_self);
    } else  if (_self instanceof org.irisa.diverse.videogen.videoGen.Sequence){
     org.irisa.diverse.videogen.videoGen.aspects.SequenceAspect._privk3_initialize(_self_, (org.irisa.diverse.videogen.videoGen.Sequence)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static Boolean done(final Sequence _self) {
    org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_done(_self_, _self);
    return (java.lang.Boolean)result;
  }
  
  public static void done(final Sequence _self, final Boolean done) {
    org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
    _privk3_done(_self_, _self,done);
  }
  
  public static Boolean callNextSequence(final Sequence _self) {
    org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_callNextSequence(_self_, _self);
    return (java.lang.Boolean)result;
  }
  
  public static void callNextSequence(final Sequence _self, final Boolean callNextSequence) {
    org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
    _privk3_callNextSequence(_self_, _self,callNextSequence);
  }
  
  protected static void _privk3_process(final SequenceAspectSequenceAspectProperties _self_, final Sequence _self) {
    Boolean _done = SequenceAspect.done(_self);
    boolean _not = (!(_done).booleanValue());
    if (_not) {
      Sequence _nextSequence = _self.getNextSequence();
      boolean _tripleNotEquals = (_nextSequence != null);
      if (_tripleNotEquals) {
        SequenceAspect.done(_self, Boolean.valueOf(true));
        Boolean _callNextSequence = SequenceAspect.callNextSequence(_self);
        if ((_callNextSequence).booleanValue()) {
          Sequence _nextSequence_1 = _self.getNextSequence();
          SequenceAspect.process(_nextSequence_1);
        }
      }
    }
  }
  
  protected static void _privk3_initialize(final SequenceAspectSequenceAspectProperties _self_, final Sequence _self) {
  }
  
  protected static Boolean _privk3_done(final SequenceAspectSequenceAspectProperties _self_, final Sequence _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getDone") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Boolean) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.done;
  }
  
  protected static void _privk3_done(final SequenceAspectSequenceAspectProperties _self_, final Sequence _self, final Boolean done) {
    _self_.done = done; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setDone")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, done);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static Boolean _privk3_callNextSequence(final SequenceAspectSequenceAspectProperties _self_, final Sequence _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCallNextSequence") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Boolean) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.callNextSequence;
  }
  
  protected static void _privk3_callNextSequence(final SequenceAspectSequenceAspectProperties _self_, final Sequence _self, final Boolean callNextSequence) {
    _self_.callNextSequence = callNextSequence; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCallNextSequence")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, callNextSequence);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
