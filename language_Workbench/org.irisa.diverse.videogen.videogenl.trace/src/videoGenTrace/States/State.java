/**
 */
package videoGenTrace.States;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import videoGenTrace.Steps.SpecificStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link videoGenTrace.States.State#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link videoGenTrace.States.State#getStartedSteps <em>Started Steps</em>}</li>
 *   <li>{@link videoGenTrace.States.State#getTransition_callnextTransition_Values <em>Transition callnext Transition Values</em>}</li>
 *   <li>{@link videoGenTrace.States.State#getTransition_executed_Values <em>Transition executed Values</em>}</li>
 *   <li>{@link videoGenTrace.States.State#getTransition_videoGen_Values <em>Transition video Gen Values</em>}</li>
 * </ul>
 *
 * @see videoGenTrace.States.StatesPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Ended Steps</b></em>' reference list.
	 * The list contents are of type {@link videoGenTrace.Steps.SpecificStep}.
	 * It is bidirectional and its opposite is '{@link videoGenTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ended Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ended Steps</em>' reference list.
	 * @see videoGenTrace.States.StatesPackage#getState_EndedSteps()
	 * @see videoGenTrace.Steps.SpecificStep#getEndingState
	 * @model opposite="endingState"
	 * @generated
	 */
	EList<SpecificStep> getEndedSteps();

	/**
	 * Returns the value of the '<em><b>Started Steps</b></em>' reference list.
	 * The list contents are of type {@link videoGenTrace.Steps.SpecificStep}.
	 * It is bidirectional and its opposite is '{@link videoGenTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started Steps</em>' reference list.
	 * @see videoGenTrace.States.StatesPackage#getState_StartedSteps()
	 * @see videoGenTrace.Steps.SpecificStep#getStartingState
	 * @model opposite="startingState"
	 * @generated
	 */
	EList<SpecificStep> getStartedSteps();

	/**
	 * Returns the value of the '<em><b>Transition callnext Transition Values</b></em>' reference list.
	 * The list contents are of type {@link videoGenTrace.States.Transition_callnextTransition_Value}.
	 * It is bidirectional and its opposite is '{@link videoGenTrace.States.Transition_callnextTransition_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition callnext Transition Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition callnext Transition Values</em>' reference list.
	 * @see videoGenTrace.States.StatesPackage#getState_Transition_callnextTransition_Values()
	 * @see videoGenTrace.States.Transition_callnextTransition_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Transition_callnextTransition_Value> getTransition_callnextTransition_Values();

	/**
	 * Returns the value of the '<em><b>Transition executed Values</b></em>' reference list.
	 * The list contents are of type {@link videoGenTrace.States.Transition_executed_Value}.
	 * It is bidirectional and its opposite is '{@link videoGenTrace.States.Transition_executed_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition executed Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition executed Values</em>' reference list.
	 * @see videoGenTrace.States.StatesPackage#getState_Transition_executed_Values()
	 * @see videoGenTrace.States.Transition_executed_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Transition_executed_Value> getTransition_executed_Values();

	/**
	 * Returns the value of the '<em><b>Transition video Gen Values</b></em>' reference list.
	 * The list contents are of type {@link videoGenTrace.States.Transition_videoGen_Value}.
	 * It is bidirectional and its opposite is '{@link videoGenTrace.States.Transition_videoGen_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition video Gen Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition video Gen Values</em>' reference list.
	 * @see videoGenTrace.States.StatesPackage#getState_Transition_videoGen_Values()
	 * @see videoGenTrace.States.Transition_videoGen_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Transition_videoGen_Value> getTransition_videoGen_Values();

} // State
