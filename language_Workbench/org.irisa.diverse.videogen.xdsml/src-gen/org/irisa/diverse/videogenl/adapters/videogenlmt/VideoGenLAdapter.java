package org.irisa.diverse.videogenl.adapters.videogenlmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import org.irisa.diverse.VideoGenLMT;
import org.irisa.diverse.videogenlmt.videoGen.VideoGenFactory;

@SuppressWarnings("all")
public class VideoGenLAdapter extends ResourceAdapter implements VideoGenLMT {
  public VideoGenLAdapter() {
    super(org.irisa.diverse.videogenl.adapters.videogenlmt.VideoGenLMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public VideoGenFactory getFactory() {
    return new org.irisa.diverse.videogenl.adapters.videogenlmt.VideoGenLMTFactoryAdapter() ;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
