package videoGen.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

/* @Aspect(className = /* name is null */) */@SuppressWarnings("all")
public abstract class SequenceAspect {
  public Boolean current = Boolean.valueOf(false);
  
  /**
   * Call the sequence processor. Need to be overridden by a inherited class
   * Be careful to call this super method at the end of the override call.
   * 	cf: _self.super_process() (kermeta style)
   */
  public void process() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type SequenceAspect"
      + "\nThe method or field _self is undefined for the type SequenceAspect"
      + "\nThe method or field _self is undefined for the type SequenceAspect"
      + "\nnextSibling cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ncurrent cannot be resolved"
      + "\nnextSibling cannot be resolved"
      + "\nprocess cannot be resolved");
  }
}
