package videoGen.aspects;

import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import videoGen.VideoGen;
import videoGen.VideoGenPackage;
import videoGen.aspects.VideoGenAspect;

@SuppressWarnings("all")
public class VideoGenSemanticTester {
  public static void main(final String[] args) {
    EPackage.Registry.INSTANCE.put("http://www.irisa.org/diverse/videogen", VideoGenPackage.eINSTANCE);
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("videogen", _xMIResourceFactoryImpl);
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    URI _createURI = URI.createURI("../../language_workbench/org.irisa.diverse.videogen.sample/sample.videogen");
    Resource _resource = _resourceSetImpl.getResource(_createURI, 
      true);
    EList<EObject> _contents = _resource.getContents();
    EObject _get = _contents.get(0);
    final VideoGen videogen = ((VideoGen) _get);
    VideoGenAspect.initialize(videogen);
  }
}
