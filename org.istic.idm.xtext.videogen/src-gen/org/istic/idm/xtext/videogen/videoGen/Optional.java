/**
 */
package org.istic.idm.xtext.videogen.videoGen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.istic.idm.xtext.videogen.videoGen.Optional#getProbability <em>Probability</em>}</li>
 *   <li>{@link org.istic.idm.xtext.videogen.videoGen.Optional#getSequence <em>Sequence</em>}</li>
 * </ul>
 *
 * @see org.istic.idm.xtext.videogen.videoGen.VideoGenPackage#getOptional()
 * @model
 * @generated
 */
public interface Optional extends Statement
{
  /**
   * Returns the value of the '<em><b>Probability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Probability</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Probability</em>' attribute.
   * @see #setProbability(int)
   * @see org.istic.idm.xtext.videogen.videoGen.VideoGenPackage#getOptional_Probability()
   * @model
   * @generated
   */
  int getProbability();

  /**
   * Sets the value of the '{@link org.istic.idm.xtext.videogen.videoGen.Optional#getProbability <em>Probability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Probability</em>' attribute.
   * @see #getProbability()
   * @generated
   */
  void setProbability(int value);

  /**
   * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequence</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequence</em>' containment reference.
   * @see #setSequence(Sequence)
   * @see org.istic.idm.xtext.videogen.videoGen.VideoGenPackage#getOptional_Sequence()
   * @model containment="true"
   * @generated
   */
  Sequence getSequence();

  /**
   * Sets the value of the '{@link org.istic.idm.xtext.videogen.videoGen.Optional#getSequence <em>Sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sequence</em>' containment reference.
   * @see #getSequence()
   * @generated
   */
  void setSequence(Sequence value);

} // Optional
