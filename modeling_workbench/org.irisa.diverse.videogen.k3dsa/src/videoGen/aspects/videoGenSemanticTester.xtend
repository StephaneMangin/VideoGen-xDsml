package videoGen.aspects

import videoGen.VideoGen
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.EPackage
import videoGen.VideoGenPackage

import static extension videoGen.aspects.VideoGenAspect.*

class VideoGenSemanticTester {

	def static void main(String[] args) {
		EPackage.Registry.INSTANCE.put("http://www.irisa.org/diverse/videogen", VideoGenPackage.eINSTANCE)
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("videogen", new XMIResourceFactoryImpl)
		val videogen = new ResourceSetImpl().getResource(
			URI.createURI("../../language_workbench/org.irisa.diverse.videogen.sample/sample.videogen"),
			 true).getContents().get(0) as VideoGen
		videogen.initialize
	}
}