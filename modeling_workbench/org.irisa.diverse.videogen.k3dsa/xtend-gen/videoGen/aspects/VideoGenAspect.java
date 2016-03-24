package videoGen.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import videoGen.Sequence;
import videoGen.VideoGen;
import videoGen.aspects.SequenceAspect;
import videoGen.aspects.VideoGenAspectVideoGenAspectProperties;

@Aspect(className = VideoGen.class)
@SuppressWarnings("all")
public class VideoGenAspect {
  @Main
  public static void initialize(final VideoGen _self) {
    videoGen.aspects.VideoGenAspectVideoGenAspectProperties _self_ = videoGen.aspects.VideoGenAspectVideoGenAspectContext.getSelf(_self);
    _privk3_initialize(_self_, _self);
  }
  
  protected static void _privk3_initialize(final VideoGenAspectVideoGenAspectProperties _self_, final VideoGen _self) {
    String _name = _self.getName();
    String _plus = ("VideoGen " + _name);
    String _plus_1 = (_plus + " initialized.");
    InputOutput.<String>println(_plus_1);
    EList<Sequence> _sequences = _self.getSequences();
    final Sequence sequence = _sequences.get(0);
    SequenceAspect.process(sequence);
  }
}
