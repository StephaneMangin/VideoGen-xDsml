/**
 */
package videoGenTrace;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.Trace;

import org.eclipse.emf.common.util.EList;

import videoGenTrace.States.State;

import videoGenTrace.States.videoGen.TracedAlternatives;
import videoGenTrace.States.videoGen.TracedDelay;
import videoGenTrace.States.videoGen.TracedGenerate;
import videoGenTrace.States.videoGen.TracedInitialize;
import videoGenTrace.States.videoGen.TracedMandatory;
import videoGenTrace.States.videoGen.TracedOptional;
import videoGenTrace.States.videoGen.TracedVideo;
import videoGenTrace.States.videoGen.TracedVideoGen;

import videoGenTrace.Steps.SpecificStep;
import videoGenTrace.Steps.VideoGen_Alternatives_Execute;
import videoGenTrace.Steps.VideoGen_Generate_Execute;
import videoGenTrace.Steps.VideoGen_Initialize_Execute;
import videoGenTrace.Steps.VideoGen_Mandatory_Execute;
import videoGenTrace.Steps.VideoGen_Optional_Execute;
import videoGenTrace.Steps.VideoGen_VideoGen_Setup;
import videoGenTrace.Steps.VideoGen_Video_Setup;

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
 *   <li>{@link videoGenTrace.SpecificTrace#getVideoGen_VideoGen_Setup_Sequence <em>Video Gen Video Gen Setup Sequence</em>}</li>
 *   <li>{@link videoGenTrace.SpecificTrace#getVideoGen_Video_Setup_Sequence <em>Video Gen Video Setup Sequence</em>}</li>
 *   <li>{@link videoGenTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}</li>
 *   <li>{@link videoGenTrace.SpecificTrace#getVideoGen_tracedAlternativess <em>Video Gen traced Alternativess</em>}</li>
 *   <li>{@link videoGenTrace.SpecificTrace#getVideoGen_tracedDelays <em>Video Gen traced Delays</em>}</li>
 *   <li>{@link videoGenTrace.SpecificTrace#getVideoGen_tracedGenerates <em>Video Gen traced Generates</em>}</li>
 *   <li>{@link videoGenTrace.SpecificTrace#getVideoGen_tracedInitializes <em>Video Gen traced Initializes</em>}</li>
 *   <li>{@link videoGenTrace.SpecificTrace#getVideoGen_tracedMandatorys <em>Video Gen traced Mandatorys</em>}</li>
 *   <li>{@link videoGenTrace.SpecificTrace#getVideoGen_tracedOptionals <em>Video Gen traced Optionals</em>}</li>
 *   <li>{@link videoGenTrace.SpecificTrace#getVideoGen_tracedVideoGens <em>Video Gen traced Video Gens</em>}</li>
 *   <li>{@link videoGenTrace.SpecificTrace#getVideoGen_tracedVideos <em>Video Gen traced Videos</em>}</li>
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
	 * Returns the value of the '<em><b>Video Gen Video Setup Sequence</b></em>' reference list.
	 * The list contents are of type {@link videoGenTrace.Steps.VideoGen_Video_Setup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen Video Setup Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen Video Setup Sequence</em>' reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getSpecificTrace_VideoGen_Video_Setup_Sequence()
	 * @model
	 * @generated
	 */
	EList<VideoGen_Video_Setup> getVideoGen_Video_Setup_Sequence();

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

	/**
	 * Returns the value of the '<em><b>Video Gen traced Alternativess</b></em>' containment reference list.
	 * The list contents are of type {@link videoGenTrace.States.videoGen.TracedAlternatives}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen traced Alternativess</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen traced Alternativess</em>' containment reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getSpecificTrace_VideoGen_tracedAlternativess()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedAlternatives> getVideoGen_tracedAlternativess();

	/**
	 * Returns the value of the '<em><b>Video Gen traced Delays</b></em>' containment reference list.
	 * The list contents are of type {@link videoGenTrace.States.videoGen.TracedDelay}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen traced Delays</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen traced Delays</em>' containment reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getSpecificTrace_VideoGen_tracedDelays()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedDelay> getVideoGen_tracedDelays();

	/**
	 * Returns the value of the '<em><b>Video Gen traced Generates</b></em>' containment reference list.
	 * The list contents are of type {@link videoGenTrace.States.videoGen.TracedGenerate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen traced Generates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen traced Generates</em>' containment reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getSpecificTrace_VideoGen_tracedGenerates()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedGenerate> getVideoGen_tracedGenerates();

	/**
	 * Returns the value of the '<em><b>Video Gen traced Initializes</b></em>' containment reference list.
	 * The list contents are of type {@link videoGenTrace.States.videoGen.TracedInitialize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen traced Initializes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen traced Initializes</em>' containment reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getSpecificTrace_VideoGen_tracedInitializes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedInitialize> getVideoGen_tracedInitializes();

	/**
	 * Returns the value of the '<em><b>Video Gen traced Mandatorys</b></em>' containment reference list.
	 * The list contents are of type {@link videoGenTrace.States.videoGen.TracedMandatory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen traced Mandatorys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen traced Mandatorys</em>' containment reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getSpecificTrace_VideoGen_tracedMandatorys()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedMandatory> getVideoGen_tracedMandatorys();

	/**
	 * Returns the value of the '<em><b>Video Gen traced Optionals</b></em>' containment reference list.
	 * The list contents are of type {@link videoGenTrace.States.videoGen.TracedOptional}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen traced Optionals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen traced Optionals</em>' containment reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getSpecificTrace_VideoGen_tracedOptionals()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedOptional> getVideoGen_tracedOptionals();

	/**
	 * Returns the value of the '<em><b>Video Gen traced Video Gens</b></em>' containment reference list.
	 * The list contents are of type {@link videoGenTrace.States.videoGen.TracedVideoGen}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen traced Video Gens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen traced Video Gens</em>' containment reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getSpecificTrace_VideoGen_tracedVideoGens()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedVideoGen> getVideoGen_tracedVideoGens();

	/**
	 * Returns the value of the '<em><b>Video Gen traced Videos</b></em>' containment reference list.
	 * The list contents are of type {@link videoGenTrace.States.videoGen.TracedVideo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen traced Videos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen traced Videos</em>' containment reference list.
	 * @see videoGenTrace.VideoGenTracePackage#getSpecificTrace_VideoGen_tracedVideos()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedVideo> getVideoGen_tracedVideos();

} // SpecificTrace
