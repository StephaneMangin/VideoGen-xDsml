/**
 */
package videoGenTrace;

import org.eclipse.emf.ecore.EClass;
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
 * @see videoGenTrace.VideoGenTraceFactory
 * @model kind="package"
 * @generated
 */
public interface VideoGenTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "videoGenTrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "videoGenTrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "videoGenTrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VideoGenTracePackage eINSTANCE = videoGenTrace.impl.VideoGenTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link videoGenTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.impl.SpecificTraceImpl
	 * @see videoGenTrace.impl.VideoGenTracePackageImpl#getSpecificTrace()
	 * @generated
	 */
	int SPECIFIC_TRACE = 0;

	/**
	 * The feature id for the '<em><b>Root Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ROOT_STEP = MsePackage.TRACE__ROOT_STEP;

	/**
	 * The feature id for the '<em><b>Launchconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LAUNCHCONFIGURATION = MsePackage.TRACE__LAUNCHCONFIGURATION;

	/**
	 * The feature id for the '<em><b>Video Gen Alternatives Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_ALTERNATIVES_EXECUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Video Gen Generate Compute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_GENERATE_COMPUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Video Gen Generate Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_GENERATE_EXECUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Video Gen Initialize Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_INITIALIZE_EXECUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Video Gen Mandatory Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_MANDATORY_EXECUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Video Gen Optional Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_OPTIONAL_EXECUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Video Gen Sequence Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_SEQUENCE_EXECUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Video Gen Transition Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_TRANSITION_EXECUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Video Gen Video Gen Compute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_COMPUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Video Gen Video Gen Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_EXECUTE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Video Gen Video Gen Initialize Model Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_INITIALIZE_MODEL_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Video Gen Video Gen Setup Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_SETUP_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Video Gen Video Select Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_VIDEO_SELECT_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>States Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__STATES_TRACE = MsePackage.TRACE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Specific Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE_FEATURE_COUNT = MsePackage.TRACE_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Specific Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE_OPERATION_COUNT = MsePackage.TRACE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link videoGenTrace.SpecificTrace <em>Specific Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Trace</em>'.
	 * @see videoGenTrace.SpecificTrace
	 * @generated
	 */
	EClass getSpecificTrace();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.SpecificTrace#getVideoGen_Alternatives_Execute_Sequence <em>Video Gen Alternatives Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Alternatives Execute Sequence</em>'.
	 * @see videoGenTrace.SpecificTrace#getVideoGen_Alternatives_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_VideoGen_Alternatives_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.SpecificTrace#getVideoGen_Generate_Compute_Sequence <em>Video Gen Generate Compute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Generate Compute Sequence</em>'.
	 * @see videoGenTrace.SpecificTrace#getVideoGen_Generate_Compute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_VideoGen_Generate_Compute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.SpecificTrace#getVideoGen_Generate_Execute_Sequence <em>Video Gen Generate Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Generate Execute Sequence</em>'.
	 * @see videoGenTrace.SpecificTrace#getVideoGen_Generate_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_VideoGen_Generate_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.SpecificTrace#getVideoGen_Initialize_Execute_Sequence <em>Video Gen Initialize Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Initialize Execute Sequence</em>'.
	 * @see videoGenTrace.SpecificTrace#getVideoGen_Initialize_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_VideoGen_Initialize_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.SpecificTrace#getVideoGen_Mandatory_Execute_Sequence <em>Video Gen Mandatory Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Mandatory Execute Sequence</em>'.
	 * @see videoGenTrace.SpecificTrace#getVideoGen_Mandatory_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_VideoGen_Mandatory_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.SpecificTrace#getVideoGen_Optional_Execute_Sequence <em>Video Gen Optional Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Optional Execute Sequence</em>'.
	 * @see videoGenTrace.SpecificTrace#getVideoGen_Optional_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_VideoGen_Optional_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.SpecificTrace#getVideoGen_Sequence_Execute_Sequence <em>Video Gen Sequence Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Sequence Execute Sequence</em>'.
	 * @see videoGenTrace.SpecificTrace#getVideoGen_Sequence_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_VideoGen_Sequence_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.SpecificTrace#getVideoGen_Transition_Execute_Sequence <em>Video Gen Transition Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Transition Execute Sequence</em>'.
	 * @see videoGenTrace.SpecificTrace#getVideoGen_Transition_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_VideoGen_Transition_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.SpecificTrace#getVideoGen_VideoGen_Compute_Sequence <em>Video Gen Video Gen Compute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Video Gen Compute Sequence</em>'.
	 * @see videoGenTrace.SpecificTrace#getVideoGen_VideoGen_Compute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_VideoGen_VideoGen_Compute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.SpecificTrace#getVideoGen_VideoGen_Execute_Sequence <em>Video Gen Video Gen Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Video Gen Execute Sequence</em>'.
	 * @see videoGenTrace.SpecificTrace#getVideoGen_VideoGen_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_VideoGen_VideoGen_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.SpecificTrace#getVideoGen_VideoGen_InitializeModel_Sequence <em>Video Gen Video Gen Initialize Model Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Video Gen Initialize Model Sequence</em>'.
	 * @see videoGenTrace.SpecificTrace#getVideoGen_VideoGen_InitializeModel_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_VideoGen_VideoGen_InitializeModel_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.SpecificTrace#getVideoGen_VideoGen_Setup_Sequence <em>Video Gen Video Gen Setup Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Video Gen Setup Sequence</em>'.
	 * @see videoGenTrace.SpecificTrace#getVideoGen_VideoGen_Setup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_VideoGen_VideoGen_Setup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.SpecificTrace#getVideoGen_Video_Select_Sequence <em>Video Gen Video Select Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Video Select Sequence</em>'.
	 * @see videoGenTrace.SpecificTrace#getVideoGen_Video_Select_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_VideoGen_Video_Select_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link videoGenTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States Trace</em>'.
	 * @see videoGenTrace.SpecificTrace#getStatesTrace()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_StatesTrace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VideoGenTraceFactory getVideoGenTraceFactory();

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
		 * The meta object literal for the '{@link videoGenTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.impl.SpecificTraceImpl
		 * @see videoGenTrace.impl.VideoGenTracePackageImpl#getSpecificTrace()
		 * @generated
		 */
		EClass SPECIFIC_TRACE = eINSTANCE.getSpecificTrace();

		/**
		 * The meta object literal for the '<em><b>Video Gen Alternatives Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__VIDEO_GEN_ALTERNATIVES_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_VideoGen_Alternatives_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Video Gen Generate Compute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__VIDEO_GEN_GENERATE_COMPUTE_SEQUENCE = eINSTANCE.getSpecificTrace_VideoGen_Generate_Compute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Video Gen Generate Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__VIDEO_GEN_GENERATE_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_VideoGen_Generate_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Video Gen Initialize Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__VIDEO_GEN_INITIALIZE_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_VideoGen_Initialize_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Video Gen Mandatory Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__VIDEO_GEN_MANDATORY_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_VideoGen_Mandatory_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Video Gen Optional Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__VIDEO_GEN_OPTIONAL_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_VideoGen_Optional_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Video Gen Sequence Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__VIDEO_GEN_SEQUENCE_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_VideoGen_Sequence_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Video Gen Transition Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__VIDEO_GEN_TRANSITION_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_VideoGen_Transition_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Video Gen Video Gen Compute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_COMPUTE_SEQUENCE = eINSTANCE.getSpecificTrace_VideoGen_VideoGen_Compute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Video Gen Video Gen Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_VideoGen_VideoGen_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Video Gen Video Gen Initialize Model Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_INITIALIZE_MODEL_SEQUENCE = eINSTANCE.getSpecificTrace_VideoGen_VideoGen_InitializeModel_Sequence();

		/**
		 * The meta object literal for the '<em><b>Video Gen Video Gen Setup Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_SETUP_SEQUENCE = eINSTANCE.getSpecificTrace_VideoGen_VideoGen_Setup_Sequence();

		/**
		 * The meta object literal for the '<em><b>Video Gen Video Select Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__VIDEO_GEN_VIDEO_SELECT_SEQUENCE = eINSTANCE.getSpecificTrace_VideoGen_Video_Select_Sequence();

		/**
		 * The meta object literal for the '<em><b>States Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__STATES_TRACE = eINSTANCE.getSpecificTrace_StatesTrace();

	}

} //VideoGenTracePackage
