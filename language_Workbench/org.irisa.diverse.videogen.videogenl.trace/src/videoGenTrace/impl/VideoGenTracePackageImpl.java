/**
 */
package videoGenTrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.executionframework.engine.mse.MsePackage;

import org.irisa.diverse.videogen.videoGen.VideoGenPackage;

import videoGenTrace.States.StatesPackage;

import videoGenTrace.States.impl.StatesPackageImpl;

import videoGenTrace.Steps.StepsPackage;

import videoGenTrace.Steps.impl.StepsPackageImpl;

import videoGenTrace.Trace;
import videoGenTrace.VideoGenTraceFactory;
import videoGenTrace.VideoGenTracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VideoGenTracePackageImpl extends EPackageImpl implements VideoGenTracePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

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
	 * @see videoGenTrace.VideoGenTracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VideoGenTracePackageImpl() {
		super(eNS_URI, VideoGenTraceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VideoGenTracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VideoGenTracePackage init() {
		if (isInited) return (VideoGenTracePackage)EPackage.Registry.INSTANCE.getEPackage(VideoGenTracePackage.eNS_URI);

		// Obtain or create and register package
		VideoGenTracePackageImpl theVideoGenTracePackage = (VideoGenTracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VideoGenTracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VideoGenTracePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MsePackage.eINSTANCE.eClass();
		VideoGenPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);

		// Create package meta-data objects
		theVideoGenTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();

		// Initialize created meta-data
		theVideoGenTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVideoGenTracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VideoGenTracePackage.eNS_URI, theVideoGenTracePackage);
		return theVideoGenTracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_VideoGen_Alternatives_Execute_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_VideoGen_Delay_Execute_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_VideoGen_Generate_Compute_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_VideoGen_Generate_Execute_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_VideoGen_Initialize_Execute_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_VideoGen_Mandatory_Execute_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_VideoGen_Optional_Execute_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_VideoGen_Sequence_Execute_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_VideoGen_Transition_Execute_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_VideoGen_Video_Select_Sequence() {
		return (EReference)traceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_RootSteps() {
		return (EReference)traceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_StatesTrace() {
		return (EReference)traceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGenTraceFactory getVideoGenTraceFactory() {
		return (VideoGenTraceFactory)getEFactoryInstance();
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
		traceEClass = createEClass(TRACE);
		createEReference(traceEClass, TRACE__VIDEO_GEN_ALTERNATIVES_EXECUTE_SEQUENCE);
		createEReference(traceEClass, TRACE__VIDEO_GEN_DELAY_EXECUTE_SEQUENCE);
		createEReference(traceEClass, TRACE__VIDEO_GEN_GENERATE_COMPUTE_SEQUENCE);
		createEReference(traceEClass, TRACE__VIDEO_GEN_GENERATE_EXECUTE_SEQUENCE);
		createEReference(traceEClass, TRACE__VIDEO_GEN_INITIALIZE_EXECUTE_SEQUENCE);
		createEReference(traceEClass, TRACE__VIDEO_GEN_MANDATORY_EXECUTE_SEQUENCE);
		createEReference(traceEClass, TRACE__VIDEO_GEN_OPTIONAL_EXECUTE_SEQUENCE);
		createEReference(traceEClass, TRACE__VIDEO_GEN_SEQUENCE_EXECUTE_SEQUENCE);
		createEReference(traceEClass, TRACE__VIDEO_GEN_TRANSITION_EXECUTE_SEQUENCE);
		createEReference(traceEClass, TRACE__VIDEO_GEN_VIDEO_SELECT_SEQUENCE);
		createEReference(traceEClass, TRACE__ROOT_STEPS);
		createEReference(traceEClass, TRACE__STATES_TRACE);
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
		StepsPackage theStepsPackage = (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theStepsPackage);
		getESubpackages().add(theStatesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_VideoGen_Alternatives_Execute_Sequence(), theStepsPackage.getVideoGen_Alternatives_Execute(), null, "VideoGen_Alternatives_Execute_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_VideoGen_Delay_Execute_Sequence(), theStepsPackage.getVideoGen_Delay_Execute(), null, "VideoGen_Delay_Execute_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_VideoGen_Generate_Compute_Sequence(), theStepsPackage.getVideoGen_Generate_Compute(), null, "VideoGen_Generate_Compute_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_VideoGen_Generate_Execute_Sequence(), theStepsPackage.getVideoGen_Generate_Execute(), null, "VideoGen_Generate_Execute_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_VideoGen_Initialize_Execute_Sequence(), theStepsPackage.getVideoGen_Initialize_Execute(), null, "VideoGen_Initialize_Execute_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_VideoGen_Mandatory_Execute_Sequence(), theStepsPackage.getVideoGen_Mandatory_Execute(), null, "VideoGen_Mandatory_Execute_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_VideoGen_Optional_Execute_Sequence(), theStepsPackage.getVideoGen_Optional_Execute(), null, "VideoGen_Optional_Execute_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_VideoGen_Sequence_Execute_Sequence(), theStepsPackage.getVideoGen_Sequence_Execute(), null, "VideoGen_Sequence_Execute_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_VideoGen_Transition_Execute_Sequence(), theStepsPackage.getVideoGen_Transition_Execute(), null, "VideoGen_Transition_Execute_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_VideoGen_Video_Select_Sequence(), theStepsPackage.getVideoGen_Video_Select(), null, "VideoGen_Video_Select_Sequence", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_RootSteps(), theStepsPackage.getStep(), null, "rootSteps", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_StatesTrace(), theStatesPackage.getState(), null, "statesTrace", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //VideoGenTracePackageImpl
