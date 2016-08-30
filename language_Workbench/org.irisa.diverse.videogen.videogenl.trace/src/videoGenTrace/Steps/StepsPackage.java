/**
 */
package videoGenTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.RootImplicitStepImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
	 * @generated
	 */
	int ROOT_IMPLICIT_STEP = 0;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__MSEOCCURRENCE = TracePackage.SMALL_STEP__MSEOCCURRENCE;

	/**
	 * The number of structural features of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_FEATURE_COUNT = TracePackage.SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_OPERATION_COUNT = TracePackage.SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.SpecificStep
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
	 * @generated
	 */
	int SPECIFIC_STEP = 1;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__MSEOCCURRENCE = TracePackage.STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__ENDING_STATE = TracePackage.STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__STARTING_STATE = TracePackage.STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Specific Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP_FEATURE_COUNT = TracePackage.STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Specific Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP_OPERATION_COUNT = TracePackage.STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.VideoGen_Alternatives_ExecuteImpl <em>Video Gen Alternatives Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.VideoGen_Alternatives_ExecuteImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Alternatives_Execute()
	 * @generated
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE = 2;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Video Gen Alternatives Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE___GET_CALLER = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Alternatives Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.VideoGen_Alternatives_Execute_AbstractSubStep <em>Video Gen Alternatives Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.VideoGen_Alternatives_Execute_AbstractSubStep
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Alternatives_Execute_AbstractSubStep()
	 * @generated
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP = 3;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Video Gen Alternatives Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Alternatives Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.VideoGen_Alternatives_Execute_ImplicitStepImpl <em>Video Gen Alternatives Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.VideoGen_Alternatives_Execute_ImplicitStepImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Alternatives_Execute_ImplicitStep()
	 * @generated
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE_IMPLICIT_STEP = 4;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE_IMPLICIT_STEP__MSEOCCURRENCE = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE_IMPLICIT_STEP__ENDING_STATE = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE_IMPLICIT_STEP__STARTING_STATE = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Video Gen Alternatives Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Alternatives Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_ALTERNATIVES_EXECUTE_IMPLICIT_STEP_OPERATION_COUNT = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.VideoGen_Generate_ExecuteImpl <em>Video Gen Generate Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.VideoGen_Generate_ExecuteImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Generate_Execute()
	 * @generated
	 */
	int VIDEO_GEN_GENERATE_EXECUTE = 5;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE__MSEOCCURRENCE = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE__ENDING_STATE = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE__STARTING_STATE = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE__SUB_STEPS = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Video Gen Generate Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE_FEATURE_COUNT = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE___GET_CALLER = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Generate Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE_OPERATION_COUNT = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.VideoGen_Generate_Execute_AbstractSubStep <em>Video Gen Generate Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.VideoGen_Generate_Execute_AbstractSubStep
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Generate_Execute_AbstractSubStep()
	 * @generated
	 */
	int VIDEO_GEN_GENERATE_EXECUTE_ABSTRACT_SUB_STEP = 6;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Video Gen Generate Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Generate Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.VideoGen_Generate_Execute_ImplicitStepImpl <em>Video Gen Generate Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.VideoGen_Generate_Execute_ImplicitStepImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Generate_Execute_ImplicitStep()
	 * @generated
	 */
	int VIDEO_GEN_GENERATE_EXECUTE_IMPLICIT_STEP = 7;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE_IMPLICIT_STEP__MSEOCCURRENCE = VIDEO_GEN_GENERATE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE_IMPLICIT_STEP__ENDING_STATE = VIDEO_GEN_GENERATE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE_IMPLICIT_STEP__STARTING_STATE = VIDEO_GEN_GENERATE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Video Gen Generate Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = VIDEO_GEN_GENERATE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Generate Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_GENERATE_EXECUTE_IMPLICIT_STEP_OPERATION_COUNT = VIDEO_GEN_GENERATE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE__MSEOCCURRENCE = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE__ENDING_STATE = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE__STARTING_STATE = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE__SUB_STEPS = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Video Gen Initialize Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE_FEATURE_COUNT = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE___GET_CALLER = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Initialize Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE_OPERATION_COUNT = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.VideoGen_Initialize_Execute_AbstractSubStep <em>Video Gen Initialize Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.VideoGen_Initialize_Execute_AbstractSubStep
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Initialize_Execute_AbstractSubStep()
	 * @generated
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE_ABSTRACT_SUB_STEP = 9;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Video Gen Initialize Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Initialize Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.VideoGen_Initialize_Execute_ImplicitStepImpl <em>Video Gen Initialize Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.VideoGen_Initialize_Execute_ImplicitStepImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Initialize_Execute_ImplicitStep()
	 * @generated
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE_IMPLICIT_STEP = 10;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE_IMPLICIT_STEP__MSEOCCURRENCE = VIDEO_GEN_INITIALIZE_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE_IMPLICIT_STEP__ENDING_STATE = VIDEO_GEN_INITIALIZE_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE_IMPLICIT_STEP__STARTING_STATE = VIDEO_GEN_INITIALIZE_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Video Gen Initialize Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = VIDEO_GEN_INITIALIZE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Initialize Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_INITIALIZE_EXECUTE_IMPLICIT_STEP_OPERATION_COUNT = VIDEO_GEN_INITIALIZE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.VideoGen_Mandatory_ExecuteImpl <em>Video Gen Mandatory Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.VideoGen_Mandatory_ExecuteImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Mandatory_Execute()
	 * @generated
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE = 11;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE__MSEOCCURRENCE = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE__ENDING_STATE = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE__STARTING_STATE = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE__SUB_STEPS = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Video Gen Mandatory Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE_FEATURE_COUNT = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE___GET_CALLER = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Mandatory Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE_OPERATION_COUNT = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.VideoGen_Mandatory_Execute_AbstractSubStep <em>Video Gen Mandatory Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.VideoGen_Mandatory_Execute_AbstractSubStep
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Mandatory_Execute_AbstractSubStep()
	 * @generated
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE_ABSTRACT_SUB_STEP = 12;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Video Gen Mandatory Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Mandatory Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.VideoGen_Mandatory_Execute_ImplicitStepImpl <em>Video Gen Mandatory Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.VideoGen_Mandatory_Execute_ImplicitStepImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Mandatory_Execute_ImplicitStep()
	 * @generated
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE_IMPLICIT_STEP = 13;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE_IMPLICIT_STEP__MSEOCCURRENCE = VIDEO_GEN_MANDATORY_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE_IMPLICIT_STEP__ENDING_STATE = VIDEO_GEN_MANDATORY_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE_IMPLICIT_STEP__STARTING_STATE = VIDEO_GEN_MANDATORY_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Video Gen Mandatory Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = VIDEO_GEN_MANDATORY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Mandatory Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_MANDATORY_EXECUTE_IMPLICIT_STEP_OPERATION_COUNT = VIDEO_GEN_MANDATORY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.VideoGen_Optional_ExecuteImpl <em>Video Gen Optional Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.VideoGen_Optional_ExecuteImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Optional_Execute()
	 * @generated
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE = 14;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE__MSEOCCURRENCE = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE__ENDING_STATE = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE__STARTING_STATE = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE__SUB_STEPS = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Video Gen Optional Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE_FEATURE_COUNT = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE___GET_CALLER = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Optional Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE_OPERATION_COUNT = VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.VideoGen_Optional_Execute_AbstractSubStep <em>Video Gen Optional Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.VideoGen_Optional_Execute_AbstractSubStep
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Optional_Execute_AbstractSubStep()
	 * @generated
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE_ABSTRACT_SUB_STEP = 15;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Video Gen Optional Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Optional Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.VideoGen_Optional_Execute_ImplicitStepImpl <em>Video Gen Optional Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.VideoGen_Optional_Execute_ImplicitStepImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Optional_Execute_ImplicitStep()
	 * @generated
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE_IMPLICIT_STEP = 16;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE_IMPLICIT_STEP__MSEOCCURRENCE = VIDEO_GEN_OPTIONAL_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE_IMPLICIT_STEP__ENDING_STATE = VIDEO_GEN_OPTIONAL_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE_IMPLICIT_STEP__STARTING_STATE = VIDEO_GEN_OPTIONAL_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Video Gen Optional Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = VIDEO_GEN_OPTIONAL_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Optional Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_OPTIONAL_EXECUTE_IMPLICIT_STEP_OPERATION_COUNT = VIDEO_GEN_OPTIONAL_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.VideoGen_VideoGen_SetupImpl <em>Video Gen Video Gen Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.VideoGen_VideoGen_SetupImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_VideoGen_Setup()
	 * @generated
	 */
	int VIDEO_GEN_VIDEO_GEN_SETUP = 17;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_GEN_SETUP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_GEN_SETUP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_GEN_SETUP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_GEN_SETUP__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Video Gen Video Gen Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_GEN_SETUP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_GEN_SETUP___GET_CALLER = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Video Gen Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_GEN_SETUP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.VideoGen_VideoGen_Setup_AbstractSubStep <em>Video Gen Video Gen Setup Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.VideoGen_VideoGen_Setup_AbstractSubStep
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_VideoGen_Setup_AbstractSubStep()
	 * @generated
	 */
	int VIDEO_GEN_VIDEO_GEN_SETUP_ABSTRACT_SUB_STEP = 18;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_GEN_SETUP_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_GEN_SETUP_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_GEN_SETUP_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Video Gen Video Gen Setup Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_GEN_SETUP_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Video Gen Setup Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_GEN_SETUP_ABSTRACT_SUB_STEP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.VideoGen_VideoGen_Setup_ImplicitStepImpl <em>Video Gen Video Gen Setup Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.VideoGen_VideoGen_Setup_ImplicitStepImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_VideoGen_Setup_ImplicitStep()
	 * @generated
	 */
	int VIDEO_GEN_VIDEO_GEN_SETUP_IMPLICIT_STEP = 19;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_GEN_SETUP_IMPLICIT_STEP__MSEOCCURRENCE = VIDEO_GEN_VIDEO_GEN_SETUP_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_GEN_SETUP_IMPLICIT_STEP__ENDING_STATE = VIDEO_GEN_VIDEO_GEN_SETUP_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_GEN_SETUP_IMPLICIT_STEP__STARTING_STATE = VIDEO_GEN_VIDEO_GEN_SETUP_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Video Gen Video Gen Setup Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_GEN_SETUP_IMPLICIT_STEP_FEATURE_COUNT = VIDEO_GEN_VIDEO_GEN_SETUP_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Video Gen Setup Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_GEN_SETUP_IMPLICIT_STEP_OPERATION_COUNT = VIDEO_GEN_VIDEO_GEN_SETUP_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.Steps.impl.VideoGen_Video_SetupImpl <em>Video Gen Video Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.Steps.impl.VideoGen_Video_SetupImpl
	 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Video_Setup()
	 * @generated
	 */
	int VIDEO_GEN_VIDEO_SETUP = 20;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_SETUP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_SETUP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_SETUP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Video Gen Video Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_SETUP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_SETUP___GET_CALLER = SPECIFIC_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Gen Video Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_VIDEO_SETUP_OPERATION_COUNT = SPECIFIC_STEP_OPERATION_COUNT + 1;


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
	 * Returns the meta object for class '{@link videoGenTrace.Steps.SpecificStep <em>Specific Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Step</em>'.
	 * @see videoGenTrace.Steps.SpecificStep
	 * @generated
	 */
	EClass getSpecificStep();

	/**
	 * Returns the meta object for the reference '{@link videoGenTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ending State</em>'.
	 * @see videoGenTrace.Steps.SpecificStep#getEndingState()
	 * @see #getSpecificStep()
	 * @generated
	 */
	EReference getSpecificStep_EndingState();

	/**
	 * Returns the meta object for the reference '{@link videoGenTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starting State</em>'.
	 * @see videoGenTrace.Steps.SpecificStep#getStartingState()
	 * @see #getSpecificStep()
	 * @generated
	 */
	EReference getSpecificStep_StartingState();

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
	 * Returns the meta object for class '{@link videoGenTrace.Steps.VideoGen_Alternatives_Execute_AbstractSubStep <em>Video Gen Alternatives Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen Alternatives Execute Abstract Sub Step</em>'.
	 * @see videoGenTrace.Steps.VideoGen_Alternatives_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getVideoGen_Alternatives_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.Steps.VideoGen_Alternatives_Execute_ImplicitStep <em>Video Gen Alternatives Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen Alternatives Execute Implicit Step</em>'.
	 * @see videoGenTrace.Steps.VideoGen_Alternatives_Execute_ImplicitStep
	 * @generated
	 */
	EClass getVideoGen_Alternatives_Execute_ImplicitStep();

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
	 * Returns the meta object for class '{@link videoGenTrace.Steps.VideoGen_Generate_Execute_AbstractSubStep <em>Video Gen Generate Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen Generate Execute Abstract Sub Step</em>'.
	 * @see videoGenTrace.Steps.VideoGen_Generate_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getVideoGen_Generate_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.Steps.VideoGen_Generate_Execute_ImplicitStep <em>Video Gen Generate Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen Generate Execute Implicit Step</em>'.
	 * @see videoGenTrace.Steps.VideoGen_Generate_Execute_ImplicitStep
	 * @generated
	 */
	EClass getVideoGen_Generate_Execute_ImplicitStep();

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
	 * Returns the meta object for class '{@link videoGenTrace.Steps.VideoGen_Initialize_Execute_AbstractSubStep <em>Video Gen Initialize Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen Initialize Execute Abstract Sub Step</em>'.
	 * @see videoGenTrace.Steps.VideoGen_Initialize_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getVideoGen_Initialize_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.Steps.VideoGen_Initialize_Execute_ImplicitStep <em>Video Gen Initialize Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen Initialize Execute Implicit Step</em>'.
	 * @see videoGenTrace.Steps.VideoGen_Initialize_Execute_ImplicitStep
	 * @generated
	 */
	EClass getVideoGen_Initialize_Execute_ImplicitStep();

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
	 * Returns the meta object for class '{@link videoGenTrace.Steps.VideoGen_Mandatory_Execute_AbstractSubStep <em>Video Gen Mandatory Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen Mandatory Execute Abstract Sub Step</em>'.
	 * @see videoGenTrace.Steps.VideoGen_Mandatory_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getVideoGen_Mandatory_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.Steps.VideoGen_Mandatory_Execute_ImplicitStep <em>Video Gen Mandatory Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen Mandatory Execute Implicit Step</em>'.
	 * @see videoGenTrace.Steps.VideoGen_Mandatory_Execute_ImplicitStep
	 * @generated
	 */
	EClass getVideoGen_Mandatory_Execute_ImplicitStep();

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
	 * Returns the meta object for class '{@link videoGenTrace.Steps.VideoGen_Optional_Execute_AbstractSubStep <em>Video Gen Optional Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen Optional Execute Abstract Sub Step</em>'.
	 * @see videoGenTrace.Steps.VideoGen_Optional_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getVideoGen_Optional_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.Steps.VideoGen_Optional_Execute_ImplicitStep <em>Video Gen Optional Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen Optional Execute Implicit Step</em>'.
	 * @see videoGenTrace.Steps.VideoGen_Optional_Execute_ImplicitStep
	 * @generated
	 */
	EClass getVideoGen_Optional_Execute_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.Steps.VideoGen_VideoGen_Setup <em>Video Gen Video Gen Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen Video Gen Setup</em>'.
	 * @see videoGenTrace.Steps.VideoGen_VideoGen_Setup
	 * @generated
	 */
	EClass getVideoGen_VideoGen_Setup();

	/**
	 * Returns the meta object for the '{@link videoGenTrace.Steps.VideoGen_VideoGen_Setup#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see videoGenTrace.Steps.VideoGen_VideoGen_Setup#getCaller()
	 * @generated
	 */
	EOperation getVideoGen_VideoGen_Setup__GetCaller();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.Steps.VideoGen_VideoGen_Setup_AbstractSubStep <em>Video Gen Video Gen Setup Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen Video Gen Setup Abstract Sub Step</em>'.
	 * @see videoGenTrace.Steps.VideoGen_VideoGen_Setup_AbstractSubStep
	 * @generated
	 */
	EClass getVideoGen_VideoGen_Setup_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.Steps.VideoGen_VideoGen_Setup_ImplicitStep <em>Video Gen Video Gen Setup Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen Video Gen Setup Implicit Step</em>'.
	 * @see videoGenTrace.Steps.VideoGen_VideoGen_Setup_ImplicitStep
	 * @generated
	 */
	EClass getVideoGen_VideoGen_Setup_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.Steps.VideoGen_Video_Setup <em>Video Gen Video Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen Video Setup</em>'.
	 * @see videoGenTrace.Steps.VideoGen_Video_Setup
	 * @generated
	 */
	EClass getVideoGen_Video_Setup();

	/**
	 * Returns the meta object for the '{@link videoGenTrace.Steps.VideoGen_Video_Setup#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see videoGenTrace.Steps.VideoGen_Video_Setup#getCaller()
	 * @generated
	 */
	EOperation getVideoGen_Video_Setup__GetCaller();

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
		 * The meta object literal for the '{@link videoGenTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.impl.RootImplicitStepImpl
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
		 * @generated
		 */
		EClass ROOT_IMPLICIT_STEP = eINSTANCE.getRootImplicitStep();

		/**
		 * The meta object literal for the '{@link videoGenTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.SpecificStep
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
		 * @generated
		 */
		EClass SPECIFIC_STEP = eINSTANCE.getSpecificStep();

		/**
		 * The meta object literal for the '<em><b>Ending State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_STEP__ENDING_STATE = eINSTANCE.getSpecificStep_EndingState();

		/**
		 * The meta object literal for the '<em><b>Starting State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_STEP__STARTING_STATE = eINSTANCE.getSpecificStep_StartingState();

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
		 * The meta object literal for the '{@link videoGenTrace.Steps.VideoGen_Alternatives_Execute_AbstractSubStep <em>Video Gen Alternatives Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.VideoGen_Alternatives_Execute_AbstractSubStep
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Alternatives_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getVideoGen_Alternatives_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link videoGenTrace.Steps.impl.VideoGen_Alternatives_Execute_ImplicitStepImpl <em>Video Gen Alternatives Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.impl.VideoGen_Alternatives_Execute_ImplicitStepImpl
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Alternatives_Execute_ImplicitStep()
		 * @generated
		 */
		EClass VIDEO_GEN_ALTERNATIVES_EXECUTE_IMPLICIT_STEP = eINSTANCE.getVideoGen_Alternatives_Execute_ImplicitStep();

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
		 * The meta object literal for the '{@link videoGenTrace.Steps.VideoGen_Generate_Execute_AbstractSubStep <em>Video Gen Generate Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.VideoGen_Generate_Execute_AbstractSubStep
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Generate_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass VIDEO_GEN_GENERATE_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getVideoGen_Generate_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link videoGenTrace.Steps.impl.VideoGen_Generate_Execute_ImplicitStepImpl <em>Video Gen Generate Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.impl.VideoGen_Generate_Execute_ImplicitStepImpl
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Generate_Execute_ImplicitStep()
		 * @generated
		 */
		EClass VIDEO_GEN_GENERATE_EXECUTE_IMPLICIT_STEP = eINSTANCE.getVideoGen_Generate_Execute_ImplicitStep();

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
		 * The meta object literal for the '{@link videoGenTrace.Steps.VideoGen_Initialize_Execute_AbstractSubStep <em>Video Gen Initialize Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.VideoGen_Initialize_Execute_AbstractSubStep
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Initialize_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass VIDEO_GEN_INITIALIZE_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getVideoGen_Initialize_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link videoGenTrace.Steps.impl.VideoGen_Initialize_Execute_ImplicitStepImpl <em>Video Gen Initialize Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.impl.VideoGen_Initialize_Execute_ImplicitStepImpl
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Initialize_Execute_ImplicitStep()
		 * @generated
		 */
		EClass VIDEO_GEN_INITIALIZE_EXECUTE_IMPLICIT_STEP = eINSTANCE.getVideoGen_Initialize_Execute_ImplicitStep();

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
		 * The meta object literal for the '{@link videoGenTrace.Steps.VideoGen_Mandatory_Execute_AbstractSubStep <em>Video Gen Mandatory Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.VideoGen_Mandatory_Execute_AbstractSubStep
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Mandatory_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass VIDEO_GEN_MANDATORY_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getVideoGen_Mandatory_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link videoGenTrace.Steps.impl.VideoGen_Mandatory_Execute_ImplicitStepImpl <em>Video Gen Mandatory Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.impl.VideoGen_Mandatory_Execute_ImplicitStepImpl
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Mandatory_Execute_ImplicitStep()
		 * @generated
		 */
		EClass VIDEO_GEN_MANDATORY_EXECUTE_IMPLICIT_STEP = eINSTANCE.getVideoGen_Mandatory_Execute_ImplicitStep();

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
		 * The meta object literal for the '{@link videoGenTrace.Steps.VideoGen_Optional_Execute_AbstractSubStep <em>Video Gen Optional Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.VideoGen_Optional_Execute_AbstractSubStep
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Optional_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass VIDEO_GEN_OPTIONAL_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getVideoGen_Optional_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link videoGenTrace.Steps.impl.VideoGen_Optional_Execute_ImplicitStepImpl <em>Video Gen Optional Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.impl.VideoGen_Optional_Execute_ImplicitStepImpl
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Optional_Execute_ImplicitStep()
		 * @generated
		 */
		EClass VIDEO_GEN_OPTIONAL_EXECUTE_IMPLICIT_STEP = eINSTANCE.getVideoGen_Optional_Execute_ImplicitStep();

		/**
		 * The meta object literal for the '{@link videoGenTrace.Steps.impl.VideoGen_VideoGen_SetupImpl <em>Video Gen Video Gen Setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.impl.VideoGen_VideoGen_SetupImpl
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_VideoGen_Setup()
		 * @generated
		 */
		EClass VIDEO_GEN_VIDEO_GEN_SETUP = eINSTANCE.getVideoGen_VideoGen_Setup();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIDEO_GEN_VIDEO_GEN_SETUP___GET_CALLER = eINSTANCE.getVideoGen_VideoGen_Setup__GetCaller();

		/**
		 * The meta object literal for the '{@link videoGenTrace.Steps.VideoGen_VideoGen_Setup_AbstractSubStep <em>Video Gen Video Gen Setup Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.VideoGen_VideoGen_Setup_AbstractSubStep
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_VideoGen_Setup_AbstractSubStep()
		 * @generated
		 */
		EClass VIDEO_GEN_VIDEO_GEN_SETUP_ABSTRACT_SUB_STEP = eINSTANCE.getVideoGen_VideoGen_Setup_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link videoGenTrace.Steps.impl.VideoGen_VideoGen_Setup_ImplicitStepImpl <em>Video Gen Video Gen Setup Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.impl.VideoGen_VideoGen_Setup_ImplicitStepImpl
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_VideoGen_Setup_ImplicitStep()
		 * @generated
		 */
		EClass VIDEO_GEN_VIDEO_GEN_SETUP_IMPLICIT_STEP = eINSTANCE.getVideoGen_VideoGen_Setup_ImplicitStep();

		/**
		 * The meta object literal for the '{@link videoGenTrace.Steps.impl.VideoGen_Video_SetupImpl <em>Video Gen Video Setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.Steps.impl.VideoGen_Video_SetupImpl
		 * @see videoGenTrace.Steps.impl.StepsPackageImpl#getVideoGen_Video_Setup()
		 * @generated
		 */
		EClass VIDEO_GEN_VIDEO_SETUP = eINSTANCE.getVideoGen_Video_Setup();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIDEO_GEN_VIDEO_SETUP___GET_CALLER = eINSTANCE.getVideoGen_Video_Setup__GetCaller();

	}

} //StepsPackage
