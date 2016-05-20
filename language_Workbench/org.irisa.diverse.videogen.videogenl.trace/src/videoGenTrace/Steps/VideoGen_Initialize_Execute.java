/**
 */
package videoGenTrace.Steps;

import org.gemoc.executionframework.engine.mse.SequentialStep;

import org.irisa.diverse.videogen.videoGen.Initialize;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen Initialize Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see videoGenTrace.Steps.StepsPackage#getVideoGen_Initialize_Execute()
 * @model
 * @generated
 */
public interface VideoGen_Initialize_Execute extends VideoGen_Sequence_Execute_AbstractSubStep, VideoGen_Alternatives_Execute_AbstractSubStep, VideoGen_Mandatory_Execute_AbstractSubStep, VideoGen_Optional_Execute_AbstractSubStep, VideoGen_Transition_Execute_AbstractSubStep, VideoGen_VideoGen_Execute_AbstractSubStep, SpecificStep, SequentialStep<VideoGen_Initialize_Execute_AbstractSubStep>, VideoGen_Initialize_Execute_AbstractSubStep, VideoGen_Generate_Execute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.irisa.diverse.videogen.videoGen.Initialize) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Initialize getCaller();

} // VideoGen_Initialize_Execute
