/**
 */
package videoGenTrace.States.videoGen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see videoGenTrace.States.videoGen.VideoGenPackage
 * @generated
 */
public interface VideoGenFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VideoGenFactory eINSTANCE = videoGenTrace.States.videoGen.impl.VideoGenFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traced Alternatives</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Alternatives</em>'.
	 * @generated
	 */
	TracedAlternatives createTracedAlternatives();

	/**
	 * Returns a new object of class '<em>Traced Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Delay</em>'.
	 * @generated
	 */
	TracedDelay createTracedDelay();

	/**
	 * Returns a new object of class '<em>Traced Generate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Generate</em>'.
	 * @generated
	 */
	TracedGenerate createTracedGenerate();

	/**
	 * Returns a new object of class '<em>Traced Initialize</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Initialize</em>'.
	 * @generated
	 */
	TracedInitialize createTracedInitialize();

	/**
	 * Returns a new object of class '<em>Traced Mandatory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Mandatory</em>'.
	 * @generated
	 */
	TracedMandatory createTracedMandatory();

	/**
	 * Returns a new object of class '<em>Traced Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Optional</em>'.
	 * @generated
	 */
	TracedOptional createTracedOptional();

	/**
	 * Returns a new object of class '<em>Traced Video</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Video</em>'.
	 * @generated
	 */
	TracedVideo createTracedVideo();

	/**
	 * Returns a new object of class '<em>Traced Video Gen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Video Gen</em>'.
	 * @generated
	 */
	TracedVideoGen createTracedVideoGen();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VideoGenPackage getVideoGenPackage();

} //VideoGenFactory
