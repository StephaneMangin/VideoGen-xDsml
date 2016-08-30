/**
 */
package videoGenTrace.States.videoGen;

import org.irisa.diverse.videogen.videogenl.videoGen.Initialize;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Initialize</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link videoGenTrace.States.videoGen.TracedInitialize#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see videoGenTrace.States.videoGen.VideoGenPackage#getTracedInitialize()
 * @model
 * @generated
 */
public interface TracedInitialize extends TracedTransition {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Initialize)
	 * @see videoGenTrace.States.videoGen.VideoGenPackage#getTracedInitialize_OriginalObject()
	 * @model
	 * @generated
	 */
	Initialize getOriginalObject();

	/**
	 * Sets the value of the '{@link videoGenTrace.States.videoGen.TracedInitialize#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Initialize value);

} // TracedInitialize
