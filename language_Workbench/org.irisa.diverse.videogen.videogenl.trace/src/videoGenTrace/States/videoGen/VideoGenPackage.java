/**
 */
package videoGenTrace.States.videoGen;

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
 * @see videoGenTrace.States.videoGen.VideoGenFactory
 * @model kind="package"
 * @generated
 */
public interface VideoGenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "videoGen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "videoGenTrace_videoGen";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VideoGenPackage eINSTANCE = videoGenTrace.States.videoGen.impl.VideoGenPackageImpl.init();

	/**
	 * The meta object id for the '{@link videoGenTrace.States.videoGen.impl.TracedNamedElementImpl <em>Traced Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.States.videoGen.impl.TracedNamedElementImpl
	 * @see videoGenTrace.States.videoGen.impl.VideoGenPackageImpl#getTracedNamedElement()
	 * @generated
	 */
	int TRACED_NAMED_ELEMENT = 5;

	/**
	 * The number of structural features of the '<em>Traced Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NAMED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Traced Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.States.videoGen.impl.TracedTransitionImpl <em>Traced Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.States.videoGen.impl.TracedTransitionImpl
	 * @see videoGenTrace.States.videoGen.impl.VideoGenPackageImpl#getTracedTransition()
	 * @generated
	 */
	int TRACED_TRANSITION = 8;

	/**
	 * The feature id for the '<em><b>Callnext Transition Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSITION__CALLNEXT_TRANSITION_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Executed Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSITION__EXECUTED_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Video Gen Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSITION__VIDEO_GEN_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Traced Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSITION_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Traced Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSITION_OPERATION_COUNT = TRACED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.States.videoGen.impl.TracedSequenceImpl <em>Traced Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.States.videoGen.impl.TracedSequenceImpl
	 * @see videoGenTrace.States.videoGen.impl.VideoGenPackageImpl#getTracedSequence()
	 * @generated
	 */
	int TRACED_SEQUENCE = 7;

	/**
	 * The feature id for the '<em><b>Callnext Transition Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SEQUENCE__CALLNEXT_TRANSITION_SEQUENCE = TRACED_TRANSITION__CALLNEXT_TRANSITION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Executed Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SEQUENCE__EXECUTED_SEQUENCE = TRACED_TRANSITION__EXECUTED_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Video Gen Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SEQUENCE__VIDEO_GEN_SEQUENCE = TRACED_TRANSITION__VIDEO_GEN_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SEQUENCE_FEATURE_COUNT = TRACED_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SEQUENCE_OPERATION_COUNT = TRACED_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.States.videoGen.impl.TracedAlternativesImpl <em>Traced Alternatives</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.States.videoGen.impl.TracedAlternativesImpl
	 * @see videoGenTrace.States.videoGen.impl.VideoGenPackageImpl#getTracedAlternatives()
	 * @generated
	 */
	int TRACED_ALTERNATIVES = 0;

	/**
	 * The feature id for the '<em><b>Callnext Transition Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ALTERNATIVES__CALLNEXT_TRANSITION_SEQUENCE = TRACED_SEQUENCE__CALLNEXT_TRANSITION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Executed Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ALTERNATIVES__EXECUTED_SEQUENCE = TRACED_SEQUENCE__EXECUTED_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Video Gen Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ALTERNATIVES__VIDEO_GEN_SEQUENCE = TRACED_SEQUENCE__VIDEO_GEN_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ALTERNATIVES__ORIGINAL_OBJECT = TRACED_SEQUENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Alternatives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ALTERNATIVES_FEATURE_COUNT = TRACED_SEQUENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Alternatives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ALTERNATIVES_OPERATION_COUNT = TRACED_SEQUENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.States.videoGen.impl.TracedDelayImpl <em>Traced Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.States.videoGen.impl.TracedDelayImpl
	 * @see videoGenTrace.States.videoGen.impl.VideoGenPackageImpl#getTracedDelay()
	 * @generated
	 */
	int TRACED_DELAY = 1;

	/**
	 * The feature id for the '<em><b>Callnext Transition Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DELAY__CALLNEXT_TRANSITION_SEQUENCE = TRACED_TRANSITION__CALLNEXT_TRANSITION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Executed Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DELAY__EXECUTED_SEQUENCE = TRACED_TRANSITION__EXECUTED_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Video Gen Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DELAY__VIDEO_GEN_SEQUENCE = TRACED_TRANSITION__VIDEO_GEN_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DELAY__ORIGINAL_OBJECT = TRACED_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DELAY_FEATURE_COUNT = TRACED_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DELAY_OPERATION_COUNT = TRACED_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.States.videoGen.impl.TracedGenerateImpl <em>Traced Generate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.States.videoGen.impl.TracedGenerateImpl
	 * @see videoGenTrace.States.videoGen.impl.VideoGenPackageImpl#getTracedGenerate()
	 * @generated
	 */
	int TRACED_GENERATE = 2;

	/**
	 * The feature id for the '<em><b>Callnext Transition Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_GENERATE__CALLNEXT_TRANSITION_SEQUENCE = TRACED_TRANSITION__CALLNEXT_TRANSITION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Executed Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_GENERATE__EXECUTED_SEQUENCE = TRACED_TRANSITION__EXECUTED_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Video Gen Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_GENERATE__VIDEO_GEN_SEQUENCE = TRACED_TRANSITION__VIDEO_GEN_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_GENERATE__ORIGINAL_OBJECT = TRACED_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Generate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_GENERATE_FEATURE_COUNT = TRACED_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Generate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_GENERATE_OPERATION_COUNT = TRACED_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.States.videoGen.impl.TracedInitializeImpl <em>Traced Initialize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.States.videoGen.impl.TracedInitializeImpl
	 * @see videoGenTrace.States.videoGen.impl.VideoGenPackageImpl#getTracedInitialize()
	 * @generated
	 */
	int TRACED_INITIALIZE = 3;

	/**
	 * The feature id for the '<em><b>Callnext Transition Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIALIZE__CALLNEXT_TRANSITION_SEQUENCE = TRACED_TRANSITION__CALLNEXT_TRANSITION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Executed Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIALIZE__EXECUTED_SEQUENCE = TRACED_TRANSITION__EXECUTED_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Video Gen Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIALIZE__VIDEO_GEN_SEQUENCE = TRACED_TRANSITION__VIDEO_GEN_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIALIZE__ORIGINAL_OBJECT = TRACED_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Initialize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIALIZE_FEATURE_COUNT = TRACED_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Initialize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INITIALIZE_OPERATION_COUNT = TRACED_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.States.videoGen.impl.TracedMandatoryImpl <em>Traced Mandatory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.States.videoGen.impl.TracedMandatoryImpl
	 * @see videoGenTrace.States.videoGen.impl.VideoGenPackageImpl#getTracedMandatory()
	 * @generated
	 */
	int TRACED_MANDATORY = 4;

	/**
	 * The feature id for the '<em><b>Callnext Transition Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MANDATORY__CALLNEXT_TRANSITION_SEQUENCE = TRACED_SEQUENCE__CALLNEXT_TRANSITION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Executed Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MANDATORY__EXECUTED_SEQUENCE = TRACED_SEQUENCE__EXECUTED_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Video Gen Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MANDATORY__VIDEO_GEN_SEQUENCE = TRACED_SEQUENCE__VIDEO_GEN_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MANDATORY__ORIGINAL_OBJECT = TRACED_SEQUENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Mandatory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MANDATORY_FEATURE_COUNT = TRACED_SEQUENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Mandatory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MANDATORY_OPERATION_COUNT = TRACED_SEQUENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.States.videoGen.impl.TracedOptionalImpl <em>Traced Optional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.States.videoGen.impl.TracedOptionalImpl
	 * @see videoGenTrace.States.videoGen.impl.VideoGenPackageImpl#getTracedOptional()
	 * @generated
	 */
	int TRACED_OPTIONAL = 6;

	/**
	 * The feature id for the '<em><b>Callnext Transition Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPTIONAL__CALLNEXT_TRANSITION_SEQUENCE = TRACED_SEQUENCE__CALLNEXT_TRANSITION_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Executed Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPTIONAL__EXECUTED_SEQUENCE = TRACED_SEQUENCE__EXECUTED_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Video Gen Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPTIONAL__VIDEO_GEN_SEQUENCE = TRACED_SEQUENCE__VIDEO_GEN_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPTIONAL__ORIGINAL_OBJECT = TRACED_SEQUENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Optional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPTIONAL_FEATURE_COUNT = TRACED_SEQUENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Optional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OPTIONAL_OPERATION_COUNT = TRACED_SEQUENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.States.videoGen.impl.TracedVideoImpl <em>Traced Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.States.videoGen.impl.TracedVideoImpl
	 * @see videoGenTrace.States.videoGen.impl.VideoGenPackageImpl#getTracedVideo()
	 * @generated
	 */
	int TRACED_VIDEO = 9;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VIDEO__ORIGINAL_OBJECT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VIDEO_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VIDEO_OPERATION_COUNT = TRACED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.States.videoGen.impl.TracedVideoGenImpl <em>Traced Video Gen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.States.videoGen.impl.TracedVideoGenImpl
	 * @see videoGenTrace.States.videoGen.impl.VideoGenPackageImpl#getTracedVideoGen()
	 * @generated
	 */
	int TRACED_VIDEO_GEN = 10;

	/**
	 * The feature id for the '<em><b>Initialized Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VIDEO_GEN__INITIALIZED_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VIDEO_GEN__ORIGINAL_OBJECT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Video Gen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VIDEO_GEN_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Video Gen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VIDEO_GEN_OPERATION_COUNT = TRACED_NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link videoGenTrace.States.videoGen.TracedAlternatives <em>Traced Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Alternatives</em>'.
	 * @see videoGenTrace.States.videoGen.TracedAlternatives
	 * @generated
	 */
	EClass getTracedAlternatives();

	/**
	 * Returns the meta object for the reference '{@link videoGenTrace.States.videoGen.TracedAlternatives#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see videoGenTrace.States.videoGen.TracedAlternatives#getOriginalObject()
	 * @see #getTracedAlternatives()
	 * @generated
	 */
	EReference getTracedAlternatives_OriginalObject();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.States.videoGen.TracedDelay <em>Traced Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Delay</em>'.
	 * @see videoGenTrace.States.videoGen.TracedDelay
	 * @generated
	 */
	EClass getTracedDelay();

	/**
	 * Returns the meta object for the reference '{@link videoGenTrace.States.videoGen.TracedDelay#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see videoGenTrace.States.videoGen.TracedDelay#getOriginalObject()
	 * @see #getTracedDelay()
	 * @generated
	 */
	EReference getTracedDelay_OriginalObject();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.States.videoGen.TracedGenerate <em>Traced Generate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Generate</em>'.
	 * @see videoGenTrace.States.videoGen.TracedGenerate
	 * @generated
	 */
	EClass getTracedGenerate();

	/**
	 * Returns the meta object for the reference '{@link videoGenTrace.States.videoGen.TracedGenerate#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see videoGenTrace.States.videoGen.TracedGenerate#getOriginalObject()
	 * @see #getTracedGenerate()
	 * @generated
	 */
	EReference getTracedGenerate_OriginalObject();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.States.videoGen.TracedInitialize <em>Traced Initialize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Initialize</em>'.
	 * @see videoGenTrace.States.videoGen.TracedInitialize
	 * @generated
	 */
	EClass getTracedInitialize();

	/**
	 * Returns the meta object for the reference '{@link videoGenTrace.States.videoGen.TracedInitialize#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see videoGenTrace.States.videoGen.TracedInitialize#getOriginalObject()
	 * @see #getTracedInitialize()
	 * @generated
	 */
	EReference getTracedInitialize_OriginalObject();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.States.videoGen.TracedMandatory <em>Traced Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Mandatory</em>'.
	 * @see videoGenTrace.States.videoGen.TracedMandatory
	 * @generated
	 */
	EClass getTracedMandatory();

	/**
	 * Returns the meta object for the reference '{@link videoGenTrace.States.videoGen.TracedMandatory#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see videoGenTrace.States.videoGen.TracedMandatory#getOriginalObject()
	 * @see #getTracedMandatory()
	 * @generated
	 */
	EReference getTracedMandatory_OriginalObject();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.States.videoGen.TracedNamedElement <em>Traced Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Named Element</em>'.
	 * @see videoGenTrace.States.videoGen.TracedNamedElement
	 * @generated
	 */
	EClass getTracedNamedElement();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.States.videoGen.TracedOptional <em>Traced Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Optional</em>'.
	 * @see videoGenTrace.States.videoGen.TracedOptional
	 * @generated
	 */
	EClass getTracedOptional();

	/**
	 * Returns the meta object for the reference '{@link videoGenTrace.States.videoGen.TracedOptional#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see videoGenTrace.States.videoGen.TracedOptional#getOriginalObject()
	 * @see #getTracedOptional()
	 * @generated
	 */
	EReference getTracedOptional_OriginalObject();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.States.videoGen.TracedSequence <em>Traced Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Sequence</em>'.
	 * @see videoGenTrace.States.videoGen.TracedSequence
	 * @generated
	 */
	EClass getTracedSequence();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.States.videoGen.TracedTransition <em>Traced Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Transition</em>'.
	 * @see videoGenTrace.States.videoGen.TracedTransition
	 * @generated
	 */
	EClass getTracedTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link videoGenTrace.States.videoGen.TracedTransition#getCallnextTransitionSequence <em>Callnext Transition Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Callnext Transition Sequence</em>'.
	 * @see videoGenTrace.States.videoGen.TracedTransition#getCallnextTransitionSequence()
	 * @see #getTracedTransition()
	 * @generated
	 */
	EReference getTracedTransition_CallnextTransitionSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link videoGenTrace.States.videoGen.TracedTransition#getExecutedSequence <em>Executed Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executed Sequence</em>'.
	 * @see videoGenTrace.States.videoGen.TracedTransition#getExecutedSequence()
	 * @see #getTracedTransition()
	 * @generated
	 */
	EReference getTracedTransition_ExecutedSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link videoGenTrace.States.videoGen.TracedTransition#getVideoGenSequence <em>Video Gen Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Video Gen Sequence</em>'.
	 * @see videoGenTrace.States.videoGen.TracedTransition#getVideoGenSequence()
	 * @see #getTracedTransition()
	 * @generated
	 */
	EReference getTracedTransition_VideoGenSequence();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.States.videoGen.TracedVideo <em>Traced Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Video</em>'.
	 * @see videoGenTrace.States.videoGen.TracedVideo
	 * @generated
	 */
	EClass getTracedVideo();

	/**
	 * Returns the meta object for the reference '{@link videoGenTrace.States.videoGen.TracedVideo#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see videoGenTrace.States.videoGen.TracedVideo#getOriginalObject()
	 * @see #getTracedVideo()
	 * @generated
	 */
	EReference getTracedVideo_OriginalObject();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.States.videoGen.TracedVideoGen <em>Traced Video Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Video Gen</em>'.
	 * @see videoGenTrace.States.videoGen.TracedVideoGen
	 * @generated
	 */
	EClass getTracedVideoGen();

	/**
	 * Returns the meta object for the containment reference list '{@link videoGenTrace.States.videoGen.TracedVideoGen#getInitializedSequence <em>Initialized Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initialized Sequence</em>'.
	 * @see videoGenTrace.States.videoGen.TracedVideoGen#getInitializedSequence()
	 * @see #getTracedVideoGen()
	 * @generated
	 */
	EReference getTracedVideoGen_InitializedSequence();

	/**
	 * Returns the meta object for the reference '{@link videoGenTrace.States.videoGen.TracedVideoGen#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see videoGenTrace.States.videoGen.TracedVideoGen#getOriginalObject()
	 * @see #getTracedVideoGen()
	 * @generated
	 */
	EReference getTracedVideoGen_OriginalObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VideoGenFactory getVideoGenFactory();

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
		 * The meta object literal for the '{@link videoGenTrace.States.videoGen.impl.TracedAlternativesImpl <em>Traced Alternatives</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.States.videoGen.impl.TracedAlternativesImpl
		 * @see videoGenTrace.States.videoGen.impl.VideoGenPackageImpl#getTracedAlternatives()
		 * @generated
		 */
		EClass TRACED_ALTERNATIVES = eINSTANCE.getTracedAlternatives();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ALTERNATIVES__ORIGINAL_OBJECT = eINSTANCE.getTracedAlternatives_OriginalObject();

		/**
		 * The meta object literal for the '{@link videoGenTrace.States.videoGen.impl.TracedDelayImpl <em>Traced Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.States.videoGen.impl.TracedDelayImpl
		 * @see videoGenTrace.States.videoGen.impl.VideoGenPackageImpl#getTracedDelay()
		 * @generated
		 */
		EClass TRACED_DELAY = eINSTANCE.getTracedDelay();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_DELAY__ORIGINAL_OBJECT = eINSTANCE.getTracedDelay_OriginalObject();

		/**
		 * The meta object literal for the '{@link videoGenTrace.States.videoGen.impl.TracedGenerateImpl <em>Traced Generate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.States.videoGen.impl.TracedGenerateImpl
		 * @see videoGenTrace.States.videoGen.impl.VideoGenPackageImpl#getTracedGenerate()
		 * @generated
		 */
		EClass TRACED_GENERATE = eINSTANCE.getTracedGenerate();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_GENERATE__ORIGINAL_OBJECT = eINSTANCE.getTracedGenerate_OriginalObject();

		/**
		 * The meta object literal for the '{@link videoGenTrace.States.videoGen.impl.TracedInitializeImpl <em>Traced Initialize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.States.videoGen.impl.TracedInitializeImpl
		 * @see videoGenTrace.States.videoGen.impl.VideoGenPackageImpl#getTracedInitialize()
		 * @generated
		 */
		EClass TRACED_INITIALIZE = eINSTANCE.getTracedInitialize();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INITIALIZE__ORIGINAL_OBJECT = eINSTANCE.getTracedInitialize_OriginalObject();

		/**
		 * The meta object literal for the '{@link videoGenTrace.States.videoGen.impl.TracedMandatoryImpl <em>Traced Mandatory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.States.videoGen.impl.TracedMandatoryImpl
		 * @see videoGenTrace.States.videoGen.impl.VideoGenPackageImpl#getTracedMandatory()
		 * @generated
		 */
		EClass TRACED_MANDATORY = eINSTANCE.getTracedMandatory();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_MANDATORY__ORIGINAL_OBJECT = eINSTANCE.getTracedMandatory_OriginalObject();

		/**
		 * The meta object literal for the '{@link videoGenTrace.States.videoGen.impl.TracedNamedElementImpl <em>Traced Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.States.videoGen.impl.TracedNamedElementImpl
		 * @see videoGenTrace.States.videoGen.impl.VideoGenPackageImpl#getTracedNamedElement()
		 * @generated
		 */
		EClass TRACED_NAMED_ELEMENT = eINSTANCE.getTracedNamedElement();

		/**
		 * The meta object literal for the '{@link videoGenTrace.States.videoGen.impl.TracedOptionalImpl <em>Traced Optional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.States.videoGen.impl.TracedOptionalImpl
		 * @see videoGenTrace.States.videoGen.impl.VideoGenPackageImpl#getTracedOptional()
		 * @generated
		 */
		EClass TRACED_OPTIONAL = eINSTANCE.getTracedOptional();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OPTIONAL__ORIGINAL_OBJECT = eINSTANCE.getTracedOptional_OriginalObject();

		/**
		 * The meta object literal for the '{@link videoGenTrace.States.videoGen.impl.TracedSequenceImpl <em>Traced Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.States.videoGen.impl.TracedSequenceImpl
		 * @see videoGenTrace.States.videoGen.impl.VideoGenPackageImpl#getTracedSequence()
		 * @generated
		 */
		EClass TRACED_SEQUENCE = eINSTANCE.getTracedSequence();

		/**
		 * The meta object literal for the '{@link videoGenTrace.States.videoGen.impl.TracedTransitionImpl <em>Traced Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.States.videoGen.impl.TracedTransitionImpl
		 * @see videoGenTrace.States.videoGen.impl.VideoGenPackageImpl#getTracedTransition()
		 * @generated
		 */
		EClass TRACED_TRANSITION = eINSTANCE.getTracedTransition();

		/**
		 * The meta object literal for the '<em><b>Callnext Transition Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TRANSITION__CALLNEXT_TRANSITION_SEQUENCE = eINSTANCE.getTracedTransition_CallnextTransitionSequence();

		/**
		 * The meta object literal for the '<em><b>Executed Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TRANSITION__EXECUTED_SEQUENCE = eINSTANCE.getTracedTransition_ExecutedSequence();

		/**
		 * The meta object literal for the '<em><b>Video Gen Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TRANSITION__VIDEO_GEN_SEQUENCE = eINSTANCE.getTracedTransition_VideoGenSequence();

		/**
		 * The meta object literal for the '{@link videoGenTrace.States.videoGen.impl.TracedVideoImpl <em>Traced Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.States.videoGen.impl.TracedVideoImpl
		 * @see videoGenTrace.States.videoGen.impl.VideoGenPackageImpl#getTracedVideo()
		 * @generated
		 */
		EClass TRACED_VIDEO = eINSTANCE.getTracedVideo();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_VIDEO__ORIGINAL_OBJECT = eINSTANCE.getTracedVideo_OriginalObject();

		/**
		 * The meta object literal for the '{@link videoGenTrace.States.videoGen.impl.TracedVideoGenImpl <em>Traced Video Gen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.States.videoGen.impl.TracedVideoGenImpl
		 * @see videoGenTrace.States.videoGen.impl.VideoGenPackageImpl#getTracedVideoGen()
		 * @generated
		 */
		EClass TRACED_VIDEO_GEN = eINSTANCE.getTracedVideoGen();

		/**
		 * The meta object literal for the '<em><b>Initialized Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_VIDEO_GEN__INITIALIZED_SEQUENCE = eINSTANCE.getTracedVideoGen_InitializedSequence();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_VIDEO_GEN__ORIGINAL_OBJECT = eINSTANCE.getTracedVideoGen_OriginalObject();

	}

} //VideoGenPackage
