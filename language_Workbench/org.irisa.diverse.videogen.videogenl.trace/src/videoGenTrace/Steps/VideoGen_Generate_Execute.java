/**
 */
package videoGenTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import videoGenTrace.States.videoGen.TracedGenerate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen Generate Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see videoGenTrace.Steps.StepsPackage#getVideoGen_Generate_Execute()
 * @model
 * @generated
 */
public interface VideoGen_Generate_Execute extends VideoGen_VideoGen_Execute_AbstractSubStep, SpecificStep, SequentialStep<VideoGen_Generate_Execute_AbstractSubStep>, VideoGen_Transition_FinishExecute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (videoGenTrace.States.videoGen.TracedGenerate) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedGenerate getCaller();

} // VideoGen_Generate_Execute
