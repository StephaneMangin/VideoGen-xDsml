/**
 */
package org.irisa.diverse.videogen.videogenl.videogenl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videogenl.Video#getUrl <em>Url</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videogenl.Video#getDescription <em>Description</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videogenl.Video#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videogenl.Video#getMimetype <em>Mimetype</em>}</li>
 * </ul>
 *
 * @see org.irisa.diverse.videogen.videogenl.videogenl.VideogenlPackage#getVideo()
 * @model
 * @generated
 */
public interface Video extends NamedElement {
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
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.VideogenlPackage#getVideo_Url()
	 * @model required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenl.videogenl.Video#getUrl <em>Url</em>}' attribute.
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
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.VideogenlPackage#getVideo_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenl.videogenl.Video#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(Integer)
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.VideogenlPackage#getVideo_Duration()
	 * @model default="0" required="true"
	 * @generated
	 */
	Integer getDuration();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenl.videogenl.Video#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Integer value);

	/**
	 * Returns the value of the '<em><b>Mimetype</b></em>' attribute.
	 * The literals are from the enumeration {@link org.irisa.diverse.videogen.videogenl.videogenl.Mimetypes_Enum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mimetype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mimetype</em>' attribute.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.Mimetypes_Enum
	 * @see #setMimetype(Mimetypes_Enum)
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.VideogenlPackage#getVideo_Mimetype()
	 * @model required="true"
	 * @generated
	 */
	Mimetypes_Enum getMimetype();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenl.videogenl.Video#getMimetype <em>Mimetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mimetype</em>' attribute.
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.Mimetypes_Enum
	 * @see #getMimetype()
	 * @generated
	 */
	void setMimetype(Mimetypes_Enum value);

} // Video
