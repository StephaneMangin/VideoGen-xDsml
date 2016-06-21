/**
 */
package videoGenTrace.States.videoGen.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import videoGenTrace.States.videoGen.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see videoGenTrace.States.videoGen.VideoGenPackage
 * @generated
 */
public class VideoGenAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VideoGenPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGenAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VideoGenPackage.eINSTANCE;
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
	protected VideoGenSwitch<Adapter> modelSwitch =
		new VideoGenSwitch<Adapter>() {
			@Override
			public Adapter caseTracedAlternatives(TracedAlternatives object) {
				return createTracedAlternativesAdapter();
			}
			@Override
			public Adapter caseTracedDelay(TracedDelay object) {
				return createTracedDelayAdapter();
			}
			@Override
			public Adapter caseTracedGenerate(TracedGenerate object) {
				return createTracedGenerateAdapter();
			}
			@Override
			public Adapter caseTracedInitialize(TracedInitialize object) {
				return createTracedInitializeAdapter();
			}
			@Override
			public Adapter caseTracedMandatory(TracedMandatory object) {
				return createTracedMandatoryAdapter();
			}
			@Override
			public Adapter caseTracedNamedElement(TracedNamedElement object) {
				return createTracedNamedElementAdapter();
			}
			@Override
			public Adapter caseTracedOptional(TracedOptional object) {
				return createTracedOptionalAdapter();
			}
			@Override
			public Adapter caseTracedSequence(TracedSequence object) {
				return createTracedSequenceAdapter();
			}
			@Override
			public Adapter caseTracedTransition(TracedTransition object) {
				return createTracedTransitionAdapter();
			}
			@Override
			public Adapter caseTracedVideo(TracedVideo object) {
				return createTracedVideoAdapter();
			}
			@Override
			public Adapter caseTracedVideoGen(TracedVideoGen object) {
				return createTracedVideoGenAdapter();
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
	 * Creates a new adapter for an object of class '{@link videoGenTrace.States.videoGen.TracedAlternatives <em>Traced Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.States.videoGen.TracedAlternatives
	 * @generated
	 */
	public Adapter createTracedAlternativesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.States.videoGen.TracedDelay <em>Traced Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.States.videoGen.TracedDelay
	 * @generated
	 */
	public Adapter createTracedDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.States.videoGen.TracedGenerate <em>Traced Generate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.States.videoGen.TracedGenerate
	 * @generated
	 */
	public Adapter createTracedGenerateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.States.videoGen.TracedInitialize <em>Traced Initialize</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.States.videoGen.TracedInitialize
	 * @generated
	 */
	public Adapter createTracedInitializeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.States.videoGen.TracedMandatory <em>Traced Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.States.videoGen.TracedMandatory
	 * @generated
	 */
	public Adapter createTracedMandatoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.States.videoGen.TracedNamedElement <em>Traced Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.States.videoGen.TracedNamedElement
	 * @generated
	 */
	public Adapter createTracedNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.States.videoGen.TracedOptional <em>Traced Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.States.videoGen.TracedOptional
	 * @generated
	 */
	public Adapter createTracedOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.States.videoGen.TracedSequence <em>Traced Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.States.videoGen.TracedSequence
	 * @generated
	 */
	public Adapter createTracedSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.States.videoGen.TracedTransition <em>Traced Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.States.videoGen.TracedTransition
	 * @generated
	 */
	public Adapter createTracedTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.States.videoGen.TracedVideo <em>Traced Video</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.States.videoGen.TracedVideo
	 * @generated
	 */
	public Adapter createTracedVideoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videoGenTrace.States.videoGen.TracedVideoGen <em>Traced Video Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videoGenTrace.States.videoGen.TracedVideoGen
	 * @generated
	 */
	public Adapter createTracedVideoGenAdapter() {
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

} //VideoGenAdapterFactory
