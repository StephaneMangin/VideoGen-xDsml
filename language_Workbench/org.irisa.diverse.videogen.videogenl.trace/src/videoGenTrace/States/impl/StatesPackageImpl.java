/**
 */
package videoGenTrace.States.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage;

import videoGenTrace.States.State;
import videoGenTrace.States.StatesFactory;
import videoGenTrace.States.StatesPackage;
import videoGenTrace.States.Transition_callnextTransition_Value;
import videoGenTrace.States.Transition_executed_Value;
import videoGenTrace.States.Transition_videoGen_Value;
import videoGenTrace.States.Value;
import videoGenTrace.States.VideoGen_initialized_Value;

import videoGenTrace.States.videoGen.impl.VideoGenPackageImpl;

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
public class StatesPackageImpl extends EPackageImpl implements StatesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transition_callnextTransition_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transition_executed_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transition_videoGen_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_initialized_ValueEClass = null;

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
	 * @see videoGenTrace.States.StatesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatesPackageImpl() {
		super(eNS_URI, StatesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatesPackage init() {
		if (isInited) return (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Obtain or create and register package
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StatesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		VideoGenPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		VideoGenTracePackageImpl theVideoGenTracePackage = (VideoGenTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VideoGenTracePackage.eNS_URI) instanceof VideoGenTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VideoGenTracePackage.eNS_URI) : VideoGenTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		VideoGenPackageImpl theVideoGenPackage_1 = (VideoGenPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(videoGenTrace.States.videoGen.VideoGenPackage.eNS_URI) instanceof VideoGenPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(videoGenTrace.States.videoGen.VideoGenPackage.eNS_URI) : videoGenTrace.States.videoGen.VideoGenPackage.eINSTANCE);

		// Create package meta-data objects
		theStatesPackage.createPackageContents();
		theVideoGenTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theVideoGenPackage_1.createPackageContents();

		// Initialize created meta-data
		theStatesPackage.initializePackageContents();
		theVideoGenTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theVideoGenPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatesPackage.eNS_URI, theStatesPackage);
		return theStatesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_EndedSteps() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_StartedSteps() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Transition_callnextTransition_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Transition_executed_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Transition_videoGen_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_VideoGen_initialized_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition_callnextTransition_Value() {
		return transition_callnextTransition_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_callnextTransition_Value_CallnextTransition() {
		return (EAttribute)transition_callnextTransition_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_callnextTransition_Value_Parent() {
		return (EReference)transition_callnextTransition_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_callnextTransition_Value_States() {
		return (EReference)transition_callnextTransition_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition_callnextTransition_Value__GetStatesNoOpposite() {
		return transition_callnextTransition_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition_executed_Value() {
		return transition_executed_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_executed_Value_Executed() {
		return (EAttribute)transition_executed_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_executed_Value_Parent() {
		return (EReference)transition_executed_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_executed_Value_States() {
		return (EReference)transition_executed_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition_executed_Value__GetStatesNoOpposite() {
		return transition_executed_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition_videoGen_Value() {
		return transition_videoGen_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_videoGen_Value_Parent() {
		return (EReference)transition_videoGen_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_videoGen_Value_States() {
		return (EReference)transition_videoGen_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_videoGen_Value_VideoGen() {
		return (EReference)transition_videoGen_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition_videoGen_Value__GetStatesNoOpposite() {
		return transition_videoGen_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValue_StatesNoOpposite() {
		return (EReference)valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_initialized_Value() {
		return videoGen_initialized_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideoGen_initialized_Value_Initialized() {
		return (EAttribute)videoGen_initialized_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVideoGen_initialized_Value_Parent() {
		return (EReference)videoGen_initialized_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVideoGen_initialized_Value_States() {
		return (EReference)videoGen_initialized_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVideoGen_initialized_Value__GetStatesNoOpposite() {
		return videoGen_initialized_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesFactory getStatesFactory() {
		return (StatesFactory)getEFactoryInstance();
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
		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__ENDED_STEPS);
		createEReference(stateEClass, STATE__STARTED_STEPS);
		createEReference(stateEClass, STATE__TRANSITION_CALLNEXT_TRANSITION_VALUES);
		createEReference(stateEClass, STATE__TRANSITION_EXECUTED_VALUES);
		createEReference(stateEClass, STATE__TRANSITION_VIDEO_GEN_VALUES);
		createEReference(stateEClass, STATE__VIDEO_GEN_INITIALIZED_VALUES);

		transition_callnextTransition_ValueEClass = createEClass(TRANSITION_CALLNEXT_TRANSITION_VALUE);
		createEAttribute(transition_callnextTransition_ValueEClass, TRANSITION_CALLNEXT_TRANSITION_VALUE__CALLNEXT_TRANSITION);
		createEReference(transition_callnextTransition_ValueEClass, TRANSITION_CALLNEXT_TRANSITION_VALUE__PARENT);
		createEReference(transition_callnextTransition_ValueEClass, TRANSITION_CALLNEXT_TRANSITION_VALUE__STATES);
		createEOperation(transition_callnextTransition_ValueEClass, TRANSITION_CALLNEXT_TRANSITION_VALUE___GET_STATES_NO_OPPOSITE);

		transition_executed_ValueEClass = createEClass(TRANSITION_EXECUTED_VALUE);
		createEAttribute(transition_executed_ValueEClass, TRANSITION_EXECUTED_VALUE__EXECUTED);
		createEReference(transition_executed_ValueEClass, TRANSITION_EXECUTED_VALUE__PARENT);
		createEReference(transition_executed_ValueEClass, TRANSITION_EXECUTED_VALUE__STATES);
		createEOperation(transition_executed_ValueEClass, TRANSITION_EXECUTED_VALUE___GET_STATES_NO_OPPOSITE);

		transition_videoGen_ValueEClass = createEClass(TRANSITION_VIDEO_GEN_VALUE);
		createEReference(transition_videoGen_ValueEClass, TRANSITION_VIDEO_GEN_VALUE__PARENT);
		createEReference(transition_videoGen_ValueEClass, TRANSITION_VIDEO_GEN_VALUE__STATES);
		createEReference(transition_videoGen_ValueEClass, TRANSITION_VIDEO_GEN_VALUE__VIDEO_GEN);
		createEOperation(transition_videoGen_ValueEClass, TRANSITION_VIDEO_GEN_VALUE___GET_STATES_NO_OPPOSITE);

		valueEClass = createEClass(VALUE);
		createEReference(valueEClass, VALUE__STATES_NO_OPPOSITE);

		videoGen_initialized_ValueEClass = createEClass(VIDEO_GEN_INITIALIZED_VALUE);
		createEAttribute(videoGen_initialized_ValueEClass, VIDEO_GEN_INITIALIZED_VALUE__INITIALIZED);
		createEReference(videoGen_initialized_ValueEClass, VIDEO_GEN_INITIALIZED_VALUE__PARENT);
		createEReference(videoGen_initialized_ValueEClass, VIDEO_GEN_INITIALIZED_VALUE__STATES);
		createEOperation(videoGen_initialized_ValueEClass, VIDEO_GEN_INITIALIZED_VALUE___GET_STATES_NO_OPPOSITE);
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
		videoGenTrace.States.videoGen.VideoGenPackage theVideoGenPackage_1 = (videoGenTrace.States.videoGen.VideoGenPackage)EPackage.Registry.INSTANCE.getEPackage(videoGenTrace.States.videoGen.VideoGenPackage.eNS_URI);
		StepsPackage theStepsPackage = (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theVideoGenPackage_1);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		transition_callnextTransition_ValueEClass.getESuperTypes().add(this.getValue());
		transition_executed_ValueEClass.getESuperTypes().add(this.getValue());
		transition_videoGen_ValueEClass.getESuperTypes().add(this.getValue());
		videoGen_initialized_ValueEClass.getESuperTypes().add(this.getValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_EndedSteps(), theStepsPackage.getSpecificStep(), theStepsPackage.getSpecificStep_EndingState(), "endedSteps", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_StartedSteps(), theStepsPackage.getSpecificStep(), theStepsPackage.getSpecificStep_StartingState(), "startedSteps", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Transition_callnextTransition_Values(), this.getTransition_callnextTransition_Value(), this.getTransition_callnextTransition_Value_States(), "transition_callnextTransition_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Transition_executed_Values(), this.getTransition_executed_Value(), this.getTransition_executed_Value_States(), "transition_executed_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Transition_videoGen_Values(), this.getTransition_videoGen_Value(), this.getTransition_videoGen_Value_States(), "transition_videoGen_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_VideoGen_initialized_Values(), this.getVideoGen_initialized_Value(), this.getVideoGen_initialized_Value_States(), "videoGen_initialized_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(transition_callnextTransition_ValueEClass, Transition_callnextTransition_Value.class, "Transition_callnextTransition_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_callnextTransition_Value_CallnextTransition(), ecorePackage.getEBooleanObject(), "callnextTransition", null, 0, 1, Transition_callnextTransition_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_callnextTransition_Value_Parent(), theVideoGenPackage_1.getTracedTransition(), theVideoGenPackage_1.getTracedTransition_CallnextTransitionSequence(), "parent", null, 1, 1, Transition_callnextTransition_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_callnextTransition_Value_States(), this.getState(), this.getState_Transition_callnextTransition_Values(), "states", null, 1, -1, Transition_callnextTransition_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTransition_callnextTransition_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(transition_executed_ValueEClass, Transition_executed_Value.class, "Transition_executed_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_executed_Value_Executed(), ecorePackage.getEBooleanObject(), "executed", null, 0, 1, Transition_executed_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_executed_Value_Parent(), theVideoGenPackage_1.getTracedTransition(), theVideoGenPackage_1.getTracedTransition_ExecutedSequence(), "parent", null, 1, 1, Transition_executed_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_executed_Value_States(), this.getState(), this.getState_Transition_executed_Values(), "states", null, 1, -1, Transition_executed_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTransition_executed_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(transition_videoGen_ValueEClass, Transition_videoGen_Value.class, "Transition_videoGen_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_videoGen_Value_Parent(), theVideoGenPackage_1.getTracedTransition(), theVideoGenPackage_1.getTracedTransition_VideoGenSequence(), "parent", null, 1, 1, Transition_videoGen_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_videoGen_Value_States(), this.getState(), this.getState_Transition_videoGen_Values(), "states", null, 1, -1, Transition_videoGen_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_videoGen_Value_VideoGen(), theVideoGenPackage_1.getTracedVideoGen(), null, "videoGen", null, 0, 1, Transition_videoGen_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTransition_videoGen_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValue_StatesNoOpposite(), this.getState(), null, "statesNoOpposite", null, 1, -1, Value.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(videoGen_initialized_ValueEClass, VideoGen_initialized_Value.class, "VideoGen_initialized_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVideoGen_initialized_Value_Initialized(), ecorePackage.getEBoolean(), "initialized", null, 0, 1, VideoGen_initialized_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVideoGen_initialized_Value_Parent(), theVideoGenPackage_1.getTracedVideoGen(), theVideoGenPackage_1.getTracedVideoGen_InitializedSequence(), "parent", null, 1, 1, VideoGen_initialized_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVideoGen_initialized_Value_States(), this.getState(), this.getState_VideoGen_initialized_Values(), "states", null, 1, -1, VideoGen_initialized_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getVideoGen_initialized_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		// Create annotations
		// http://www.modelexecution.org/trace/XMOF
		createXMOFAnnotations();
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelexecution.org/trace/XMOF</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXMOFAnnotations() {
		String source = "http://www.modelexecution.org/trace/XMOF";	
		addAnnotation
		  (transition_callnextTransition_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (transition_executed_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (transition_videoGen_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (videoGen_initialized_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";	
		addAnnotation
		  (getTransition_callnextTransition_Value_CallnextTransition(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTransition_executed_Value_Executed(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTransition_videoGen_Value_VideoGen(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getVideoGen_initialized_Value_Initialized(), 
		   source, 
		   new String[] {
		   });
	}

} //StatesPackageImpl
