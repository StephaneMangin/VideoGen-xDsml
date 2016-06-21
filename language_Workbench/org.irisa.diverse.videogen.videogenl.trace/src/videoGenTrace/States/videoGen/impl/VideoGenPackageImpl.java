/**
 */
package videoGenTrace.States.videoGen.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import videoGenTrace.States.StatesPackage;

import videoGenTrace.States.impl.StatesPackageImpl;

import videoGenTrace.States.videoGen.TracedAlternatives;
import videoGenTrace.States.videoGen.TracedDelay;
import videoGenTrace.States.videoGen.TracedGenerate;
import videoGenTrace.States.videoGen.TracedInitialize;
import videoGenTrace.States.videoGen.TracedMandatory;
import videoGenTrace.States.videoGen.TracedNamedElement;
import videoGenTrace.States.videoGen.TracedOptional;
import videoGenTrace.States.videoGen.TracedSequence;
import videoGenTrace.States.videoGen.TracedTransition;
import videoGenTrace.States.videoGen.TracedVideo;
import videoGenTrace.States.videoGen.TracedVideoGen;
import videoGenTrace.States.videoGen.VideoGenFactory;
import videoGenTrace.States.videoGen.VideoGenPackage;

import videoGenTrace.Steps.StepsPackage;

import videoGenTrace.Steps.impl.StepsPackageImpl;

import videoGenTrace.VideoGenTracePackage;

import videoGenTrace.impl.VideoGenTracePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VideoGenPackageImpl extends EPackageImpl implements VideoGenPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedAlternativesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDelayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedGenerateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInitializeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedMandatoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedVideoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedVideoGenEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see videoGenTrace.States.videoGen.VideoGenPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VideoGenPackageImpl() {
		super(eNS_URI, VideoGenFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VideoGenPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VideoGenPackage init() {
		if (isInited) return (VideoGenPackage)EPackage.Registry.INSTANCE.getEPackage(VideoGenPackage.eNS_URI);

		// Obtain or create and register package
		VideoGenPackageImpl theVideoGenPackage = (VideoGenPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VideoGenPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VideoGenPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		VideoGenTracePackageImpl theVideoGenTracePackage = (VideoGenTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VideoGenTracePackage.eNS_URI) instanceof VideoGenTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VideoGenTracePackage.eNS_URI) : VideoGenTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);

		// Create package meta-data objects
		theVideoGenPackage.createPackageContents();
		theVideoGenTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();

		// Initialize created meta-data
		theVideoGenPackage.initializePackageContents();
		theVideoGenTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVideoGenPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VideoGenPackage.eNS_URI, theVideoGenPackage);
		return theVideoGenPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedAlternatives() {
		return tracedAlternativesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedAlternatives_OriginalObject() {
		return (EReference)tracedAlternativesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDelay() {
		return tracedDelayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedDelay_OriginalObject() {
		return (EReference)tracedDelayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedGenerate() {
		return tracedGenerateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedGenerate_OriginalObject() {
		return (EReference)tracedGenerateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInitialize() {
		return tracedInitializeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedInitialize_OriginalObject() {
		return (EReference)tracedInitializeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedMandatory() {
		return tracedMandatoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedMandatory_OriginalObject() {
		return (EReference)tracedMandatoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedNamedElement() {
		return tracedNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedOptional() {
		return tracedOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedOptional_OriginalObject() {
		return (EReference)tracedOptionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedSequence() {
		return tracedSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedTransition() {
		return tracedTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedTransition_CallnextTransitionSequence() {
		return (EReference)tracedTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedTransition_ExecutedSequence() {
		return (EReference)tracedTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedTransition_VideoGenSequence() {
		return (EReference)tracedTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedVideo() {
		return tracedVideoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedVideo_OriginalObject() {
		return (EReference)tracedVideoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedVideoGen() {
		return tracedVideoGenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedVideoGen_OriginalObject() {
		return (EReference)tracedVideoGenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGenFactory getVideoGenFactory() {
		return (VideoGenFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tracedAlternativesEClass = createEClass(TRACED_ALTERNATIVES);
		createEReference(tracedAlternativesEClass, TRACED_ALTERNATIVES__ORIGINAL_OBJECT);

		tracedDelayEClass = createEClass(TRACED_DELAY);
		createEReference(tracedDelayEClass, TRACED_DELAY__ORIGINAL_OBJECT);

		tracedGenerateEClass = createEClass(TRACED_GENERATE);
		createEReference(tracedGenerateEClass, TRACED_GENERATE__ORIGINAL_OBJECT);

		tracedInitializeEClass = createEClass(TRACED_INITIALIZE);
		createEReference(tracedInitializeEClass, TRACED_INITIALIZE__ORIGINAL_OBJECT);

		tracedMandatoryEClass = createEClass(TRACED_MANDATORY);
		createEReference(tracedMandatoryEClass, TRACED_MANDATORY__ORIGINAL_OBJECT);

		tracedNamedElementEClass = createEClass(TRACED_NAMED_ELEMENT);

		tracedOptionalEClass = createEClass(TRACED_OPTIONAL);
		createEReference(tracedOptionalEClass, TRACED_OPTIONAL__ORIGINAL_OBJECT);

		tracedSequenceEClass = createEClass(TRACED_SEQUENCE);

		tracedTransitionEClass = createEClass(TRACED_TRANSITION);
		createEReference(tracedTransitionEClass, TRACED_TRANSITION__CALLNEXT_TRANSITION_SEQUENCE);
		createEReference(tracedTransitionEClass, TRACED_TRANSITION__EXECUTED_SEQUENCE);
		createEReference(tracedTransitionEClass, TRACED_TRANSITION__VIDEO_GEN_SEQUENCE);

		tracedVideoEClass = createEClass(TRACED_VIDEO);
		createEReference(tracedVideoEClass, TRACED_VIDEO__ORIGINAL_OBJECT);

		tracedVideoGenEClass = createEClass(TRACED_VIDEO_GEN);
		createEReference(tracedVideoGenEClass, TRACED_VIDEO_GEN__ORIGINAL_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage theVideoGenPackage_1 = (org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage)EPackage.Registry.INSTANCE.getEPackage(org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tracedAlternativesEClass.getESuperTypes().add(this.getTracedSequence());
		tracedDelayEClass.getESuperTypes().add(this.getTracedTransition());
		tracedGenerateEClass.getESuperTypes().add(this.getTracedTransition());
		tracedInitializeEClass.getESuperTypes().add(this.getTracedTransition());
		tracedMandatoryEClass.getESuperTypes().add(this.getTracedSequence());
		tracedOptionalEClass.getESuperTypes().add(this.getTracedSequence());
		tracedSequenceEClass.getESuperTypes().add(this.getTracedTransition());
		tracedTransitionEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedVideoEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedVideoGenEClass.getESuperTypes().add(this.getTracedNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(tracedAlternativesEClass, TracedAlternatives.class, "TracedAlternatives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedAlternatives_OriginalObject(), theVideoGenPackage_1.getAlternatives(), null, "originalObject", null, 0, 1, TracedAlternatives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedDelayEClass, TracedDelay.class, "TracedDelay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedDelay_OriginalObject(), theVideoGenPackage_1.getDelay(), null, "originalObject", null, 0, 1, TracedDelay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedGenerateEClass, TracedGenerate.class, "TracedGenerate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedGenerate_OriginalObject(), theVideoGenPackage_1.getGenerate(), null, "originalObject", null, 0, 1, TracedGenerate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedInitializeEClass, TracedInitialize.class, "TracedInitialize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedInitialize_OriginalObject(), theVideoGenPackage_1.getInitialize(), null, "originalObject", null, 0, 1, TracedInitialize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedMandatoryEClass, TracedMandatory.class, "TracedMandatory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedMandatory_OriginalObject(), theVideoGenPackage_1.getMandatory(), null, "originalObject", null, 0, 1, TracedMandatory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedNamedElementEClass, TracedNamedElement.class, "TracedNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedOptionalEClass, TracedOptional.class, "TracedOptional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedOptional_OriginalObject(), theVideoGenPackage_1.getOptional(), null, "originalObject", null, 0, 1, TracedOptional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedSequenceEClass, TracedSequence.class, "TracedSequence", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedTransitionEClass, TracedTransition.class, "TracedTransition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedTransition_CallnextTransitionSequence(), theStatesPackage.getTransition_callnextTransition_Value(), theStatesPackage.getTransition_callnextTransition_Value_Parent(), "callnextTransitionSequence", null, 0, -1, TracedTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedTransition_ExecutedSequence(), theStatesPackage.getTransition_executed_Value(), theStatesPackage.getTransition_executed_Value_Parent(), "executedSequence", null, 0, -1, TracedTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedTransition_VideoGenSequence(), theStatesPackage.getTransition_videoGen_Value(), theStatesPackage.getTransition_videoGen_Value_Parent(), "videoGenSequence", null, 0, -1, TracedTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedVideoEClass, TracedVideo.class, "TracedVideo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedVideo_OriginalObject(), theVideoGenPackage_1.getVideo(), null, "originalObject", null, 0, 1, TracedVideo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedVideoGenEClass, TracedVideoGen.class, "TracedVideoGen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedVideoGen_OriginalObject(), theVideoGenPackage_1.getVideoGen(), null, "originalObject", null, 0, 1, TracedVideoGen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //VideoGenPackageImpl
