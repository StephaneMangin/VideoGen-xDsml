package org.irisa.diverse.videogenl.adapters.videogenlmt;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.irisa.diverse.videogenl.adapters.videogenlmt.VideoGenLMTAdaptersFactory;
import org.irisa.diverse.videogenlmt.videoGen.Alternatives;
import org.irisa.diverse.videogenlmt.videoGen.Mandatory;
import org.irisa.diverse.videogenlmt.videoGen.Optional;
import org.irisa.diverse.videogenlmt.videoGen.Video;
import org.irisa.diverse.videogenlmt.videoGen.VideoGen;
import org.irisa.diverse.videogenlmt.videoGen.VideoGenFactory;
import org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage;

@SuppressWarnings("all")
public class VideoGenLMTFactoryAdapter extends EFactoryImpl implements VideoGenFactory {
  private VideoGenLMTAdaptersFactory adaptersFactory = org.irisa.diverse.videogenl.adapters.videogenlmt.VideoGenLMTAdaptersFactory.getInstance();
  
  private videoGen.VideoGenFactory videoGenAdaptee = videoGen.VideoGenFactory.eINSTANCE;
  
  @Override
  public VideoGen createVideoGen() {
    return adaptersFactory.createVideoGenAdapter(videoGenAdaptee.createVideoGen(), null) ;
  }
  
  @Override
  public Alternatives createAlternatives() {
    return adaptersFactory.createAlternativesAdapter(videoGenAdaptee.createAlternatives(), null) ;
  }
  
  @Override
  public Mandatory createMandatory() {
    return adaptersFactory.createMandatoryAdapter(videoGenAdaptee.createMandatory(), null) ;
  }
  
  @Override
  public Optional createOptional() {
    return adaptersFactory.createOptionalAdapter(videoGenAdaptee.createOptional(), null) ;
  }
  
  @Override
  public Video createVideo() {
    return adaptersFactory.createVideoAdapter(videoGenAdaptee.createVideo(), null) ;
  }
  
  @Override
  public EPackage getEPackage() {
    return getVideoGenPackage();
  }
  
  public VideoGenPackage getVideoGenPackage() {
    return org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.eINSTANCE;
  }
}
