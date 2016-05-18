/**
 */
package videoGenTrace.Steps;

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
public interface VideoGen_Generate_Compute extends SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.irisa.diverse.videogen.videoGen.Generate) this.getMse().getCaller();'"
	 * @generated
	 */
	Generate getCaller();

} // VideoGen_Generate_Compute
