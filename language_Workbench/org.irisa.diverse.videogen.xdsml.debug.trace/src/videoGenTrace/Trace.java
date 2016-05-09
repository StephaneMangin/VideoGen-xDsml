/**
 */
package videoGenTrace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import videoGenTrace.States.State;

import videoGenTrace.Steps.Step;
import videoGenTrace.Steps.VideoGen_Alternatives_Execute;
import videoGenTrace.Steps.VideoGen_Delay_Execute;
import videoGenTrace.Steps.VideoGen_Generate_Compute;
import videoGenTrace.Steps.VideoGen_Generate_Execute;
import videoGenTrace.Steps.VideoGen_Initialize_Execute;
import videoGenTrace.Steps.VideoGen_Mandatory_Execute;
import videoGenTrace.Steps.VideoGen_Optional_Execute;
import videoGenTrace.Steps.VideoGen_Sequence_Execute;
import videoGenTrace.Steps.VideoGen_Transition_Execute;
import videoGenTrace.Steps.VideoGen_Video_Select;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link videoGenTrace.Trace#getVideoGen_Alternatives_Execute_Sequence <em>Video Gen Alternatives Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.Trace#getVideoGen_Delay_Execute_Sequence <em>Video Gen Delay Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.Trace#getVideoGen_Generate_Compute_Sequence <em>Video Gen Generate Compute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.Trace#getVideoGen_Generate_Execute_Sequence <em>Video Gen Generate Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.Trace#getVideoGen_Initialize_Execute_Sequence <em>Video Gen Initialize Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.Trace#getVideoGen_Mandatory_Execute_Sequence <em>Video Gen Mandatory Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.Trace#getVideoGen_Optional_Execute_Sequence <em>Video Gen Optional Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.Trace#getVideoGen_Sequence_Execute_Sequence <em>Video Gen Sequence Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.Trace#getVideoGen_Transition_Execute_Sequence <em>Video Gen Transition Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.Trace#getVideoGen_Video_Select_Sequence <em>Video Gen Video Select Sequence</em>}</li>
 *   <li>{@link videoGenTrace.Trace#getRootSteps <em>Root Steps</em>}</li>
 *   <li>{@link videoGenTrace.Trace#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @see videoGenTrace.VideoGenTracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Video Gen Alternatives Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link videoGenTrace.Steps.VideoGen_Alternatives_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen Alternatives Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen Alternatives Execute Sequence</em>' reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getTrace_VideoGen_Alternatives_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<VideoGen_Alternatives_Execute> getVideoGen_Alternatives_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Video Gen Delay Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link videoGenTrace.Steps.VideoGen_Delay_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen Delay Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen Delay Execute Sequence</em>' reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getTrace_VideoGen_Delay_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<VideoGen_Delay_Execute> getVideoGen_Delay_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Video Gen Generate Compute Sequence</b></em>' reference list.
	 * The list contents are of type {@link videoGenTrace.Steps.VideoGen_Generate_Compute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen Generate Compute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen Generate Compute Sequence</em>' reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getTrace_VideoGen_Generate_Compute_Sequence()
	 * @model
	 * @generated
	 */
	EList<VideoGen_Generate_Compute> getVideoGen_Generate_Compute_Sequence();

	/**
	 * Returns the value of the '<em><b>Video Gen Generate Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link videoGenTrace.Steps.VideoGen_Generate_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen Generate Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen Generate Execute Sequence</em>' reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getTrace_VideoGen_Generate_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<VideoGen_Generate_Execute> getVideoGen_Generate_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Video Gen Initialize Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link videoGenTrace.Steps.VideoGen_Initialize_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen Initialize Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen Initialize Execute Sequence</em>' reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getTrace_VideoGen_Initialize_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<VideoGen_Initialize_Execute> getVideoGen_Initialize_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Video Gen Mandatory Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link videoGenTrace.Steps.VideoGen_Mandatory_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen Mandatory Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen Mandatory Execute Sequence</em>' reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getTrace_VideoGen_Mandatory_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<VideoGen_Mandatory_Execute> getVideoGen_Mandatory_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Video Gen Optional Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link videoGenTrace.Steps.VideoGen_Optional_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen Optional Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen Optional Execute Sequence</em>' reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getTrace_VideoGen_Optional_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<VideoGen_Optional_Execute> getVideoGen_Optional_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Video Gen Sequence Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link videoGenTrace.Steps.VideoGen_Sequence_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen Sequence Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen Sequence Execute Sequence</em>' reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getTrace_VideoGen_Sequence_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<VideoGen_Sequence_Execute> getVideoGen_Sequence_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Video Gen Transition Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link videoGenTrace.Steps.VideoGen_Transition_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen Transition Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen Transition Execute Sequence</em>' reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getTrace_VideoGen_Transition_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<VideoGen_Transition_Execute> getVideoGen_Transition_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Video Gen Video Select Sequence</b></em>' reference list.
	 * The list contents are of type {@link videoGenTrace.Steps.VideoGen_Video_Select}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen Video Select Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen Video Select Sequence</em>' reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getTrace_VideoGen_Video_Select_Sequence()
	 * @model
	 * @generated
	 */
	EList<VideoGen_Video_Select> getVideoGen_Video_Select_Sequence();

	/**
	 * Returns the value of the '<em><b>Root Steps</b></em>' containment reference list.
	 * The list contents are of type {@link videoGenTrace.Steps.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Steps</em>' containment reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getTrace_RootSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getRootSteps();

	/**
	 * Returns the value of the '<em><b>States Trace</b></em>' containment reference list.
	 * The list contents are of type {@link videoGenTrace.States.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States Trace</em>' containment reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getTrace_StatesTrace()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStatesTrace();

} // Trace
