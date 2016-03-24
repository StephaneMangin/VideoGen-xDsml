package videoGen.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import videoGen.Sequence;
import videoGen.aspects.SequenceAspectSequenceAspectProperties;

@Aspect(className = Sequence.class)
@SuppressWarnings("all")
public abstract class SequenceAspect {
  @Step
  public static void process(final Sequence _self) {
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		videoGen.aspects.SequenceAspectSequenceAspectProperties _self_ = videoGen.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
    		 if (_self instanceof videoGen.Alternatives){
    		 videoGen.aspects.AlternativesAspect.process((videoGen.Alternatives)_self);
    		} else  if (_self instanceof videoGen.Optional){
    		 videoGen.aspects.OptionalAspect.process((videoGen.Optional)_self);
    		} else  if (_self instanceof videoGen.Sequence){
    		 videoGen.aspects.SequenceAspect._privk3_process(_self_, (videoGen.Sequence)_self);
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
  
  protected static void _privk3_process(final SequenceAspectSequenceAspectProperties _self_, final Sequence _self) {
    Class<? extends Sequence> _class = _self.getClass();
    String _simpleName = _class.getSimpleName();
    String _plus = ("Sequence [" + _simpleName);
    String _plus_1 = (_plus + "] ");
    String _name = _self.getName();
    String _plus_2 = (_plus_1 + _name);
    String _plus_3 = (_plus_2 + ": processed.");
    InputOutput.<String>println(_plus_3);
    Sequence _nextSibling = _self.getNextSibling();
    SequenceAspect.process(_nextSibling);
  }
}
