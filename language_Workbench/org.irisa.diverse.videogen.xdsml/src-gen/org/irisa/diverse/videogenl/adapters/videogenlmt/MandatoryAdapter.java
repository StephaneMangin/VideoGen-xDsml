package org.irisa.diverse.videogenl.adapters.videogenlmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.irisa.diverse.videogenl.adapters.videogenlmt.VideoGenLMTAdaptersFactory;
import org.irisa.diverse.videogenlmt.videoGen.Sequence;
import org.irisa.diverse.videogenlmt.videoGen.Video;
import videoGen.Mandatory;

@SuppressWarnings("all")
public class MandatoryAdapter extends EObjectAdapter<Mandatory> implements org.irisa.diverse.videogenlmt.videoGen.Mandatory {
  private VideoGenLMTAdaptersFactory adaptersFactory;
  
  public MandatoryAdapter() {
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
  public Sequence getNextSibling() {
    return (Sequence) adaptersFactory.createAdapter(adaptee.getNextSibling(), eResource) ;
  }
  
  @Override
  public void setNextSibling(final Sequence o) {
    if (o != null)
    	adaptee.setNextSibling(((org.irisa.diverse.videogenl.adapters.videogenlmt.SequenceAdapter) o).getAdaptee()) ;
    else adaptee.setNextSibling(null) ;
  }
  
  @Override
  public Video getVideo() {
    return (Video) adaptersFactory.createAdapter(adaptee.getVideo(), eResource) ;
  }
  
  @Override
  public void setVideo(final Video o) {
    if (o != null)
    	adaptee.setVideo(((org.irisa.diverse.videogenl.adapters.videogenlmt.VideoAdapter) o).getAdaptee()) ;
    else adaptee.setVideo(null) ;
  }
  
  @Override
  public void process() {
    videoGen.aspects.MandatoryAspect.process(adaptee) ;
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
    return org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.eINSTANCE.getMandatory();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.MANDATORY__NAME:
    		return getName();
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.MANDATORY__NEXT_SIBLING:
    		return getNextSibling();
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.MANDATORY__CURRENT:
    		return getCurrent();
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.MANDATORY__VIDEO:
    		return getVideo();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.MANDATORY__NAME:
    		setName(NAME_EDEFAULT);
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.MANDATORY__NEXT_SIBLING:
    		setNextSibling((org.irisa.diverse.videogenlmt.videoGen.Sequence) null);
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.MANDATORY__CURRENT:
    		setCurrent(CURRENT_EDEFAULT);
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.MANDATORY__VIDEO:
    		setVideo((org.irisa.diverse.videogenlmt.videoGen.Video) null);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.MANDATORY__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.MANDATORY__NEXT_SIBLING:
    		return getNextSibling() != null;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.MANDATORY__CURRENT:
    		return getCurrent() != CURRENT_EDEFAULT;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.MANDATORY__VIDEO:
    		return getVideo() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.MANDATORY__NAME:
    		setName((java.lang.String) newValue);
    		return;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.MANDATORY__NEXT_SIBLING:
    		setNextSibling((org.irisa.diverse.videogenlmt.videoGen.Sequence) newValue);
    		return;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.MANDATORY__CURRENT:
    		setCurrent((java.lang.Boolean) newValue);
    		return;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.MANDATORY__VIDEO:
    		setVideo((org.irisa.diverse.videogenlmt.videoGen.Video) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
