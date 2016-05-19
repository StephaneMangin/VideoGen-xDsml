/**
 */
package videoGenTrace.Steps;

import org.gemoc.executionframework.engine.mse.SequentialStep;

import org.irisa.diverse.videogen.videoGen.Delay;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen Delay Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see videoGenTrace.Steps.StepsPackage#getVideoGen_Delay_Execute()
 * @model
 * @generated
 */
public interface VideoGen_Delay_Execute extends VideoGen_Alternatives_Execute_AbstractSubStep, VideoGen_Mandatory_Execute_AbstractSubStep, VideoGen_Optional_Execute_AbstractSubStep, VideoGen_Transition_Execute_AbstractSubStep, VideoGen_VideoGen_Execute_AbstractSubStep, VideoGen_Generate_Execute_AbstractSubStep, SpecificStep, SequentialStep<VideoGen_Delay_Execute_AbstractSubStep>, VideoGen_Delay_Execute_AbstractSubStep, VideoGen_Initialize_Execute_AbstractSubStep, VideoGen_Sequence_Execute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.irisa.diverse.videogen.videoGen.Delay) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Delay getCaller();

} // VideoGen_Delay_Execute
