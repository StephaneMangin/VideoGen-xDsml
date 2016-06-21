/**
 */
package videoGenTrace;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

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
	int SPECIFIC_TRACE__ROOT_STEP = TracePackage.TRACE__ROOT_STEP;

	/**
	 * The feature id for the '<em><b>Launchconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LAUNCHCONFIGURATION = TracePackage.TRACE__LAUNCHCONFIGURATION;

	/**
	 * The feature id for the '<em><b>Video Gen Alternatives Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_ALTERNATIVES_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Video Gen Generate Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_GENERATE_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Video Gen Initialize Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_INITIALIZE_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Video Gen Mandatory Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_MANDATORY_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Video Gen Optional Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_OPTIONAL_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Video Gen Transition Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_TRANSITION_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Video Gen Transition Finish Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_TRANSITION_FINISH_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Video Gen Video Gen Compute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_COMPUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Video Gen Video Gen Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Video Gen Video Gen Initialize Model Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_INITIALIZE_MODEL_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Video Gen Video Gen Setup Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_SETUP_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Video Gen Video Gen Solve Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_SOLVE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Video Gen Video Setup Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_VIDEO_SETUP_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>States Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__STATES_TRACE = TracePackage.TRACE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Video Gen traced Alternativess</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_TRACED_ALTERNATIVESS = TracePackage.TRACE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Video Gen traced Delays</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_TRACED_DELAYS = TracePackage.TRACE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Video Gen traced Generates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_TRACED_GENERATES = TracePackage.TRACE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Video Gen traced Initializes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_TRACED_INITIALIZES = TracePackage.TRACE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Video Gen traced Mandatorys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_TRACED_MANDATORYS = TracePackage.TRACE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Video Gen traced Optionals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_TRACED_OPTIONALS = TracePackage.TRACE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Video Gen traced Video Gens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_TRACED_VIDEO_GENS = TracePackage.TRACE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Video Gen traced Videos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__VIDEO_GEN_TRACED_VIDEOS = TracePackage.TRACE_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Specific Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE_FEATURE_COUNT = TracePackage.TRACE_FEATURE_COUNT + 22;

	/**
	 * The number of operations of the '<em>Specific Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE_OPERATION_COUNT = TracePackage.TRACE_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the reference list '{@link videoGenTrace.SpecificTrace#getVideoGen_Transition_FinishExecute_Sequence <em>Video Gen Transition Finish Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Transition Finish Execute Sequence</em>'.
	 * @see videoGenTrace.SpecificTrace#getVideoGen_Transition_FinishExecute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_VideoGen_Transition_FinishExecute_Sequence();

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
	 * Returns the meta object for the reference list '{@link videoGenTrace.SpecificTrace#getVideoGen_VideoGen_Solve_Sequence <em>Video Gen Video Gen Solve Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Video Gen Solve Sequence</em>'.
	 * @see videoGenTrace.SpecificTrace#getVideoGen_VideoGen_Solve_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_VideoGen_VideoGen_Solve_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.SpecificTrace#getVideoGen_Video_Setup_Sequence <em>Video Gen Video Setup Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Video Gen Video Setup Sequence</em>'.
	 * @see videoGenTrace.SpecificTrace#getVideoGen_Video_Setup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_VideoGen_Video_Setup_Sequence();

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
	 * Returns the meta object for the containment reference list '{@link videoGenTrace.SpecificTrace#getVideoGen_tracedAlternativess <em>Video Gen traced Alternativess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Video Gen traced Alternativess</em>'.
	 * @see videoGenTrace.SpecificTrace#getVideoGen_tracedAlternativess()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_VideoGen_tracedAlternativess();

	/**
	 * Returns the meta object for the containment reference list '{@link videoGenTrace.SpecificTrace#getVideoGen_tracedDelays <em>Video Gen traced Delays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Video Gen traced Delays</em>'.
	 * @see videoGenTrace.SpecificTrace#getVideoGen_tracedDelays()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_VideoGen_tracedDelays();

	/**
	 * Returns the meta object for the containment reference list '{@link videoGenTrace.SpecificTrace#getVideoGen_tracedGenerates <em>Video Gen traced Generates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Video Gen traced Generates</em>'.
	 * @see videoGenTrace.SpecificTrace#getVideoGen_tracedGenerates()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_VideoGen_tracedGenerates();

	/**
	 * Returns the meta object for the containment reference list '{@link videoGenTrace.SpecificTrace#getVideoGen_tracedInitializes <em>Video Gen traced Initializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Video Gen traced Initializes</em>'.
	 * @see videoGenTrace.SpecificTrace#getVideoGen_tracedInitializes()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_VideoGen_tracedInitializes();

	/**
	 * Returns the meta object for the containment reference list '{@link videoGenTrace.SpecificTrace#getVideoGen_tracedMandatorys <em>Video Gen traced Mandatorys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Video Gen traced Mandatorys</em>'.
	 * @see videoGenTrace.SpecificTrace#getVideoGen_tracedMandatorys()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_VideoGen_tracedMandatorys();

	/**
	 * Returns the meta object for the containment reference list '{@link videoGenTrace.SpecificTrace#getVideoGen_tracedOptionals <em>Video Gen traced Optionals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Video Gen traced Optionals</em>'.
	 * @see videoGenTrace.SpecificTrace#getVideoGen_tracedOptionals()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_VideoGen_tracedOptionals();

	/**
	 * Returns the meta object for the containment reference list '{@link videoGenTrace.SpecificTrace#getVideoGen_tracedVideoGens <em>Video Gen traced Video Gens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Video Gen traced Video Gens</em>'.
	 * @see videoGenTrace.SpecificTrace#getVideoGen_tracedVideoGens()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_VideoGen_tracedVideoGens();

	/**
	 * Returns the meta object for the containment reference list '{@link videoGenTrace.SpecificTrace#getVideoGen_tracedVideos <em>Video Gen traced Videos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Video Gen traced Videos</em>'.
	 * @see videoGenTrace.SpecificTrace#getVideoGen_tracedVideos()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_VideoGen_tracedVideos();

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
		 * The meta object literal for the '<em><b>Video Gen Transition Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__VIDEO_GEN_TRANSITION_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_VideoGen_Transition_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Video Gen Transition Finish Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__VIDEO_GEN_TRANSITION_FINISH_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_VideoGen_Transition_FinishExecute_Sequence();

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
		 * The meta object literal for the '<em><b>Video Gen Video Gen Solve Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_SOLVE_SEQUENCE = eINSTANCE.getSpecificTrace_VideoGen_VideoGen_Solve_Sequence();

		/**
		 * The meta object literal for the '<em><b>Video Gen Video Setup Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__VIDEO_GEN_VIDEO_SETUP_SEQUENCE = eINSTANCE.getSpecificTrace_VideoGen_Video_Setup_Sequence();

		/**
		 * The meta object literal for the '<em><b>States Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__STATES_TRACE = eINSTANCE.getSpecificTrace_StatesTrace();

		/**
		 * The meta object literal for the '<em><b>Video Gen traced Alternativess</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__VIDEO_GEN_TRACED_ALTERNATIVESS = eINSTANCE.getSpecificTrace_VideoGen_tracedAlternativess();

		/**
		 * The meta object literal for the '<em><b>Video Gen traced Delays</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__VIDEO_GEN_TRACED_DELAYS = eINSTANCE.getSpecificTrace_VideoGen_tracedDelays();

		/**
		 * The meta object literal for the '<em><b>Video Gen traced Generates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__VIDEO_GEN_TRACED_GENERATES = eINSTANCE.getSpecificTrace_VideoGen_tracedGenerates();

		/**
		 * The meta object literal for the '<em><b>Video Gen traced Initializes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__VIDEO_GEN_TRACED_INITIALIZES = eINSTANCE.getSpecificTrace_VideoGen_tracedInitializes();

		/**
		 * The meta object literal for the '<em><b>Video Gen traced Mandatorys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__VIDEO_GEN_TRACED_MANDATORYS = eINSTANCE.getSpecificTrace_VideoGen_tracedMandatorys();

		/**
		 * The meta object literal for the '<em><b>Video Gen traced Optionals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__VIDEO_GEN_TRACED_OPTIONALS = eINSTANCE.getSpecificTrace_VideoGen_tracedOptionals();

		/**
		 * The meta object literal for the '<em><b>Video Gen traced Video Gens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__VIDEO_GEN_TRACED_VIDEO_GENS = eINSTANCE.getSpecificTrace_VideoGen_tracedVideoGens();

		/**
		 * The meta object literal for the '<em><b>Video Gen traced Videos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__VIDEO_GEN_TRACED_VIDEOS = eINSTANCE.getSpecificTrace_VideoGen_tracedVideos();

	}

} //VideoGenTracePackage
