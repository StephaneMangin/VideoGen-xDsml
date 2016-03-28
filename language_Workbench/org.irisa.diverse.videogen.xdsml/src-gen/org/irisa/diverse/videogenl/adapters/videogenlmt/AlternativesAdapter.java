package org.irisa.diverse.videogenl.adapters.videogenlmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.irisa.diverse.videogenl.adapters.videogenlmt.VideoGenLMTAdaptersFactory;
import org.irisa.diverse.videogenlmt.videoGen.Optional;
import org.irisa.diverse.videogenlmt.videoGen.Sequence;
import videoGen.Alternatives;

@SuppressWarnings("all")
public class AlternativesAdapter extends EObjectAdapter<Alternatives> implements org.irisa.diverse.videogenlmt.videoGen.Alternatives {
  private VideoGenLMTAdaptersFactory adaptersFactory;
  
  public AlternativesAdapter() {
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
  
  private EList<Optional> options;
  
  @Override
  public EList<Optional> getOptions() {
    if (options == null)
    	options = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOptions(), adaptersFactory) ;
    return options;
  }
  
  @Override
  public java.util.Map<java.lang.String, java.lang.Integer> checkProbabilities() {
    return videoGen.aspects.AlternativesAspect.checkProbabilities(adaptee);
  }
  
  @Override
  public void process() {
    videoGen.aspects.AlternativesAspect.process(adaptee) ;
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
    return org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.eINSTANCE.getAlternatives();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.ALTERNATIVES__NAME:
    		return getName();
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.ALTERNATIVES__NEXT_SIBLING:
    		return getNextSibling();
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.ALTERNATIVES__CURRENT:
    		return getCurrent();
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.ALTERNATIVES__OPTIONS:
    		return getOptions();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.ALTERNATIVES__NAME:
    		setName(NAME_EDEFAULT);
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.ALTERNATIVES__NEXT_SIBLING:
    		setNextSibling((org.irisa.diverse.videogenlmt.videoGen.Sequence) null);
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.ALTERNATIVES__CURRENT:
    		setCurrent(CURRENT_EDEFAULT);
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.ALTERNATIVES__OPTIONS:
    		getOptions().clear();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.ALTERNATIVES__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.ALTERNATIVES__NEXT_SIBLING:
    		return getNextSibling() != null;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.ALTERNATIVES__CURRENT:
    		return getCurrent() != CURRENT_EDEFAULT;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.ALTERNATIVES__OPTIONS:
    		return getOptions() != null && !getOptions().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.ALTERNATIVES__NAME:
    		setName((java.lang.String) newValue);
    		return;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.ALTERNATIVES__NEXT_SIBLING:
    		setNextSibling((org.irisa.diverse.videogenlmt.videoGen.Sequence) newValue);
    		return;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.ALTERNATIVES__CURRENT:
    		setCurrent((java.lang.Boolean) newValue);
    		return;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.ALTERNATIVES__OPTIONS:
    		getOptions().clear();
    		getOptions().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
