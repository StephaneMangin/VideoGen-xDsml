/**
 */
package org.irisa.diverse.videogenlmt.videoGen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.irisa.diverse.videogenlmt.videoGen.Sequence#getNextSibling <em>Next Sibling</em>}</li>
 *   <li>{@link org.irisa.diverse.videogenlmt.videoGen.Sequence#getCurrent <em>Current</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage#getSequence()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Sequence extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Next Sibling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Sibling</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Sibling</em>' reference.
	 * @see #setNextSibling(Sequence)
	 * @see org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage#getSequence_NextSibling()
	 * @model
	 * @generated
	 */
	Sequence getNextSibling();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogenlmt.videoGen.Sequence#getNextSibling <em>Next Sibling</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Sibling</em>' reference.
	 * @see #getNextSibling()
	 * @generated
	 */
	void setNextSibling(Sequence value);

	/**
	 * Returns the value of the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' attribute.
	 * @see #setCurrent(Boolean)
	 * @see org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage#getSequence_Current()
	 * @model
	 * @generated
	 */
	Boolean getCurrent();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogenlmt.videoGen.Sequence#getCurrent <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' attribute.
	 * @see #getCurrent()
	 * @generated
	 */
	void setCurrent(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void process();

} // Sequence
