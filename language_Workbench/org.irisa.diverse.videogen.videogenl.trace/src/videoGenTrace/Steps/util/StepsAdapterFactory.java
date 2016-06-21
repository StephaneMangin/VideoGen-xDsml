/**
 */
package videoGenTrace.Steps.util;

import fr.inria.diverse.trace.commons.model.trace.BigStep;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.SmallStep;
import fr.inria.diverse.trace.commons.model.trace.Step;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
			public Adapter caseRootImplicitStep(RootImplicitStep object) {
				return createRootImplicitStepAdapter();
			}
			@Override
			public Adapter caseSpecificStep(SpecificStep object) {
				return createSpecificStepAdapter();
			}
			@Override
			public Adapter caseVideoGen_Alternatives_Execute(VideoGen_Alternatives_Execute object) {
				return createVideoGen_Alternatives_ExecuteAdapter();
			}
			@Override
			public Adapter caseVideoGen_Alternatives_Execute_AbstractSubStep(VideoGen_Alternatives_Execute_AbstractSubStep object) {
				return createVideoGen_Alternatives_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseVideoGen_Alternatives_Execute_ImplicitStep(VideoGen_Alternatives_Execute_ImplicitStep object) {
				return createVideoGen_Alternatives_Execute_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseVideoGen_Generate_Execute(VideoGen_Generate_Execute object) {
				return createVideoGen_Generate_ExecuteAdapter();
			}
			@Override
			public Adapter caseVideoGen_Generate_Execute_AbstractSubStep(VideoGen_Generate_Execute_AbstractSubStep object) {
				return createVideoGen_Generate_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseVideoGen_Generate_Execute_ImplicitStep(VideoGen_Generate_Execute_ImplicitStep object) {
				return createVideoGen_Generate_Execute_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseVideoGen_Initialize_Execute(VideoGen_Initialize_Execute object) {
				return createVideoGen_Initialize_ExecuteAdapter();
			}
			@Override
			public Adapter caseVideoGen_Initialize_Execute_AbstractSubStep(VideoGen_Initialize_Execute_AbstractSubStep object) {
				return createVideoGen_Initialize_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseVideoGen_Initialize_Execute_ImplicitStep(VideoGen_Initialize_Execute_ImplicitStep object) {
				return createVideoGen_Initialize_Execute_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseVideoGen_Mandatory_Execute(VideoGen_Mandatory_Execute object) {
				return createVideoGen_Mandatory_ExecuteAdapter();
			}
			@Override
			public Adapter caseVideoGen_Mandatory_Execute_AbstractSubStep(VideoGen_Mandatory_Execute_AbstractSubStep object) {
				return createVideoGen_Mandatory_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseVideoGen_Mandatory_Execute_ImplicitStep(VideoGen_Mandatory_Execute_ImplicitStep object) {
				return createVideoGen_Mandatory_Execute_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseVideoGen_Optional_Execute(VideoGen_Optional_Execute object) {
				return createVideoGen_Optional_ExecuteAdapter();
			}
			@Override
			public Adapter caseVideoGen_Optional_Execute_AbstractSubStep(VideoGen_Optional_Execute_AbstractSubStep object) {
				return createVideoGen_Optional_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseVideoGen_Optional_Execute_ImplicitStep(VideoGen_Optional_Execute_ImplicitStep object) {
				return createVideoGen_Optional_Execute_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseVideoGen_Transition_Execute(VideoGen_Transition_Execute object) {
				return createVideoGen_Transition_ExecuteAdapter();
			}
			@Override
			public Adapter caseVideoGen_Transition_Execute_AbstractSubStep(VideoGen_Transition_Execute_AbstractSubStep object) {
				return createVideoGen_Transition_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseVideoGen_Transition_Execute_ImplicitStep(VideoGen_Transition_Execute_ImplicitStep object) {
				return createVideoGen_Transition_Execute_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseVideoGen_Transition_FinishExecute(VideoGen_Transition_FinishExecute object) {
				return createVideoGen_Transition_FinishExecuteAdapter();
			}
			@Override
			public Adapter caseVideoGen_Transition_FinishExecute_AbstractSubStep(VideoGen_Transition_FinishExecute_AbstractSubStep object) {
				return createVideoGen_Transition_FinishExecute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseVideoGen_Transition_FinishExecute_ImplicitStep(VideoGen_Transition_FinishExecute_ImplicitStep object) {
				return createVideoGen_Transition_FinishExecute_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseVideoGen_VideoGen_Compute(VideoGen_VideoGen_Compute object) {
				return createVideoGen_VideoGen_ComputeAdapter();
			}
			@Override
			public Adapter caseVideoGen_VideoGen_Execute(VideoGen_VideoGen_Execute object) {
				return createVideoGen_VideoGen_ExecuteAdapter();
			}
			@Override
			public Adapter caseVideoGen_VideoGen_Execute_AbstractSubStep(VideoGen_VideoGen_Execute_AbstractSubStep object) {
				return createVideoGen_VideoGen_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseVideoGen_VideoGen_Execute_ImplicitStep(VideoGen_VideoGen_Execute_ImplicitStep object) {
				return createVideoGen_VideoGen_Execute_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseVideoGen_VideoGen_InitializeModel(VideoGen_VideoGen_InitializeModel object) {
				return createVideoGen_VideoGen_InitializeModelAdapter();
			}
			@Override
			public Adapter caseVideoGen_VideoGen_InitializeModel_AbstractSubStep(VideoGen_VideoGen_InitializeModel_AbstractSubStep object) {
				return createVideoGen_VideoGen_InitializeModel_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseVideoGen_VideoGen_InitializeModel_ImplicitStep(VideoGen_VideoGen_InitializeModel_ImplicitStep object) {
				return createVideoGen_VideoGen_InitializeModel_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseVideoGen_VideoGen_Setup(VideoGen_VideoGen_Setup object) {
				return createVideoGen_VideoGen_SetupAdapter();
			}
			@Override
			public Adapter caseVideoGen_VideoGen_Setup_AbstractSubStep(VideoGen_VideoGen_Setup_AbstractSubStep object) {
				return createVideoGen_VideoGen_Setup_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseVideoGen_VideoGen_Setup_ImplicitStep(VideoGen_VideoGen_Setup_ImplicitStep object) {
				return createVideoGen_VideoGen_Setup_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseVideoGen_VideoGen_Solve(VideoGen_VideoGen_Solve object) {
				return createVideoGen_VideoGen_SolveAdapter();
			}
			@Override
			public Adapter caseVideoGen_Video_Setup(VideoGen_Video_Setup object) {
				return createVideoGen_Video_SetupAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseSmallStep(SmallStep object) {
				return createSmallStepAdapter();
			}
			@Override
			public <StepSubtype extends Step> Adapter caseBigStep(BigStep<StepSubtype> object) {
				return createBigStepAdapter();
			}
			@Override
			public <StepSubtype extends Step> Adapter caseSequentialStep(SequentialStep<StepSubtype> object) {
				return createSequentialStepAdapter();
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
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.SpecificStep <em>Specific Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.SpecificStep
	 * @generated
	 */
	public Adapter createSpecificStepAdapter() {
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
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Alternatives_Execute_AbstractSubStep <em>Video Gen Alternatives Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Alternatives_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createVideoGen_Alternatives_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Alternatives_Execute_ImplicitStep <em>Video Gen Alternatives Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Alternatives_Execute_ImplicitStep
	 * @generated
	 */
	public Adapter createVideoGen_Alternatives_Execute_ImplicitStepAdapter() {
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
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Generate_Execute_AbstractSubStep <em>Video Gen Generate Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Generate_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createVideoGen_Generate_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Generate_Execute_ImplicitStep <em>Video Gen Generate Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Generate_Execute_ImplicitStep
	 * @generated
	 */
	public Adapter createVideoGen_Generate_Execute_ImplicitStepAdapter() {
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
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Initialize_Execute_AbstractSubStep <em>Video Gen Initialize Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Initialize_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createVideoGen_Initialize_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Initialize_Execute_ImplicitStep <em>Video Gen Initialize Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Initialize_Execute_ImplicitStep
	 * @generated
	 */
	public Adapter createVideoGen_Initialize_Execute_ImplicitStepAdapter() {
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
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Mandatory_Execute_AbstractSubStep <em>Video Gen Mandatory Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Mandatory_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createVideoGen_Mandatory_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Mandatory_Execute_ImplicitStep <em>Video Gen Mandatory Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Mandatory_Execute_ImplicitStep
	 * @generated
	 */
	public Adapter createVideoGen_Mandatory_Execute_ImplicitStepAdapter() {
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
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Optional_Execute_AbstractSubStep <em>Video Gen Optional Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Optional_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createVideoGen_Optional_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Optional_Execute_ImplicitStep <em>Video Gen Optional Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Optional_Execute_ImplicitStep
	 * @generated
	 */
	public Adapter createVideoGen_Optional_Execute_ImplicitStepAdapter() {
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
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Transition_Execute_AbstractSubStep <em>Video Gen Transition Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Transition_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createVideoGen_Transition_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Transition_Execute_ImplicitStep <em>Video Gen Transition Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Transition_Execute_ImplicitStep
	 * @generated
	 */
	public Adapter createVideoGen_Transition_Execute_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Transition_FinishExecute <em>Video Gen Transition Finish Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Transition_FinishExecute
	 * @generated
	 */
	public Adapter createVideoGen_Transition_FinishExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Transition_FinishExecute_AbstractSubStep <em>Video Gen Transition Finish Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Transition_FinishExecute_AbstractSubStep
	 * @generated
	 */
	public Adapter createVideoGen_Transition_FinishExecute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Transition_FinishExecute_ImplicitStep <em>Video Gen Transition Finish Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Transition_FinishExecute_ImplicitStep
	 * @generated
	 */
	public Adapter createVideoGen_Transition_FinishExecute_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_VideoGen_Compute <em>Video Gen Video Gen Compute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_VideoGen_Compute
	 * @generated
	 */
	public Adapter createVideoGen_VideoGen_ComputeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_VideoGen_Execute <em>Video Gen Video Gen Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_VideoGen_Execute
	 * @generated
	 */
	public Adapter createVideoGen_VideoGen_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_VideoGen_Execute_AbstractSubStep <em>Video Gen Video Gen Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_VideoGen_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createVideoGen_VideoGen_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_VideoGen_Execute_ImplicitStep <em>Video Gen Video Gen Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_VideoGen_Execute_ImplicitStep
	 * @generated
	 */
	public Adapter createVideoGen_VideoGen_Execute_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_VideoGen_InitializeModel <em>Video Gen Video Gen Initialize Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_VideoGen_InitializeModel
	 * @generated
	 */
	public Adapter createVideoGen_VideoGen_InitializeModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_VideoGen_InitializeModel_AbstractSubStep <em>Video Gen Video Gen Initialize Model Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_VideoGen_InitializeModel_AbstractSubStep
	 * @generated
	 */
	public Adapter createVideoGen_VideoGen_InitializeModel_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_VideoGen_InitializeModel_ImplicitStep <em>Video Gen Video Gen Initialize Model Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_VideoGen_InitializeModel_ImplicitStep
	 * @generated
	 */
	public Adapter createVideoGen_VideoGen_InitializeModel_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_VideoGen_Setup <em>Video Gen Video Gen Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_VideoGen_Setup
	 * @generated
	 */
	public Adapter createVideoGen_VideoGen_SetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_VideoGen_Setup_AbstractSubStep <em>Video Gen Video Gen Setup Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_VideoGen_Setup_AbstractSubStep
	 * @generated
	 */
	public Adapter createVideoGen_VideoGen_Setup_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_VideoGen_Setup_ImplicitStep <em>Video Gen Video Gen Setup Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_VideoGen_Setup_ImplicitStep
	 * @generated
	 */
	public Adapter createVideoGen_VideoGen_Setup_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_VideoGen_Solve <em>Video Gen Video Gen Solve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_VideoGen_Solve
	 * @generated
	 */
	public Adapter createVideoGen_VideoGen_SolveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.Steps.VideoGen_Video_Setup <em>Video Gen Video Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.Steps.VideoGen_Video_Setup
	 * @generated
	 */
	public Adapter createVideoGen_Video_SetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.trace.commons.model.trace.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.trace.commons.model.trace.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.trace.commons.model.trace.SmallStep <em>Small Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.trace.commons.model.trace.SmallStep
	 * @generated
	 */
	public Adapter createSmallStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.trace.commons.model.trace.BigStep <em>Big Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.trace.commons.model.trace.BigStep
	 * @generated
	 */
	public Adapter createBigStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.trace.commons.model.trace.SequentialStep <em>Sequential Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.trace.commons.model.trace.SequentialStep
	 * @generated
	 */
	public Adapter createSequentialStepAdapter() {
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
