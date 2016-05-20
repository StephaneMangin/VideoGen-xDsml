/**
 */
package videoGenTrace.Steps;

import org.gemoc.executionframework.engine.mse.SmallStep;

import org.irisa.diverse.videogen.videoGen.VideoGen;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen Video Gen Setup</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see videoGenTrace.Steps.StepsPackage#getVideoGen_VideoGen_Setup()
 * @model
 * @generated
 */
public interface VideoGen_VideoGen_Setup extends VideoGen_VideoGen_InitializeModel_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.irisa.diverse.videogen.videoGen.VideoGen) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	VideoGen getCaller();

} // VideoGen_VideoGen_Setup
