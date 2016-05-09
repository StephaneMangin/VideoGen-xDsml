/**
 */
package videoGenTrace.Steps;

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
public interface VideoGen_Delay_Execute extends SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.irisa.diverse.videogen.videoGen.Delay) this.getMse().getCaller();'"
	 * @generated
	 */
	Delay getCaller();

} // VideoGen_Delay_Execute
