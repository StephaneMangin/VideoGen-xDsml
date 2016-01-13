/**
 */
package org.istic.idm.xtext.videogen.videoGen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.istic.idm.xtext.videogen.videoGen.Sequence#getName <em>Name</em>}</li>
 *   <li>{@link org.istic.idm.xtext.videogen.videoGen.Sequence#getUrl <em>Url</em>}</li>
 *   <li>{@link org.istic.idm.xtext.videogen.videoGen.Sequence#getDescription <em>Description</em>}</li>
 *   <li>{@link org.istic.idm.xtext.videogen.videoGen.Sequence#getLength <em>Length</em>}</li>
 *   <li>{@link org.istic.idm.xtext.videogen.videoGen.Sequence#getMimetype <em>Mimetype</em>}</li>
 * </ul>
 *
 * @see org.istic.idm.xtext.videogen.videoGen.VideoGenPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends EObject
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
   * @see org.istic.idm.xtext.videogen.videoGen.VideoGenPackage#getSequence_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.istic.idm.xtext.videogen.videoGen.Sequence#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see org.istic.idm.xtext.videogen.videoGen.VideoGenPackage#getSequence_Url()
   * @model
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link org.istic.idm.xtext.videogen.videoGen.Sequence#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.istic.idm.xtext.videogen.videoGen.VideoGenPackage#getSequence_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.istic.idm.xtext.videogen.videoGen.Sequence#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length</em>' attribute.
   * @see #setLength(int)
   * @see org.istic.idm.xtext.videogen.videoGen.VideoGenPackage#getSequence_Length()
   * @model
   * @generated
   */
  int getLength();

  /**
   * Sets the value of the '{@link org.istic.idm.xtext.videogen.videoGen.Sequence#getLength <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' attribute.
   * @see #getLength()
   * @generated
   */
  void setLength(int value);

  /**
   * Returns the value of the '<em><b>Mimetype</b></em>' attribute.
   * The literals are from the enumeration {@link org.istic.idm.xtext.videogen.videoGen.Mimetypes_Enum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mimetype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mimetype</em>' attribute.
   * @see org.istic.idm.xtext.videogen.videoGen.Mimetypes_Enum
   * @see #setMimetype(Mimetypes_Enum)
   * @see org.istic.idm.xtext.videogen.videoGen.VideoGenPackage#getSequence_Mimetype()
   * @model
   * @generated
   */
  Mimetypes_Enum getMimetype();

  /**
   * Sets the value of the '{@link org.istic.idm.xtext.videogen.videoGen.Sequence#getMimetype <em>Mimetype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mimetype</em>' attribute.
   * @see org.istic.idm.xtext.videogen.videoGen.Mimetypes_Enum
   * @see #getMimetype()
   * @generated
   */
  void setMimetype(Mimetypes_Enum value);

} // Sequence
