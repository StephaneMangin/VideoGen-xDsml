/**
 */
package videoGenTrace.Steps;

import org.irisa.diverse.videogen.videoGen.Mandatory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen Mandatory Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see videoGenTrace.Steps.StepsPackage#getVideoGen_Mandatory_Execute()
 * @model
 * @generated
 */
public interface VideoGen_Mandatory_Execute extends SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.irisa.diverse.videogen.videoGen.Mandatory) this.getMse().getCaller();'"
	 * @generated
	 */
	Mandatory getCaller();

} // VideoGen_Mandatory_Execute
