/**
 */
package videoGenTrace.States.videoGen;

import org.eclipse.emf.common.util.EList;

import org.irisa.diverse.videogen.videogenl.videoGen.VideoGen;

import videoGenTrace.States.VideoGen_initialized_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Video Gen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link videoGenTrace.States.videoGen.TracedVideoGen#getInitializedSequence <em>Initialized Sequence</em>}</li>
 *   <li>{@link videoGenTrace.States.videoGen.TracedVideoGen#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see videoGenTrace.States.videoGen.VideoGenPackage#getTracedVideoGen()
 * @model
 * @generated
 */
public interface TracedVideoGen extends TracedNamedElement {
	/**
	 * Returns the value of the '<em><b>Initialized Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link videoGenTrace.States.VideoGen_initialized_Value}.
	 * It is bidirectional and its opposite is '{@link videoGenTrace.States.VideoGen_initialized_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialized Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialized Sequence</em>' containment reference list.
	 * @see videoGenTrace.States.videoGen.VideoGenPackage#getTracedVideoGen_InitializedSequence()
	 * @see videoGenTrace.States.VideoGen_initialized_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<VideoGen_initialized_Value> getInitializedSequence();

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(VideoGen)
	 * @see videoGenTrace.States.videoGen.VideoGenPackage#getTracedVideoGen_OriginalObject()
	 * @model
	 * @generated
	 */
	VideoGen getOriginalObject();

	/**
	 * Sets the value of the '{@link videoGenTrace.States.videoGen.TracedVideoGen#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(VideoGen value);

} // TracedVideoGen
