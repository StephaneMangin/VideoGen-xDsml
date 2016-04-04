/**
 */
package org.irisa.diverse.videogen.videogenlmt.videoGen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence#getNextSequence <em>Next Sequence</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence#getVideo <em>Video</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence#getActive <em>Active</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence#getDone <em>Done</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence#getCallNextSequence <em>Call Next Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage#getSequence()
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
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage#getSequence_NextSequence()
	 * @model
	 * @generated
	 */
	Sequence getNextSequence();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence#getNextSequence <em>Next Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Sequence</em>' reference.
	 * @see #getNextSequence()
	 * @generated
	 */
	void setNextSequence(Sequence value);

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
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage#getSequence_Video()
	 * @model
	 * @generated
	 */
	Video getVideo();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence#getVideo <em>Video</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video</em>' reference.
	 * @see #getVideo()
	 * @generated
	 */
	void setVideo(Video value);

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
	 * @see #setActive(Boolean)
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage#getSequence_Active()
	 * @model default="true" required="true"
	 * @generated
	 */
	Boolean getActive();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence#getActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(Boolean value);

	/**
	 * Returns the value of the '<em><b>Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Done</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Done</em>' attribute.
	 * @see #setDone(Boolean)
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage#getSequence_Done()
	 * @model
	 * @generated
	 */
	Boolean getDone();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence#getDone <em>Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Done</em>' attribute.
	 * @see #getDone()
	 * @generated
	 */
	void setDone(Boolean value);

	/**
	 * Returns the value of the '<em><b>Call Next Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Next Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Next Sequence</em>' attribute.
	 * @see #setCallNextSequence(Boolean)
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage#getSequence_CallNextSequence()
	 * @model
	 * @generated
	 */
	Boolean getCallNextSequence();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence#getCallNextSequence <em>Call Next Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Next Sequence</em>' attribute.
	 * @see #getCallNextSequence()
	 * @generated
	 */
	void setCallNextSequence(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void process();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize();

} // Sequence
