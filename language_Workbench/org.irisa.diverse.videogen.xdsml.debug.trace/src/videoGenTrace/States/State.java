/**
 */
package videoGenTrace.States;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import videoGenTrace.Steps.Step;

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
	 * The list contents are of type {@link videoGenTrace.Steps.Step}.
	 * It is bidirectional and its opposite is '{@link videoGenTrace.Steps.Step#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ended Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ended Steps</em>' reference list.
	 * @see videoGenTrace.States.StatesPackage#getState_EndedSteps()
	 * @see videoGenTrace.Steps.Step#getEndingState
	 * @model opposite="endingState"
	 * @generated
	 */
	EList<Step> getEndedSteps();

	/**
	 * Returns the value of the '<em><b>Started Steps</b></em>' reference list.
	 * The list contents are of type {@link videoGenTrace.Steps.Step}.
	 * It is bidirectional and its opposite is '{@link videoGenTrace.Steps.Step#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started Steps</em>' reference list.
	 * @see videoGenTrace.States.StatesPackage#getState_StartedSteps()
	 * @see videoGenTrace.Steps.Step#getStartingState
	 * @model opposite="startingState"
	 * @generated
	 */
	EList<Step> getStartedSteps();

} // State
