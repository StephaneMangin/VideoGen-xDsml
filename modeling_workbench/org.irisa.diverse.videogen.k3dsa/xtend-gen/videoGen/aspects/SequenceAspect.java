package videoGen.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import videoGen.Sequence;
import videoGen.aspects.SequenceAspectSequenceAspectProperties;

@Aspect(className = Sequence.class)
@SuppressWarnings("all")
public abstract class SequenceAspect {
  /**
   * Call the sequence processor. Need to be overridden by a inherited class
   * Be careful to call this super method at the end of the override call.
   * 	cf: _self.super_process() (kermeta style)
   */
  public static void process(final Sequence _self) {
    videoGen.aspects.SequenceAspectSequenceAspectProperties _self_ = videoGen.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
     if (_self instanceof videoGen.Mandatory){
     videoGen.aspects.MandatoryAspect.process((videoGen.Mandatory)_self);
    } else  if (_self instanceof videoGen.Alternatives){
     videoGen.aspects.AlternativesAspect.process((videoGen.Alternatives)_self);
    } else  if (_self instanceof videoGen.Optional){
     videoGen.aspects.OptionalAspect.process((videoGen.Optional)_self);
    } else  if (_self instanceof videoGen.Sequence){
     videoGen.aspects.SequenceAspect._privk3_process(_self_, (videoGen.Sequence)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static Boolean current(final Sequence _self) {
    videoGen.aspects.SequenceAspectSequenceAspectProperties _self_ = videoGen.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_current(_self_, _self);
    return (java.lang.Boolean)result;
  }
  
  public static void current(final Sequence _self, final Boolean current) {
    videoGen.aspects.SequenceAspectSequenceAspectProperties _self_ = videoGen.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
    _privk3_current(_self_, _self,current);
  }
  
  protected static void _privk3_process(final SequenceAspectSequenceAspectProperties _self_, final Sequence _self) {
    Sequence _nextSibling = _self.getNextSibling();
    boolean _notEquals = (!Objects.equal(_nextSibling, null));
    if (_notEquals) {
      SequenceAspect.current(_self, Boolean.valueOf(false));
      Sequence _nextSibling_1 = _self.getNextSibling();
      SequenceAspect.process(_nextSibling_1);
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
