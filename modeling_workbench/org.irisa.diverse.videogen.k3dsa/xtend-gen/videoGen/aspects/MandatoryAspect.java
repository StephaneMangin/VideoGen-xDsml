package videoGen.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import videoGen.aspects.SequenceAspect;

/* @Aspect(className = /* name is null */) */@SuppressWarnings("all")
public class MandatoryAspect extends SequenceAspect {
  @Step
  @OverrideAspectMethod
  public void process() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type MandatoryAspect"
      + "\nThe method or field _self is undefined for the type MandatoryAspect"
      + "\nThe method or field _self is undefined for the type MandatoryAspect"
      + "\nThe method or field _self is undefined for the type MandatoryAspect"
      + "\ncurrent cannot be resolved"
      + "\nname cannot be resolved"
      + "\nvideo cannot be resolved"
      + "\nselect cannot be resolved"
      + "\nnextSibling cannot be resolved"
      + "\nprocess cannot be resolved");
  }
}
