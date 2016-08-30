/**
 */
package videoGenTrace.States;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see videoGenTrace.States.StatesPackage
 * @generated
 */
public interface StatesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesFactory eINSTANCE = videoGenTrace.States.impl.StatesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Transition callnext Transition Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition callnext Transition Value</em>'.
	 * @generated
	 */
	Transition_callnextTransition_Value createTransition_callnextTransition_Value();

	/**
	 * Returns a new object of class '<em>Transition executed Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition executed Value</em>'.
	 * @generated
	 */
	Transition_executed_Value createTransition_executed_Value();

	/**
	 * Returns a new object of class '<em>Transition video Gen Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition video Gen Value</em>'.
	 * @generated
	 */
	Transition_videoGen_Value createTransition_videoGen_Value();

	/**
	 * Returns a new object of class '<em>Video Gen initialized Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video Gen initialized Value</em>'.
	 * @generated
	 */
	VideoGen_initialized_Value createVideoGen_initialized_Value();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StatesPackage getStatesPackage();

} //StatesFactory
