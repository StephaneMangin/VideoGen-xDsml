package org.irisa.diverse.videogen.videogenl.adapters.videogenlmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import org.irisa.diverse.videogen.VideoGenLMT;

@SuppressWarnings("all")
public class VideoGenLAdapter extends ResourceAdapter implements VideoGenLMT {
  public VideoGenLAdapter() {
    super(org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoGenLMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenFactory getFactory() {
    return new org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoGenLMTFactoryAdapter() ;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
