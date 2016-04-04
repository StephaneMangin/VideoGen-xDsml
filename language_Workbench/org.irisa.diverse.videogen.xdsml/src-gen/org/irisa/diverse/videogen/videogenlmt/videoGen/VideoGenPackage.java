/**
 */
package org.irisa.diverse.videogen.videogenlmt.videoGen;

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
 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
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
	String eNS_URI = "http://videogenlmt/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "videoGen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VideoGenPackage eINSTANCE = org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoGenPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.NamedElementImpl
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoGenPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 6;

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
	 * The meta object id for the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoGenImpl <em>Video Gen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoGenImpl
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoGenPackageImpl#getVideoGen()
	 * @generated
	 */
	int VIDEO_GEN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sequences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN__SEQUENCES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Videos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN__VIDEOS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Duration Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN__MIN_DURATION_CONSTRAINT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Duration Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN__MAX_DURATION_CONSTRAINT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Video Gen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoGenPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Next Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NEXT_SEQUENCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Video</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__VIDEO = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ACTIVE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__DONE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Call Next Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__CALL_NEXT_SEQUENCE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.impl.AlternativesImpl <em>Alternatives</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.AlternativesImpl
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoGenPackageImpl#getAlternatives()
	 * @generated
	 */
	int ALTERNATIVES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVES__NAME = SEQUENCE__NAME;

	/**
	 * The feature id for the '<em><b>Next Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVES__NEXT_SEQUENCE = SEQUENCE__NEXT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Video</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVES__VIDEO = SEQUENCE__VIDEO;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVES__ACTIVE = SEQUENCE__ACTIVE;

	/**
	 * The feature id for the '<em><b>Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVES__DONE = SEQUENCE__DONE;

	/**
	 * The feature id for the '<em><b>Call Next Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVES__CALL_NEXT_SEQUENCE = SEQUENCE__CALL_NEXT_SEQUENCE;

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
	 * The meta object id for the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.impl.MandatoryImpl <em>Mandatory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.MandatoryImpl
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoGenPackageImpl#getMandatory()
	 * @generated
	 */
	int MANDATORY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__NAME = SEQUENCE__NAME;

	/**
	 * The feature id for the '<em><b>Next Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__NEXT_SEQUENCE = SEQUENCE__NEXT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Video</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__VIDEO = SEQUENCE__VIDEO;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__ACTIVE = SEQUENCE__ACTIVE;

	/**
	 * The feature id for the '<em><b>Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__DONE = SEQUENCE__DONE;

	/**
	 * The feature id for the '<em><b>Call Next Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__CALL_NEXT_SEQUENCE = SEQUENCE__CALL_NEXT_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Mandatory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FEATURE_COUNT = SEQUENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.impl.OptionalImpl <em>Optional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.OptionalImpl
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoGenPackageImpl#getOptional()
	 * @generated
	 */
	int OPTIONAL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__NAME = SEQUENCE__NAME;

	/**
	 * The feature id for the '<em><b>Next Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__NEXT_SEQUENCE = SEQUENCE__NEXT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Video</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__VIDEO = SEQUENCE__VIDEO;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__ACTIVE = SEQUENCE__ACTIVE;

	/**
	 * The feature id for the '<em><b>Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__DONE = SEQUENCE__DONE;

	/**
	 * The feature id for the '<em><b>Call Next Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__CALL_NEXT_SEQUENCE = SEQUENCE__CALL_NEXT_SEQUENCE;

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
	 * The meta object id for the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoImpl <em>Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoImpl
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoGenPackageImpl#getVideo()
	 * @generated
	 */
	int VIDEO = 5;

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
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__SELECTED = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.impl.IntroductionImpl <em>Introduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.IntroductionImpl
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoGenPackageImpl#getIntroduction()
	 * @generated
	 */
	int INTRODUCTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCTION__NAME = SEQUENCE__NAME;

	/**
	 * The feature id for the '<em><b>Next Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCTION__NEXT_SEQUENCE = SEQUENCE__NEXT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Video</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCTION__VIDEO = SEQUENCE__VIDEO;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCTION__ACTIVE = SEQUENCE__ACTIVE;

	/**
	 * The feature id for the '<em><b>Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCTION__DONE = SEQUENCE__DONE;

	/**
	 * The feature id for the '<em><b>Call Next Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCTION__CALL_NEXT_SEQUENCE = SEQUENCE__CALL_NEXT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Video Gen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCTION__VIDEO_GEN = SEQUENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Introduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCTION_FEATURE_COUNT = SEQUENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.impl.ConclusionImpl <em>Conclusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.ConclusionImpl
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoGenPackageImpl#getConclusion()
	 * @generated
	 */
	int CONCLUSION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION__NAME = SEQUENCE__NAME;

	/**
	 * The feature id for the '<em><b>Next Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION__NEXT_SEQUENCE = SEQUENCE__NEXT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Video</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION__VIDEO = SEQUENCE__VIDEO;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION__ACTIVE = SEQUENCE__ACTIVE;

	/**
	 * The feature id for the '<em><b>Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION__DONE = SEQUENCE__DONE;

	/**
	 * The feature id for the '<em><b>Call Next Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION__CALL_NEXT_SEQUENCE = SEQUENCE__CALL_NEXT_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Video Gen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION__VIDEO_GEN = SEQUENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION_FEATURE_COUNT = SEQUENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Mimetypes_Enum <em>Mimetypes Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Mimetypes_Enum
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoGenPackageImpl#getMimetypes_Enum()
	 * @generated
	 */
	int MIMETYPES_ENUM = 9;


	/**
	 * Returns the meta object for class '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGen <em>Video Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGen
	 * @generated
	 */
	EClass getVideoGen();

	/**
	 * Returns the meta object for the containment reference list '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGen#getSequences <em>Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequences</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGen#getSequences()
	 * @see #getVideoGen()
	 * @generated
	 */
	EReference getVideoGen_Sequences();

	/**
	 * Returns the meta object for the containment reference list '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGen#getVideos <em>Videos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Videos</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGen#getVideos()
	 * @see #getVideoGen()
	 * @generated
	 */
	EReference getVideoGen_Videos();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGen#getMinDurationConstraint <em>Min Duration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Duration Constraint</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGen#getMinDurationConstraint()
	 * @see #getVideoGen()
	 * @generated
	 */
	EAttribute getVideoGen_MinDurationConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGen#getMaxDurationConstraint <em>Max Duration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Duration Constraint</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGen#getMaxDurationConstraint()
	 * @see #getVideoGen()
	 * @generated
	 */
	EAttribute getVideoGen_MaxDurationConstraint();

	/**
	 * Returns the meta object for class '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the reference '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence#getNextSequence <em>Next Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Sequence</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence#getNextSequence()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_NextSequence();

	/**
	 * Returns the meta object for the reference '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence#getVideo <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Video</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence#getVideo()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Video();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence#getActive()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Active();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence#getDone <em>Done</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Done</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence#getDone()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Done();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence#getCallNextSequence <em>Call Next Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call Next Sequence</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence#getCallNextSequence()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_CallNextSequence();

	/**
	 * Returns the meta object for class '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Alternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternatives</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Alternatives
	 * @generated
	 */
	EClass getAlternatives();

	/**
	 * Returns the meta object for the containment reference list '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Alternatives#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Alternatives#getOptions()
	 * @see #getAlternatives()
	 * @generated
	 */
	EReference getAlternatives_Options();

	/**
	 * Returns the meta object for class '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Mandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatory</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Mandatory
	 * @generated
	 */
	EClass getMandatory();

	/**
	 * Returns the meta object for class '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Optional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Optional
	 * @generated
	 */
	EClass getOptional();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Optional#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Optional#getProbability()
	 * @see #getOptional()
	 * @generated
	 */
	EAttribute getOptional_Probability();

	/**
	 * Returns the meta object for class '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Video
	 * @generated
	 */
	EClass getVideo();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Video#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Video#getUrl()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Video#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Video#getDescription()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Video#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Video#getDuration()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Duration();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Video#getMimetype <em>Mimetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mimetype</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Video#getMimetype()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Mimetype();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Video#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Video#getSelected()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Selected();

	/**
	 * Returns the meta object for class '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Introduction <em>Introduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Introduction</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Introduction
	 * @generated
	 */
	EClass getIntroduction();

	/**
	 * Returns the meta object for the reference '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Introduction#getVideoGen <em>Video Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Video Gen</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Introduction#getVideoGen()
	 * @see #getIntroduction()
	 * @generated
	 */
	EReference getIntroduction_VideoGen();

	/**
	 * Returns the meta object for class '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Conclusion <em>Conclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conclusion</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Conclusion
	 * @generated
	 */
	EClass getConclusion();

	/**
	 * Returns the meta object for the reference '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Conclusion#getVideoGen <em>Video Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Video Gen</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Conclusion#getVideoGen()
	 * @see #getConclusion()
	 * @generated
	 */
	EReference getConclusion_VideoGen();

	/**
	 * Returns the meta object for enum '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Mimetypes_Enum <em>Mimetypes Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mimetypes Enum</em>'.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Mimetypes_Enum
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
	VideoGenFactory getVideoGenFactory();

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
		 * The meta object literal for the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoGenImpl <em>Video Gen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoGenImpl
		 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoGenPackageImpl#getVideoGen()
		 * @generated
		 */
		EClass VIDEO_GEN = eINSTANCE.getVideoGen();

		/**
		 * The meta object literal for the '<em><b>Sequences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIDEO_GEN__SEQUENCES = eINSTANCE.getVideoGen_Sequences();

		/**
		 * The meta object literal for the '<em><b>Videos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIDEO_GEN__VIDEOS = eINSTANCE.getVideoGen_Videos();

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
		 * The meta object literal for the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence
		 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoGenPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Next Sequence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__NEXT_SEQUENCE = eINSTANCE.getSequence_NextSequence();

		/**
		 * The meta object literal for the '<em><b>Video</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__VIDEO = eINSTANCE.getSequence_Video();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__ACTIVE = eINSTANCE.getSequence_Active();

		/**
		 * The meta object literal for the '<em><b>Done</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__DONE = eINSTANCE.getSequence_Done();

		/**
		 * The meta object literal for the '<em><b>Call Next Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__CALL_NEXT_SEQUENCE = eINSTANCE.getSequence_CallNextSequence();

		/**
		 * The meta object literal for the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.impl.AlternativesImpl <em>Alternatives</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.AlternativesImpl
		 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoGenPackageImpl#getAlternatives()
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
		 * The meta object literal for the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.impl.MandatoryImpl <em>Mandatory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.MandatoryImpl
		 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoGenPackageImpl#getMandatory()
		 * @generated
		 */
		EClass MANDATORY = eINSTANCE.getMandatory();

		/**
		 * The meta object literal for the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.impl.OptionalImpl <em>Optional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.OptionalImpl
		 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoGenPackageImpl#getOptional()
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
		 * The meta object literal for the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoImpl <em>Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoImpl
		 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoGenPackageImpl#getVideo()
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
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__SELECTED = eINSTANCE.getVideo_Selected();

		/**
		 * The meta object literal for the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.NamedElementImpl
		 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoGenPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.impl.IntroductionImpl <em>Introduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.IntroductionImpl
		 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoGenPackageImpl#getIntroduction()
		 * @generated
		 */
		EClass INTRODUCTION = eINSTANCE.getIntroduction();

		/**
		 * The meta object literal for the '<em><b>Video Gen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTRODUCTION__VIDEO_GEN = eINSTANCE.getIntroduction_VideoGen();

		/**
		 * The meta object literal for the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.impl.ConclusionImpl <em>Conclusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.ConclusionImpl
		 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoGenPackageImpl#getConclusion()
		 * @generated
		 */
		EClass CONCLUSION = eINSTANCE.getConclusion();

		/**
		 * The meta object literal for the '<em><b>Video Gen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCLUSION__VIDEO_GEN = eINSTANCE.getConclusion_VideoGen();

		/**
		 * The meta object literal for the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Mimetypes_Enum <em>Mimetypes Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.Mimetypes_Enum
		 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.impl.VideoGenPackageImpl#getMimetypes_Enum()
		 * @generated
		 */
		EEnum MIMETYPES_ENUM = eINSTANCE.getMimetypes_Enum();

	}

} //VideoGenPackage
