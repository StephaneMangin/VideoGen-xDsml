/**
 */
package videoGenTrace.States;

import org.eclipse.emf.common.util.EList;

import videoGenTrace.States.videoGen.TracedVideoGen;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen initialized Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link videoGenTrace.States.VideoGen_initialized_Value#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link videoGenTrace.States.VideoGen_initialized_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link videoGenTrace.States.VideoGen_initialized_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see videoGenTrace.States.StatesPackage#getVideoGen_initialized_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface VideoGen_initialized_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialized</em>' attribute.
	 * @see #setInitialized(boolean)
	 * @see videoGenTrace.States.StatesPackage#getVideoGen_initialized_Value_Initialized()
	 * @model
	 * @generated
	 */
	boolean isInitialized();

	/**
	 * Sets the value of the '{@link videoGenTrace.States.VideoGen_initialized_Value#isInitialized <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialized</em>' attribute.
	 * @see #isInitialized()
	 * @generated
	 */
	void setInitialized(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link videoGenTrace.States.videoGen.TracedVideoGen#getInitializedSequence <em>Initialized Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedVideoGen)
	 * @see videoGenTrace.States.StatesPackage#getVideoGen_initialized_Value_Parent()
	 * @see videoGenTrace.States.videoGen.TracedVideoGen#getInitializedSequence
	 * @model opposite="initializedSequence" required="true" transient="false"
	 * @generated
	 */
	TracedVideoGen getParent();

	/**
	 * Sets the value of the '{@link videoGenTrace.States.VideoGen_initialized_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedVideoGen value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link videoGenTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link videoGenTrace.States.State#getVideoGen_initialized_Values <em>Video Gen initialized Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see videoGenTrace.States.StatesPackage#getVideoGen_initialized_Value_States()
	 * @see videoGenTrace.States.State#getVideoGen_initialized_Values
	 * @model opposite="videoGen_initialized_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // VideoGen_initialized_Value
