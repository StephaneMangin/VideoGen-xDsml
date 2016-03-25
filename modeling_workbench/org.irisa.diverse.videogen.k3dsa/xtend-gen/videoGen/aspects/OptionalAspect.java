package videoGen.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import videoGen.aspects.SequenceAspect;

/* @Aspect(className = /* name is null */) */@SuppressWarnings("all")
public class OptionalAspect extends SequenceAspect {
  /**
   * Is this video is selectable or not ?
   * applies 50% in case of undefined proba
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   */
  private Boolean isSelected() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type OptionalAspect"
      + "\nThe method or field _self is undefined for the type OptionalAspect"
      + "\nprobability cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nprobability cannot be resolved");
  }
  
  @Step
  @OverrideAspectMethod
  public void process() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type OptionalAspect"
      + "\nThe method or field _self is undefined for the type OptionalAspect"
      + "\nThe method or field _self is undefined for the type OptionalAspect"
      + "\nThe method or field _self is undefined for the type OptionalAspect"
      + "\nThe method or field _self is undefined for the type OptionalAspect"
      + "\ncurrent cannot be resolved"
      + "\nname cannot be resolved"
      + "\nisSelected cannot be resolved"
      + "\nvideo cannot be resolved"
      + "\nselect cannot be resolved"
      + "\nsuper_process cannot be resolved");
  }
}
