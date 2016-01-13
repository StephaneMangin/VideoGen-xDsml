/**
 */
package org.istic.idm.xtext.videogen.videoGen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.istic.idm.xtext.videogen.videoGen.VideoGen#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see org.istic.idm.xtext.videogen.videoGen.VideoGenPackage#getVideoGen()
 * @model
 * @generated
 */
public interface VideoGen extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.istic.idm.xtext.videogen.videoGen.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.istic.idm.xtext.videogen.videoGen.VideoGenPackage#getVideoGen_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // VideoGen
