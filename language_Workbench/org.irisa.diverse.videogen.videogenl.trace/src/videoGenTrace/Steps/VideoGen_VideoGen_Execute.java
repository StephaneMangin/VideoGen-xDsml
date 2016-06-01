/**
 */
package videoGenTrace.Steps;

import org.gemoc.executionframework.engine.mse.SequentialStep;

import org.irisa.diverse.videogen.videoGen.VideoGen;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen Video Gen Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see videoGenTrace.Steps.StepsPackage#getVideoGen_VideoGen_Execute()
 * @model
 * @generated
 */
public interface VideoGen_VideoGen_Execute extends SpecificStep, SequentialStep<VideoGen_VideoGen_Execute_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.irisa.diverse.videogen.videoGen.VideoGen) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	VideoGen getCaller();

} // VideoGen_VideoGen_Execute
