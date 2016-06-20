/**
 */
package videoGenTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import videoGenTrace.States.videoGen.TracedAlternatives;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen Alternatives Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see videoGenTrace.Steps.StepsPackage#getVideoGen_Alternatives_Execute()
 * @model
 * @generated
 */
public interface VideoGen_Alternatives_Execute extends VideoGen_VideoGen_Execute_AbstractSubStep, SpecificStep, SequentialStep<VideoGen_Alternatives_Execute_AbstractSubStep>, VideoGen_Alternatives_Execute_AbstractSubStep, VideoGen_Transition_Execute_AbstractSubStep, VideoGen_Transition_FinishExecute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (videoGenTrace.States.videoGen.TracedAlternatives) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedAlternatives getCaller();

} // VideoGen_Alternatives_Execute
