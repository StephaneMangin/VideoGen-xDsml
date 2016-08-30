/**
 */
package videoGenTrace.States;

import org.eclipse.emf.common.util.EList;

import videoGenTrace.States.videoGen.TracedTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition callnext Transition Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link videoGenTrace.States.Transition_callnextTransition_Value#getCallnextTransition <em>Callnext Transition</em>}</li>
 *   <li>{@link videoGenTrace.States.Transition_callnextTransition_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link videoGenTrace.States.Transition_callnextTransition_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see videoGenTrace.States.StatesPackage#getTransition_callnextTransition_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Transition_callnextTransition_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Callnext Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callnext Transition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callnext Transition</em>' attribute.
	 * @see #setCallnextTransition(Boolean)
	 * @see videoGenTrace.States.StatesPackage#getTransition_callnextTransition_Value_CallnextTransition()
	 * @model
	 * @generated
	 */
	Boolean getCallnextTransition();

	/**
	 * Sets the value of the '{@link videoGenTrace.States.Transition_callnextTransition_Value#getCallnextTransition <em>Callnext Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callnext Transition</em>' attribute.
	 * @see #getCallnextTransition()
	 * @generated
	 */
	void setCallnextTransition(Boolean value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link videoGenTrace.States.videoGen.TracedTransition#getCallnextTransitionSequence <em>Callnext Transition Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedTransition)
	 * @see videoGenTrace.States.StatesPackage#getTransition_callnextTransition_Value_Parent()
	 * @see videoGenTrace.States.videoGen.TracedTransition#getCallnextTransitionSequence
	 * @model opposite="callnextTransitionSequence" required="true" transient="false"
	 * @generated
	 */
	TracedTransition getParent();

	/**
	 * Sets the value of the '{@link videoGenTrace.States.Transition_callnextTransition_Value#getParent <em>Parent</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link videoGenTrace.States.State#getTransition_callnextTransition_Values <em>Transition callnext Transition Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see videoGenTrace.States.StatesPackage#getTransition_callnextTransition_Value_States()
	 * @see videoGenTrace.States.State#getTransition_callnextTransition_Values
	 * @model opposite="transition_callnextTransition_Values" required="true"
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

} // Transition_callnextTransition_Value
