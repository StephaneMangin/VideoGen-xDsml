package org.irisa.diverse.videogen.videogenl.adapters.videogenlmt;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.irisa.diverse.videogen.videoGen.VideoGenFactory;

@SuppressWarnings("all")
public class VideoGenLMTFactoryAdapter extends EFactoryImpl implements org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenFactory {
  private org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoGenLMTAdaptersFactory adaptersFactory = org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoGenLMTAdaptersFactory.getInstance();
  
  private VideoGenFactory videoGenAdaptee = org.irisa.diverse.videogen.videoGen.VideoGenFactory.eINSTANCE;
  
  @Override
  public org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGen createVideoGen() {
    return adaptersFactory.createVideoGenAdapter(videoGenAdaptee.createVideoGen(), null) ;
  }
  
  @Override
  public org.irisa.diverse.videogen.videogenlmt.videoGen.Alternatives createAlternatives() {
    return adaptersFactory.createAlternativesAdapter(videoGenAdaptee.createAlternatives(), null) ;
  }
  
  @Override
  public org.irisa.diverse.videogen.videogenlmt.videoGen.Mandatory createMandatory() {
    return adaptersFactory.createMandatoryAdapter(videoGenAdaptee.createMandatory(), null) ;
  }
  
  @Override
  public org.irisa.diverse.videogen.videogenlmt.videoGen.Optional createOptional() {
    return adaptersFactory.createOptionalAdapter(videoGenAdaptee.createOptional(), null) ;
  }
  
  @Override
  public org.irisa.diverse.videogen.videogenlmt.videoGen.Video createVideo() {
    return adaptersFactory.createVideoAdapter(videoGenAdaptee.createVideo(), null) ;
  }
  
  @Override
  public org.irisa.diverse.videogen.videogenlmt.videoGen.Introduction createIntroduction() {
    return adaptersFactory.createIntroductionAdapter(videoGenAdaptee.createIntroduction(), null) ;
  }
  
  @Override
  public org.irisa.diverse.videogen.videogenlmt.videoGen.Conclusion createConclusion() {
    return adaptersFactory.createConclusionAdapter(videoGenAdaptee.createConclusion(), null) ;
  }
  
  @Override
  public EPackage getEPackage() {
    return getVideoGenPackage();
  }
  
  public org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage getVideoGenPackage() {
    return org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.eINSTANCE;
  }
}
