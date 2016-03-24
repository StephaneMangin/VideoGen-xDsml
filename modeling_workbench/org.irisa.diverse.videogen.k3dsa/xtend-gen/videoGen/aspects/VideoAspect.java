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
  
  protected static void _privk3_select(final VideoAspectVideoAspectProperties _self_, final Video _self) {
    String _name = _self.getName();
    String _plus = ("Sequence " + _name);
    String _plus_1 = (_plus + ": processed.");
    InputOutput.<String>println(_plus_1);
    _self.setSelected(Boolean.valueOf(true));
  }
}
