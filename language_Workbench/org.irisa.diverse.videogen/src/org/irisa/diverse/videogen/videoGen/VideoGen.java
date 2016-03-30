/**
 */
package org.irisa.diverse.videogen.videoGen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.VideoGen#getSequences <em>Sequences</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getVideoGen()
 * @model
 * @generated
 */
public interface VideoGen extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sequences</b></em>' containment reference list.
	 * The list contents are of type {@link org.irisa.diverse.videogen.videoGen.Sequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequences</em>' containment reference list.
	 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getVideoGen_Sequences()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sequence> getSequences();

} // VideoGen
