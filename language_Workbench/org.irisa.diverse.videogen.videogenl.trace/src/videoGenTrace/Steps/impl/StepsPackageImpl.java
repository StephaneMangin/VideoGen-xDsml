/**
 */
package videoGenTrace.Steps.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.executionframework.engine.mse.MsePackage;

import org.irisa.diverse.videogen.videoGen.VideoGenPackage;

import videoGenTrace.States.StatesPackage;

import videoGenTrace.States.impl.StatesPackageImpl;

import videoGenTrace.Steps.BigStep;
import videoGenTrace.Steps.RootImplicitStep;
import videoGenTrace.Steps.SmallStep;
import videoGenTrace.Steps.Step;
import videoGenTrace.Steps.StepsFactory;
import videoGenTrace.Steps.StepsPackage;
import videoGenTrace.Steps.VideoGen_Alternatives_Execute;
import videoGenTrace.Steps.VideoGen_Delay_Execute;
import videoGenTrace.Steps.VideoGen_Generate_Compute;
import videoGenTrace.Steps.VideoGen_Generate_Execute;
import videoGenTrace.Steps.VideoGen_Initialize_Execute;
import videoGenTrace.Steps.VideoGen_Mandatory_Execute;
import videoGenTrace.Steps.VideoGen_Optional_Execute;
import videoGenTrace.Steps.VideoGen_Sequence_Execute;
import videoGenTrace.Steps.VideoGen_Transition_Execute;
import videoGenTrace.Steps.VideoGen_Video_Select;

import videoGenTrace.VideoGenTracePackage;

import videoGenTrace.impl.VideoGenTracePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepsPackageImpl extends EPackageImpl implements StepsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bigStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smallStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_Alternatives_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_Delay_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_Generate_ComputeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_Generate_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_Initialize_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_Mandatory_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_Optional_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_Sequence_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_Transition_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_Video_SelectEClass = null;

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
	 * @see videoGenTrace.Steps.StepsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StepsPackageImpl() {
		super(eNS_URI, StepsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StepsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StepsPackage init() {
		if (isInited) return (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Obtain or create and register package
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StepsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MsePackage.eINSTANCE.eClass();
		VideoGenPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		VideoGenTracePackageImpl theVideoGenTracePackage = (VideoGenTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VideoGenTracePackage.eNS_URI) instanceof VideoGenTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VideoGenTracePackage.eNS_URI) : VideoGenTracePackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);

		// Create package meta-data objects
		theStepsPackage.createPackageContents();
		theVideoGenTracePackage.createPackageContents();
		theStatesPackage.createPackageContents();

		// Initialize created meta-data
		theStepsPackage.initializePackageContents();
		theVideoGenTracePackage.initializePackageContents();
		theStatesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStepsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StepsPackage.eNS_URI, theStepsPackage);
		return theStepsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBigStep() {
		return bigStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootImplicitStep() {
		return rootImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmallStep() {
		return smallStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_EndingState() {
		return (EReference)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_StartingState() {
		return (EReference)stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_Alternatives_Execute() {
		return videoGen_Alternatives_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVideoGen_Alternatives_Execute__GetCaller() {
		return videoGen_Alternatives_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_Delay_Execute() {
		return videoGen_Delay_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVideoGen_Delay_Execute__GetCaller() {
		return videoGen_Delay_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_Generate_Compute() {
		return videoGen_Generate_ComputeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVideoGen_Generate_Compute__GetCaller() {
		return videoGen_Generate_ComputeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_Generate_Execute() {
		return videoGen_Generate_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVideoGen_Generate_Execute__GetCaller() {
		return videoGen_Generate_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_Initialize_Execute() {
		return videoGen_Initialize_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVideoGen_Initialize_Execute__GetCaller() {
		return videoGen_Initialize_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_Mandatory_Execute() {
		return videoGen_Mandatory_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVideoGen_Mandatory_Execute__GetCaller() {
		return videoGen_Mandatory_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_Optional_Execute() {
		return videoGen_Optional_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVideoGen_Optional_Execute__GetCaller() {
		return videoGen_Optional_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_Sequence_Execute() {
		return videoGen_Sequence_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVideoGen_Sequence_Execute__GetCaller() {
		return videoGen_Sequence_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_Transition_Execute() {
		return videoGen_Transition_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVideoGen_Transition_Execute__GetCaller() {
		return videoGen_Transition_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_Video_Select() {
		return videoGen_Video_SelectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVideoGen_Video_Select__GetCaller() {
		return videoGen_Video_SelectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactory getStepsFactory() {
		return (StepsFactory)getEFactoryInstance();
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
		bigStepEClass = createEClass(BIG_STEP);

		rootImplicitStepEClass = createEClass(ROOT_IMPLICIT_STEP);

		smallStepEClass = createEClass(SMALL_STEP);

		stepEClass = createEClass(STEP);
		createEReference(stepEClass, STEP__ENDING_STATE);
		createEReference(stepEClass, STEP__STARTING_STATE);

		videoGen_Alternatives_ExecuteEClass = createEClass(VIDEO_GEN_ALTERNATIVES_EXECUTE);
		createEOperation(videoGen_Alternatives_ExecuteEClass, VIDEO_GEN_ALTERNATIVES_EXECUTE___GET_CALLER);

		videoGen_Delay_ExecuteEClass = createEClass(VIDEO_GEN_DELAY_EXECUTE);
		createEOperation(videoGen_Delay_ExecuteEClass, VIDEO_GEN_DELAY_EXECUTE___GET_CALLER);

		videoGen_Generate_ComputeEClass = createEClass(VIDEO_GEN_GENERATE_COMPUTE);
		createEOperation(videoGen_Generate_ComputeEClass, VIDEO_GEN_GENERATE_COMPUTE___GET_CALLER);

		videoGen_Generate_ExecuteEClass = createEClass(VIDEO_GEN_GENERATE_EXECUTE);
		createEOperation(videoGen_Generate_ExecuteEClass, VIDEO_GEN_GENERATE_EXECUTE___GET_CALLER);

		videoGen_Initialize_ExecuteEClass = createEClass(VIDEO_GEN_INITIALIZE_EXECUTE);
		createEOperation(videoGen_Initialize_ExecuteEClass, VIDEO_GEN_INITIALIZE_EXECUTE___GET_CALLER);

		videoGen_Mandatory_ExecuteEClass = createEClass(VIDEO_GEN_MANDATORY_EXECUTE);
		createEOperation(videoGen_Mandatory_ExecuteEClass, VIDEO_GEN_MANDATORY_EXECUTE___GET_CALLER);

		videoGen_Optional_ExecuteEClass = createEClass(VIDEO_GEN_OPTIONAL_EXECUTE);
		createEOperation(videoGen_Optional_ExecuteEClass, VIDEO_GEN_OPTIONAL_EXECUTE___GET_CALLER);

		videoGen_Sequence_ExecuteEClass = createEClass(VIDEO_GEN_SEQUENCE_EXECUTE);
		createEOperation(videoGen_Sequence_ExecuteEClass, VIDEO_GEN_SEQUENCE_EXECUTE___GET_CALLER);

		videoGen_Transition_ExecuteEClass = createEClass(VIDEO_GEN_TRANSITION_EXECUTE);
		createEOperation(videoGen_Transition_ExecuteEClass, VIDEO_GEN_TRANSITION_EXECUTE___GET_CALLER);

		videoGen_Video_SelectEClass = createEClass(VIDEO_GEN_VIDEO_SELECT);
		createEOperation(videoGen_Video_SelectEClass, VIDEO_GEN_VIDEO_SELECT___GET_CALLER);
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
		MsePackage theMsePackage = (MsePackage)EPackage.Registry.INSTANCE.getEPackage(MsePackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);
		VideoGenPackage theVideoGenPackage = (VideoGenPackage)EPackage.Registry.INSTANCE.getEPackage(VideoGenPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bigStepEClass.getESuperTypes().add(this.getStep());
		rootImplicitStepEClass.getESuperTypes().add(this.getSmallStep());
		smallStepEClass.getESuperTypes().add(this.getStep());
		stepEClass.getESuperTypes().add(theMsePackage.getSequentialLogicalStep());
		videoGen_Alternatives_ExecuteEClass.getESuperTypes().add(this.getSmallStep());
		videoGen_Delay_ExecuteEClass.getESuperTypes().add(this.getSmallStep());
		videoGen_Generate_ComputeEClass.getESuperTypes().add(this.getSmallStep());
		videoGen_Generate_ExecuteEClass.getESuperTypes().add(this.getSmallStep());
		videoGen_Initialize_ExecuteEClass.getESuperTypes().add(this.getSmallStep());
		videoGen_Mandatory_ExecuteEClass.getESuperTypes().add(this.getSmallStep());
		videoGen_Optional_ExecuteEClass.getESuperTypes().add(this.getSmallStep());
		videoGen_Sequence_ExecuteEClass.getESuperTypes().add(this.getSmallStep());
		videoGen_Transition_ExecuteEClass.getESuperTypes().add(this.getSmallStep());
		videoGen_Video_SelectEClass.getESuperTypes().add(this.getSmallStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(bigStepEClass, BigStep.class, "BigStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rootImplicitStepEClass, RootImplicitStep.class, "RootImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(smallStepEClass, SmallStep.class, "SmallStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stepEClass, Step.class, "Step", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_EndingState(), theStatesPackage.getState(), theStatesPackage.getState_EndedSteps(), "endingState", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_StartingState(), theStatesPackage.getState(), theStatesPackage.getState_StartedSteps(), "startingState", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(videoGen_Alternatives_ExecuteEClass, VideoGen_Alternatives_Execute.class, "VideoGen_Alternatives_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getVideoGen_Alternatives_Execute__GetCaller(), theVideoGenPackage.getAlternatives(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(videoGen_Delay_ExecuteEClass, VideoGen_Delay_Execute.class, "VideoGen_Delay_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getVideoGen_Delay_Execute__GetCaller(), theVideoGenPackage.getDelay(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(videoGen_Generate_ComputeEClass, VideoGen_Generate_Compute.class, "VideoGen_Generate_Compute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getVideoGen_Generate_Compute__GetCaller(), theVideoGenPackage.getGenerate(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(videoGen_Generate_ExecuteEClass, VideoGen_Generate_Execute.class, "VideoGen_Generate_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getVideoGen_Generate_Execute__GetCaller(), theVideoGenPackage.getGenerate(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(videoGen_Initialize_ExecuteEClass, VideoGen_Initialize_Execute.class, "VideoGen_Initialize_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getVideoGen_Initialize_Execute__GetCaller(), theVideoGenPackage.getInitialize(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(videoGen_Mandatory_ExecuteEClass, VideoGen_Mandatory_Execute.class, "VideoGen_Mandatory_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getVideoGen_Mandatory_Execute__GetCaller(), theVideoGenPackage.getMandatory(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(videoGen_Optional_ExecuteEClass, VideoGen_Optional_Execute.class, "VideoGen_Optional_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getVideoGen_Optional_Execute__GetCaller(), theVideoGenPackage.getOptional(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(videoGen_Sequence_ExecuteEClass, VideoGen_Sequence_Execute.class, "VideoGen_Sequence_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getVideoGen_Sequence_Execute__GetCaller(), theVideoGenPackage.getSequence(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(videoGen_Transition_ExecuteEClass, VideoGen_Transition_Execute.class, "VideoGen_Transition_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getVideoGen_Transition_Execute__GetCaller(), theVideoGenPackage.getTransition(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(videoGen_Video_SelectEClass, VideoGen_Video_Select.class, "VideoGen_Video_Select", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getVideoGen_Video_Select__GetCaller(), theVideoGenPackage.getVideo(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);
	}

} //StepsPackageImpl
