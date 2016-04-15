/**
 */
package org.irisa.diverse.videogen.videoGen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.Transition#getNextTransition <em>Next Transition</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.Transition#getActive <em>Active</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getTransition()
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
	 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getTransition_NextTransition()
	 * @model
	 * @generated
	 */
	Transition getNextTransition();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videoGen.Transition#getNextTransition <em>Next Transition</em>}' reference.
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
	 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getTransition_Active()
	 * @model default="true" required="true"
	 * @generated
	 */
	Boolean getActive();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videoGen.Transition#getActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(Boolean value);

} // Transition
