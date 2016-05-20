/**
 */
package videoGenTrace.Steps;

import org.gemoc.executionframework.engine.mse.SequentialStep;

import org.irisa.diverse.videogen.videoGen.Optional;

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
public interface VideoGen_Optional_Execute extends VideoGen_Sequence_Execute_AbstractSubStep, VideoGen_Alternatives_Execute_AbstractSubStep, VideoGen_Mandatory_Execute_AbstractSubStep, SpecificStep, SequentialStep<VideoGen_Optional_Execute_AbstractSubStep>, VideoGen_Optional_Execute_AbstractSubStep, VideoGen_Transition_Execute_AbstractSubStep, VideoGen_Initialize_Execute_AbstractSubStep, VideoGen_Generate_Execute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.irisa.diverse.videogen.videoGen.Optional) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Optional getCaller();

} // VideoGen_Optional_Execute
