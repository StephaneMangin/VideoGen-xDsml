package org.irisa.diverse.videogen.videogenl.adapters.videogenlmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.irisa.diverse.videogen.videoGen.Optional;

@SuppressWarnings("all")
public class OptionalAdapter extends EObjectAdapter<Optional> implements org.irisa.diverse.videogen.videogenlmt.videoGen.Optional {
  private org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoGenLMTAdaptersFactory adaptersFactory;
  
  public OptionalAdapter() {
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
  
  @Override
  public boolean isActive() {
    return adaptee.isActive() ;
  }
  
  @Override
  public void setActive(final boolean o) {
    adaptee.setActive(o) ;
  }
  
  @Override
  public Integer getProbability() {
    return adaptee.getProbability() ;
  }
  
  @Override
  public void setProbability(final Integer o) {
    adaptee.setProbability(o) ;
  }
  
  @Override
  public org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence getNextSequence() {
    return () adaptersFactory.createAdapter(adaptee.getNextSequence(), eResource) ;
  }
  
  @Override
  public void setNextSequence(final org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence o) {
    if (o != null)
    	adaptee.setNextSequence(((org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.SequenceAdapter) o).getAdaptee()) ;
    else adaptee.setNextSequence(null) ;
  }
  
  @Override
  public org.irisa.diverse.videogen.videogenlmt.videoGen.Video getVideo() {
    return () adaptersFactory.createAdapter(adaptee.getVideo(), eResource) ;
  }
  
  @Override
  public void setVideo(final org.irisa.diverse.videogen.videogenlmt.videoGen.Video o) {
    if (o != null)
    	adaptee.setVideo(((org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoAdapter) o).getAdaptee()) ;
    else adaptee.setVideo(null) ;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static boolean ACTIVE_EDEFAULT = true;
  
  protected final static Integer PROBABILITY_EDEFAULT = new Integer(0);
  
  @Override
  public EClass eClass() {
    return org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.eINSTANCE.getOptional();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.OPTIONAL__NAME:
    		return getName();
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.OPTIONAL__NEXT_SEQUENCE:
    		return getNextSequence();
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.OPTIONAL__ACTIVE:
    		return isActive() ? Boolean.TRUE : Boolean.FALSE;
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.OPTIONAL__VIDEO:
    		return getVideo();
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.OPTIONAL__PROBABILITY:
    		return getProbability();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.OPTIONAL__NAME:
    		setName(NAME_EDEFAULT);
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.OPTIONAL__NEXT_SEQUENCE:
    		setNextSequence((org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence) null);
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.OPTIONAL__ACTIVE:
    		setActive(ACTIVE_EDEFAULT);
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.OPTIONAL__VIDEO:
    		setVideo((org.irisa.diverse.videogen.videogenlmt.videoGen.Video) null);
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.OPTIONAL__PROBABILITY:
    		setProbability(PROBABILITY_EDEFAULT);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.OPTIONAL__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.OPTIONAL__NEXT_SEQUENCE:
    		return getNextSequence() != null;
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.OPTIONAL__ACTIVE:
    		return isActive() != ACTIVE_EDEFAULT;
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.OPTIONAL__VIDEO:
    		return getVideo() != null;
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.OPTIONAL__PROBABILITY:
    		return getProbability() != PROBABILITY_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.OPTIONAL__NAME:
    		setName((java.lang.String) newValue);
    		return;
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.OPTIONAL__NEXT_SEQUENCE:
    		setNextSequence((org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence) newValue);
    		return;
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.OPTIONAL__ACTIVE:
    		setActive(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.OPTIONAL__VIDEO:
    		setVideo((org.irisa.diverse.videogen.videogenlmt.videoGen.Video) newValue);
    		return;
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.OPTIONAL__PROBABILITY:
    		setProbability((java.lang.Integer) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
