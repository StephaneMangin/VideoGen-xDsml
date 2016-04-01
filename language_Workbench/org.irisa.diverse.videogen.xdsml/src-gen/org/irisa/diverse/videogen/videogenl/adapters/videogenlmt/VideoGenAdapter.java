package org.irisa.diverse.videogen.videogenl.adapters.videogenlmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.irisa.diverse.videogen.videoGen.VideoGen;

@SuppressWarnings("all")
public class VideoGenAdapter extends EObjectAdapter<VideoGen> implements org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGen {
  private org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoGenLMTAdaptersFactory adaptersFactory;
  
  public VideoGenAdapter() {
    super(org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoGenLMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoGenLMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public String getName() {
    return adaptee.getName() ;
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o) ;
  }
  
  private /* EList<org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence> */Object sequences;
  
  @Override
  public /* EList<org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence> */Object getSequences() {
    if (sequences == null)
    	sequences = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSequences(), adaptersFactory) ;
    return sequences;
  }
  
  private /* EList<org.irisa.diverse.videogen.videogenlmt.videoGen.Video> */Object videos;
  
  @Override
  public /* EList<org.irisa.diverse.videogen.videogenlmt.videoGen.Video> */Object getVideos() {
    if (videos == null)
    	videos = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getVideos(), adaptersFactory) ;
    return videos;
  }
  
  @Override
  public org.irisa.diverse.videogen.videogenlmt.videoGen.Introduction getIntroduction() {
    return () adaptersFactory.createAdapter(adaptee.getIntroduction(), eResource) ;
  }
  
  @Override
  public void setIntroduction(final org.irisa.diverse.videogen.videogenlmt.videoGen.Introduction o) {
    if (o != null)
    	adaptee.setIntroduction(((org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.IntroductionAdapter) o).getAdaptee()) ;
    else adaptee.setIntroduction(null) ;
  }
  
  @Override
  public org.irisa.diverse.videogen.videogenlmt.videoGen.Conclusion getConclusion() {
    return () adaptersFactory.createAdapter(adaptee.getConclusion(), eResource) ;
  }
  
  @Override
  public void setConclusion(final org.irisa.diverse.videogen.videogenlmt.videoGen.Conclusion o) {
    if (o != null)
    	adaptee.setConclusion(((org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.ConclusionAdapter) o).getAdaptee()) ;
    else adaptee.setConclusion(null) ;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.eINSTANCE.getVideoGen();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__NAME:
    		return getName();
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__SEQUENCES:
    		return getSequences();
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__VIDEOS:
    		return getVideos();
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__INTRODUCTION:
    		return getIntroduction();
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__CONCLUSION:
    		return getConclusion();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__NAME:
    		setName(NAME_EDEFAULT);
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__SEQUENCES:
    		getSequences().clear();
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__VIDEOS:
    		getVideos().clear();
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__INTRODUCTION:
    		setIntroduction((org.irisa.diverse.videogen.videogenlmt.videoGen.Introduction) null);
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__CONCLUSION:
    		setConclusion((org.irisa.diverse.videogen.videogenlmt.videoGen.Conclusion) null);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__SEQUENCES:
    		return getSequences() != null && !getSequences().isEmpty();
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__VIDEOS:
    		return getVideos() != null && !getVideos().isEmpty();
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__INTRODUCTION:
    		return getIntroduction() != null;
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__CONCLUSION:
    		return getConclusion() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__NAME:
    		setName((java.lang.String) newValue);
    		return;
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__SEQUENCES:
    		getSequences().clear();
    		getSequences().addAll((Collection) newValue);
    		return;
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__VIDEOS:
    		getVideos().clear();
    		getVideos().addAll((Collection) newValue);
    		return;
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__INTRODUCTION:
    		setIntroduction((org.irisa.diverse.videogen.videogenlmt.videoGen.Introduction) newValue);
    		return;
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__CONCLUSION:
    		setConclusion((org.irisa.diverse.videogen.videogenlmt.videoGen.Conclusion) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
