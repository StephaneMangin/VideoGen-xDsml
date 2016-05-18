/**
 */
package videoGenTrace.Steps;

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
public interface VideoGen_Optional_Execute extends SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.irisa.diverse.videogen.videoGen.Optional) this.getMse().getCaller();'"
	 * @generated
	 */
	Optional getCaller();

} // VideoGen_Optional_Execute
