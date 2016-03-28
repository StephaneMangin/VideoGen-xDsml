package org.irisa.diverse;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.irisa.diverse.videogenlmt.videoGen.VideoGenFactory;

@SuppressWarnings("all")
public interface VideoGenLMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract VideoGenFactory getFactory();
  
  public abstract void save(final String uri) throws IOException;
}
