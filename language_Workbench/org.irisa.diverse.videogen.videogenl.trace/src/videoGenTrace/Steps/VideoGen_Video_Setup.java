/**
 */
package videoGenTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import videoGenTrace.States.videoGen.TracedVideo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen Video Setup</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see videoGenTrace.Steps.StepsPackage#getVideoGen_Video_Setup()
 * @model
 * @generated
 */
public interface VideoGen_Video_Setup extends SpecificStep, SmallStep, VideoGen_VideoGen_Setup_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (videoGenTrace.States.videoGen.TracedVideo) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedVideo getCaller();

} // VideoGen_Video_Setup
