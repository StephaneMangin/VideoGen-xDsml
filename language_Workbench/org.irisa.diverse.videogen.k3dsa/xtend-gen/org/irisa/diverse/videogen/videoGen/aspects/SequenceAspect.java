package org.irisa.diverse.videogen.videoGen.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
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
  public static void process(final Sequence _self) {
    org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
     if (_self instanceof org.irisa.diverse.videogen.videoGen.Alternatives){
     org.irisa.diverse.videogen.videoGen.aspects.AlternativesAspect.process((org.irisa.diverse.videogen.videoGen.Alternatives)_self);
    } else  if (_self instanceof org.irisa.diverse.videogen.videoGen.Mandatory){
     org.irisa.diverse.videogen.videoGen.aspects.MandatoryAspect.process((org.irisa.diverse.videogen.videoGen.Mandatory)_self);
    } else  if (_self instanceof org.irisa.diverse.videogen.videoGen.Optional){
     org.irisa.diverse.videogen.videoGen.aspects.OptionalAspect.process((org.irisa.diverse.videogen.videoGen.Optional)_self);
    } else  if (_self instanceof org.irisa.diverse.videogen.videoGen.Sequence){
     org.irisa.diverse.videogen.videoGen.aspects.SequenceAspect._privk3_process(_self_, (org.irisa.diverse.videogen.videoGen.Sequence)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static void initialize(final Sequence _self) {
    org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
     if (_self instanceof org.irisa.diverse.videogen.videoGen.Alternatives){
     org.irisa.diverse.videogen.videoGen.aspects.AlternativesAspect.initialize((org.irisa.diverse.videogen.videoGen.Alternatives)_self);
    } else  if (_self instanceof org.irisa.diverse.videogen.videoGen.Sequence){
     org.irisa.diverse.videogen.videoGen.aspects.SequenceAspect._privk3_initialize(_self_, (org.irisa.diverse.videogen.videoGen.Sequence)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static Boolean active(final Sequence _self) {
    org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_active(_self_, _self);
    return (java.lang.Boolean)result;
  }
  
  public static void active(final Sequence _self, final Boolean active) {
    org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
    _privk3_active(_self_, _self,active);
  }
  
  public static Boolean current(final Sequence _self) {
    org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_current(_self_, _self);
    return (java.lang.Boolean)result;
  }
  
  public static void current(final Sequence _self, final Boolean current) {
    org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
    _privk3_current(_self_, _self,current);
  }
  
  protected static void _privk3_process(final SequenceAspectSequenceAspectProperties _self_, final Sequence _self) {
    Sequence _nextSequence = _self.getNextSequence();
    boolean _tripleNotEquals = (_nextSequence != null);
    if (_tripleNotEquals) {
      SequenceAspect.current(_self, Boolean.valueOf(false));
      Sequence _nextSequence_1 = _self.getNextSequence();
      SequenceAspect.process(_nextSequence_1);
    }
  }
  
  protected static void _privk3_initialize(final SequenceAspectSequenceAspectProperties _self_, final Sequence _self) {
    Sequence _nextSequence = _self.getNextSequence();
    SequenceAspect.initialize(_nextSequence);
  }
  
  protected static Boolean _privk3_active(final SequenceAspectSequenceAspectProperties _self_, final Sequence _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getActive") &&
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
    return _self_.active;
  }
  
  protected static void _privk3_active(final SequenceAspectSequenceAspectProperties _self_, final Sequence _self, final Boolean active) {
    _self_.active = active; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setActive")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, active);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static Boolean _privk3_current(final SequenceAspectSequenceAspectProperties _self_, final Sequence _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrent") &&
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
    return _self_.current;
  }
  
  protected static void _privk3_current(final SequenceAspectSequenceAspectProperties _self_, final Sequence _self, final Boolean current) {
    _self_.current = current; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrent")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, current);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
