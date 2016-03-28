package org.irisa.diverse.videogenl.adapters.videogenlmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;

import org.eclipse.emf.ecore.EClass;
import org.irisa.diverse.videogenl.adapters.videogenlmt.VideoGenLMTAdaptersFactory;
import org.irisa.diverse.videogenlmt.videoGen.Mimetypes_Enum;

import videoGen.Video;

@SuppressWarnings("all")
public class VideoAdapter extends EObjectAdapter<Video> implements org.irisa.diverse.videogenlmt.videoGen.Video {
  private VideoGenLMTAdaptersFactory adaptersFactory;
  
  public VideoAdapter() {
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
  public String getUrl() {
    return adaptee.getUrl() ;
  }
  
  @Override
  public void setUrl(final String o) {
    adaptee.setUrl(o) ;
  }
  
  @Override
  public String getDescription() {
    return adaptee.getDescription() ;
  }
  
  @Override
  public void setDescription(final String o) {
    adaptee.setDescription(o) ;
  }
  
  @Override
  public Integer getDuration() {
    return adaptee.getDuration() ;
  }
  
  @Override
  public void setDuration(final Integer o) {
    adaptee.setDuration(o) ;
  }
  
  @Override
  public Mimetypes_Enum getMimetype() {
    return org.irisa.diverse.videogenlmt.videoGen.Mimetypes_Enum.get(adaptee.getMimetype().getValue());
  }
  
  @Override
  public void setMimetype(final Mimetypes_Enum o) {
    adaptee.setMimetype(videoGen.Mimetypes_Enum.get(o.getValue())) ;
  }
  
  @Override
  public void select() {
    videoGen.aspects.VideoAspect.select(adaptee) ;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static String URL_EDEFAULT = null;
  
  protected final static String DESCRIPTION_EDEFAULT = null;
  
  protected final static Integer DURATION_EDEFAULT = new Integer(0);
  
  protected final static Mimetypes_Enum MIMETYPE_EDEFAULT = org.irisa.diverse.videogenlmt.videoGen.Mimetypes_Enum.NONE;
  
  protected final static Boolean SELECTED_EDEFAULT = java.lang.Boolean.FALSE;
  
  @Override
  public EClass eClass() {
    return org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.eINSTANCE.getVideo();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO__NAME:
    		return getName();
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO__URL:
    		return getUrl();
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO__DESCRIPTION:
    		return getDescription();
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO__DURATION:
    		return getDuration();
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO__MIMETYPE:
    		return getMimetype();
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO__SELECTED:
    		return getSelected();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO__NAME:
    		setName(NAME_EDEFAULT);
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO__URL:
    		setUrl(URL_EDEFAULT);
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO__DESCRIPTION:
    		setDescription(DESCRIPTION_EDEFAULT);
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO__DURATION:
    		setDuration(DURATION_EDEFAULT);
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO__MIMETYPE:
    		setMimetype(MIMETYPE_EDEFAULT);
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO__SELECTED:
    		setSelected(SELECTED_EDEFAULT);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO__URL:
    		return getUrl() != URL_EDEFAULT;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO__DURATION:
    		return getDuration() != DURATION_EDEFAULT;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO__MIMETYPE:
    		return getMimetype() != MIMETYPE_EDEFAULT;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO__SELECTED:
    		return getSelected() != SELECTED_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO__NAME:
    		setName((java.lang.String) newValue);
    		return;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO__URL:
    		setUrl((java.lang.String) newValue);
    		return;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO__DESCRIPTION:
    		setDescription((java.lang.String) newValue);
    		return;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO__DURATION:
    		setDuration((java.lang.Integer) newValue);
    		return;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO__MIMETYPE:
    		setMimetype((org.irisa.diverse.videogenlmt.videoGen.Mimetypes_Enum) newValue);
    		return;
    	case org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage.VIDEO__SELECTED:
    		setSelected((java.lang.Boolean) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }

@Override
public Boolean getSelected() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void setSelected(Boolean value) {
	// TODO Auto-generated method stub
	
}
}
