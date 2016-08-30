/**
 */
package videoGenTrace.States.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import videoGenTrace.States.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatesFactoryImpl extends EFactoryImpl implements StatesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatesFactory init() {
		try {
			StatesFactory theStatesFactory = (StatesFactory)EPackage.Registry.INSTANCE.getEFactory(StatesPackage.eNS_URI);
			if (theStatesFactory != null) {
				return theStatesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StatesPackage.STATE: return createState();
			case StatesPackage.TRANSITION_CALLNEXT_TRANSITION_VALUE: return createTransition_callnextTransition_Value();
			case StatesPackage.TRANSITION_EXECUTED_VALUE: return createTransition_executed_Value();
			case StatesPackage.TRANSITION_VIDEO_GEN_VALUE: return createTransition_videoGen_Value();
			case StatesPackage.VIDEO_GEN_INITIALIZED_VALUE: return createVideoGen_initialized_Value();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition_callnextTransition_Value createTransition_callnextTransition_Value() {
		Transition_callnextTransition_ValueImpl transition_callnextTransition_Value = new Transition_callnextTransition_ValueImpl();
		return transition_callnextTransition_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition_executed_Value createTransition_executed_Value() {
		Transition_executed_ValueImpl transition_executed_Value = new Transition_executed_ValueImpl();
		return transition_executed_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition_videoGen_Value createTransition_videoGen_Value() {
		Transition_videoGen_ValueImpl transition_videoGen_Value = new Transition_videoGen_ValueImpl();
		return transition_videoGen_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen_initialized_Value createVideoGen_initialized_Value() {
		VideoGen_initialized_ValueImpl videoGen_initialized_Value = new VideoGen_initialized_ValueImpl();
		return videoGen_initialized_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesPackage getStatesPackage() {
		return (StatesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatesPackage getPackage() {
		return StatesPackage.eINSTANCE;
	}

} //StatesFactoryImpl
