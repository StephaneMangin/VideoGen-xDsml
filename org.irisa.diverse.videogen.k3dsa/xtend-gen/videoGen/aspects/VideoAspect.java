package videoGen.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import videoGen.Video;
import videoGen.aspects.VideoAspectVideoAspectProperties;

@Aspect(className = Video.class)
@SuppressWarnings("all")
public class VideoAspect {
  @Step
  public static void select(final Video _self) {
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		videoGen.aspects.VideoAspectVideoAspectProperties _self_ = videoGen.aspects.VideoAspectVideoAspectContext.getSelf(_self);
    		_privk3_select(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"Video","select");
    } else {
    	command.execute();
    }
  }
  
  private static Boolean selected(final Video _self) {
    videoGen.aspects.VideoAspectVideoAspectProperties _self_ = videoGen.aspects.VideoAspectVideoAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_selected(_self_, _self);
    return (java.lang.Boolean)result;
  }
  
  private static void selected(final Video _self, final Boolean selected) {
    videoGen.aspects.VideoAspectVideoAspectProperties _self_ = videoGen.aspects.VideoAspectVideoAspectContext.getSelf(_self);
    _privk3_selected(_self_, _self,selected);
  }
  
  protected static void _privk3_select(final VideoAspectVideoAspectProperties _self_, final Video _self) {
    String _name = _self.getName();
    String _plus = ("Sequence " + _name);
    String _plus_1 = (_plus + ": processed.");
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
