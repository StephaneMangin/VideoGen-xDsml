/**
 */
package videoGenTrace.States.videoGen;

import org.eclipse.emf.common.util.EList;

import videoGenTrace.States.Transition_callnextTransition_Value;
import videoGenTrace.States.Transition_executed_Value;
import videoGenTrace.States.Transition_videoGen_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link videoGenTrace.States.videoGen.TracedTransition#getCallnextTransitionSequence <em>Callnext Transition Sequence</em>}</li>
 *   <li>{@link videoGenTrace.States.videoGen.TracedTransition#getExecutedSequence <em>Executed Sequence</em>}</li>
 *   <li>{@link videoGenTrace.States.videoGen.TracedTransition#getVideoGenSequence <em>Video Gen Sequence</em>}</li>
 * </ul>
 *
 * @see videoGenTrace.States.videoGen.VideoGenPackage#getTracedTransition()
 * @model abstract="true"
 * @generated
 */
public interface TracedTransition extends TracedNamedElement {
	/**
	 * Returns the value of the '<em><b>Callnext Transition Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link videoGenTrace.States.Transition_callnextTransition_Value}.
	 * It is bidirectional and its opposite is '{@link videoGenTrace.States.Transition_callnextTransition_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callnext Transition Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callnext Transition Sequence</em>' containment reference list.
	 * @see videoGenTrace.States.videoGen.VideoGenPackage#getTracedTransition_CallnextTransitionSequence()
	 * @see videoGenTrace.States.Transition_callnextTransition_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Transition_callnextTransition_Value> getCallnextTransitionSequence();

	/**
	 * Returns the value of the '<em><b>Executed Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link videoGenTrace.States.Transition_executed_Value}.
	 * It is bidirectional and its opposite is '{@link videoGenTrace.States.Transition_executed_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executed Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed Sequence</em>' containment reference list.
	 * @see videoGenTrace.States.videoGen.VideoGenPackage#getTracedTransition_ExecutedSequence()
	 * @see videoGenTrace.States.Transition_executed_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Transition_executed_Value> getExecutedSequence();

	/**
	 * Returns the value of the '<em><b>Video Gen Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link videoGenTrace.States.Transition_videoGen_Value}.
	 * It is bidirectional and its opposite is '{@link videoGenTrace.States.Transition_videoGen_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen Sequence</em>' containment reference list.
	 * @see videoGenTrace.States.videoGen.VideoGenPackage#getTracedTransition_VideoGenSequence()
	 * @see videoGenTrace.States.Transition_videoGen_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Transition_videoGen_Value> getVideoGenSequence();

} // TracedTransition
