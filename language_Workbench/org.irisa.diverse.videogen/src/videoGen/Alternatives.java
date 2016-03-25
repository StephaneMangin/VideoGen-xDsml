/**
 */
package videoGen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternatives</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link videoGen.Alternatives#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see videoGen.VideoGenPackage#getAlternatives()
 * @model
 * @generated
 */
public interface Alternatives extends Sequence {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link videoGen.Optional}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see videoGen.VideoGenPackage#getAlternatives_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<Optional> getOptions();

} // Alternatives
