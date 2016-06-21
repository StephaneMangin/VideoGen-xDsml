/**
 */
package videoGenTrace.States;

import org.eclipse.emf.common.util.EList;

import videoGenTrace.States.videoGen.TracedTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition executed Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link videoGenTrace.States.Transition_executed_Value#getExecuted <em>Executed</em>}</li>
 *   <li>{@link videoGenTrace.States.Transition_executed_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link videoGenTrace.States.Transition_executed_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see videoGenTrace.States.StatesPackage#getTransition_executed_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Transition_executed_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed</em>' attribute.
	 * @see #setExecuted(Boolean)
	 * @see videoGenTrace.States.StatesPackage#getTransition_executed_Value_Executed()
	 * @model
	 * @generated
	 */
	Boolean getExecuted();

	/**
	 * Sets the value of the '{@link videoGenTrace.States.Transition_executed_Value#getExecuted <em>Executed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executed</em>' attribute.
	 * @see #getExecuted()
	 * @generated
	 */
	void setExecuted(Boolean value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link videoGenTrace.States.videoGen.TracedTransition#getExecutedSequence <em>Executed Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedTransition)
	 * @see videoGenTrace.States.StatesPackage#getTransition_executed_Value_Parent()
	 * @see videoGenTrace.States.videoGen.TracedTransition#getExecutedSequence
	 * @model opposite="executedSequence" required="true" transient="false"
	 * @generated
	 */
	TracedTransition getParent();

	/**
	 * Sets the value of the '{@link videoGenTrace.States.Transition_executed_Value#getParent <em>Parent</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link videoGenTrace.States.State#getTransition_executed_Values <em>Transition executed Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see videoGenTrace.States.StatesPackage#getTransition_executed_Value_States()
	 * @see videoGenTrace.States.State#getTransition_executed_Values
	 * @model opposite="transition_executed_Values" required="true"
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

} // Transition_executed_Value
