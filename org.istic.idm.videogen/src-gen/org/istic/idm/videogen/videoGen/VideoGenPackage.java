/**
 */
package org.istic.idm.videogen.videoGen;

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
 * @see org.istic.idm.videogen.videoGen.VideoGenFactory
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
	String eNS_URI = "http://www.istic.org/idm/videogen/VideoGen";

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
	VideoGenPackage eINSTANCE = org.istic.idm.videogen.videoGen.impl.VideoGenPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.istic.idm.videogen.videoGen.impl.VideoGenImpl <em>Video Gen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.istic.idm.videogen.videoGen.impl.VideoGenImpl
	 * @see org.istic.idm.videogen.videoGen.impl.VideoGenPackageImpl#getVideoGen()
	 * @generated
	 */
	int VIDEO_GEN = 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN__STATEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Video Gen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_GEN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.istic.idm.videogen.videoGen.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.istic.idm.videogen.videoGen.impl.StatementImpl
	 * @see org.istic.idm.videogen.videoGen.impl.VideoGenPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.istic.idm.videogen.videoGen.impl.AlternativesImpl <em>Alternatives</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.istic.idm.videogen.videoGen.impl.AlternativesImpl
	 * @see org.istic.idm.videogen.videoGen.impl.VideoGenPackageImpl#getAlternatives()
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
	int ALTERNATIVES__NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVES__OPTIONS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Alternatives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVES_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.istic.idm.videogen.videoGen.impl.MandatoryImpl <em>Mandatory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.istic.idm.videogen.videoGen.impl.MandatoryImpl
	 * @see org.istic.idm.videogen.videoGen.impl.VideoGenPackageImpl#getMandatory()
	 * @generated
	 */
	int MANDATORY = 3;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__SEQUENCE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mandatory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.istic.idm.videogen.videoGen.impl.OptionalImpl <em>Optional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.istic.idm.videogen.videoGen.impl.OptionalImpl
	 * @see org.istic.idm.videogen.videoGen.impl.VideoGenPackageImpl#getOptional()
	 * @generated
	 */
	int OPTIONAL = 4;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__PROBABILITY = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__SEQUENCE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Optional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.istic.idm.videogen.videoGen.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.istic.idm.videogen.videoGen.impl.SequenceImpl
	 * @see org.istic.idm.videogen.videoGen.impl.VideoGenPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__URL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__LENGTH = 3;

	/**
	 * The feature id for the '<em><b>Mimetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__MIMETYPE = 4;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.istic.idm.videogen.videoGen.Mimetypes_Enum <em>Mimetypes Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.istic.idm.videogen.videoGen.Mimetypes_Enum
	 * @see org.istic.idm.videogen.videoGen.impl.VideoGenPackageImpl#getMimetypes_Enum()
	 * @generated
	 */
	int MIMETYPES_ENUM = 6;


	/**
	 * Returns the meta object for class '{@link org.istic.idm.videogen.videoGen.VideoGen <em>Video Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Gen</em>'.
	 * @see org.istic.idm.videogen.videoGen.VideoGen
	 * @generated
	 */
	EClass getVideoGen();

	/**
	 * Returns the meta object for the containment reference list '{@link org.istic.idm.videogen.videoGen.VideoGen#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.istic.idm.videogen.videoGen.VideoGen#getStatements()
	 * @see #getVideoGen()
	 * @generated
	 */
	EReference getVideoGen_Statements();

	/**
	 * Returns the meta object for class '{@link org.istic.idm.videogen.videoGen.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.istic.idm.videogen.videoGen.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link org.istic.idm.videogen.videoGen.Alternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternatives</em>'.
	 * @see org.istic.idm.videogen.videoGen.Alternatives
	 * @generated
	 */
	EClass getAlternatives();

	/**
	 * Returns the meta object for the attribute '{@link org.istic.idm.videogen.videoGen.Alternatives#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.istic.idm.videogen.videoGen.Alternatives#getName()
	 * @see #getAlternatives()
	 * @generated
	 */
	EAttribute getAlternatives_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.istic.idm.videogen.videoGen.Alternatives#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see org.istic.idm.videogen.videoGen.Alternatives#getOptions()
	 * @see #getAlternatives()
	 * @generated
	 */
	EReference getAlternatives_Options();

	/**
	 * Returns the meta object for class '{@link org.istic.idm.videogen.videoGen.Mandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatory</em>'.
	 * @see org.istic.idm.videogen.videoGen.Mandatory
	 * @generated
	 */
	EClass getMandatory();

	/**
	 * Returns the meta object for the containment reference '{@link org.istic.idm.videogen.videoGen.Mandatory#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see org.istic.idm.videogen.videoGen.Mandatory#getSequence()
	 * @see #getMandatory()
	 * @generated
	 */
	EReference getMandatory_Sequence();

	/**
	 * Returns the meta object for class '{@link org.istic.idm.videogen.videoGen.Optional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional</em>'.
	 * @see org.istic.idm.videogen.videoGen.Optional
	 * @generated
	 */
	EClass getOptional();

	/**
	 * Returns the meta object for the attribute '{@link org.istic.idm.videogen.videoGen.Optional#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see org.istic.idm.videogen.videoGen.Optional#getProbability()
	 * @see #getOptional()
	 * @generated
	 */
	EAttribute getOptional_Probability();

	/**
	 * Returns the meta object for the containment reference '{@link org.istic.idm.videogen.videoGen.Optional#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see org.istic.idm.videogen.videoGen.Optional#getSequence()
	 * @see #getOptional()
	 * @generated
	 */
	EReference getOptional_Sequence();

	/**
	 * Returns the meta object for class '{@link org.istic.idm.videogen.videoGen.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see org.istic.idm.videogen.videoGen.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the attribute '{@link org.istic.idm.videogen.videoGen.Sequence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.istic.idm.videogen.videoGen.Sequence#getName()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.istic.idm.videogen.videoGen.Sequence#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.istic.idm.videogen.videoGen.Sequence#getUrl()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.istic.idm.videogen.videoGen.Sequence#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.istic.idm.videogen.videoGen.Sequence#getDescription()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.istic.idm.videogen.videoGen.Sequence#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.istic.idm.videogen.videoGen.Sequence#getLength()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.istic.idm.videogen.videoGen.Sequence#getMimetype <em>Mimetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mimetype</em>'.
	 * @see org.istic.idm.videogen.videoGen.Sequence#getMimetype()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Mimetype();

	/**
	 * Returns the meta object for enum '{@link org.istic.idm.videogen.videoGen.Mimetypes_Enum <em>Mimetypes Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mimetypes Enum</em>'.
	 * @see org.istic.idm.videogen.videoGen.Mimetypes_Enum
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
		 * The meta object literal for the '{@link org.istic.idm.videogen.videoGen.impl.VideoGenImpl <em>Video Gen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.istic.idm.videogen.videoGen.impl.VideoGenImpl
		 * @see org.istic.idm.videogen.videoGen.impl.VideoGenPackageImpl#getVideoGen()
		 * @generated
		 */
		EClass VIDEO_GEN = eINSTANCE.getVideoGen();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIDEO_GEN__STATEMENTS = eINSTANCE.getVideoGen_Statements();

		/**
		 * The meta object literal for the '{@link org.istic.idm.videogen.videoGen.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.istic.idm.videogen.videoGen.impl.StatementImpl
		 * @see org.istic.idm.videogen.videoGen.impl.VideoGenPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link org.istic.idm.videogen.videoGen.impl.AlternativesImpl <em>Alternatives</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.istic.idm.videogen.videoGen.impl.AlternativesImpl
		 * @see org.istic.idm.videogen.videoGen.impl.VideoGenPackageImpl#getAlternatives()
		 * @generated
		 */
		EClass ALTERNATIVES = eINSTANCE.getAlternatives();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALTERNATIVES__NAME = eINSTANCE.getAlternatives_Name();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVES__OPTIONS = eINSTANCE.getAlternatives_Options();

		/**
		 * The meta object literal for the '{@link org.istic.idm.videogen.videoGen.impl.MandatoryImpl <em>Mandatory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.istic.idm.videogen.videoGen.impl.MandatoryImpl
		 * @see org.istic.idm.videogen.videoGen.impl.VideoGenPackageImpl#getMandatory()
		 * @generated
		 */
		EClass MANDATORY = eINSTANCE.getMandatory();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANDATORY__SEQUENCE = eINSTANCE.getMandatory_Sequence();

		/**
		 * The meta object literal for the '{@link org.istic.idm.videogen.videoGen.impl.OptionalImpl <em>Optional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.istic.idm.videogen.videoGen.impl.OptionalImpl
		 * @see org.istic.idm.videogen.videoGen.impl.VideoGenPackageImpl#getOptional()
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
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONAL__SEQUENCE = eINSTANCE.getOptional_Sequence();

		/**
		 * The meta object literal for the '{@link org.istic.idm.videogen.videoGen.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.istic.idm.videogen.videoGen.impl.SequenceImpl
		 * @see org.istic.idm.videogen.videoGen.impl.VideoGenPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__NAME = eINSTANCE.getSequence_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__URL = eINSTANCE.getSequence_Url();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__DESCRIPTION = eINSTANCE.getSequence_Description();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__LENGTH = eINSTANCE.getSequence_Length();

		/**
		 * The meta object literal for the '<em><b>Mimetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__MIMETYPE = eINSTANCE.getSequence_Mimetype();

		/**
		 * The meta object literal for the '{@link org.istic.idm.videogen.videoGen.Mimetypes_Enum <em>Mimetypes Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.istic.idm.videogen.videoGen.Mimetypes_Enum
		 * @see org.istic.idm.videogen.videoGen.impl.VideoGenPackageImpl#getMimetypes_Enum()
		 * @generated
		 */
		EEnum MIMETYPES_ENUM = eINSTANCE.getMimetypes_Enum();

	}

} //VideoGenPackage
