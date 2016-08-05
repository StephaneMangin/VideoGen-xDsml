/**
 */
package org.irisa.diverse.videogen.videogenl.videoGen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.Transition#getNextTransition <em>Next Transition</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.Transition#getActive <em>Active</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.Transition#getSelected <em>Selected</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.Transition#getVideoGen <em>Video Gen</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.Transition#getExecuted <em>Executed</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.Transition#getCallnextTransition <em>Callnext Transition</em>}</li>
 * </ul>
 *
 * @see org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage#getTransition()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Next Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Transition</em>' reference.
	 * @see #setNextTransition(Transition)
	 * @see org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage#getTransition_NextTransition()
	 * @model
	 * @generated
	 */
	Transition getNextTransition();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenl.videoGen.Transition#getNextTransition <em>Next Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Transition</em>' reference.
	 * @see #getNextTransition()
	 * @generated
	 */
	void setNextTransition(Transition value);

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
	 * @see org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage#getTransition_Active()
	 * @model default="true" required="true"
	 * @generated
	 */
	Boolean getActive();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenl.videoGen.Transition#getActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(Boolean value);

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(Boolean)
	 * @see org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage#getTransition_Selected()
	 * @model default="false" required="true"
	 * @generated
	 */
	Boolean getSelected();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenl.videoGen.Transition#getSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #getSelected()
	 * @generated
	 */
	void setSelected(Boolean value);

	/**
	 * Returns the value of the '<em><b>Video Gen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen</em>' reference.
	 * @see #setVideoGen(VideoGen)
	 * @see org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage#getTransition_VideoGen()
	 * @model
	 * @generated
	 */
	VideoGen getVideoGen();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenl.videoGen.Transition#getVideoGen <em>Video Gen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video Gen</em>' reference.
	 * @see #getVideoGen()
	 * @generated
	 */
	void setVideoGen(VideoGen value);

	/**
	 * Returns the value of the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed</em>' attribute.
	 * @see #setExecuted(Boolean)
	 * @see org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage#getTransition_Executed()
	 * @model
	 * @generated
	 */
	Boolean getExecuted();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenl.videoGen.Transition#getExecuted <em>Executed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executed</em>' attribute.
	 * @see #getExecuted()
	 * @generated
	 */
	void setExecuted(Boolean value);

	/**
	 * Returns the value of the '<em><b>Callnext Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callnext Transition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callnext Transition</em>' attribute.
	 * @see #setCallnextTransition(Boolean)
	 * @see org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage#getTransition_CallnextTransition()
	 * @model
	 * @generated
	 */
	Boolean getCallnextTransition();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenl.videoGen.Transition#getCallnextTransition <em>Callnext Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callnext Transition</em>' attribute.
	 * @see #getCallnextTransition()
	 * @generated
	 */
	void setCallnextTransition(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute(VideoGen videoGen);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void finishExecute(VideoGen videoGen);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addNumber(int key, double distribution);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getDistributedRandomNumber();

} // Transition
