/**
 */
package videoGenTrace.Steps;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.gemoc.executionframework.engine.mse.MsePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see videoGenTrace.Steps.StepsFactory
 * @model kind="package"
 * @generated
 */
public interface StepsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Steps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "videoGenTrace_Steps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "events";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsPackage eINSTANCE = videoGenTrace.Steps.impl.StepsPackageImpl.init();

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.StepImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 3;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__MSE = MsePackage.SEQUENTIAL_LOGICAL_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PARAMETERS = MsePackage.SEQUENTIAL_LOGICAL_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__RESULT = MsePackage.SEQUENTIAL_LOGICAL_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ENDING_STATE = MsePackage.SEQUENTIAL_LOGICAL_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__STARTING_STATE = MsePackage.SEQUENTIAL_LOGICAL_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = MsePackage.SEQUENTIAL_LOGICAL_STEP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Mse Occurrences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP___GET_MSE_OCCURRENCES = MsePackage.SEQUENTIAL_LOGICAL_STEP___GET_MSE_OCCURRENCES;

	/**
	 * The operation id for the '<em>Get Logical Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP___GET_LOGICAL_STEP = MsePackage.SEQUENTIAL_LOGICAL_STEP___GET_LOGICAL_STEP;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = MsePackage.SEQUENTIAL_LOGICAL_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.BigStepImpl <em>Big Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.BigStepImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getBigStep()
	 * @generated
	 */
	int BIG_STEP = 0;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__MSE = STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__PARAMETERS = STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__RESULT = STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__ENDING_STATE = STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__STARTING_STATE = STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Big Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Mse Occurrences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP___GET_MSE_OCCURRENCES = STEP___GET_MSE_OCCURRENCES;

	/**
	 * The operation id for the '<em>Get Logical Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP___GET_LOGICAL_STEP = STEP___GET_LOGICAL_STEP;

	/**
	 * The number of operations of the '<em>Big Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.SmallStepImpl <em>Small Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.SmallStepImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getSmallStep()
	 * @generated
	 */
	int SMALL_STEP = 2;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__MSE = STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__PARAMETERS = STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__RESULT = STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__ENDING_STATE = STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__STARTING_STATE = STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Small Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Mse Occurrences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP___GET_MSE_OCCURRENCES = STEP___GET_MSE_OCCURRENCES;

	/**
	 * The operation id for the '<em>Get Logical Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP___GET_LOGICAL_STEP = STEP___GET_LOGICAL_STEP;

	/**
	 * The number of operations of the '<em>Small Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.RootImplicitStepImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
	 * @generated
	 */
	int ROOT_IMPLICIT_STEP = 1;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__MSE = SMALL_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__PARAMETERS = SMALL_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__RESULT = SMALL_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__ENDING_STATE = SMALL_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__STARTING_STATE = SMALL_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Mse Occurrences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP___GET_MSE_OCCURRENCES = SMALL_STEP___GET_MSE_OCCURRENCES;

	/**
	 * The operation id for the '<em>Get Logical Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP___GET_LOGICAL_STEP = SMALL_STEP___GET_LOGICAL_STEP;

	/**
	 * The number of operations of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.VideoGen_Alternatives_ExecuteImpl <em>Video Gen Alternatives Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.VideoGen_Alternatives_ExecuteImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Alternatives_Execute()
	 * @generated
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE = 4;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE__MSE = SMALL_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE__PARAMETERS = SMALL_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE__RESULT = SMALL_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE__ENDING_STATE = SMALL_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE__STARTING_STATE = SMALL_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Video Gen Alternatives Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Mse Occurrences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE___GET_MSE_OCCURRENCES = SMALL_STEP___GET_MSE_OCCURRENCES;

	/**
	 * The operation id for the '<em>Get Logical Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE___GET_LOGICAL_STEP = SMALL_STEP___GET_LOGICAL_STEP;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE___GET_CALLER = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Alternatives Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.VideoGen_Delay_ExecuteImpl <em>Video Gen Delay Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.VideoGen_Delay_ExecuteImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Delay_Execute()
	 * @generated
	 */
	int VIDEO_GEN_DELAY_EXECUTE = 5;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_DELAY_EXECUTE__MSE = SMALL_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_DELAY_EXECUTE__PARAMETERS = SMALL_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_DELAY_EXECUTE__RESULT = SMALL_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_DELAY_EXECUTE__ENDING_STATE = SMALL_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_DELAY_EXECUTE__STARTING_STATE = SMALL_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Video Gen Delay Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_DELAY_EXECUTE_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Mse Occurrences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_DELAY_EXECUTE___GET_MSE_OCCURRENCES = SMALL_STEP___GET_MSE_OCCURRENCES;

	/**
	 * The operation id for the '<em>Get Logical Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_DELAY_EXECUTE___GET_LOGICAL_STEP = SMALL_STEP___GET_LOGICAL_STEP;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_DELAY_EXECUTE___GET_CALLER = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Delay Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_DELAY_EXECUTE_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.VideoGen_Generate_ComputeImpl <em>Video Gen Generate Compute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.VideoGen_Generate_ComputeImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Generate_Compute()
	 * @generated
	 */
	int VIDEO_GEN_GENERATE_COMPUTE = 6;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_COMPUTE__MSE = SMALL_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_COMPUTE__PARAMETERS = SMALL_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_COMPUTE__RESULT = SMALL_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_COMPUTE__ENDING_STATE = SMALL_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_COMPUTE__STARTING_STATE = SMALL_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Video Gen Generate Compute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_COMPUTE_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Mse Occurrences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_COMPUTE___GET_MSE_OCCURRENCES = SMALL_STEP___GET_MSE_OCCURRENCES;

	/**
	 * The operation id for the '<em>Get Logical Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_COMPUTE___GET_LOGICAL_STEP = SMALL_STEP___GET_LOGICAL_STEP;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_COMPUTE___GET_CALLER = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Generate Compute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_COMPUTE_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.VideoGen_Generate_ExecuteImpl <em>Video Gen Generate Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.VideoGen_Generate_ExecuteImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Generate_Execute()
	 * @generated
	 */
	int VIDEO_GEN_GENERATE_EXECUTE = 7;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE__MSE = SMALL_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE__PARAMETERS = SMALL_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE__RESULT = SMALL_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE__ENDING_STATE = SMALL_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE__STARTING_STATE = SMALL_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Video Gen Generate Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Mse Occurrences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE___GET_MSE_OCCURRENCES = SMALL_STEP___GET_MSE_OCCURRENCES;

	/**
	 * The operation id for the '<em>Get Logical Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE___GET_LOGICAL_STEP = SMALL_STEP___GET_LOGICAL_STEP;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE___GET_CALLER = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Generate Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.VideoGen_Initialize_ExecuteImpl <em>Video Gen Initialize Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.VideoGen_Initialize_ExecuteImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Initialize_Execute()
	 * @generated
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE = 8;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE__MSE = SMALL_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE__PARAMETERS = SMALL_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE__RESULT = SMALL_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE__ENDING_STATE = SMALL_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE__STARTING_STATE = SMALL_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Video Gen Initialize Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Mse Occurrences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE___GET_MSE_OCCURRENCES = SMALL_STEP___GET_MSE_OCCURRENCES;

	/**
	 * The operation id for the '<em>Get Logical Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE___GET_LOGICAL_STEP = SMALL_STEP___GET_LOGICAL_STEP;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE___GET_CALLER = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Initialize Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.VideoGen_Mandatory_ExecuteImpl <em>Video Gen Mandatory Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.VideoGen_Mandatory_ExecuteImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Mandatory_Execute()
	 * @generated
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE = 9;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE__MSE = SMALL_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE__PARAMETERS = SMALL_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE__RESULT = SMALL_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE__ENDING_STATE = SMALL_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE__STARTING_STATE = SMALL_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Video Gen Mandatory Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Mse Occurrences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE___GET_MSE_OCCURRENCES = SMALL_STEP___GET_MSE_OCCURRENCES;

	/**
	 * The operation id for the '<em>Get Logical Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE___GET_LOGICAL_STEP = SMALL_STEP___GET_LOGICAL_STEP;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE___GET_CALLER = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Mandatory Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.VideoGen_Optional_ExecuteImpl <em>Video Gen Optional Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.VideoGen_Optional_ExecuteImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Optional_Execute()
	 * @generated
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE = 10;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE__MSE = SMALL_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE__PARAMETERS = SMALL_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE__RESULT = SMALL_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE__ENDING_STATE = SMALL_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE__STARTING_STATE = SMALL_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Video Gen Optional Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Mse Occurrences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE___GET_MSE_OCCURRENCES = SMALL_STEP___GET_MSE_OCCURRENCES;

	/**
	 * The operation id for the '<em>Get Logical Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE___GET_LOGICAL_STEP = SMALL_STEP___GET_LOGICAL_STEP;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE___GET_CALLER = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Optional Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.VideoGen_Sequence_ExecuteImpl <em>Video Gen Sequence Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.VideoGen_Sequence_ExecuteImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Sequence_Execute()
	 * @generated
	 */
	int VIDEO_GEN_SEQUENCE_EXECUTE = 11;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_SEQUENCE_EXECUTE__MSE = SMALL_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_SEQUENCE_EXECUTE__PARAMETERS = SMALL_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_SEQUENCE_EXECUTE__RESULT = SMALL_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_SEQUENCE_EXECUTE__ENDING_STATE = SMALL_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_SEQUENCE_EXECUTE__STARTING_STATE = SMALL_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Video Gen Sequence Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_SEQUENCE_EXECUTE_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Mse Occurrences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_SEQUENCE_EXECUTE___GET_MSE_OCCURRENCES = SMALL_STEP___GET_MSE_OCCURRENCES;

	/**
	 * The operation id for the '<em>Get Logical Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_SEQUENCE_EXECUTE___GET_LOGICAL_STEP = SMALL_STEP___GET_LOGICAL_STEP;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_SEQUENCE_EXECUTE___GET_CALLER = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Sequence Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_SEQUENCE_EXECUTE_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.VideoGen_Transition_ExecuteImpl <em>Video Gen Transition Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.VideoGen_Transition_ExecuteImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Transition_Execute()
	 * @generated
	 */
	int VIDEO_GEN_TRANSITION_EXECUTE = 12;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_TRANSITION_EXECUTE__MSE = SMALL_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_TRANSITION_EXECUTE__PARAMETERS = SMALL_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_TRANSITION_EXECUTE__RESULT = SMALL_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_TRANSITION_EXECUTE__ENDING_STATE = SMALL_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_TRANSITION_EXECUTE__STARTING_STATE = SMALL_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Video Gen Transition Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_TRANSITION_EXECUTE_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Mse Occurrences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_TRANSITION_EXECUTE___GET_MSE_OCCURRENCES = SMALL_STEP___GET_MSE_OCCURRENCES;

	/**
	 * The operation id for the '<em>Get Logical Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_TRANSITION_EXECUTE___GET_LOGICAL_STEP = SMALL_STEP___GET_LOGICAL_STEP;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_TRANSITION_EXECUTE___GET_CALLER = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Transition Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_TRANSITION_EXECUTE_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.VideoGen_Video_SelectImpl <em>Video Gen Video Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.VideoGen_Video_SelectImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Video_Select()
	 * @generated
	 */
	int VIDEO_GEN_VIDEO_SELECT = 13;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_SELECT__MSE = SMALL_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_SELECT__PARAMETERS = SMALL_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_SELECT__RESULT = SMALL_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_SELECT__ENDING_STATE = SMALL_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_SELECT__STARTING_STATE = SMALL_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Video Gen Video Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_SELECT_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Mse Occurrences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_SELECT___GET_MSE_OCCURRENCES = SMALL_STEP___GET_MSE_OCCURRENCES;

	/**
	 * The operation id for the '<em>Get Logical Step</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_SELECT___GET_LOGICAL_STEP = SMALL_STEP___GET_LOGICAL_STEP;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_SELECT___GET_CALLER = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Video Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_SELECT_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link videoGenTrace.Steps.BigStep <em>Big Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Big Step</em>'.
	 * @see videoGenTrace.Steps.BigStep
	 * @generated
	 */
	EClass getBigStep();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Implicit Step</em>'.
	 * @see videoGenTrace.Steps.RootImplicitStep
	 * @generated
	 */
	EClass getRootImplicitStep();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.Steps.SmallStep <em>Small Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Small Step</em>'.
	 * @see videoGenTrace.Steps.SmallStep
	 * @generated
	 */
	EClass getSmallStep();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.Steps.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see videoGenTrace.Steps.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the reference '{@link videoGenTrace.Steps.Step#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ending State</em>'.
	 * @see videoGenTrace.Steps.Step#getEndingState()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_EndingState();

	/**
	 * Returns the meta object for the reference '{@link videoGenTrace.Steps.Step#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starting State</em>'.
	 * @see videoGenTrace.Steps.Step#getStartingState()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_StartingState();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.Steps.VideoGen_Alternatives_Execute <em>Video Gen Alternatives Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen Alternatives Execute</em>'.
	 * @see videoGenTrace.Steps.VideoGen_Alternatives_Execute
	 * @generated
	 */
	EClass getVideoGen_Alternatives_Execute();

	/**
	 * Returns the meta object for the '{@link videoGenTrace.Steps.VideoGen_Alternatives_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see videoGenTrace.Steps.VideoGen_Alternatives_Execute#getCaller()
	 * @generated
	 */
	EOperation getVideoGen_Alternatives_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.Steps.VideoGen_Delay_Execute <em>Video Gen Delay Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen Delay Execute</em>'.
	 * @see videoGenTrace.Steps.VideoGen_Delay_Execute
	 * @generated
	 */
	EClass getVideoGen_Delay_Execute();

	/**
	 * Returns the meta object for the '{@link videoGenTrace.Steps.VideoGen_Delay_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see videoGenTrace.Steps.VideoGen_Delay_Execute#getCaller()
	 * @generated
	 */
	EOperation getVideoGen_Delay_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.Steps.VideoGen_Generate_Compute <em>Video Gen Generate Compute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen Generate Compute</em>'.
	 * @see videoGenTrace.Steps.VideoGen_Generate_Compute
	 * @generated
	 */
	EClass getVideoGen_Generate_Compute();

	/**
	 * Returns the meta object for the '{@link videoGenTrace.Steps.VideoGen_Generate_Compute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see videoGenTrace.Steps.VideoGen_Generate_Compute#getCaller()
	 * @generated
	 */
	EOperation getVideoGen_Generate_Compute__GetCaller();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.Steps.VideoGen_Generate_Execute <em>Video Gen Generate Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen Generate Execute</em>'.
	 * @see videoGenTrace.Steps.VideoGen_Generate_Execute
	 * @generated
	 */
	EClass getVideoGen_Generate_Execute();

	/**
	 * Returns the meta object for the '{@link videoGenTrace.Steps.VideoGen_Generate_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see videoGenTrace.Steps.VideoGen_Generate_Execute#getCaller()
	 * @generated
	 */
	EOperation getVideoGen_Generate_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.Steps.VideoGen_Initialize_Execute <em>Video Gen Initialize Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen Initialize Execute</em>'.
	 * @see videoGenTrace.Steps.VideoGen_Initialize_Execute
	 * @generated
	 */
	EClass getVideoGen_Initialize_Execute();

	/**
	 * Returns the meta object for the '{@link videoGenTrace.Steps.VideoGen_Initialize_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see videoGenTrace.Steps.VideoGen_Initialize_Execute#getCaller()
	 * @generated
	 */
	EOperation getVideoGen_Initialize_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.Steps.VideoGen_Mandatory_Execute <em>Video Gen Mandatory Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen Mandatory Execute</em>'.
	 * @see videoGenTrace.Steps.VideoGen_Mandatory_Execute
	 * @generated
	 */
	EClass getVideoGen_Mandatory_Execute();

	/**
	 * Returns the meta object for the '{@link videoGenTrace.Steps.VideoGen_Mandatory_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see videoGenTrace.Steps.VideoGen_Mandatory_Execute#getCaller()
	 * @generated
	 */
	EOperation getVideoGen_Mandatory_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.Steps.VideoGen_Optional_Execute <em>Video Gen Optional Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen Optional Execute</em>'.
	 * @see videoGenTrace.Steps.VideoGen_Optional_Execute
	 * @generated
	 */
	EClass getVideoGen_Optional_Execute();

	/**
	 * Returns the meta object for the '{@link videoGenTrace.Steps.VideoGen_Optional_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see videoGenTrace.Steps.VideoGen_Optional_Execute#getCaller()
	 * @generated
	 */
	EOperation getVideoGen_Optional_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.Steps.VideoGen_Sequence_Execute <em>Video Gen Sequence Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen Sequence Execute</em>'.
	 * @see videoGenTrace.Steps.VideoGen_Sequence_Execute
	 * @generated
	 */
	EClass getVideoGen_Sequence_Execute();

	/**
	 * Returns the meta object for the '{@link videoGenTrace.Steps.VideoGen_Sequence_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see videoGenTrace.Steps.VideoGen_Sequence_Execute#getCaller()
	 * @generated
	 */
	EOperation getVideoGen_Sequence_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.Steps.VideoGen_Transition_Execute <em>Video Gen Transition Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen Transition Execute</em>'.
	 * @see videoGenTrace.Steps.VideoGen_Transition_Execute
	 * @generated
	 */
	EClass getVideoGen_Transition_Execute();

	/**
	 * Returns the meta object for the '{@link videoGenTrace.Steps.VideoGen_Transition_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see videoGenTrace.Steps.VideoGen_Transition_Execute#getCaller()
	 * @generated
	 */
	EOperation getVideoGen_Transition_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.Steps.VideoGen_Video_Select <em>Video Gen Video Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen Video Select</em>'.
	 * @see videoGenTrace.Steps.VideoGen_Video_Select
	 * @generated
	 */
	EClass getVideoGen_Video_Select();

	/**
	 * Returns the meta object for the '{@link videoGenTrace.Steps.VideoGen_Video_Select#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see videoGenTrace.Steps.VideoGen_Video_Select#getCaller()
	 * @generated
	 */
	EOperation getVideoGen_Video_Select__GetCaller();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StepsFactory getStepsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link videoGenTrace.Steps.impl.BigStepImpl <em>Big Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.impl.BigStepImpl
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getBigStep()
		 * @generated
		 */
		EClass BIG_STEP = eINSTANCE.getBigStep();

		/**
		 * The meta object literal for the '{@link videoGenTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.impl.RootImplicitStepImpl
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
		 * @generated
		 */
		EClass ROOT_IMPLICIT_STEP = eINSTANCE.getRootImplicitStep();

		/**
		 * The meta object literal for the '{@link videoGenTrace.Steps.impl.SmallStepImpl <em>Small Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.impl.SmallStepImpl
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getSmallStep()
		 * @generated
		 */
		EClass SMALL_STEP = eINSTANCE.getSmallStep();

		/**
		 * The meta object literal for the '{@link videoGenTrace.Steps.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.impl.StepImpl
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Ending State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__ENDING_STATE = eINSTANCE.getStep_EndingState();

		/**
		 * The meta object literal for the '<em><b>Starting State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__STARTING_STATE = eINSTANCE.getStep_StartingState();

		/**
		 * The meta object literal for the '{@link videoGenTrace.Steps.impl.VideoGen_Alternatives_ExecuteImpl <em>Video Gen Alternatives Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.impl.VideoGen_Alternatives_ExecuteImpl
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Alternatives_Execute()
		 * @generated
		 */
		EClass VIDEO_GEN_ALTERNATIVES_EXECUTE = eINSTANCE.getVideoGen_Alternatives_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIDEO_GEN_ALTERNATIVES_EXECUTE___GET_CALLER = eINSTANCE.getVideoGen_Alternatives_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link videoGenTrace.Steps.impl.VideoGen_Delay_ExecuteImpl <em>Video Gen Delay Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.impl.VideoGen_Delay_ExecuteImpl
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Delay_Execute()
		 * @generated
		 */
		EClass VIDEO_GEN_DELAY_EXECUTE = eINSTANCE.getVideoGen_Delay_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIDEO_GEN_DELAY_EXECUTE___GET_CALLER = eINSTANCE.getVideoGen_Delay_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link videoGenTrace.Steps.impl.VideoGen_Generate_ComputeImpl <em>Video Gen Generate Compute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.impl.VideoGen_Generate_ComputeImpl
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Generate_Compute()
		 * @generated
		 */
		EClass VIDEO_GEN_GENERATE_COMPUTE = eINSTANCE.getVideoGen_Generate_Compute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIDEO_GEN_GENERATE_COMPUTE___GET_CALLER = eINSTANCE.getVideoGen_Generate_Compute__GetCaller();

		/**
		 * The meta object literal for the '{@link videoGenTrace.Steps.impl.VideoGen_Generate_ExecuteImpl <em>Video Gen Generate Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.impl.VideoGen_Generate_ExecuteImpl
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Generate_Execute()
		 * @generated
		 */
		EClass VIDEO_GEN_GENERATE_EXECUTE = eINSTANCE.getVideoGen_Generate_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIDEO_GEN_GENERATE_EXECUTE___GET_CALLER = eINSTANCE.getVideoGen_Generate_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link videoGenTrace.Steps.impl.VideoGen_Initialize_ExecuteImpl <em>Video Gen Initialize Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.impl.VideoGen_Initialize_ExecuteImpl
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Initialize_Execute()
		 * @generated
		 */
		EClass VIDEO_GEN_INITIALIZE_EXECUTE = eINSTANCE.getVideoGen_Initialize_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIDEO_GEN_INITIALIZE_EXECUTE___GET_CALLER = eINSTANCE.getVideoGen_Initialize_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link videoGenTrace.Steps.impl.VideoGen_Mandatory_ExecuteImpl <em>Video Gen Mandatory Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.impl.VideoGen_Mandatory_ExecuteImpl
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Mandatory_Execute()
		 * @generated
		 */
		EClass VIDEO_GEN_MANDATORY_EXECUTE = eINSTANCE.getVideoGen_Mandatory_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIDEO_GEN_MANDATORY_EXECUTE___GET_CALLER = eINSTANCE.getVideoGen_Mandatory_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link videoGenTrace.Steps.impl.VideoGen_Optional_ExecuteImpl <em>Video Gen Optional Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.impl.VideoGen_Optional_ExecuteImpl
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Optional_Execute()
		 * @generated
		 */
		EClass VIDEO_GEN_OPTIONAL_EXECUTE = eINSTANCE.getVideoGen_Optional_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIDEO_GEN_OPTIONAL_EXECUTE___GET_CALLER = eINSTANCE.getVideoGen_Optional_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link videoGenTrace.Steps.impl.VideoGen_Sequence_ExecuteImpl <em>Video Gen Sequence Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.impl.VideoGen_Sequence_ExecuteImpl
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Sequence_Execute()
		 * @generated
		 */
		EClass VIDEO_GEN_SEQUENCE_EXECUTE = eINSTANCE.getVideoGen_Sequence_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIDEO_GEN_SEQUENCE_EXECUTE___GET_CALLER = eINSTANCE.getVideoGen_Sequence_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link videoGenTrace.Steps.impl.VideoGen_Transition_ExecuteImpl <em>Video Gen Transition Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.impl.VideoGen_Transition_ExecuteImpl
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Transition_Execute()
		 * @generated
		 */
		EClass VIDEO_GEN_TRANSITION_EXECUTE = eINSTANCE.getVideoGen_Transition_Execute();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIDEO_GEN_TRANSITION_EXECUTE___GET_CALLER = eINSTANCE.getVideoGen_Transition_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link videoGenTrace.Steps.impl.VideoGen_Video_SelectImpl <em>Video Gen Video Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.impl.VideoGen_Video_SelectImpl
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Video_Select()
		 * @generated
		 */
		EClass VIDEO_GEN_VIDEO_SELECT = eINSTANCE.getVideoGen_Video_Select();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIDEO_GEN_VIDEO_SELECT___GET_CALLER = eINSTANCE.getVideoGen_Video_Select__GetCaller();

	}

} //StepsPackage
