/**
 */
package org.irisa.diverse.videogen.videoGen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternatives</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.Alternatives#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getAlternatives()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='probSumMax'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot probSumMax='\n\t\t\tself.options.probability->sum() <= 100'"
 * @generated
 */
public interface Alternatives extends Sequence {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link org.irisa.diverse.videogen.videoGen.Optional}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getAlternatives_Options()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Optional> getOptions();

} // Alternatives
