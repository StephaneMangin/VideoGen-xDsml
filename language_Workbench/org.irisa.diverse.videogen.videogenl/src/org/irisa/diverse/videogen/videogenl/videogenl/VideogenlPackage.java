/**
 */
package org.irisa.diverse.videogen.videogenl.videogenl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.irisa.diverse.videogen.videogenl.videogenl.VideogenlFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface VideogenlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "videogenl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://videogenl/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "videogenl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VideogenlPackage eINSTANCE = org.irisa.diverse.videogen.videogenl.videogenl.impl.VideogenlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.irisa.diverse.videogen.videogenl.videogenl.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.NamedElementImpl
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideogenlPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.irisa.diverse.videogen.videogenl.videogenl.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.Transition
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideogenlPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Next Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NEXT_TRANSITION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTIVE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SELECTED = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.irisa.diverse.videogen.videogenl.videogenl.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.SequenceImpl
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideogenlPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Next Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NEXT_TRANSITION = TRANSITION__NEXT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ACTIVE = TRANSITION__ACTIVE;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__SELECTED = TRANSITION__SELECTED;

	/**
	 * The feature id for the '<em><b>Video</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__VIDEO = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.irisa.diverse.videogen.videogenl.videogenl.impl.MandatoryImpl <em>Mandatory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.MandatoryImpl
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideogenlPackageImpl#getMandatory()
	 * @generated
	 */
	int MANDATORY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__NAME = SEQUENCE__NAME;

	/**
	 * The feature id for the '<em><b>Next Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__NEXT_TRANSITION = SEQUENCE__NEXT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__ACTIVE = SEQUENCE__ACTIVE;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__SELECTED = SEQUENCE__SELECTED;

	/**
	 * The feature id for the '<em><b>Video</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__VIDEO = SEQUENCE__VIDEO;

	/**
	 * The number of structural features of the '<em>Mandatory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FEATURE_COUNT = SEQUENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.irisa.diverse.videogen.videogenl.videogenl.impl.InitializeImpl <em>Initialize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.InitializeImpl
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideogenlPackageImpl#getInitialize()
	 * @generated
	 */
	int INITIALIZE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZE__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Next Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZE__NEXT_TRANSITION = TRANSITION__NEXT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZE__ACTIVE = TRANSITION__ACTIVE;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZE__SELECTED = TRANSITION__SELECTED;

	/**
	 * The number of structural features of the '<em>Initialize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZE_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.irisa.diverse.videogen.videogenl.videogenl.impl.VideoGenImpl <em>Video Gen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideoGenImpl
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideogenlPackageImpl#getVideoGen()
	 * @generated
	 */
	int VIDEO_GEN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Min Duration Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN__MIN_DURATION_CONSTRAINT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Duration Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN__MAX_DURATION_CONSTRAINT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variantes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN__VARIANTES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN__TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Videos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN__VIDEOS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min User Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN__MIN_USER_CONSTRAINT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max User Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN__MAX_USER_CONSTRAINT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Video Gen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.irisa.diverse.videogen.videogenl.videogenl.impl.OptionalImpl <em>Optional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.OptionalImpl
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideogenlPackageImpl#getOptional()
	 * @generated
	 */
	int OPTIONAL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__NAME = SEQUENCE__NAME;

	/**
	 * The feature id for the '<em><b>Next Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__NEXT_TRANSITION = SEQUENCE__NEXT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__ACTIVE = SEQUENCE__ACTIVE;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__SELECTED = SEQUENCE__SELECTED;

	/**
	 * The feature id for the '<em><b>Video</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__VIDEO = SEQUENCE__VIDEO;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__PROBABILITY = SEQUENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Optional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_COUNT = SEQUENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.irisa.diverse.videogen.videogenl.videogenl.impl.VideoImpl <em>Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideoImpl
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideogenlPackageImpl#getVideo()
	 * @generated
	 */
	int VIDEO = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__URL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__DURATION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mimetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__MIMETYPE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.irisa.diverse.videogen.videogenl.videogenl.impl.AlternativesImpl <em>Alternatives</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.AlternativesImpl
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideogenlPackageImpl#getAlternatives()
	 * @generated
	 */
	int ALTERNATIVES = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVES__NAME = SEQUENCE__NAME;

	/**
	 * The feature id for the '<em><b>Next Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVES__NEXT_TRANSITION = SEQUENCE__NEXT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVES__ACTIVE = SEQUENCE__ACTIVE;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVES__SELECTED = SEQUENCE__SELECTED;

	/**
	 * The feature id for the '<em><b>Video</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVES__VIDEO = SEQUENCE__VIDEO;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVES__OPTIONS = SEQUENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alternatives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVES_FEATURE_COUNT = SEQUENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.irisa.diverse.videogen.videogenl.videogenl.impl.GenerateImpl <em>Generate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.GenerateImpl
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideogenlPackageImpl#getGenerate()
	 * @generated
	 */
	int GENERATE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Next Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE__NEXT_TRANSITION = TRANSITION__NEXT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE__ACTIVE = TRANSITION__ACTIVE;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE__SELECTED = TRANSITION__SELECTED;

	/**
	 * The number of structural features of the '<em>Generate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.irisa.diverse.videogen.videogenl.videogenl.impl.DelayImpl <em>Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.DelayImpl
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideogenlPackageImpl#getDelay()
	 * @generated
	 */
	int DELAY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Next Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__NEXT_TRANSITION = TRANSITION__NEXT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__ACTIVE = TRANSITION__ACTIVE;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__SELECTED = TRANSITION__SELECTED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__VALUE = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.irisa.diverse.videogen.videogenl.videogenl.Mimetypes_Enum <em>Mimetypes Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.Mimetypes_Enum
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideogenlPackageImpl#getMimetypes_Enum()
	 * @generated
	 */
	int MIMETYPES_ENUM = 11;


	/**
	 * Returns the meta object for class '{@link org.irisa.diverse.videogen.videogenl.videogenl.Mandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatory</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.Mandatory
	 * @generated
	 */
	EClass getMandatory();

	/**
	 * Returns the meta object for class '{@link org.irisa.diverse.videogen.videogenl.videogenl.Initialize <em>Initialize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initialize</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.Initialize
	 * @generated
	 */
	EClass getInitialize();

	/**
	 * Returns the meta object for class '{@link org.irisa.diverse.videogen.videogenl.videogenl.VideoGen <em>Video Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.VideoGen
	 * @generated
	 */
	EClass getVideoGen();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenl.videogenl.VideoGen#getMinDurationConstraint <em>Min Duration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Duration Constraint</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.VideoGen#getMinDurationConstraint()
	 * @see #getVideoGen()
	 * @generated
	 */
	EAttribute getVideoGen_MinDurationConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenl.videogenl.VideoGen#getMaxDurationConstraint <em>Max Duration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Duration Constraint</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.VideoGen#getMaxDurationConstraint()
	 * @see #getVideoGen()
	 * @generated
	 */
	EAttribute getVideoGen_MaxDurationConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenl.videogenl.VideoGen#getVariantes <em>Variantes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variantes</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.VideoGen#getVariantes()
	 * @see #getVideoGen()
	 * @generated
	 */
	EAttribute getVideoGen_Variantes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.irisa.diverse.videogen.videogenl.videogenl.VideoGen#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.VideoGen#getTransitions()
	 * @see #getVideoGen()
	 * @generated
	 */
	EReference getVideoGen_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.irisa.diverse.videogen.videogenl.videogenl.VideoGen#getVideos <em>Videos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Videos</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.VideoGen#getVideos()
	 * @see #getVideoGen()
	 * @generated
	 */
	EReference getVideoGen_Videos();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenl.videogenl.VideoGen#getMinUserConstraint <em>Min User Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min User Constraint</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.VideoGen#getMinUserConstraint()
	 * @see #getVideoGen()
	 * @generated
	 */
	EAttribute getVideoGen_MinUserConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenl.videogenl.VideoGen#getMaxUserConstraint <em>Max User Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max User Constraint</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.VideoGen#getMaxUserConstraint()
	 * @see #getVideoGen()
	 * @generated
	 */
	EAttribute getVideoGen_MaxUserConstraint();

	/**
	 * Returns the meta object for class '{@link org.irisa.diverse.videogen.videogenl.videogenl.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link org.irisa.diverse.videogen.videogenl.videogenl.Transition#getNextTransition <em>Next Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Transition</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.Transition#getNextTransition()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_NextTransition();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenl.videogenl.Transition#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.Transition#getActive()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Active();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenl.videogenl.Transition#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.Transition#getSelected()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Selected();

	/**
	 * Returns the meta object for class '{@link org.irisa.diverse.videogen.videogenl.videogenl.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenl.videogenl.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.irisa.diverse.videogen.videogenl.videogenl.Optional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.Optional
	 * @generated
	 */
	EClass getOptional();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenl.videogenl.Optional#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.Optional#getProbability()
	 * @see #getOptional()
	 * @generated
	 */
	EAttribute getOptional_Probability();

	/**
	 * Returns the meta object for class '{@link org.irisa.diverse.videogen.videogenl.videogenl.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.Video
	 * @generated
	 */
	EClass getVideo();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenl.videogenl.Video#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.Video#getUrl()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenl.videogenl.Video#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.Video#getDescription()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenl.videogenl.Video#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.Video#getDuration()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Duration();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenl.videogenl.Video#getMimetype <em>Mimetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mimetype</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.Video#getMimetype()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Mimetype();

	/**
	 * Returns the meta object for class '{@link org.irisa.diverse.videogen.videogenl.videogenl.Alternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternatives</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.Alternatives
	 * @generated
	 */
	EClass getAlternatives();

	/**
	 * Returns the meta object for the containment reference list '{@link org.irisa.diverse.videogen.videogenl.videogenl.Alternatives#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.Alternatives#getOptions()
	 * @see #getAlternatives()
	 * @generated
	 */
	EReference getAlternatives_Options();

	/**
	 * Returns the meta object for class '{@link org.irisa.diverse.videogen.videogenl.videogenl.Generate <em>Generate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generate</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.Generate
	 * @generated
	 */
	EClass getGenerate();

	/**
	 * Returns the meta object for class '{@link org.irisa.diverse.videogen.videogenl.videogenl.Delay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.Delay
	 * @generated
	 */
	EClass getDelay();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenl.videogenl.Delay#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.Delay#getValue()
	 * @see #getDelay()
	 * @generated
	 */
	EAttribute getDelay_Value();

	/**
	 * Returns the meta object for class '{@link org.irisa.diverse.videogen.videogenl.videogenl.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the reference '{@link org.irisa.diverse.videogen.videogenl.videogenl.Sequence#getVideo <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Video</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.Sequence#getVideo()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Video();

	/**
	 * Returns the meta object for enum '{@link org.irisa.diverse.videogen.videogenl.videogenl.Mimetypes_Enum <em>Mimetypes Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mimetypes Enum</em>'.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.Mimetypes_Enum
	 * @generated
	 */
	EEnum getMimetypes_Enum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VideogenlFactory getVideogenlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.irisa.diverse.videogen.videogenl.videogenl.impl.MandatoryImpl <em>Mandatory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.MandatoryImpl
		 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideogenlPackageImpl#getMandatory()
		 * @generated
		 */
		EClass MANDATORY = eINSTANCE.getMandatory();

		/**
		 * The meta object literal for the '{@link org.irisa.diverse.videogen.videogenl.videogenl.impl.InitializeImpl <em>Initialize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.InitializeImpl
		 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideogenlPackageImpl#getInitialize()
		 * @generated
		 */
		EClass INITIALIZE = eINSTANCE.getInitialize();

		/**
		 * The meta object literal for the '{@link org.irisa.diverse.videogen.videogenl.videogenl.impl.VideoGenImpl <em>Video Gen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideoGenImpl
		 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideogenlPackageImpl#getVideoGen()
		 * @generated
		 */
		EClass VIDEO_GEN = eINSTANCE.getVideoGen();

		/**
		 * The meta object literal for the '<em><b>Min Duration Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO_GEN__MIN_DURATION_CONSTRAINT = eINSTANCE.getVideoGen_MinDurationConstraint();

		/**
		 * The meta object literal for the '<em><b>Max Duration Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO_GEN__MAX_DURATION_CONSTRAINT = eINSTANCE.getVideoGen_MaxDurationConstraint();

		/**
		 * The meta object literal for the '<em><b>Variantes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO_GEN__VARIANTES = eINSTANCE.getVideoGen_Variantes();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIDEO_GEN__TRANSITIONS = eINSTANCE.getVideoGen_Transitions();

		/**
		 * The meta object literal for the '<em><b>Videos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIDEO_GEN__VIDEOS = eINSTANCE.getVideoGen_Videos();

		/**
		 * The meta object literal for the '<em><b>Min User Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO_GEN__MIN_USER_CONSTRAINT = eINSTANCE.getVideoGen_MinUserConstraint();

		/**
		 * The meta object literal for the '<em><b>Max User Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO_GEN__MAX_USER_CONSTRAINT = eINSTANCE.getVideoGen_MaxUserConstraint();

		/**
		 * The meta object literal for the '{@link org.irisa.diverse.videogen.videogenl.videogenl.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.irisa.diverse.videogen.videogenl.videogenl.Transition
		 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideogenlPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Next Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__NEXT_TRANSITION = eINSTANCE.getTransition_NextTransition();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__ACTIVE = eINSTANCE.getTransition_Active();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__SELECTED = eINSTANCE.getTransition_Selected();

		/**
		 * The meta object literal for the '{@link org.irisa.diverse.videogen.videogenl.videogenl.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.NamedElementImpl
		 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideogenlPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.irisa.diverse.videogen.videogenl.videogenl.impl.OptionalImpl <em>Optional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.OptionalImpl
		 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideogenlPackageImpl#getOptional()
		 * @generated
		 */
		EClass OPTIONAL = eINSTANCE.getOptional();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONAL__PROBABILITY = eINSTANCE.getOptional_Probability();

		/**
		 * The meta object literal for the '{@link org.irisa.diverse.videogen.videogenl.videogenl.impl.VideoImpl <em>Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideoImpl
		 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideogenlPackageImpl#getVideo()
		 * @generated
		 */
		EClass VIDEO = eINSTANCE.getVideo();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__URL = eINSTANCE.getVideo_Url();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__DESCRIPTION = eINSTANCE.getVideo_Description();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__DURATION = eINSTANCE.getVideo_Duration();

		/**
		 * The meta object literal for the '<em><b>Mimetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__MIMETYPE = eINSTANCE.getVideo_Mimetype();

		/**
		 * The meta object literal for the '{@link org.irisa.diverse.videogen.videogenl.videogenl.impl.AlternativesImpl <em>Alternatives</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.AlternativesImpl
		 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideogenlPackageImpl#getAlternatives()
		 * @generated
		 */
		EClass ALTERNATIVES = eINSTANCE.getAlternatives();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVES__OPTIONS = eINSTANCE.getAlternatives_Options();

		/**
		 * The meta object literal for the '{@link org.irisa.diverse.videogen.videogenl.videogenl.impl.GenerateImpl <em>Generate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.GenerateImpl
		 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideogenlPackageImpl#getGenerate()
		 * @generated
		 */
		EClass GENERATE = eINSTANCE.getGenerate();

		/**
		 * The meta object literal for the '{@link org.irisa.diverse.videogen.videogenl.videogenl.impl.DelayImpl <em>Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.DelayImpl
		 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideogenlPackageImpl#getDelay()
		 * @generated
		 */
		EClass DELAY = eINSTANCE.getDelay();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY__VALUE = eINSTANCE.getDelay_Value();

		/**
		 * The meta object literal for the '{@link org.irisa.diverse.videogen.videogenl.videogenl.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.SequenceImpl
		 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideogenlPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Video</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__VIDEO = eINSTANCE.getSequence_Video();

		/**
		 * The meta object literal for the '{@link org.irisa.diverse.videogen.videogenl.videogenl.Mimetypes_Enum <em>Mimetypes Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.irisa.diverse.videogen.videogenl.videogenl.Mimetypes_Enum
		 * @see org.irisa.diverse.videogen.videogenl.videogenl.impl.VideogenlPackageImpl#getMimetypes_Enum()
		 * @generated
		 */
		EEnum MIMETYPES_ENUM = eINSTANCE.getMimetypes_Enum();

	}

} //VideogenlPackage