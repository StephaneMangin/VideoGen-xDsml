/**
 */
package videoGenTrace.Steps.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import videoGenTrace.Steps.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepsFactoryImpl extends EFactoryImpl implements StepsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StepsFactory init() {
		try {
			StepsFactory theStepsFactory = (StepsFactory)EPackage.Registry.INSTANCE.getEFactory(StepsPackage.eNS_URI);
			if (theStepsFactory != null) {
				return theStepsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StepsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactoryImpl() {
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
			case StepsPackage.ROOT_IMPLICIT_STEP: return createRootImplicitStep();
			case StepsPackage.VIDEO_GEN_ALTERNATIVES_EXECUTE: return createVideoGen_Alternatives_Execute();
			case StepsPackage.VIDEO_GEN_ALTERNATIVES_EXECUTE_IMPLICIT_STEP: return createVideoGen_Alternatives_Execute_ImplicitStep();
			case StepsPackage.VIDEO_GEN_GENERATE_EXECUTE: return createVideoGen_Generate_Execute();
			case StepsPackage.VIDEO_GEN_GENERATE_EXECUTE_IMPLICIT_STEP: return createVideoGen_Generate_Execute_ImplicitStep();
			case StepsPackage.VIDEO_GEN_INITIALIZE_EXECUTE: return createVideoGen_Initialize_Execute();
			case StepsPackage.VIDEO_GEN_INITIALIZE_EXECUTE_IMPLICIT_STEP: return createVideoGen_Initialize_Execute_ImplicitStep();
			case StepsPackage.VIDEO_GEN_MANDATORY_EXECUTE: return createVideoGen_Mandatory_Execute();
			case StepsPackage.VIDEO_GEN_MANDATORY_EXECUTE_IMPLICIT_STEP: return createVideoGen_Mandatory_Execute_ImplicitStep();
			case StepsPackage.VIDEO_GEN_OPTIONAL_EXECUTE: return createVideoGen_Optional_Execute();
			case StepsPackage.VIDEO_GEN_OPTIONAL_EXECUTE_IMPLICIT_STEP: return createVideoGen_Optional_Execute_ImplicitStep();
			case StepsPackage.VIDEO_GEN_TRANSITION_EXECUTE: return createVideoGen_Transition_Execute();
			case StepsPackage.VIDEO_GEN_TRANSITION_EXECUTE_IMPLICIT_STEP: return createVideoGen_Transition_Execute_ImplicitStep();
			case StepsPackage.VIDEO_GEN_TRANSITION_FINISH_EXECUTE: return createVideoGen_Transition_FinishExecute();
			case StepsPackage.VIDEO_GEN_TRANSITION_FINISH_EXECUTE_IMPLICIT_STEP: return createVideoGen_Transition_FinishExecute_ImplicitStep();
			case StepsPackage.VIDEO_GEN_VIDEO_GEN_COMPUTE: return createVideoGen_VideoGen_Compute();
			case StepsPackage.VIDEO_GEN_VIDEO_GEN_EXECUTE: return createVideoGen_VideoGen_Execute();
			case StepsPackage.VIDEO_GEN_VIDEO_GEN_EXECUTE_IMPLICIT_STEP: return createVideoGen_VideoGen_Execute_ImplicitStep();
			case StepsPackage.VIDEO_GEN_VIDEO_GEN_INITIALIZE_MODEL: return createVideoGen_VideoGen_InitializeModel();
			case StepsPackage.VIDEO_GEN_VIDEO_GEN_INITIALIZE_MODEL_IMPLICIT_STEP: return createVideoGen_VideoGen_InitializeModel_ImplicitStep();
			case StepsPackage.VIDEO_GEN_VIDEO_GEN_SETUP: return createVideoGen_VideoGen_Setup();
			case StepsPackage.VIDEO_GEN_VIDEO_GEN_SETUP_IMPLICIT_STEP: return createVideoGen_VideoGen_Setup_ImplicitStep();
			case StepsPackage.VIDEO_GEN_VIDEO_GEN_SOLVE: return createVideoGen_VideoGen_Solve();
			case StepsPackage.VIDEO_GEN_VIDEO_SETUP: return createVideoGen_Video_Setup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootImplicitStep createRootImplicitStep() {
		RootImplicitStepImpl rootImplicitStep = new RootImplicitStepImpl();
		return rootImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_Alternatives_Execute createVideoGen_Alternatives_Execute() {
		VideoGen_Alternatives_ExecuteImpl videoGen_Alternatives_Execute = new VideoGen_Alternatives_ExecuteImpl();
		return videoGen_Alternatives_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_Alternatives_Execute_ImplicitStep createVideoGen_Alternatives_Execute_ImplicitStep() {
		VideoGen_Alternatives_Execute_ImplicitStepImpl videoGen_Alternatives_Execute_ImplicitStep = new VideoGen_Alternatives_Execute_ImplicitStepImpl();
		return videoGen_Alternatives_Execute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_Generate_Execute createVideoGen_Generate_Execute() {
		VideoGen_Generate_ExecuteImpl videoGen_Generate_Execute = new VideoGen_Generate_ExecuteImpl();
		return videoGen_Generate_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_Generate_Execute_ImplicitStep createVideoGen_Generate_Execute_ImplicitStep() {
		VideoGen_Generate_Execute_ImplicitStepImpl videoGen_Generate_Execute_ImplicitStep = new VideoGen_Generate_Execute_ImplicitStepImpl();
		return videoGen_Generate_Execute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_Initialize_Execute createVideoGen_Initialize_Execute() {
		VideoGen_Initialize_ExecuteImpl videoGen_Initialize_Execute = new VideoGen_Initialize_ExecuteImpl();
		return videoGen_Initialize_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_Initialize_Execute_ImplicitStep createVideoGen_Initialize_Execute_ImplicitStep() {
		VideoGen_Initialize_Execute_ImplicitStepImpl videoGen_Initialize_Execute_ImplicitStep = new VideoGen_Initialize_Execute_ImplicitStepImpl();
		return videoGen_Initialize_Execute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_Mandatory_Execute createVideoGen_Mandatory_Execute() {
		VideoGen_Mandatory_ExecuteImpl videoGen_Mandatory_Execute = new VideoGen_Mandatory_ExecuteImpl();
		return videoGen_Mandatory_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_Mandatory_Execute_ImplicitStep createVideoGen_Mandatory_Execute_ImplicitStep() {
		VideoGen_Mandatory_Execute_ImplicitStepImpl videoGen_Mandatory_Execute_ImplicitStep = new VideoGen_Mandatory_Execute_ImplicitStepImpl();
		return videoGen_Mandatory_Execute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_Optional_Execute createVideoGen_Optional_Execute() {
		VideoGen_Optional_ExecuteImpl videoGen_Optional_Execute = new VideoGen_Optional_ExecuteImpl();
		return videoGen_Optional_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_Optional_Execute_ImplicitStep createVideoGen_Optional_Execute_ImplicitStep() {
		VideoGen_Optional_Execute_ImplicitStepImpl videoGen_Optional_Execute_ImplicitStep = new VideoGen_Optional_Execute_ImplicitStepImpl();
		return videoGen_Optional_Execute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_Transition_Execute createVideoGen_Transition_Execute() {
		VideoGen_Transition_ExecuteImpl videoGen_Transition_Execute = new VideoGen_Transition_ExecuteImpl();
		return videoGen_Transition_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_Transition_Execute_ImplicitStep createVideoGen_Transition_Execute_ImplicitStep() {
		VideoGen_Transition_Execute_ImplicitStepImpl videoGen_Transition_Execute_ImplicitStep = new VideoGen_Transition_Execute_ImplicitStepImpl();
		return videoGen_Transition_Execute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_Transition_FinishExecute createVideoGen_Transition_FinishExecute() {
		VideoGen_Transition_FinishExecuteImpl videoGen_Transition_FinishExecute = new VideoGen_Transition_FinishExecuteImpl();
		return videoGen_Transition_FinishExecute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_Transition_FinishExecute_ImplicitStep createVideoGen_Transition_FinishExecute_ImplicitStep() {
		VideoGen_Transition_FinishExecute_ImplicitStepImpl videoGen_Transition_FinishExecute_ImplicitStep = new VideoGen_Transition_FinishExecute_ImplicitStepImpl();
		return videoGen_Transition_FinishExecute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_VideoGen_Compute createVideoGen_VideoGen_Compute() {
		VideoGen_VideoGen_ComputeImpl videoGen_VideoGen_Compute = new VideoGen_VideoGen_ComputeImpl();
		return videoGen_VideoGen_Compute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_VideoGen_Execute createVideoGen_VideoGen_Execute() {
		VideoGen_VideoGen_ExecuteImpl videoGen_VideoGen_Execute = new VideoGen_VideoGen_ExecuteImpl();
		return videoGen_VideoGen_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_VideoGen_Execute_ImplicitStep createVideoGen_VideoGen_Execute_ImplicitStep() {
		VideoGen_VideoGen_Execute_ImplicitStepImpl videoGen_VideoGen_Execute_ImplicitStep = new VideoGen_VideoGen_Execute_ImplicitStepImpl();
		return videoGen_VideoGen_Execute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_VideoGen_InitializeModel createVideoGen_VideoGen_InitializeModel() {
		VideoGen_VideoGen_InitializeModelImpl videoGen_VideoGen_InitializeModel = new VideoGen_VideoGen_InitializeModelImpl();
		return videoGen_VideoGen_InitializeModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_VideoGen_InitializeModel_ImplicitStep createVideoGen_VideoGen_InitializeModel_ImplicitStep() {
		VideoGen_VideoGen_InitializeModel_ImplicitStepImpl videoGen_VideoGen_InitializeModel_ImplicitStep = new VideoGen_VideoGen_InitializeModel_ImplicitStepImpl();
		return videoGen_VideoGen_InitializeModel_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_VideoGen_Setup createVideoGen_VideoGen_Setup() {
		VideoGen_VideoGen_SetupImpl videoGen_VideoGen_Setup = new VideoGen_VideoGen_SetupImpl();
		return videoGen_VideoGen_Setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_VideoGen_Setup_ImplicitStep createVideoGen_VideoGen_Setup_ImplicitStep() {
		VideoGen_VideoGen_Setup_ImplicitStepImpl videoGen_VideoGen_Setup_ImplicitStep = new VideoGen_VideoGen_Setup_ImplicitStepImpl();
		return videoGen_VideoGen_Setup_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_VideoGen_Solve createVideoGen_VideoGen_Solve() {
		VideoGen_VideoGen_SolveImpl videoGen_VideoGen_Solve = new VideoGen_VideoGen_SolveImpl();
		return videoGen_VideoGen_Solve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_Video_Setup createVideoGen_Video_Setup() {
		VideoGen_Video_SetupImpl videoGen_Video_Setup = new VideoGen_Video_SetupImpl();
		return videoGen_Video_Setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsPackage getStepsPackage() {
		return (StepsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StepsPackage getPackage() {
		return StepsPackage.eINSTANCE;
	}

} //StepsFactoryImpl
