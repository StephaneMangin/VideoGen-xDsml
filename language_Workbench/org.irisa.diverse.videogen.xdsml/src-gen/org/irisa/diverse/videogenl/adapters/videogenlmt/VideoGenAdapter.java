package org.irisa.diverse.videogenl.adapters.videogenlmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.irisa.diverse.videogenl.adapters.videogenlmt.VideoGenLMTAdaptersFactory;
import org.irisa.diverse.videogenlmt.videoGen.Sequence;
import videoGen.VideoGen;

@SuppressWarnings("all")
public class VideoGenAdapter extends EObjectAdapter<VideoGen> implements org.irisa.diverse.videogenlmt.videoGen.VideoGen {
  private VideoGenLMTAdaptersFactory adaptersFactory;
  
  public VideoGenAdapter() {
    super(org.irisa.diverse.videogenl.adapters.videogenlmt.VideoGenLMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.irisa.diverse.videogenl.adapters.videogenlmt.VideoGenLMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public String getName() {
    return adaptee.getName() ;
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o) ;
  }
  
  @Override
  public EList<?> getSelectedSequences() {
    return adaptee.getSelectedSequences() ;
  }
  
  @Override
  public void setSelectedSequences(final EList<?> o) {
    adaptee.setSelectedSequences(o) ;
  }
  
  private EList<Sequence> sequences;
  
  @Override
  public EList<Sequence> getSequences() {
    if (sequences == null)
    	sequences = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSequences(), adaptersFactory) ;
    return sequences;
  }
  
  @Override
  public void initialize() {
    videoGen.aspects.VideoGenAspect.initialize(adaptee) ;
  }
  
  @Override
  public void compute() {
    videoGen.aspects.VideoGenAspect.compute(adaptee) ;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.eINSTANCE.getVideoGen();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__NAME:
    		return getName();
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__SEQUENCES:
    		return getSequences();
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__SELECTED_SEQUENCES:
    		return getSelectedSequences();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__NAME:
    		setName(NAME_EDEFAULT);
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__SEQUENCES:
    		getSequences().clear();
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__SELECTED_SEQUENCES:
    		setSelectedSequences((org.eclipse.emf.common.util.EList<?>) null);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__SEQUENCES:
    		return getSequences() != null && !getSequences().isEmpty();
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__SELECTED_SEQUENCES:
    		return getSelectedSequences() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__NAME:
    		setName((java.lang.String) newValue);
    		return;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__SEQUENCES:
    		getSequences().clear();
    		getSequences().addAll((Collection) newValue);
    		return;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO_GEN__SELECTED_SEQUENCES:
    		setSelectedSequences((org.eclipse.emf.common.util.EList<?>) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
