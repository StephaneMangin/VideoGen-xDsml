/**
 */
package videoGenTrace.Steps.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage;

import videoGenTrace.States.StatesPackage;

import videoGenTrace.States.impl.StatesPackageImpl;

import videoGenTrace.States.videoGen.impl.VideoGenPackageImpl;

import videoGenTrace.Steps.RootImplicitStep;
import videoGenTrace.Steps.SpecificStep;
import videoGenTrace.Steps.StepsFactory;
import videoGenTrace.Steps.StepsPackage;
import videoGenTrace.Steps.VideoGen_Alternatives_Execute;
import videoGenTrace.Steps.VideoGen_Alternatives_Execute_AbstractSubStep;
import videoGenTrace.Steps.VideoGen_Alternatives_Execute_ImplicitStep;
import videoGenTrace.Steps.VideoGen_Generate_Execute;
import videoGenTrace.Steps.VideoGen_Generate_Execute_AbstractSubStep;
import videoGenTrace.Steps.VideoGen_Generate_Execute_ImplicitStep;
import videoGenTrace.Steps.VideoGen_Initialize_Execute;
import videoGenTrace.Steps.VideoGen_Initialize_Execute_AbstractSubStep;
import videoGenTrace.Steps.VideoGen_Initialize_Execute_ImplicitStep;
import videoGenTrace.Steps.VideoGen_Mandatory_Execute;
import videoGenTrace.Steps.VideoGen_Mandatory_Execute_AbstractSubStep;
import videoGenTrace.Steps.VideoGen_Mandatory_Execute_ImplicitStep;
import videoGenTrace.Steps.VideoGen_Optional_Execute;
import videoGenTrace.Steps.VideoGen_Optional_Execute_AbstractSubStep;
import videoGenTrace.Steps.VideoGen_Optional_Execute_ImplicitStep;
import videoGenTrace.Steps.VideoGen_Transition_Execute;
import videoGenTrace.Steps.VideoGen_Transition_Execute_AbstractSubStep;
import videoGenTrace.Steps.VideoGen_Transition_Execute_ImplicitStep;
import videoGenTrace.Steps.VideoGen_Transition_FinishExecute;
import videoGenTrace.Steps.VideoGen_Transition_FinishExecute_AbstractSubStep;
import videoGenTrace.Steps.VideoGen_Transition_FinishExecute_ImplicitStep;
import videoGenTrace.Steps.VideoGen_VideoGen_Compute;
import videoGenTrace.Steps.VideoGen_VideoGen_Execute;
import videoGenTrace.Steps.VideoGen_VideoGen_Execute_AbstractSubStep;
import videoGenTrace.Steps.VideoGen_VideoGen_Execute_ImplicitStep;
import videoGenTrace.Steps.VideoGen_VideoGen_InitializeModel;
import videoGenTrace.Steps.VideoGen_VideoGen_InitializeModel_AbstractSubStep;
import videoGenTrace.Steps.VideoGen_VideoGen_InitializeModel_ImplicitStep;
import videoGenTrace.Steps.VideoGen_VideoGen_Setup;
import videoGenTrace.Steps.VideoGen_VideoGen_Setup_AbstractSubStep;
import videoGenTrace.Steps.VideoGen_VideoGen_Setup_ImplicitStep;
import videoGenTrace.Steps.VideoGen_VideoGen_Solve;
import videoGenTrace.Steps.VideoGen_Video_Setup;

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
	private EClass rootImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificStepEClass = null;

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
	private EClass videoGen_Alternatives_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_Alternatives_Execute_ImplicitStepEClass = null;

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
	private EClass videoGen_Generate_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_Generate_Execute_ImplicitStepEClass = null;

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
	private EClass videoGen_Initialize_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_Initialize_Execute_ImplicitStepEClass = null;

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
	private EClass videoGen_Mandatory_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_Mandatory_Execute_ImplicitStepEClass = null;

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
	private EClass videoGen_Optional_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_Optional_Execute_ImplicitStepEClass = null;

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
	private EClass videoGen_Transition_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_Transition_Execute_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_Transition_FinishExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_Transition_FinishExecute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_Transition_FinishExecute_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_VideoGen_ComputeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_VideoGen_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_VideoGen_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_VideoGen_Execute_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_VideoGen_InitializeModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_VideoGen_InitializeModel_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_VideoGen_InitializeModel_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_VideoGen_SetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_VideoGen_Setup_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_VideoGen_Setup_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_VideoGen_SolveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoGen_Video_SetupEClass = null;

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
		TracePackage.eINSTANCE.eClass();
		VideoGenPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		VideoGenTracePackageImpl theVideoGenTracePackage = (VideoGenTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VideoGenTracePackage.eNS_URI) instanceof VideoGenTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VideoGenTracePackage.eNS_URI) : VideoGenTracePackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		VideoGenPackageImpl theVideoGenPackage_1 = (VideoGenPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(videoGenTrace.States.videoGen.VideoGenPackage.eNS_URI) instanceof VideoGenPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(videoGenTrace.States.videoGen.VideoGenPackage.eNS_URI) : videoGenTrace.States.videoGen.VideoGenPackage.eINSTANCE);

		// Create package meta-data objects
		theStepsPackage.createPackageContents();
		theVideoGenTracePackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theVideoGenPackage_1.createPackageContents();

		// Initialize created meta-data
		theStepsPackage.initializePackageContents();
		theVideoGenTracePackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theVideoGenPackage_1.initializePackageContents();

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
	public EClass getRootImplicitStep() {
		return rootImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificStep() {
		return specificStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificStep_EndingState() {
		return (EReference)specificStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificStep_StartingState() {
		return (EReference)specificStepEClass.getEStructuralFeatures().get(1);
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
	public EClass getVideoGen_Alternatives_Execute_AbstractSubStep() {
		return videoGen_Alternatives_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_Alternatives_Execute_ImplicitStep() {
		return videoGen_Alternatives_Execute_ImplicitStepEClass;
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
	public EClass getVideoGen_Generate_Execute_AbstractSubStep() {
		return videoGen_Generate_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_Generate_Execute_ImplicitStep() {
		return videoGen_Generate_Execute_ImplicitStepEClass;
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
	public EClass getVideoGen_Initialize_Execute_AbstractSubStep() {
		return videoGen_Initialize_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_Initialize_Execute_ImplicitStep() {
		return videoGen_Initialize_Execute_ImplicitStepEClass;
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
	public EClass getVideoGen_Mandatory_Execute_AbstractSubStep() {
		return videoGen_Mandatory_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_Mandatory_Execute_ImplicitStep() {
		return videoGen_Mandatory_Execute_ImplicitStepEClass;
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
	public EClass getVideoGen_Optional_Execute_AbstractSubStep() {
		return videoGen_Optional_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_Optional_Execute_ImplicitStep() {
		return videoGen_Optional_Execute_ImplicitStepEClass;
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
	public EClass getVideoGen_Transition_Execute_AbstractSubStep() {
		return videoGen_Transition_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_Transition_Execute_ImplicitStep() {
		return videoGen_Transition_Execute_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_Transition_FinishExecute() {
		return videoGen_Transition_FinishExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVideoGen_Transition_FinishExecute__GetCaller() {
		return videoGen_Transition_FinishExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_Transition_FinishExecute_AbstractSubStep() {
		return videoGen_Transition_FinishExecute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_Transition_FinishExecute_ImplicitStep() {
		return videoGen_Transition_FinishExecute_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_VideoGen_Compute() {
		return videoGen_VideoGen_ComputeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVideoGen_VideoGen_Compute__GetCaller() {
		return videoGen_VideoGen_ComputeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_VideoGen_Execute() {
		return videoGen_VideoGen_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVideoGen_VideoGen_Execute__GetCaller() {
		return videoGen_VideoGen_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_VideoGen_Execute_AbstractSubStep() {
		return videoGen_VideoGen_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_VideoGen_Execute_ImplicitStep() {
		return videoGen_VideoGen_Execute_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_VideoGen_InitializeModel() {
		return videoGen_VideoGen_InitializeModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVideoGen_VideoGen_InitializeModel__GetCaller() {
		return videoGen_VideoGen_InitializeModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_VideoGen_InitializeModel_AbstractSubStep() {
		return videoGen_VideoGen_InitializeModel_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_VideoGen_InitializeModel_ImplicitStep() {
		return videoGen_VideoGen_InitializeModel_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_VideoGen_Setup() {
		return videoGen_VideoGen_SetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVideoGen_VideoGen_Setup__GetCaller() {
		return videoGen_VideoGen_SetupEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_VideoGen_Setup_AbstractSubStep() {
		return videoGen_VideoGen_Setup_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_VideoGen_Setup_ImplicitStep() {
		return videoGen_VideoGen_Setup_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_VideoGen_Solve() {
		return videoGen_VideoGen_SolveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVideoGen_VideoGen_Solve__GetCaller() {
		return videoGen_VideoGen_SolveEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoGen_Video_Setup() {
		return videoGen_Video_SetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVideoGen_Video_Setup__GetCaller() {
		return videoGen_Video_SetupEClass.getEOperations().get(0);
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
		rootImplicitStepEClass = createEClass(ROOT_IMPLICIT_STEP);

		specificStepEClass = createEClass(SPECIFIC_STEP);
		createEReference(specificStepEClass, SPECIFIC_STEP__ENDING_STATE);
		createEReference(specificStepEClass, SPECIFIC_STEP__STARTING_STATE);

		videoGen_Alternatives_ExecuteEClass = createEClass(VIDEO_GEN_ALTERNATIVES_EXECUTE);
		createEOperation(videoGen_Alternatives_ExecuteEClass, VIDEO_GEN_ALTERNATIVES_EXECUTE___GET_CALLER);

		videoGen_Alternatives_Execute_AbstractSubStepEClass = createEClass(VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP);

		videoGen_Alternatives_Execute_ImplicitStepEClass = createEClass(VIDEO_GEN_ALTERNATIVES_EXECUTE_IMPLICIT_STEP);

		videoGen_Generate_ExecuteEClass = createEClass(VIDEO_GEN_GENERATE_EXECUTE);
		createEOperation(videoGen_Generate_ExecuteEClass, VIDEO_GEN_GENERATE_EXECUTE___GET_CALLER);

		videoGen_Generate_Execute_AbstractSubStepEClass = createEClass(VIDEO_GEN_GENERATE_EXECUTE_ABSTRACT_SUB_STEP);

		videoGen_Generate_Execute_ImplicitStepEClass = createEClass(VIDEO_GEN_GENERATE_EXECUTE_IMPLICIT_STEP);

		videoGen_Initialize_ExecuteEClass = createEClass(VIDEO_GEN_INITIALIZE_EXECUTE);
		createEOperation(videoGen_Initialize_ExecuteEClass, VIDEO_GEN_INITIALIZE_EXECUTE___GET_CALLER);

		videoGen_Initialize_Execute_AbstractSubStepEClass = createEClass(VIDEO_GEN_INITIALIZE_EXECUTE_ABSTRACT_SUB_STEP);

		videoGen_Initialize_Execute_ImplicitStepEClass = createEClass(VIDEO_GEN_INITIALIZE_EXECUTE_IMPLICIT_STEP);

		videoGen_Mandatory_ExecuteEClass = createEClass(VIDEO_GEN_MANDATORY_EXECUTE);
		createEOperation(videoGen_Mandatory_ExecuteEClass, VIDEO_GEN_MANDATORY_EXECUTE___GET_CALLER);

		videoGen_Mandatory_Execute_AbstractSubStepEClass = createEClass(VIDEO_GEN_MANDATORY_EXECUTE_ABSTRACT_SUB_STEP);

		videoGen_Mandatory_Execute_ImplicitStepEClass = createEClass(VIDEO_GEN_MANDATORY_EXECUTE_IMPLICIT_STEP);

		videoGen_Optional_ExecuteEClass = createEClass(VIDEO_GEN_OPTIONAL_EXECUTE);
		createEOperation(videoGen_Optional_ExecuteEClass, VIDEO_GEN_OPTIONAL_EXECUTE___GET_CALLER);

		videoGen_Optional_Execute_AbstractSubStepEClass = createEClass(VIDEO_GEN_OPTIONAL_EXECUTE_ABSTRACT_SUB_STEP);

		videoGen_Optional_Execute_ImplicitStepEClass = createEClass(VIDEO_GEN_OPTIONAL_EXECUTE_IMPLICIT_STEP);

		videoGen_Transition_ExecuteEClass = createEClass(VIDEO_GEN_TRANSITION_EXECUTE);
		createEOperation(videoGen_Transition_ExecuteEClass, VIDEO_GEN_TRANSITION_EXECUTE___GET_CALLER);

		videoGen_Transition_Execute_AbstractSubStepEClass = createEClass(VIDEO_GEN_TRANSITION_EXECUTE_ABSTRACT_SUB_STEP);

		videoGen_Transition_Execute_ImplicitStepEClass = createEClass(VIDEO_GEN_TRANSITION_EXECUTE_IMPLICIT_STEP);

		videoGen_Transition_FinishExecuteEClass = createEClass(VIDEO_GEN_TRANSITION_FINISH_EXECUTE);
		createEOperation(videoGen_Transition_FinishExecuteEClass, VIDEO_GEN_TRANSITION_FINISH_EXECUTE___GET_CALLER);

		videoGen_Transition_FinishExecute_AbstractSubStepEClass = createEClass(VIDEO_GEN_TRANSITION_FINISH_EXECUTE_ABSTRACT_SUB_STEP);

		videoGen_Transition_FinishExecute_ImplicitStepEClass = createEClass(VIDEO_GEN_TRANSITION_FINISH_EXECUTE_IMPLICIT_STEP);

		videoGen_VideoGen_ComputeEClass = createEClass(VIDEO_GEN_VIDEO_GEN_COMPUTE);
		createEOperation(videoGen_VideoGen_ComputeEClass, VIDEO_GEN_VIDEO_GEN_COMPUTE___GET_CALLER);

		videoGen_VideoGen_ExecuteEClass = createEClass(VIDEO_GEN_VIDEO_GEN_EXECUTE);
		createEOperation(videoGen_VideoGen_ExecuteEClass, VIDEO_GEN_VIDEO_GEN_EXECUTE___GET_CALLER);

		videoGen_VideoGen_Execute_AbstractSubStepEClass = createEClass(VIDEO_GEN_VIDEO_GEN_EXECUTE_ABSTRACT_SUB_STEP);

		videoGen_VideoGen_Execute_ImplicitStepEClass = createEClass(VIDEO_GEN_VIDEO_GEN_EXECUTE_IMPLICIT_STEP);

		videoGen_VideoGen_InitializeModelEClass = createEClass(VIDEO_GEN_VIDEO_GEN_INITIALIZE_MODEL);
		createEOperation(videoGen_VideoGen_InitializeModelEClass, VIDEO_GEN_VIDEO_GEN_INITIALIZE_MODEL___GET_CALLER);

		videoGen_VideoGen_InitializeModel_AbstractSubStepEClass = createEClass(VIDEO_GEN_VIDEO_GEN_INITIALIZE_MODEL_ABSTRACT_SUB_STEP);

		videoGen_VideoGen_InitializeModel_ImplicitStepEClass = createEClass(VIDEO_GEN_VIDEO_GEN_INITIALIZE_MODEL_IMPLICIT_STEP);

		videoGen_VideoGen_SetupEClass = createEClass(VIDEO_GEN_VIDEO_GEN_SETUP);
		createEOperation(videoGen_VideoGen_SetupEClass, VIDEO_GEN_VIDEO_GEN_SETUP___GET_CALLER);

		videoGen_VideoGen_Setup_AbstractSubStepEClass = createEClass(VIDEO_GEN_VIDEO_GEN_SETUP_ABSTRACT_SUB_STEP);

		videoGen_VideoGen_Setup_ImplicitStepEClass = createEClass(VIDEO_GEN_VIDEO_GEN_SETUP_IMPLICIT_STEP);

		videoGen_VideoGen_SolveEClass = createEClass(VIDEO_GEN_VIDEO_GEN_SOLVE);
		createEOperation(videoGen_VideoGen_SolveEClass, VIDEO_GEN_VIDEO_GEN_SOLVE___GET_CALLER);

		videoGen_Video_SetupEClass = createEClass(VIDEO_GEN_VIDEO_SETUP);
		createEOperation(videoGen_Video_SetupEClass, VIDEO_GEN_VIDEO_SETUP___GET_CALLER);
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
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);
		videoGenTrace.States.videoGen.VideoGenPackage theVideoGenPackage_1 = (videoGenTrace.States.videoGen.VideoGenPackage)EPackage.Registry.INSTANCE.getEPackage(videoGenTrace.States.videoGen.VideoGenPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rootImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		specificStepEClass.getESuperTypes().add(theTracePackage.getStep());
		EGenericType g1 = createEGenericType(this.getVideoGen_VideoGen_Execute_AbstractSubStep());
		videoGen_Alternatives_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		videoGen_Alternatives_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		EGenericType g2 = createEGenericType(this.getVideoGen_Alternatives_Execute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		videoGen_Alternatives_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVideoGen_Alternatives_Execute_AbstractSubStep());
		videoGen_Alternatives_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVideoGen_Transition_Execute_AbstractSubStep());
		videoGen_Alternatives_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVideoGen_Transition_FinishExecute_AbstractSubStep());
		videoGen_Alternatives_ExecuteEClass.getEGenericSuperTypes().add(g1);
		videoGen_Alternatives_Execute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		videoGen_Alternatives_Execute_ImplicitStepEClass.getESuperTypes().add(this.getVideoGen_Alternatives_Execute_AbstractSubStep());
		videoGen_Alternatives_Execute_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		g1 = createEGenericType(this.getVideoGen_VideoGen_Execute_AbstractSubStep());
		videoGen_Generate_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVideoGen_Alternatives_Execute_AbstractSubStep());
		videoGen_Generate_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVideoGen_Transition_Execute_AbstractSubStep());
		videoGen_Generate_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		videoGen_Generate_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getVideoGen_Generate_Execute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		videoGen_Generate_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVideoGen_Transition_FinishExecute_AbstractSubStep());
		videoGen_Generate_ExecuteEClass.getEGenericSuperTypes().add(g1);
		videoGen_Generate_Execute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		videoGen_Generate_Execute_ImplicitStepEClass.getESuperTypes().add(this.getVideoGen_Generate_Execute_AbstractSubStep());
		videoGen_Generate_Execute_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		g1 = createEGenericType(this.getVideoGen_VideoGen_Execute_AbstractSubStep());
		videoGen_Initialize_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVideoGen_Alternatives_Execute_AbstractSubStep());
		videoGen_Initialize_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVideoGen_Transition_Execute_AbstractSubStep());
		videoGen_Initialize_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		videoGen_Initialize_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getVideoGen_Initialize_Execute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		videoGen_Initialize_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVideoGen_Transition_FinishExecute_AbstractSubStep());
		videoGen_Initialize_ExecuteEClass.getEGenericSuperTypes().add(g1);
		videoGen_Initialize_Execute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		videoGen_Initialize_Execute_ImplicitStepEClass.getESuperTypes().add(this.getVideoGen_Initialize_Execute_AbstractSubStep());
		videoGen_Initialize_Execute_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		g1 = createEGenericType(this.getVideoGen_VideoGen_Execute_AbstractSubStep());
		videoGen_Mandatory_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVideoGen_Alternatives_Execute_AbstractSubStep());
		videoGen_Mandatory_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVideoGen_Transition_Execute_AbstractSubStep());
		videoGen_Mandatory_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		videoGen_Mandatory_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getVideoGen_Mandatory_Execute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		videoGen_Mandatory_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVideoGen_Transition_FinishExecute_AbstractSubStep());
		videoGen_Mandatory_ExecuteEClass.getEGenericSuperTypes().add(g1);
		videoGen_Mandatory_Execute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		videoGen_Mandatory_Execute_ImplicitStepEClass.getESuperTypes().add(this.getVideoGen_Mandatory_Execute_AbstractSubStep());
		videoGen_Mandatory_Execute_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		g1 = createEGenericType(this.getVideoGen_VideoGen_Execute_AbstractSubStep());
		videoGen_Optional_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVideoGen_Alternatives_Execute_AbstractSubStep());
		videoGen_Optional_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVideoGen_Transition_Execute_AbstractSubStep());
		videoGen_Optional_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		videoGen_Optional_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getVideoGen_Optional_Execute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		videoGen_Optional_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVideoGen_Transition_FinishExecute_AbstractSubStep());
		videoGen_Optional_ExecuteEClass.getEGenericSuperTypes().add(g1);
		videoGen_Optional_Execute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		videoGen_Optional_Execute_ImplicitStepEClass.getESuperTypes().add(this.getVideoGen_Optional_Execute_AbstractSubStep());
		videoGen_Optional_Execute_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		g1 = createEGenericType(this.getVideoGen_VideoGen_Execute_AbstractSubStep());
		videoGen_Transition_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVideoGen_Alternatives_Execute_AbstractSubStep());
		videoGen_Transition_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		videoGen_Transition_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getVideoGen_Transition_Execute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		videoGen_Transition_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVideoGen_Transition_Execute_AbstractSubStep());
		videoGen_Transition_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVideoGen_Transition_FinishExecute_AbstractSubStep());
		videoGen_Transition_ExecuteEClass.getEGenericSuperTypes().add(g1);
		videoGen_Transition_Execute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		videoGen_Transition_Execute_ImplicitStepEClass.getESuperTypes().add(this.getVideoGen_Transition_Execute_AbstractSubStep());
		videoGen_Transition_Execute_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		g1 = createEGenericType(this.getVideoGen_Alternatives_Execute_AbstractSubStep());
		videoGen_Transition_FinishExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVideoGen_Transition_Execute_AbstractSubStep());
		videoGen_Transition_FinishExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVideoGen_Optional_Execute_AbstractSubStep());
		videoGen_Transition_FinishExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVideoGen_Mandatory_Execute_AbstractSubStep());
		videoGen_Transition_FinishExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVideoGen_Initialize_Execute_AbstractSubStep());
		videoGen_Transition_FinishExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getVideoGen_Generate_Execute_AbstractSubStep());
		videoGen_Transition_FinishExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		videoGen_Transition_FinishExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getVideoGen_Transition_FinishExecute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		videoGen_Transition_FinishExecuteEClass.getEGenericSuperTypes().add(g1);
		videoGen_Transition_FinishExecute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		videoGen_Transition_FinishExecute_ImplicitStepEClass.getESuperTypes().add(this.getVideoGen_Transition_FinishExecute_AbstractSubStep());
		videoGen_Transition_FinishExecute_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		videoGen_VideoGen_ComputeEClass.getESuperTypes().add(this.getVideoGen_Transition_Execute_AbstractSubStep());
		videoGen_VideoGen_ComputeEClass.getESuperTypes().add(this.getVideoGen_Generate_Execute_AbstractSubStep());
		videoGen_VideoGen_ComputeEClass.getESuperTypes().add(this.getSpecificStep());
		videoGen_VideoGen_ComputeEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		g1 = createEGenericType(this.getSpecificStep());
		videoGen_VideoGen_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getVideoGen_VideoGen_Execute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		videoGen_VideoGen_ExecuteEClass.getEGenericSuperTypes().add(g1);
		videoGen_VideoGen_Execute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		videoGen_VideoGen_Execute_ImplicitStepEClass.getESuperTypes().add(this.getVideoGen_VideoGen_Execute_AbstractSubStep());
		videoGen_VideoGen_Execute_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		g1 = createEGenericType(this.getSpecificStep());
		videoGen_VideoGen_InitializeModelEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getVideoGen_VideoGen_InitializeModel_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		videoGen_VideoGen_InitializeModelEClass.getEGenericSuperTypes().add(g1);
		videoGen_VideoGen_InitializeModel_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		videoGen_VideoGen_InitializeModel_ImplicitStepEClass.getESuperTypes().add(this.getVideoGen_VideoGen_InitializeModel_AbstractSubStep());
		videoGen_VideoGen_InitializeModel_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		g1 = createEGenericType(this.getVideoGen_VideoGen_InitializeModel_AbstractSubStep());
		videoGen_VideoGen_SetupEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		videoGen_VideoGen_SetupEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getVideoGen_VideoGen_Setup_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		videoGen_VideoGen_SetupEClass.getEGenericSuperTypes().add(g1);
		videoGen_VideoGen_Setup_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		videoGen_VideoGen_Setup_ImplicitStepEClass.getESuperTypes().add(this.getVideoGen_VideoGen_Setup_AbstractSubStep());
		videoGen_VideoGen_Setup_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		videoGen_VideoGen_SolveEClass.getESuperTypes().add(this.getVideoGen_VideoGen_Execute_AbstractSubStep());
		videoGen_VideoGen_SolveEClass.getESuperTypes().add(this.getSpecificStep());
		videoGen_VideoGen_SolveEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		videoGen_Video_SetupEClass.getESuperTypes().add(this.getSpecificStep());
		videoGen_Video_SetupEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		videoGen_Video_SetupEClass.getESuperTypes().add(this.getVideoGen_VideoGen_Setup_AbstractSubStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(rootImplicitStepEClass, RootImplicitStep.class, "RootImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificStepEClass, SpecificStep.class, "SpecificStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificStep_EndingState(), theStatesPackage.getState(), theStatesPackage.getState_EndedSteps(), "endingState", null, 0, 1, SpecificStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificStep_StartingState(), theStatesPackage.getState(), theStatesPackage.getState_StartedSteps(), "startingState", null, 1, 1, SpecificStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(videoGen_Alternatives_ExecuteEClass, VideoGen_Alternatives_Execute.class, "VideoGen_Alternatives_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getVideoGen_Alternatives_Execute__GetCaller(), theVideoGenPackage_1.getTracedAlternatives(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(videoGen_Alternatives_Execute_AbstractSubStepEClass, VideoGen_Alternatives_Execute_AbstractSubStep.class, "VideoGen_Alternatives_Execute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoGen_Alternatives_Execute_ImplicitStepEClass, VideoGen_Alternatives_Execute_ImplicitStep.class, "VideoGen_Alternatives_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoGen_Generate_ExecuteEClass, VideoGen_Generate_Execute.class, "VideoGen_Generate_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getVideoGen_Generate_Execute__GetCaller(), theVideoGenPackage_1.getTracedGenerate(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(videoGen_Generate_Execute_AbstractSubStepEClass, VideoGen_Generate_Execute_AbstractSubStep.class, "VideoGen_Generate_Execute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoGen_Generate_Execute_ImplicitStepEClass, VideoGen_Generate_Execute_ImplicitStep.class, "VideoGen_Generate_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoGen_Initialize_ExecuteEClass, VideoGen_Initialize_Execute.class, "VideoGen_Initialize_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getVideoGen_Initialize_Execute__GetCaller(), theVideoGenPackage_1.getTracedInitialize(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(videoGen_Initialize_Execute_AbstractSubStepEClass, VideoGen_Initialize_Execute_AbstractSubStep.class, "VideoGen_Initialize_Execute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoGen_Initialize_Execute_ImplicitStepEClass, VideoGen_Initialize_Execute_ImplicitStep.class, "VideoGen_Initialize_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoGen_Mandatory_ExecuteEClass, VideoGen_Mandatory_Execute.class, "VideoGen_Mandatory_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getVideoGen_Mandatory_Execute__GetCaller(), theVideoGenPackage_1.getTracedMandatory(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(videoGen_Mandatory_Execute_AbstractSubStepEClass, VideoGen_Mandatory_Execute_AbstractSubStep.class, "VideoGen_Mandatory_Execute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoGen_Mandatory_Execute_ImplicitStepEClass, VideoGen_Mandatory_Execute_ImplicitStep.class, "VideoGen_Mandatory_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoGen_Optional_ExecuteEClass, VideoGen_Optional_Execute.class, "VideoGen_Optional_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getVideoGen_Optional_Execute__GetCaller(), theVideoGenPackage_1.getTracedOptional(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(videoGen_Optional_Execute_AbstractSubStepEClass, VideoGen_Optional_Execute_AbstractSubStep.class, "VideoGen_Optional_Execute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoGen_Optional_Execute_ImplicitStepEClass, VideoGen_Optional_Execute_ImplicitStep.class, "VideoGen_Optional_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoGen_Transition_ExecuteEClass, VideoGen_Transition_Execute.class, "VideoGen_Transition_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getVideoGen_Transition_Execute__GetCaller(), theVideoGenPackage_1.getTracedTransition(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(videoGen_Transition_Execute_AbstractSubStepEClass, VideoGen_Transition_Execute_AbstractSubStep.class, "VideoGen_Transition_Execute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoGen_Transition_Execute_ImplicitStepEClass, VideoGen_Transition_Execute_ImplicitStep.class, "VideoGen_Transition_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoGen_Transition_FinishExecuteEClass, VideoGen_Transition_FinishExecute.class, "VideoGen_Transition_FinishExecute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getVideoGen_Transition_FinishExecute__GetCaller(), theVideoGenPackage_1.getTracedTransition(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(videoGen_Transition_FinishExecute_AbstractSubStepEClass, VideoGen_Transition_FinishExecute_AbstractSubStep.class, "VideoGen_Transition_FinishExecute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoGen_Transition_FinishExecute_ImplicitStepEClass, VideoGen_Transition_FinishExecute_ImplicitStep.class, "VideoGen_Transition_FinishExecute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoGen_VideoGen_ComputeEClass, VideoGen_VideoGen_Compute.class, "VideoGen_VideoGen_Compute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getVideoGen_VideoGen_Compute__GetCaller(), theVideoGenPackage_1.getTracedVideoGen(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(videoGen_VideoGen_ExecuteEClass, VideoGen_VideoGen_Execute.class, "VideoGen_VideoGen_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getVideoGen_VideoGen_Execute__GetCaller(), theVideoGenPackage_1.getTracedVideoGen(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(videoGen_VideoGen_Execute_AbstractSubStepEClass, VideoGen_VideoGen_Execute_AbstractSubStep.class, "VideoGen_VideoGen_Execute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoGen_VideoGen_Execute_ImplicitStepEClass, VideoGen_VideoGen_Execute_ImplicitStep.class, "VideoGen_VideoGen_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoGen_VideoGen_InitializeModelEClass, VideoGen_VideoGen_InitializeModel.class, "VideoGen_VideoGen_InitializeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getVideoGen_VideoGen_InitializeModel__GetCaller(), theVideoGenPackage_1.getTracedVideoGen(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(videoGen_VideoGen_InitializeModel_AbstractSubStepEClass, VideoGen_VideoGen_InitializeModel_AbstractSubStep.class, "VideoGen_VideoGen_InitializeModel_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoGen_VideoGen_InitializeModel_ImplicitStepEClass, VideoGen_VideoGen_InitializeModel_ImplicitStep.class, "VideoGen_VideoGen_InitializeModel_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoGen_VideoGen_SetupEClass, VideoGen_VideoGen_Setup.class, "VideoGen_VideoGen_Setup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getVideoGen_VideoGen_Setup__GetCaller(), theVideoGenPackage_1.getTracedVideoGen(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(videoGen_VideoGen_Setup_AbstractSubStepEClass, VideoGen_VideoGen_Setup_AbstractSubStep.class, "VideoGen_VideoGen_Setup_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoGen_VideoGen_Setup_ImplicitStepEClass, VideoGen_VideoGen_Setup_ImplicitStep.class, "VideoGen_VideoGen_Setup_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoGen_VideoGen_SolveEClass, VideoGen_VideoGen_Solve.class, "VideoGen_VideoGen_Solve", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getVideoGen_VideoGen_Solve__GetCaller(), theVideoGenPackage_1.getTracedVideoGen(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(videoGen_Video_SetupEClass, VideoGen_Video_Setup.class, "VideoGen_Video_Setup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getVideoGen_Video_Setup__GetCaller(), theVideoGenPackage_1.getTracedVideo(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);
	}

} //StepsPackageImpl
