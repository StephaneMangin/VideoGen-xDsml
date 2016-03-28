/**
 */
package org.irisa.diverse.videogenlmt.videoGen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.irisa.diverse.videogenlmt.videoGen.VideoGen#getSequences <em>Sequences</em>}</li>
 *   <li>{@link org.irisa.diverse.videogenlmt.videoGen.VideoGen#getSelectedSequences <em>Selected Sequences</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage#getVideoGen()
 * @model
 * @generated
 */
public interface VideoGen extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sequences</b></em>' containment reference list.
	 * The list contents are of type {@link org.irisa.diverse.videogenlmt.videoGen.Sequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequences</em>' containment reference list.
	 * @see org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage#getVideoGen_Sequences()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sequence> getSequences();

	/**
	 * Returns the value of the '<em><b>Selected Sequences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Sequences</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Sequences</em>' attribute.
	 * @see #setSelectedSequences(EList)
	 * @see org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage#getVideoGen_SelectedSequences()
	 * @model required="true" many="false" transient="true"
	 * @generated
	 */
	EList<?> getSelectedSequences();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogenlmt.videoGen.VideoGen#getSelectedSequences <em>Selected Sequences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Sequences</em>' attribute.
	 * @see #getSelectedSequences()
	 * @generated
	 */
	void setSelectedSequences(EList<?> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void compute();

} // VideoGen