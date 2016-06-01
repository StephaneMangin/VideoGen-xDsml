/**
 */
package videoGenTrace;

import org.eclipse.emf.common.util.EList;

import org.gemoc.executionframework.engine.mse.SequentialStep;
import org.gemoc.executionframework.engine.mse.Trace;

import videoGenTrace.States.State;

import videoGenTrace.Steps.SpecificStep;
import videoGenTrace.Steps.VideoGen_Alternatives_Execute;
import videoGenTrace.Steps.VideoGen_Generate_Execute;
import videoGenTrace.Steps.VideoGen_Initialize_Execute;
import videoGenTrace.Steps.VideoGen_Mandatory_Execute;
import videoGenTrace.Steps.VideoGen_Optional_Execute;
import videoGenTrace.Steps.VideoGen_Sequence_Execute;
import videoGenTrace.Steps.VideoGen_Transition_Execute;
import videoGenTrace.Steps.VideoGen_Transition_FinishExecute;
import videoGenTrace.Steps.VideoGen_VideoGen_Compute;
import videoGenTrace.Steps.VideoGen_VideoGen_Execute;
import videoGenTrace.Steps.VideoGen_VideoGen_InitializeModel;
import videoGenTrace.Steps.VideoGen_VideoGen_Setup;
import videoGenTrace.Steps.VideoGen_Video_Select;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link videoGenTrace.SpecificTrace#getVideoGen_Alternatives_Execute_Sequence <em>Video Gen Alternatives Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.SpecificTrace#getVideoGen_Generate_Execute_Sequence <em>Video Gen Generate Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.SpecificTrace#getVideoGen_Initialize_Execute_Sequence <em>Video Gen Initialize Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.SpecificTrace#getVideoGen_Mandatory_Execute_Sequence <em>Video Gen Mandatory Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.SpecificTrace#getVideoGen_Optional_Execute_Sequence <em>Video Gen Optional Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.SpecificTrace#getVideoGen_Sequence_Execute_Sequence <em>Video Gen Sequence Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.SpecificTrace#getVideoGen_Transition_Execute_Sequence <em>Video Gen Transition Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.SpecificTrace#getVideoGen_Transition_FinishExecute_Sequence <em>Video Gen Transition Finish Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.SpecificTrace#getVideoGen_VideoGen_Compute_Sequence <em>Video Gen Video Gen Compute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.SpecificTrace#getVideoGen_VideoGen_Execute_Sequence <em>Video Gen Video Gen Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.SpecificTrace#getVideoGen_VideoGen_InitializeModel_Sequence <em>Video Gen Video Gen Initialize Model Sequence</em>}</li>
 *   <li>{@link videoGenTrace.SpecificTrace#getVideoGen_VideoGen_Setup_Sequence <em>Video Gen Video Gen Setup Sequence</em>}</li>
 *   <li>{@link videoGenTrace.SpecificTrace#getVideoGen_Video_Select_Sequence <em>Video Gen Video Select Sequence</em>}</li>
 *   <li>{@link videoGenTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @see videoGenTrace.VideoGenTracePackage#getSpecificTrace()
 * @model
 * @generated
 */
public interface SpecificTrace extends Trace<SequentialStep<SpecificStep>> {
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
	 * @see videoGenTrace.VideoGenTracePackage#getSpecificTrace_VideoGen_Alternatives_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<VideoGen_Alternatives_Execute> getVideoGen_Alternatives_Execute_Sequence();

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
	 * @see videoGenTrace.VideoGenTracePackage#getSpecificTrace_VideoGen_Generate_Execute_Sequence()
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
	 * @see videoGenTrace.VideoGenTracePackage#getSpecificTrace_VideoGen_Initialize_Execute_Sequence()
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
	 * @see videoGenTrace.VideoGenTracePackage#getSpecificTrace_VideoGen_Mandatory_Execute_Sequence()
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
	 * @see videoGenTrace.VideoGenTracePackage#getSpecificTrace_VideoGen_Optional_Execute_Sequence()
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
	 * @see videoGenTrace.VideoGenTracePackage#getSpecificTrace_VideoGen_Sequence_Execute_Sequence()
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
	 * @see videoGenTrace.VideoGenTracePackage#getSpecificTrace_VideoGen_Transition_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<VideoGen_Transition_Execute> getVideoGen_Transition_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Video Gen Transition Finish Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link videoGenTrace.Steps.VideoGen_Transition_FinishExecute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen Transition Finish Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen Transition Finish Execute Sequence</em>' reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getSpecificTrace_VideoGen_Transition_FinishExecute_Sequence()
	 * @model
	 * @generated
	 */
	EList<VideoGen_Transition_FinishExecute> getVideoGen_Transition_FinishExecute_Sequence();

	/**
	 * Returns the value of the '<em><b>Video Gen Video Gen Compute Sequence</b></em>' reference list.
	 * The list contents are of type {@link videoGenTrace.Steps.VideoGen_VideoGen_Compute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen Video Gen Compute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen Video Gen Compute Sequence</em>' reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getSpecificTrace_VideoGen_VideoGen_Compute_Sequence()
	 * @model
	 * @generated
	 */
	EList<VideoGen_VideoGen_Compute> getVideoGen_VideoGen_Compute_Sequence();

	/**
	 * Returns the value of the '<em><b>Video Gen Video Gen Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link videoGenTrace.Steps.VideoGen_VideoGen_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen Video Gen Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen Video Gen Execute Sequence</em>' reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getSpecificTrace_VideoGen_VideoGen_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<VideoGen_VideoGen_Execute> getVideoGen_VideoGen_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Video Gen Video Gen Initialize Model Sequence</b></em>' reference list.
	 * The list contents are of type {@link videoGenTrace.Steps.VideoGen_VideoGen_InitializeModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen Video Gen Initialize Model Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen Video Gen Initialize Model Sequence</em>' reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getSpecificTrace_VideoGen_VideoGen_InitializeModel_Sequence()
	 * @model
	 * @generated
	 */
	EList<VideoGen_VideoGen_InitializeModel> getVideoGen_VideoGen_InitializeModel_Sequence();

	/**
	 * Returns the value of the '<em><b>Video Gen Video Gen Setup Sequence</b></em>' reference list.
	 * The list contents are of type {@link videoGenTrace.Steps.VideoGen_VideoGen_Setup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen Video Gen Setup Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen Video Gen Setup Sequence</em>' reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getSpecificTrace_VideoGen_VideoGen_Setup_Sequence()
	 * @model
	 * @generated
	 */
	EList<VideoGen_VideoGen_Setup> getVideoGen_VideoGen_Setup_Sequence();

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
	 * @see videoGenTrace.VideoGenTracePackage#getSpecificTrace_VideoGen_Video_Select_Sequence()
	 * @model
	 * @generated
	 */
	EList<VideoGen_Video_Select> getVideoGen_Video_Select_Sequence();

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
	 * @see videoGenTrace.VideoGenTracePackage#getSpecificTrace_StatesTrace()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStatesTrace();

} // SpecificTrace
