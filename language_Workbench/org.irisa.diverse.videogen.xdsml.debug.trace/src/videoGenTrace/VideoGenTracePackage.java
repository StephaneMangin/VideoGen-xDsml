/**
 */
package videoGenTrace;

import org.eclipse.emf.ecore.EClass;
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
	 * The meta object id for the '{@link videoGenTrace.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.impl.TraceImpl
	 * @see videoGenTrace.impl.VideoGenTracePackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 0;

	/**
	 * The feature id for the '<em><b>Video Gen Alternatives Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__VIDEO_GEN_ALTERNATIVES_EXECUTE_SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Video Gen Delay Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__VIDEO_GEN_DELAY_EXECUTE_SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Video Gen Generate Compute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__VIDEO_GEN_GENERATE_COMPUTE_SEQUENCE = 2;

	/**
	 * The feature id for the '<em><b>Video Gen Generate Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__VIDEO_GEN_GENERATE_EXECUTE_SEQUENCE = 3;

	/**
	 * The feature id for the '<em><b>Video Gen Initialize Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__VIDEO_GEN_INITIALIZE_EXECUTE_SEQUENCE = 4;

	/**
	 * The feature id for the '<em><b>Video Gen Mandatory Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__VIDEO_GEN_MANDATORY_EXECUTE_SEQUENCE = 5;

	/**
	 * The feature id for the '<em><b>Video Gen Optional Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__VIDEO_GEN_OPTIONAL_EXECUTE_SEQUENCE = 6;

	/**
	 * The feature id for the '<em><b>Video Gen Sequence Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__VIDEO_GEN_SEQUENCE_EXECUTE_SEQUENCE = 7;

	/**
	 * The feature id for the '<em><b>Video Gen Transition Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__VIDEO_GEN_TRANSITION_EXECUTE_SEQUENCE = 8;

	/**
	 * The feature id for the '<em><b>Video Gen Video Select Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__VIDEO_GEN_VIDEO_SELECT_SEQUENCE = 9;

	/**
	 * The feature id for the '<em><b>Root Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ROOT_STEPS = 10;

	/**
	 * The feature id for the '<em><b>States Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__STATES_TRACE = 11;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link videoGenTrace.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see videoGenTrace.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.Trace#getVideoGen_Alternatives_Execute_Sequence <em>Video Gen Alternatives Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Alternatives Execute Sequence</em>'.
	 * @see videoGenTrace.Trace#getVideoGen_Alternatives_Execute_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_VideoGen_Alternatives_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.Trace#getVideoGen_Delay_Execute_Sequence <em>Video Gen Delay Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Delay Execute Sequence</em>'.
	 * @see videoGenTrace.Trace#getVideoGen_Delay_Execute_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_VideoGen_Delay_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.Trace#getVideoGen_Generate_Compute_Sequence <em>Video Gen Generate Compute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Generate Compute Sequence</em>'.
	 * @see videoGenTrace.Trace#getVideoGen_Generate_Compute_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_VideoGen_Generate_Compute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.Trace#getVideoGen_Generate_Execute_Sequence <em>Video Gen Generate Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Generate Execute Sequence</em>'.
	 * @see videoGenTrace.Trace#getVideoGen_Generate_Execute_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_VideoGen_Generate_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.Trace#getVideoGen_Initialize_Execute_Sequence <em>Video Gen Initialize Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Initialize Execute Sequence</em>'.
	 * @see videoGenTrace.Trace#getVideoGen_Initialize_Execute_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_VideoGen_Initialize_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.Trace#getVideoGen_Mandatory_Execute_Sequence <em>Video Gen Mandatory Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Mandatory Execute Sequence</em>'.
	 * @see videoGenTrace.Trace#getVideoGen_Mandatory_Execute_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_VideoGen_Mandatory_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.Trace#getVideoGen_Optional_Execute_Sequence <em>Video Gen Optional Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Optional Execute Sequence</em>'.
	 * @see videoGenTrace.Trace#getVideoGen_Optional_Execute_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_VideoGen_Optional_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.Trace#getVideoGen_Sequence_Execute_Sequence <em>Video Gen Sequence Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Sequence Execute Sequence</em>'.
	 * @see videoGenTrace.Trace#getVideoGen_Sequence_Execute_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_VideoGen_Sequence_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.Trace#getVideoGen_Transition_Execute_Sequence <em>Video Gen Transition Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Transition Execute Sequence</em>'.
	 * @see videoGenTrace.Trace#getVideoGen_Transition_Execute_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_VideoGen_Transition_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.Trace#getVideoGen_Video_Select_Sequence <em>Video Gen Video Select Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Video Select Sequence</em>'.
	 * @see videoGenTrace.Trace#getVideoGen_Video_Select_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_VideoGen_Video_Select_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link videoGenTrace.Trace#getRootSteps <em>Root Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Steps</em>'.
	 * @see videoGenTrace.Trace#getRootSteps()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_RootSteps();

	/**
	 * Returns the meta object for the containment reference list '{@link videoGenTrace.Trace#getStatesTrace <em>States Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States Trace</em>'.
	 * @see videoGenTrace.Trace#getStatesTrace()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_StatesTrace();

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
		 * The meta object literal for the '{@link videoGenTrace.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.impl.TraceImpl
		 * @see videoGenTrace.impl.VideoGenTracePackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Video Gen Alternatives Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__VIDEO_GEN_ALTERNATIVES_EXECUTE_SEQUENCE = eINSTANCE.getTrace_VideoGen_Alternatives_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Video Gen Delay Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__VIDEO_GEN_DELAY_EXECUTE_SEQUENCE = eINSTANCE.getTrace_VideoGen_Delay_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Video Gen Generate Compute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__VIDEO_GEN_GENERATE_COMPUTE_SEQUENCE = eINSTANCE.getTrace_VideoGen_Generate_Compute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Video Gen Generate Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__VIDEO_GEN_GENERATE_EXECUTE_SEQUENCE = eINSTANCE.getTrace_VideoGen_Generate_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Video Gen Initialize Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__VIDEO_GEN_INITIALIZE_EXECUTE_SEQUENCE = eINSTANCE.getTrace_VideoGen_Initialize_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Video Gen Mandatory Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__VIDEO_GEN_MANDATORY_EXECUTE_SEQUENCE = eINSTANCE.getTrace_VideoGen_Mandatory_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Video Gen Optional Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__VIDEO_GEN_OPTIONAL_EXECUTE_SEQUENCE = eINSTANCE.getTrace_VideoGen_Optional_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Video Gen Sequence Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__VIDEO_GEN_SEQUENCE_EXECUTE_SEQUENCE = eINSTANCE.getTrace_VideoGen_Sequence_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Video Gen Transition Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__VIDEO_GEN_TRANSITION_EXECUTE_SEQUENCE = eINSTANCE.getTrace_VideoGen_Transition_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Video Gen Video Select Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__VIDEO_GEN_VIDEO_SELECT_SEQUENCE = eINSTANCE.getTrace_VideoGen_Video_Select_Sequence();

		/**
		 * The meta object literal for the '<em><b>Root Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ROOT_STEPS = eINSTANCE.getTrace_RootSteps();

		/**
		 * The meta object literal for the '<em><b>States Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__STATES_TRACE = eINSTANCE.getTrace_StatesTrace();

	}

} //VideoGenTracePackage
