package org.irisa.diverse.videogen;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.irisa.diverse.videogen.VideoGenLMT;

@SuppressWarnings("all")
public class VideoGenL implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static VideoGenL load(final String uri) {
    ResourceSet rs = new ResourceSetImpl() ;
    Resource res = rs.getResource(URI.createURI(uri), true) ;
    VideoGenL mm = new VideoGenL() ;
    mm.setResource(res) ;
    return mm ;
  }
  
  public VideoGenLMT toVideoGenLMT() {
    org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoGenLAdapter adaptee = new org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoGenLAdapter() ;
    adaptee.setAdaptee(resource) ;
    return adaptee ;
  }
}