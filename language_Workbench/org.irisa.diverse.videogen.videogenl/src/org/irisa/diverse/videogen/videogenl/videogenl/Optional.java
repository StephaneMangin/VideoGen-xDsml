/**
 */
package org.irisa.diverse.videogen.videogenl.videogenl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videogenl.Optional#getProbability <em>Probability</em>}</li>
 * </ul>
 *
 * @see org.irisa.diverse.videogen.videogenl.videogenl.VideogenlPackage#getOptional()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='probMax probMin'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot probMax='\n\t\t\tself.probability <= 100' probMin='\n\t\t\tself.probability >= 0'"
 * @generated
 */
public interface Optional extends Sequence {
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(Integer)
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.VideogenlPackage#getOptional_Probability()
	 * @model default="0" required="true"
	 * @generated
	 */
	Integer getProbability();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenl.videogenl.Optional#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(Integer value);

} // Optional