/**
 */
package videoGenTrace.Steps;

import org.gemoc.executionframework.engine.mse.SmallStep;

import org.irisa.diverse.videogen.videoGen.Video;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen Video Select</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see videoGenTrace.Steps.StepsPackage#getVideoGen_Video_Select()
 * @model
 * @generated
 */
public interface VideoGen_Video_Select extends VideoGen_Alternatives_Execute_AbstractSubStep, VideoGen_Mandatory_Execute_AbstractSubStep, VideoGen_Optional_Execute_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.irisa.diverse.videogen.videoGen.Video) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Video getCaller();

} // VideoGen_Video_Select
