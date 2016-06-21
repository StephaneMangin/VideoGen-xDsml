/**
 */
package videoGenTrace.States;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see videoGenTrace.States.StatesFactory
 * @model kind="package"
 * @generated
 */
public interface StatesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "States";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "videoGenTrace_States";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tracedclasses";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesPackage eINSTANCE = videoGenTrace.States.impl.StatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link videoGenTrace.States.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.States.impl.StateImpl
	 * @see videoGenTrace.States.impl.StatesPackageImpl#getState()
	 * @generated
	 */
	int STATE = 0;

	/**
	 * The feature id for the '<em><b>Ended Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENDED_STEPS = 0;

	/**
	 * The feature id for the '<em><b>Started Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STARTED_STEPS = 1;

	/**
	 * The feature id for the '<em><b>Transition callnext Transition Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITION_CALLNEXT_TRANSITION_VALUES = 2;

	/**
	 * The feature id for the '<em><b>Transition executed Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITION_EXECUTED_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Transition video Gen Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITION_VIDEO_GEN_VALUES = 4;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.States.Value <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.States.Value
	 * @see videoGenTrace.States.impl.StatesPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 4;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__STATES_NO_OPPOSITE = 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link videoGenTrace.States.impl.Transition_callnextTransition_ValueImpl <em>Transition callnext Transition Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.States.impl.Transition_callnextTransition_ValueImpl
	 * @see videoGenTrace.States.impl.StatesPackageImpl#getTransition_callnextTransition_Value()
	 * @generated
	 */
	int TRANSITION_CALLNEXT_TRANSITION_VALUE = 1;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CALLNEXT_TRANSITION_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Callnext Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CALLNEXT_TRANSITION_VALUE__CALLNEXT_TRANSITION = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CALLNEXT_TRANSITION_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CALLNEXT_TRANSITION_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transition callnext Transition Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CALLNEXT_TRANSITION_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CALLNEXT_TRANSITION_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transition callnext Transition Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_CALLNEXT_TRANSITION_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link videoGenTrace.States.impl.Transition_executed_ValueImpl <em>Transition executed Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.States.impl.Transition_executed_ValueImpl
	 * @see videoGenTrace.States.impl.StatesPackageImpl#getTransition_executed_Value()
	 * @generated
	 */
	int TRANSITION_EXECUTED_VALUE = 2;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EXECUTED_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EXECUTED_VALUE__EXECUTED = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EXECUTED_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EXECUTED_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transition executed Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EXECUTED_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EXECUTED_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transition executed Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EXECUTED_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link videoGenTrace.States.impl.Transition_videoGen_ValueImpl <em>Transition video Gen Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videoGenTrace.States.impl.Transition_videoGen_ValueImpl
	 * @see videoGenTrace.States.impl.StatesPackageImpl#getTransition_videoGen_Value()
	 * @generated
	 */
	int TRANSITION_VIDEO_GEN_VALUE = 3;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIDEO_GEN_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIDEO_GEN_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIDEO_GEN_VALUE__STATES = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Video Gen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIDEO_GEN_VALUE__VIDEO_GEN = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transition video Gen Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIDEO_GEN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIDEO_GEN_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transition video Gen Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIDEO_GEN_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link videoGenTrace.States.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see videoGenTrace.States.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.States.State#getEndedSteps <em>Ended Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ended Steps</em>'.
	 * @see videoGenTrace.States.State#getEndedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EndedSteps();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.States.State#getStartedSteps <em>Started Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Started Steps</em>'.
	 * @see videoGenTrace.States.State#getStartedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StartedSteps();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.States.State#getTransition_callnextTransition_Values <em>Transition callnext Transition Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transition callnext Transition Values</em>'.
	 * @see videoGenTrace.States.State#getTransition_callnextTransition_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Transition_callnextTransition_Values();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.States.State#getTransition_executed_Values <em>Transition executed Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transition executed Values</em>'.
	 * @see videoGenTrace.States.State#getTransition_executed_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Transition_executed_Values();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.States.State#getTransition_videoGen_Values <em>Transition video Gen Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transition video Gen Values</em>'.
	 * @see videoGenTrace.States.State#getTransition_videoGen_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Transition_videoGen_Values();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.States.Transition_callnextTransition_Value <em>Transition callnext Transition Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition callnext Transition Value</em>'.
	 * @see videoGenTrace.States.Transition_callnextTransition_Value
	 * @generated
	 */
	EClass getTransition_callnextTransition_Value();

	/**
	 * Returns the meta object for the attribute '{@link videoGenTrace.States.Transition_callnextTransition_Value#getCallnextTransition <em>Callnext Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Callnext Transition</em>'.
	 * @see videoGenTrace.States.Transition_callnextTransition_Value#getCallnextTransition()
	 * @see #getTransition_callnextTransition_Value()
	 * @generated
	 */
	EAttribute getTransition_callnextTransition_Value_CallnextTransition();

	/**
	 * Returns the meta object for the container reference '{@link videoGenTrace.States.Transition_callnextTransition_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see videoGenTrace.States.Transition_callnextTransition_Value#getParent()
	 * @see #getTransition_callnextTransition_Value()
	 * @generated
	 */
	EReference getTransition_callnextTransition_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.States.Transition_callnextTransition_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see videoGenTrace.States.Transition_callnextTransition_Value#getStates()
	 * @see #getTransition_callnextTransition_Value()
	 * @generated
	 */
	EReference getTransition_callnextTransition_Value_States();

	/**
	 * Returns the meta object for the '{@link videoGenTrace.States.Transition_callnextTransition_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see videoGenTrace.States.Transition_callnextTransition_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getTransition_callnextTransition_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.States.Transition_executed_Value <em>Transition executed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition executed Value</em>'.
	 * @see videoGenTrace.States.Transition_executed_Value
	 * @generated
	 */
	EClass getTransition_executed_Value();

	/**
	 * Returns the meta object for the attribute '{@link videoGenTrace.States.Transition_executed_Value#getExecuted <em>Executed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executed</em>'.
	 * @see videoGenTrace.States.Transition_executed_Value#getExecuted()
	 * @see #getTransition_executed_Value()
	 * @generated
	 */
	EAttribute getTransition_executed_Value_Executed();

	/**
	 * Returns the meta object for the container reference '{@link videoGenTrace.States.Transition_executed_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see videoGenTrace.States.Transition_executed_Value#getParent()
	 * @see #getTransition_executed_Value()
	 * @generated
	 */
	EReference getTransition_executed_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.States.Transition_executed_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see videoGenTrace.States.Transition_executed_Value#getStates()
	 * @see #getTransition_executed_Value()
	 * @generated
	 */
	EReference getTransition_executed_Value_States();

	/**
	 * Returns the meta object for the '{@link videoGenTrace.States.Transition_executed_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see videoGenTrace.States.Transition_executed_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getTransition_executed_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.States.Transition_videoGen_Value <em>Transition video Gen Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition video Gen Value</em>'.
	 * @see videoGenTrace.States.Transition_videoGen_Value
	 * @generated
	 */
	EClass getTransition_videoGen_Value();

	/**
	 * Returns the meta object for the container reference '{@link videoGenTrace.States.Transition_videoGen_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see videoGenTrace.States.Transition_videoGen_Value#getParent()
	 * @see #getTransition_videoGen_Value()
	 * @generated
	 */
	EReference getTransition_videoGen_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.States.Transition_videoGen_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see videoGenTrace.States.Transition_videoGen_Value#getStates()
	 * @see #getTransition_videoGen_Value()
	 * @generated
	 */
	EReference getTransition_videoGen_Value_States();

	/**
	 * Returns the meta object for the reference '{@link videoGenTrace.States.Transition_videoGen_Value#getVideoGen <em>Video Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Video Gen</em>'.
	 * @see videoGenTrace.States.Transition_videoGen_Value#getVideoGen()
	 * @see #getTransition_videoGen_Value()
	 * @generated
	 */
	EReference getTransition_videoGen_Value_VideoGen();

	/**
	 * Returns the meta object for the '{@link videoGenTrace.States.Transition_videoGen_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see videoGenTrace.States.Transition_videoGen_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getTransition_videoGen_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link videoGenTrace.States.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see videoGenTrace.States.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the reference list '{@link videoGenTrace.States.Value#getStatesNoOpposite <em>States No Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States No Opposite</em>'.
	 * @see videoGenTrace.States.Value#getStatesNoOpposite()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_StatesNoOpposite();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatesFactory getStatesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link videoGenTrace.States.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.States.impl.StateImpl
		 * @see videoGenTrace.States.impl.StatesPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Ended Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENDED_STEPS = eINSTANCE.getState_EndedSteps();

		/**
		 * The meta object literal for the '<em><b>Started Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STARTED_STEPS = eINSTANCE.getState_StartedSteps();

		/**
		 * The meta object literal for the '<em><b>Transition callnext Transition Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSITION_CALLNEXT_TRANSITION_VALUES = eINSTANCE.getState_Transition_callnextTransition_Values();

		/**
		 * The meta object literal for the '<em><b>Transition executed Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSITION_EXECUTED_VALUES = eINSTANCE.getState_Transition_executed_Values();

		/**
		 * The meta object literal for the '<em><b>Transition video Gen Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSITION_VIDEO_GEN_VALUES = eINSTANCE.getState_Transition_videoGen_Values();

		/**
		 * The meta object literal for the '{@link videoGenTrace.States.impl.Transition_callnextTransition_ValueImpl <em>Transition callnext Transition Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.States.impl.Transition_callnextTransition_ValueImpl
		 * @see videoGenTrace.States.impl.StatesPackageImpl#getTransition_callnextTransition_Value()
		 * @generated
		 */
		EClass TRANSITION_CALLNEXT_TRANSITION_VALUE = eINSTANCE.getTransition_callnextTransition_Value();

		/**
		 * The meta object literal for the '<em><b>Callnext Transition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_CALLNEXT_TRANSITION_VALUE__CALLNEXT_TRANSITION = eINSTANCE.getTransition_callnextTransition_Value_CallnextTransition();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_CALLNEXT_TRANSITION_VALUE__PARENT = eINSTANCE.getTransition_callnextTransition_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_CALLNEXT_TRANSITION_VALUE__STATES = eINSTANCE.getTransition_callnextTransition_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION_CALLNEXT_TRANSITION_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getTransition_callnextTransition_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link videoGenTrace.States.impl.Transition_executed_ValueImpl <em>Transition executed Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.States.impl.Transition_executed_ValueImpl
		 * @see videoGenTrace.States.impl.StatesPackageImpl#getTransition_executed_Value()
		 * @generated
		 */
		EClass TRANSITION_EXECUTED_VALUE = eINSTANCE.getTransition_executed_Value();

		/**
		 * The meta object literal for the '<em><b>Executed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_EXECUTED_VALUE__EXECUTED = eINSTANCE.getTransition_executed_Value_Executed();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_EXECUTED_VALUE__PARENT = eINSTANCE.getTransition_executed_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_EXECUTED_VALUE__STATES = eINSTANCE.getTransition_executed_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION_EXECUTED_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getTransition_executed_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link videoGenTrace.States.impl.Transition_videoGen_ValueImpl <em>Transition video Gen Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.States.impl.Transition_videoGen_ValueImpl
		 * @see videoGenTrace.States.impl.StatesPackageImpl#getTransition_videoGen_Value()
		 * @generated
		 */
		EClass TRANSITION_VIDEO_GEN_VALUE = eINSTANCE.getTransition_videoGen_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_VIDEO_GEN_VALUE__PARENT = eINSTANCE.getTransition_videoGen_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_VIDEO_GEN_VALUE__STATES = eINSTANCE.getTransition_videoGen_Value_States();

		/**
		 * The meta object literal for the '<em><b>Video Gen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_VIDEO_GEN_VALUE__VIDEO_GEN = eINSTANCE.getTransition_videoGen_Value_VideoGen();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION_VIDEO_GEN_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getTransition_videoGen_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link videoGenTrace.States.Value <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videoGenTrace.States.Value
		 * @see videoGenTrace.States.impl.StatesPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>States No Opposite</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__STATES_NO_OPPOSITE = eINSTANCE.getValue_StatesNoOpposite();

	}

} //StatesPackage
