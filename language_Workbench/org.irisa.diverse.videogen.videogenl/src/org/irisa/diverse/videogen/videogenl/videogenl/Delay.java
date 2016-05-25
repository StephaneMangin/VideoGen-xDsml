/**
 */
package org.irisa.diverse.videogen.videogenl.videogenl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videogenl.Delay#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.irisa.diverse.videogen.videogenl.videogenl.VideogenlPackage#getDelay()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='positiveDelay'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot positiveDelay='\n\t\t\tself.value >= 0'"
 * @generated
 */
public interface Delay extends Transition {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Integer)
	 * @see org.irisa.diverse.videogen.videogenl.videogenl.VideogenlPackage#getDelay_Value()
	 * @model default="0"
	 * @generated
	 */
	Integer getValue();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenl.videogenl.Delay#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Integer value);

} // Delay