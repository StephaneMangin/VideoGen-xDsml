/**
 */
package videoGenTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import videoGenTrace.States.videoGen.TracedOptional;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen Optional Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see videoGenTrace.Steps.StepsPackage#getVideoGen_Optional_Execute()
 * @model
 * @generated
 */
public interface VideoGen_Optional_Execute extends VideoGen_VideoGen_Execute_AbstractSubStep, SpecificStep, SequentialStep<VideoGen_Optional_Execute_AbstractSubStep>, VideoGen_Transition_FinishExecute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (videoGenTrace.States.videoGen.TracedOptional) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedOptional getCaller();

} // VideoGen_Optional_Execute
