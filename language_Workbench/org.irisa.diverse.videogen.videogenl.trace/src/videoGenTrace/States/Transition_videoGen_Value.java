/**
 */
package videoGenTrace.States;

import org.eclipse.emf.common.util.EList;

import videoGenTrace.States.videoGen.TracedTransition;
import videoGenTrace.States.videoGen.TracedVideoGen;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition video Gen Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link videoGenTrace.States.Transition_videoGen_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link videoGenTrace.States.Transition_videoGen_Value#getStates <em>States</em>}</li>
 *   <li>{@link videoGenTrace.States.Transition_videoGen_Value#getVideoGen <em>Video Gen</em>}</li>
 * </ul>
 *
 * @see videoGenTrace.States.StatesPackage#getTransition_videoGen_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Transition_videoGen_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link videoGenTrace.States.videoGen.TracedTransition#getVideoGenSequence <em>Video Gen Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedTransition)
	 * @see videoGenTrace.States.StatesPackage#getTransition_videoGen_Value_Parent()
	 * @see videoGenTrace.States.videoGen.TracedTransition#getVideoGenSequence
	 * @model opposite="videoGenSequence" required="true" transient="false"
	 * @generated
	 */
	TracedTransition getParent();

	/**
	 * Sets the value of the '{@link videoGenTrace.States.Transition_videoGen_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedTransition value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link videoGenTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link videoGenTrace.States.State#getTransition_videoGen_Values <em>Transition video Gen Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see videoGenTrace.States.StatesPackage#getTransition_videoGen_Value_States()
	 * @see videoGenTrace.States.State#getTransition_videoGen_Values
	 * @model opposite="transition_videoGen_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Video Gen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen</em>' reference.
	 * @see #setVideoGen(TracedVideoGen)
	 * @see videoGenTrace.States.StatesPackage#getTransition_videoGen_Value_VideoGen()
	 * @model
	 * @generated
	 */
	TracedVideoGen getVideoGen();

	/**
	 * Sets the value of the '{@link videoGenTrace.States.Transition_videoGen_Value#getVideoGen <em>Video Gen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video Gen</em>' reference.
	 * @see #getVideoGen()
	 * @generated
	 */
	void setVideoGen(TracedVideoGen value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // Transition_videoGen_Value
