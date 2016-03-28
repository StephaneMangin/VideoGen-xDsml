package org.irisa.diverse;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup() ;
    setup.doEMFRegistration() ;
    setup.doAdaptersRegistration() ;
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	videoGen.VideoGenPackage.eNS_URI,
    	videoGen.VideoGenPackage.eINSTANCE
    ) ;
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    ) ;
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    ) ;
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor videoGenL = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.irisa.diverse.VideoGenL", "", "http://www.irisa.org/diverse/videogen", "org.irisa.diverse.VideoGenLMT"
    ) ;
    videoGenL.addAdapter("org.irisa.diverse.VideoGenLMT", org.irisa.diverse.videogenl.adapters.videogenlmt.VideoGenLAdapter.class) ;
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.irisa.diverse.VideoGenL",
    	videoGenL
    ) ;
    MelangeRegistry.ModelTypeDescriptor videoGenLMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.irisa.diverse.VideoGenLMT", "", "http://videogenlmt/"
    ) ;
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.irisa.diverse.VideoGenLMT",
    	videoGenLMT
    ) ;
  }
}
