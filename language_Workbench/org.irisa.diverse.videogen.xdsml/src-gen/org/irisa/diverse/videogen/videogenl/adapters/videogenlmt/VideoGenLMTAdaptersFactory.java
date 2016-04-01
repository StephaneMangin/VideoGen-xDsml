package org.irisa.diverse.videogen.videogenl.adapters.videogenlmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.irisa.diverse.videogen.videoGen.Alternatives;
import org.irisa.diverse.videogen.videoGen.Conclusion;
import org.irisa.diverse.videogen.videoGen.Introduction;
import org.irisa.diverse.videogen.videoGen.Mandatory;
import org.irisa.diverse.videogen.videoGen.NamedElement;
import org.irisa.diverse.videogen.videoGen.Optional;
import org.irisa.diverse.videogen.videoGen.Sequence;
import org.irisa.diverse.videogen.videoGen.Video;
import org.irisa.diverse.videogen.videoGen.VideoGen;
import org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.AlternativesAdapter;
import org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.ConclusionAdapter;
import org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.IntroductionAdapter;
import org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.MandatoryAdapter;
import org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.NamedElementAdapter;
import org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.OptionalAdapter;
import org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.SequenceAdapter;
import org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoAdapter;
import org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoGenAdapter;

@SuppressWarnings("all")
public class VideoGenLMTAdaptersFactory implements AdaptersFactory {
  private static org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoGenLMTAdaptersFactory instance;
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public VideoGenLMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public static org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoGenLMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoGenLMTAdaptersFactory() ;
    }
    return instance ;
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.irisa.diverse.videogen.videoGen.VideoGen){
    	return createVideoGenAdapter((org.irisa.diverse.videogen.videoGen.VideoGen) o, res) ;
    }
    if (o instanceof org.irisa.diverse.videogen.videoGen.Alternatives){
    	return createAlternativesAdapter((org.irisa.diverse.videogen.videoGen.Alternatives) o, res) ;
    }
    if (o instanceof org.irisa.diverse.videogen.videoGen.Mandatory){
    	return createMandatoryAdapter((org.irisa.diverse.videogen.videoGen.Mandatory) o, res) ;
    }
    if (o instanceof org.irisa.diverse.videogen.videoGen.Optional){
    	return createOptionalAdapter((org.irisa.diverse.videogen.videoGen.Optional) o, res) ;
    }
    if (o instanceof org.irisa.diverse.videogen.videoGen.Video){
    	return createVideoAdapter((org.irisa.diverse.videogen.videoGen.Video) o, res) ;
    }
    if (o instanceof org.irisa.diverse.videogen.videoGen.Introduction){
    	return createIntroductionAdapter((org.irisa.diverse.videogen.videoGen.Introduction) o, res) ;
    }
    if (o instanceof org.irisa.diverse.videogen.videoGen.Conclusion){
    	return createConclusionAdapter((org.irisa.diverse.videogen.videoGen.Conclusion) o, res) ;
    }
    
    return null ;
  }
  
  public VideoGenAdapter createVideoGenAdapter(final VideoGen adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoGenAdapter) adapter;
    else {
    	adapter = new org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoGenAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoGenAdapter) adapter ;
    }
  }
  
  public SequenceAdapter createSequenceAdapter(final Sequence adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.SequenceAdapter) adapter;
    else {
    	adapter = new org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.SequenceAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.SequenceAdapter) adapter ;
    }
  }
  
  public AlternativesAdapter createAlternativesAdapter(final Alternatives adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.AlternativesAdapter) adapter;
    else {
    	adapter = new org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.AlternativesAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.AlternativesAdapter) adapter ;
    }
  }
  
  public MandatoryAdapter createMandatoryAdapter(final Mandatory adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.MandatoryAdapter) adapter;
    else {
    	adapter = new org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.MandatoryAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.MandatoryAdapter) adapter ;
    }
  }
  
  public OptionalAdapter createOptionalAdapter(final Optional adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.OptionalAdapter) adapter;
    else {
    	adapter = new org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.OptionalAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.OptionalAdapter) adapter ;
    }
  }
  
  public VideoAdapter createVideoAdapter(final Video adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoAdapter) adapter;
    else {
    	adapter = new org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoAdapter) adapter ;
    }
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.NamedElementAdapter) adapter;
    else {
    	adapter = new org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.NamedElementAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.NamedElementAdapter) adapter ;
    }
  }
  
  public IntroductionAdapter createIntroductionAdapter(final Introduction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.IntroductionAdapter) adapter;
    else {
    	adapter = new org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.IntroductionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.IntroductionAdapter) adapter ;
    }
  }
  
  public ConclusionAdapter createConclusionAdapter(final Conclusion adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.ConclusionAdapter) adapter;
    else {
    	adapter = new org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.ConclusionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.ConclusionAdapter) adapter ;
    }
  }
}
