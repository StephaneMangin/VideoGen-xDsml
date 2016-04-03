package org.irisa.diverse.videogen.videoGen.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.irisa.diverse.videogen.videoGen.Video;
import org.irisa.diverse.videogen.videoGen.aspects.VideoAspectVideoAspectProperties;

@Aspect(className = Video.class)
@SuppressWarnings("all")
public class VideoAspect {
  /**
   * Select this video and apply any of needed operations (conversion or rename for example)
   */
  public static void select(final Video _self) {
    org.irisa.diverse.videogen.videoGen.aspects.VideoAspectVideoAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.VideoAspectVideoAspectContext.getSelf(_self);
    _privk3_select(_self_, _self);
  }
  
  public static Boolean selected(final Video _self) {
    org.irisa.diverse.videogen.videoGen.aspects.VideoAspectVideoAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.VideoAspectVideoAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_selected(_self_, _self);
    return (java.lang.Boolean)result;
  }
  
  public static void selected(final Video _self, final Boolean selected) {
    org.irisa.diverse.videogen.videoGen.aspects.VideoAspectVideoAspectProperties _self_ = org.irisa.diverse.videogen.videoGen.aspects.VideoAspectVideoAspectContext.getSelf(_self);
    _privk3_selected(_self_, _self,selected);
  }
  
  protected static void _privk3_select(final VideoAspectVideoAspectProperties _self_, final Video _self) {
    String _url = _self.getUrl();
    String _plus = ("##### Video \'" + _url);
    String _plus_1 = (_plus + "\' has been selected.");
    InputOutput.<String>println(_plus_1);
    _self.setSelected(Boolean.valueOf(true));
  }
  
  protected static Boolean _privk3_selected(final VideoAspectVideoAspectProperties _self_, final Video _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getSelected") &&
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
    return _self_.selected;
  }
  
  protected static void _privk3_selected(final VideoAspectVideoAspectProperties _self_, final Video _self, final Boolean selected) {
    _self_.selected = selected; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setSelected")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, selected);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
