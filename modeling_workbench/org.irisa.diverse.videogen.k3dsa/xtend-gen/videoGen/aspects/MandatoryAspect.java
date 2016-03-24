package videoGen.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import videoGen.Mandatory;
import videoGen.aspects.SequenceAspect;

@Aspect(className = Mandatory.class)
@SuppressWarnings("all")
public class MandatoryAspect extends SequenceAspect {
}
