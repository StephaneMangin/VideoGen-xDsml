package org.irisa.diverse.videogenl.adapters.videogenlmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.irisa.diverse.videogenl.adapters.videogenlmt.AlternativesAdapter;
import org.irisa.diverse.videogenl.adapters.videogenlmt.MandatoryAdapter;
import org.irisa.diverse.videogenl.adapters.videogenlmt.NamedElementAdapter;
import org.irisa.diverse.videogenl.adapters.videogenlmt.OptionalAdapter;
import org.irisa.diverse.videogenl.adapters.videogenlmt.SequenceAdapter;
import org.irisa.diverse.videogenl.adapters.videogenlmt.VideoAdapter;
import org.irisa.diverse.videogenl.adapters.videogenlmt.VideoGenAdapter;
import videoGen.Alternatives;
import videoGen.Mandatory;
import videoGen.NamedElement;
import videoGen.Optional;
import videoGen.Sequence;
import videoGen.Video;
import videoGen.VideoGen;

@SuppressWarnings("all")
public class VideoGenLMTAdaptersFactory implements AdaptersFactory {
  private static VideoGenLMTAdaptersFactory instance;
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public VideoGenLMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public static VideoGenLMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.irisa.diverse.videogenl.adapters.videogenlmt.VideoGenLMTAdaptersFactory() ;
    }
    return instance ;
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof videoGen.VideoGen){
    	return createVideoGenAdapter((videoGen.VideoGen) o, res) ;
    }
    if (o instanceof videoGen.Alternatives){
    	return createAlternativesAdapter((videoGen.Alternatives) o, res) ;
    }
    if (o instanceof videoGen.Mandatory){
    	return createMandatoryAdapter((videoGen.Mandatory) o, res) ;
    }
    if (o instanceof videoGen.Optional){
    	return createOptionalAdapter((videoGen.Optional) o, res) ;
    }
    if (o instanceof videoGen.Video){
    	return createVideoAdapter((videoGen.Video) o, res) ;
    }
    
    return null ;
  }
  
  public VideoGenAdapter createVideoGenAdapter(final VideoGen adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.irisa.diverse.videogenl.adapters.videogenlmt.VideoGenAdapter) adapter;
    else {
    	adapter = new org.irisa.diverse.videogenl.adapters.videogenlmt.VideoGenAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.irisa.diverse.videogenl.adapters.videogenlmt.VideoGenAdapter) adapter ;
    }
  }
  
  public SequenceAdapter createSequenceAdapter(final Sequence adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.irisa.diverse.videogenl.adapters.videogenlmt.SequenceAdapter) adapter;
    else {
    	adapter = new org.irisa.diverse.videogenl.adapters.videogenlmt.SequenceAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.irisa.diverse.videogenl.adapters.videogenlmt.SequenceAdapter) adapter ;
    }
  }
  
  public AlternativesAdapter createAlternativesAdapter(final Alternatives adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.irisa.diverse.videogenl.adapters.videogenlmt.AlternativesAdapter) adapter;
    else {
    	adapter = new org.irisa.diverse.videogenl.adapters.videogenlmt.AlternativesAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.irisa.diverse.videogenl.adapters.videogenlmt.AlternativesAdapter) adapter ;
    }
  }
  
  public MandatoryAdapter createMandatoryAdapter(final Mandatory adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.irisa.diverse.videogenl.adapters.videogenlmt.MandatoryAdapter) adapter;
    else {
    	adapter = new org.irisa.diverse.videogenl.adapters.videogenlmt.MandatoryAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.irisa.diverse.videogenl.adapters.videogenlmt.MandatoryAdapter) adapter ;
    }
  }
  
  public OptionalAdapter createOptionalAdapter(final Optional adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.irisa.diverse.videogenl.adapters.videogenlmt.OptionalAdapter) adapter;
    else {
    	adapter = new org.irisa.diverse.videogenl.adapters.videogenlmt.OptionalAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.irisa.diverse.videogenl.adapters.videogenlmt.OptionalAdapter) adapter ;
    }
  }
  
  public VideoAdapter createVideoAdapter(final Video adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.irisa.diverse.videogenl.adapters.videogenlmt.VideoAdapter) adapter;
    else {
    	adapter = new org.irisa.diverse.videogenl.adapters.videogenlmt.VideoAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.irisa.diverse.videogenl.adapters.videogenlmt.VideoAdapter) adapter ;
    }
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.irisa.diverse.videogenl.adapters.videogenlmt.NamedElementAdapter) adapter;
    else {
    	adapter = new org.irisa.diverse.videogenl.adapters.videogenlmt.NamedElementAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.irisa.diverse.videogenl.adapters.videogenlmt.NamedElementAdapter) adapter ;
    }
  }
}
