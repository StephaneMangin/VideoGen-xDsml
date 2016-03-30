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
 *   <li>{@link org.irisa.diverse.videogen.videoGen.Sequence#getNextSibling <em>Next Sibling</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getSequence()
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
	 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getSequence_NextSibling()
	 * @model
	 * @generated
	 */
	Sequence getNextSibling();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videoGen.Sequence#getNextSibling <em>Next Sibling</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Sibling</em>' reference.
	 * @see #getNextSibling()
	 * @generated
	 */
	void setNextSibling(Sequence value);

} // Sequence
