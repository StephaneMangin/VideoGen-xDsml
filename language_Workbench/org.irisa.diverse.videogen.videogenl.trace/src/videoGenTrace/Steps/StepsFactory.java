/**
 */
package videoGenTrace.Steps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see videoGenTrace.Steps.StepsPackage
 * @generated
 */
public interface StepsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsFactory eINSTANCE = videoGenTrace.Steps.impl.StepsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Implicit Step</em>'.
	 * @generated
	 */
	RootImplicitStep createRootImplicitStep();

	/**
	 * Returns a new object of class '<em>Video Gen Alternatives Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video Gen Alternatives Execute</em>'.
	 * @generated
	 */
	VideoGen_Alternatives_Execute createVideoGen_Alternatives_Execute();

	/**
	 * Returns a new object of class '<em>Video Gen Delay Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video Gen Delay Execute</em>'.
	 * @generated
	 */
	VideoGen_Delay_Execute createVideoGen_Delay_Execute();

	/**
	 * Returns a new object of class '<em>Video Gen Generate Compute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video Gen Generate Compute</em>'.
	 * @generated
	 */
	VideoGen_Generate_Compute createVideoGen_Generate_Compute();

	/**
	 * Returns a new object of class '<em>Video Gen Generate Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video Gen Generate Execute</em>'.
	 * @generated
	 */
	VideoGen_Generate_Execute createVideoGen_Generate_Execute();

	/**
	 * Returns a new object of class '<em>Video Gen Initialize Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video Gen Initialize Execute</em>'.
	 * @generated
	 */
	VideoGen_Initialize_Execute createVideoGen_Initialize_Execute();

	/**
	 * Returns a new object of class '<em>Video Gen Mandatory Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video Gen Mandatory Execute</em>'.
	 * @generated
	 */
	VideoGen_Mandatory_Execute createVideoGen_Mandatory_Execute();

	/**
	 * Returns a new object of class '<em>Video Gen Optional Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video Gen Optional Execute</em>'.
	 * @generated
	 */
	VideoGen_Optional_Execute createVideoGen_Optional_Execute();

	/**
	 * Returns a new object of class '<em>Video Gen Sequence Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video Gen Sequence Execute</em>'.
	 * @generated
	 */
	VideoGen_Sequence_Execute createVideoGen_Sequence_Execute();

	/**
	 * Returns a new object of class '<em>Video Gen Transition Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video Gen Transition Execute</em>'.
	 * @generated
	 */
	VideoGen_Transition_Execute createVideoGen_Transition_Execute();

	/**
	 * Returns a new object of class '<em>Video Gen Video Select</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video Gen Video Select</em>'.
	 * @generated
	 */
	VideoGen_Video_Select createVideoGen_Video_Select();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StepsPackage getStepsPackage();

} //StepsFactory
