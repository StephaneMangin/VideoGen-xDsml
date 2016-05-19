/**
 */
package videoGenTrace.Steps;

import org.gemoc.executionframework.engine.mse.SequentialStep;

import org.irisa.diverse.videogen.videoGen.Generate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen Generate Compute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see videoGenTrace.Steps.StepsPackage#getVideoGen_Generate_Compute()
 * @model
 * @generated
 */
public interface VideoGen_Generate_Compute extends SpecificStep, SequentialStep<VideoGen_Generate_Compute_AbstractSubStep>, VideoGen_Generate_Execute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.irisa.diverse.videogen.videoGen.Generate) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Generate getCaller();

} // VideoGen_Generate_Compute
