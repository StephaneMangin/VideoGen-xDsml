/**
 */
package videoGenTrace.States.videoGen.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import videoGenTrace.States.videoGen.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VideoGenFactoryImpl extends EFactoryImpl implements VideoGenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VideoGenFactory init() {
		try {
			VideoGenFactory theVideoGenFactory = (VideoGenFactory)EPackage.Registry.INSTANCE.getEFactory(VideoGenPackage.eNS_URI);
			if (theVideoGenFactory != null) {
				return theVideoGenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VideoGenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGenFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VideoGenPackage.TRACED_ALTERNATIVES: return createTracedAlternatives();
			case VideoGenPackage.TRACED_DELAY: return createTracedDelay();
			case VideoGenPackage.TRACED_GENERATE: return createTracedGenerate();
			case VideoGenPackage.TRACED_INITIALIZE: return createTracedInitialize();
			case VideoGenPackage.TRACED_MANDATORY: return createTracedMandatory();
			case VideoGenPackage.TRACED_OPTIONAL: return createTracedOptional();
			case VideoGenPackage.TRACED_VIDEO: return createTracedVideo();
			case VideoGenPackage.TRACED_VIDEO_GEN: return createTracedVideoGen();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedAlternatives createTracedAlternatives() {
		TracedAlternativesImpl tracedAlternatives = new TracedAlternativesImpl();
		return tracedAlternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedDelay createTracedDelay() {
		TracedDelayImpl tracedDelay = new TracedDelayImpl();
		return tracedDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedGenerate createTracedGenerate() {
		TracedGenerateImpl tracedGenerate = new TracedGenerateImpl();
		return tracedGenerate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedInitialize createTracedInitialize() {
		TracedInitializeImpl tracedInitialize = new TracedInitializeImpl();
		return tracedInitialize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedMandatory createTracedMandatory() {
		TracedMandatoryImpl tracedMandatory = new TracedMandatoryImpl();
		return tracedMandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedOptional createTracedOptional() {
		TracedOptionalImpl tracedOptional = new TracedOptionalImpl();
		return tracedOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedVideo createTracedVideo() {
		TracedVideoImpl tracedVideo = new TracedVideoImpl();
		return tracedVideo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedVideoGen createTracedVideoGen() {
		TracedVideoGenImpl tracedVideoGen = new TracedVideoGenImpl();
		return tracedVideoGen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGenPackage getVideoGenPackage() {
		return (VideoGenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VideoGenPackage getPackage() {
		return VideoGenPackage.eINSTANCE;
	}

} //VideoGenFactoryImpl
