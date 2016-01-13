/**
 */
package org.istic.idm.xtext.videogen.videoGen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mandatory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.istic.idm.xtext.videogen.videoGen.Mandatory#getSequence <em>Sequence</em>}</li>
 * </ul>
 *
 * @see org.istic.idm.xtext.videogen.videoGen.VideoGenPackage#getMandatory()
 * @model
 * @generated
 */
public interface Mandatory extends Statement
{
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
   * @see org.istic.idm.xtext.videogen.videoGen.VideoGenPackage#getMandatory_Sequence()
   * @model containment="true"
   * @generated
   */
  Sequence getSequence();

  /**
   * Sets the value of the '{@link org.istic.idm.xtext.videogen.videoGen.Mandatory#getSequence <em>Sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sequence</em>' containment reference.
   * @see #getSequence()
   * @generated
   */
  void setSequence(Sequence value);

} // Mandatory
