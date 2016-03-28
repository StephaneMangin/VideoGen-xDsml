package org.irisa.diverse.videogenl.adapters.videogenlmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.irisa.diverse.videogenl.adapters.videogenlmt.VideoGenLMTAdaptersFactory;
import videoGen.Sequence;

@SuppressWarnings("all")
public class SequenceAdapter extends EObjectAdapter<Sequence> implements org.irisa.diverse.videogenlmt.videoGen.Sequence {
  private VideoGenLMTAdaptersFactory adaptersFactory;
  
  public SequenceAdapter() {
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
  public org.irisa.diverse.videogenlmt.videoGen.Sequence getNextSibling() {
    return (org.irisa.diverse.videogenlmt.videoGen.Sequence) adaptersFactory.createAdapter(adaptee.getNextSibling(), eResource) ;
  }
  
  @Override
  public void setNextSibling(final org.irisa.diverse.videogenlmt.videoGen.Sequence o) {
    if (o != null)
    	adaptee.setNextSibling(((org.irisa.diverse.videogenl.adapters.videogenlmt.SequenceAdapter) o).getAdaptee()) ;
    else adaptee.setNextSibling(null) ;
  }
  
  @Override
  public void process() {
    videoGen.aspects.SequenceAspect.process(adaptee) ;
  }
  
  @Override
  public Boolean getCurrent() {
    return videoGen.aspects.SequenceAspect.current(adaptee) ;
  }
  
  @Override
  public void setCurrent(final Boolean current) {
    videoGen.aspects.SequenceAspect.current(adaptee, current
    ) ;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static Boolean CURRENT_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.eINSTANCE.getSequence();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__NAME:
    		return getName();
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__NEXT_SIBLING:
    		return getNextSibling();
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__CURRENT:
    		return getCurrent();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__NAME:
    		setName(NAME_EDEFAULT);
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__NEXT_SIBLING:
    		setNextSibling((org.irisa.diverse.videogenlmt.videoGen.Sequence) null);
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__CURRENT:
    		setCurrent(CURRENT_EDEFAULT);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__NEXT_SIBLING:
    		return getNextSibling() != null;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__CURRENT:
    		return getCurrent() != CURRENT_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__NAME:
    		setName((java.lang.String) newValue);
    		return;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__NEXT_SIBLING:
    		setNextSibling((org.irisa.diverse.videogenlmt.videoGen.Sequence) newValue);
    		return;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__CURRENT:
    		setCurrent((java.lang.Boolean) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
