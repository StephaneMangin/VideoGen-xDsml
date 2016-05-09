/**
 */
package videoGenTrace.Steps;

import org.irisa.diverse.videogen.videoGen.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen Transition Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see videoGenTrace.Steps.StepsPackage#getVideoGen_Transition_Execute()
 * @model
 * @generated
 */
public interface VideoGen_Transition_Execute extends SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.irisa.diverse.videogen.videoGen.Transition) this.getMse().getCaller();'"
	 * @generated
	 */
	Transition getCaller();

} // VideoGen_Transition_Execute
