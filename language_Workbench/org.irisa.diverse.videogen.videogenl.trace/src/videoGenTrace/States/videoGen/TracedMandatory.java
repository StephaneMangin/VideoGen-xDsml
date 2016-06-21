/**
 */
package videoGenTrace.States.videoGen;

import org.irisa.diverse.videogen.videogenl.videoGen.Mandatory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Mandatory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link videoGenTrace.States.videoGen.TracedMandatory#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see videoGenTrace.States.videoGen.VideoGenPackage#getTracedMandatory()
 * @model
 * @generated
 */
public interface TracedMandatory extends TracedSequence {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Mandatory)
	 * @see videoGenTrace.States.videoGen.VideoGenPackage#getTracedMandatory_OriginalObject()
	 * @model
	 * @generated
	 */
	Mandatory getOriginalObject();

	/**
	 * Sets the value of the '{@link videoGenTrace.States.videoGen.TracedMandatory#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Mandatory value);

} // TracedMandatory
