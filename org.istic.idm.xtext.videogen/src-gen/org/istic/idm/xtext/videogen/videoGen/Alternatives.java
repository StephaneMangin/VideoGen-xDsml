/**
 */
package org.istic.idm.xtext.videogen.videoGen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternatives</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.istic.idm.xtext.videogen.videoGen.Alternatives#getName <em>Name</em>}</li>
 *   <li>{@link org.istic.idm.xtext.videogen.videoGen.Alternatives#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.istic.idm.xtext.videogen.videoGen.VideoGenPackage#getAlternatives()
 * @model
 * @generated
 */
public interface Alternatives extends Statement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.istic.idm.xtext.videogen.videoGen.VideoGenPackage#getAlternatives_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.istic.idm.xtext.videogen.videoGen.Alternatives#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link org.istic.idm.xtext.videogen.videoGen.Optional}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see org.istic.idm.xtext.videogen.videoGen.VideoGenPackage#getAlternatives_Options()
   * @model containment="true"
   * @generated
   */
  EList<Optional> getOptions();

} // Alternatives
