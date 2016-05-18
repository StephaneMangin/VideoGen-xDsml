/**
 */
package videoGenTrace.Steps.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gemoc.executionframework.engine.mse.LogicalStep;
import org.gemoc.executionframework.engine.mse.MSEOccurrence;
import org.gemoc.executionframework.engine.mse.SequentialLogicalStep;

import videoGenTrace.Steps.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see videoGenTrace.Steps.StepsPackage
 * @generated
 */
public class StepsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StepsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StepsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepsSwitch<Adapter> modelSwitch =
		new StepsSwitch<Adapter>() {
			@Override
			public Adapter caseBigStep(BigStep object) {
				return createBigStepAdapter();
			}
			@Override
			public Adapter caseRootImplicitStep(RootImplicitStep object) {
				return createRootImplicitStepAdapter();
			}
			@Override
			public Adapter caseSmallStep(SmallStep object) {
				return createSmallStepAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseVideoGen_Alternatives_Execute(VideoGen_Alternatives_Execute object) {
				return createVideoGen_Alternatives_ExecuteAdapter();
			}
			@Override
			public Adapter caseVideoGen_Delay_Execute(VideoGen_Delay_Execute object) {
				return createVideoGen_Delay_ExecuteAdapter();
			}
			@Override
			public Adapter caseVideoGen_Generate_Compute(VideoGen_Generate_Compute object) {
				return createVideoGen_Generate_ComputeAdapter();
			}
			@Override
			public Adapter caseVideoGen_Generate_Execute(VideoGen_Generate_Execute object) {
				return createVideoGen_Generate_ExecuteAdapter();
			}
			@Override
			public Adapter caseVideoGen_Initialize_Execute(VideoGen_Initialize_Execute object) {
				return createVideoGen_Initialize_ExecuteAdapter();
			}
			@Override
			public Adapter caseVideoGen_Mandatory_Execute(VideoGen_Mandatory_Execute object) {
				return createVideoGen_Mandatory_ExecuteAdapter();
			}
			@Override
			public Adapter caseVideoGen_Optional_Execute(VideoGen_Optional_Execute object) {
				return createVideoGen_Optional_ExecuteAdapter();
			}
			@Override
			public Adapter caseVideoGen_Sequence_Execute(VideoGen_Sequence_Execute object) {
				return createVideoGen_Sequence_ExecuteAdapter();
			}
			@Override
			public Adapter caseVideoGen_Transition_Execute(VideoGen_Transition_Execute object) {
				return createVideoGen_Transition_ExecuteAdapter();
			}
			@Override
			public Adapter caseVideoGen_Video_Select(VideoGen_Video_Select object) {
				return createVideoGen_Video_SelectAdapter();
			}
			@Override
			public Adapter caseMSEOccurrence(MSEOccurrence object) {
				return createMSEOccurrenceAdapter();
			}
			@Override
			public Adapter caseLogicalStep(LogicalStep object) {
				return createLogicalStepAdapter();
			}
			@Override
			public Adapter caseSequentialLogicalStep(SequentialLogicalStep object) {
				return createSequentialLogicalStepAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.BigStep <em>Big Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.BigStep
	 * @generated
	 */
	public Adapter createBigStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.RootImplicitStep
	 * @generated
	 */
	public Adapter createRootImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.SmallStep <em>Small Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.SmallStep
	 * @generated
	 */
	public Adapter createSmallStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Alternatives_Execute <em>Video Gen Alternatives Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Alternatives_Execute
	 * @generated
	 */
	public Adapter createVideoGen_Alternatives_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Delay_Execute <em>Video Gen Delay Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Delay_Execute
	 * @generated
	 */
	public Adapter createVideoGen_Delay_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Generate_Compute <em>Video Gen Generate Compute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Generate_Compute
	 * @generated
	 */
	public Adapter createVideoGen_Generate_ComputeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Generate_Execute <em>Video Gen Generate Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Generate_Execute
	 * @generated
	 */
	public Adapter createVideoGen_Generate_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Initialize_Execute <em>Video Gen Initialize Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Initialize_Execute
	 * @generated
	 */
	public Adapter createVideoGen_Initialize_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Mandatory_Execute <em>Video Gen Mandatory Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Mandatory_Execute
	 * @generated
	 */
	public Adapter createVideoGen_Mandatory_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Optional_Execute <em>Video Gen Optional Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Optional_Execute
	 * @generated
	 */
	public Adapter createVideoGen_Optional_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Sequence_Execute <em>Video Gen Sequence Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Sequence_Execute
	 * @generated
	 */
	public Adapter createVideoGen_Sequence_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Transition_Execute <em>Video Gen Transition Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Transition_Execute
	 * @generated
	 */
	public Adapter createVideoGen_Transition_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Video_Select <em>Video Gen Video Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Video_Select
	 * @generated
	 */
	public Adapter createVideoGen_Video_SelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.executionframework.engine.mse.MSEOccurrence <em>MSE Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.executionframework.engine.mse.MSEOccurrence
	 * @generated
	 */
	public Adapter createMSEOccurrenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.executionframework.engine.mse.LogicalStep <em>Logical Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.executionframework.engine.mse.LogicalStep
	 * @generated
	 */
	public Adapter createLogicalStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.executionframework.engine.mse.SequentialLogicalStep <em>Sequential Logical Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.executionframework.engine.mse.SequentialLogicalStep
	 * @generated
	 */
	public Adapter createSequentialLogicalStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StepsAdapterFactory
