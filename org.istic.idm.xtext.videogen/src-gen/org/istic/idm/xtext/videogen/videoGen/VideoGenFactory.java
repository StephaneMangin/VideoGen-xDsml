/**
 */
package org.istic.idm.xtext.videogen.videoGen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.istic.idm.xtext.videogen.videoGen.VideoGenPackage
 * @generated
 */
public interface VideoGenFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VideoGenFactory eINSTANCE = org.istic.idm.xtext.videogen.videoGen.impl.VideoGenFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Video Gen</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Video Gen</em>'.
   * @generated
   */
  VideoGen createVideoGen();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Alternatives</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alternatives</em>'.
   * @generated
   */
  Alternatives createAlternatives();

  /**
   * Returns a new object of class '<em>Mandatory</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mandatory</em>'.
   * @generated
   */
  Mandatory createMandatory();

  /**
   * Returns a new object of class '<em>Optional</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Optional</em>'.
   * @generated
   */
  Optional createOptional();

  /**
   * Returns a new object of class '<em>Sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence</em>'.
   * @generated
   */
  Sequence createSequence();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  VideoGenPackage getVideoGenPackage();

} //VideoGenFactory
