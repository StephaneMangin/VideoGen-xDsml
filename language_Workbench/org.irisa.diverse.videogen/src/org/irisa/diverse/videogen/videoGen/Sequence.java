/**
 */
package org.irisa.diverse.videogen.videoGen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.Sequence#getNextSequence <em>Next Sequence</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.Sequence#isActive <em>Active</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.Sequence#getVideo <em>Video</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getSequence()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Sequence extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Next Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Sequence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Sequence</em>' reference.
	 * @see #setNextSequence(Sequence)
	 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getSequence_NextSequence()
	 * @model
	 * @generated
	 */
	Sequence getNextSequence();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videoGen.Sequence#getNextSequence <em>Next Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Sequence</em>' reference.
	 * @see #getNextSequence()
	 * @generated
	 */
	void setNextSequence(Sequence value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getSequence_Active()
	 * @model default="true"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videoGen.Sequence#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Video</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video</em>' reference.
	 * @see #setVideo(Video)
	 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getSequence_Video()
	 * @model
	 * @generated
	 */
	Video getVideo();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videoGen.Sequence#getVideo <em>Video</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video</em>' reference.
	 * @see #getVideo()
	 * @generated
	 */
	void setVideo(Video value);

} // Sequence
