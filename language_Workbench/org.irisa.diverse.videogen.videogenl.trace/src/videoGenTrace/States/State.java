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

} // State
