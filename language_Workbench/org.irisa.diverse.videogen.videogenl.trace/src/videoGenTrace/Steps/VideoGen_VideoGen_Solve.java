/**
 */
package videoGenTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import videoGenTrace.States.videoGen.TracedVideoGen;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen Video Gen Solve</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see videoGenTrace.Steps.StepsPackage#getVideoGen_VideoGen_Solve()
 * @model
 * @generated
 */
public interface VideoGen_VideoGen_Solve extends VideoGen_VideoGen_Execute_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (videoGenTrace.States.videoGen.TracedVideoGen) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedVideoGen getCaller();

} // VideoGen_VideoGen_Solve
