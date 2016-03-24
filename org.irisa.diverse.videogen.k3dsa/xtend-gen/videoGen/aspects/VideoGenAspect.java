package videoGen.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import videoGen.Sequence;
import videoGen.VideoGen;
import videoGen.aspects.VideoGenAspectVideoGenAspectProperties;

@Aspect(className = VideoGen.class)
@SuppressWarnings("all")
public class VideoGenAspect {
  @Main
  public static void initialize(final VideoGen _self) {
    videoGen.aspects.VideoGenAspectVideoGenAspectProperties _self_ = videoGen.aspects.VideoGenAspectVideoGenAspectContext.getSelf(_self);
    _privk3_initialize(_self_, _self);
  }
  
  private static List<Sequence> selectedSequences(final VideoGen _self) {
    videoGen.aspects.VideoGenAspectVideoGenAspectProperties _self_ = videoGen.aspects.VideoGenAspectVideoGenAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_selectedSequences(_self_, _self);
    return (java.util.List<videoGen.Sequence>)result;
  }
  
  private static void selectedSequences(final VideoGen _self, final List<Sequence> selectedSequences) {
    videoGen.aspects.VideoGenAspectVideoGenAspectProperties _self_ = videoGen.aspects.VideoGenAspectVideoGenAspectContext.getSelf(_self);
    _privk3_selectedSequences(_self_, _self,selectedSequences);
  }
  
  protected static void _privk3_initialize(final VideoGenAspectVideoGenAspectProperties _self_, final VideoGen _self) {
    String _name = _self.getName();
    String _plus = ("VideoGen " + _name);
    String _plus_1 = (_plus + " initialized.");
    InputOutput.<String>println(_plus_1);
    EList<Sequence> _sequences = _self.getSequences();
    final Sequence sequence = _sequences.get(0);
    sequence.process();
  }
  
  protected static List<Sequence> _privk3_selectedSequences(final VideoGenAspectVideoGenAspectProperties _self_, final VideoGen _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getSelectedSequences") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.List) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.selectedSequences;
  }
  
  protected static void _privk3_selectedSequences(final VideoGenAspectVideoGenAspectProperties _self_, final VideoGen _self, final List<Sequence> selectedSequences) {
    _self_.selectedSequences = selectedSequences; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setSelectedSequences")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, selectedSequences);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
