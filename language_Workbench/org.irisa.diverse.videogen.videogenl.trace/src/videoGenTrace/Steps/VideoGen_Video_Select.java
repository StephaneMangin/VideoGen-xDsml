/**
 */
package videoGenTrace.Steps;

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
public interface VideoGen_Video_Select extends SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.irisa.diverse.videogen.videoGen.Video) this.getMse().getCaller();'"
	 * @generated
	 */
	Video getCaller();

} // VideoGen_Video_Select
