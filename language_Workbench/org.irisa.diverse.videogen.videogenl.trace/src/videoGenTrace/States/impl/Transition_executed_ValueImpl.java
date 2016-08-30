/**
 */
package videoGenTrace.States.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import videoGenTrace.States.State;
import videoGenTrace.States.StatesPackage;
import videoGenTrace.States.Transition_executed_Value;

import videoGenTrace.States.videoGen.TracedTransition;
import videoGenTrace.States.videoGen.VideoGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition executed Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link videoGenTrace.States.impl.Transition_executed_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link videoGenTrace.States.impl.Transition_executed_ValueImpl#getExecuted <em>Executed</em>}</li>
 *   <li>{@link videoGenTrace.States.impl.Transition_executed_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link videoGenTrace.States.impl.Transition_executed_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transition_executed_ValueImpl extends MinimalEObjectImpl.Container implements Transition_executed_Value {
	/**
	 * The default value of the '{@link #getExecuted() <em>Executed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecuted()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXECUTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecuted() <em>Executed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecuted()
	 * @generated
	 * @ordered
	 */
	protected Boolean executed = EXECUTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition_executed_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.TRANSITION_EXECUTED_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesNoOpposite() {
		return this.getStates();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getExecuted() {
		return executed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecuted(Boolean newExecuted) {
		Boolean oldExecuted = executed;
		executed = newExecuted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.TRANSITION_EXECUTED_VALUE__EXECUTED, oldExecuted, executed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTransition getParent() {
		if (eContainerFeatureID() != StatesPackage.TRANSITION_EXECUTED_VALUE__PARENT) return null;
		return (TracedTransition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedTransition newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.TRANSITION_EXECUTED_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedTransition newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.TRANSITION_EXECUTED_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, VideoGenPackage.TRACED_TRANSITION__EXECUTED_SEQUENCE, TracedTransition.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.TRANSITION_EXECUTED_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.TRANSITION_EXECUTED_VALUE__STATES, StatesPackage.STATE__TRANSITION_EXECUTED_VALUES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.TRANSITION_EXECUTED_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedTransition)otherEnd, msgs);
			case StatesPackage.TRANSITION_EXECUTED_VALUE__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.TRANSITION_EXECUTED_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.TRANSITION_EXECUTED_VALUE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StatesPackage.TRANSITION_EXECUTED_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, VideoGenPackage.TRACED_TRANSITION__EXECUTED_SEQUENCE, TracedTransition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.TRANSITION_EXECUTED_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.TRANSITION_EXECUTED_VALUE__EXECUTED:
				return getExecuted();
			case StatesPackage.TRANSITION_EXECUTED_VALUE__PARENT:
				return getParent();
			case StatesPackage.TRANSITION_EXECUTED_VALUE__STATES:
				return getStates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatesPackage.TRANSITION_EXECUTED_VALUE__EXECUTED:
				setExecuted((Boolean)newValue);
				return;
			case StatesPackage.TRANSITION_EXECUTED_VALUE__PARENT:
				setParent((TracedTransition)newValue);
				return;
			case StatesPackage.TRANSITION_EXECUTED_VALUE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StatesPackage.TRANSITION_EXECUTED_VALUE__EXECUTED:
				setExecuted(EXECUTED_EDEFAULT);
				return;
			case StatesPackage.TRANSITION_EXECUTED_VALUE__PARENT:
				setParent((TracedTransition)null);
				return;
			case StatesPackage.TRANSITION_EXECUTED_VALUE__STATES:
				getStates().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StatesPackage.TRANSITION_EXECUTED_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.TRANSITION_EXECUTED_VALUE__EXECUTED:
				return EXECUTED_EDEFAULT == null ? executed != null : !EXECUTED_EDEFAULT.equals(executed);
			case StatesPackage.TRANSITION_EXECUTED_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.TRANSITION_EXECUTED_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (executed: ");
		result.append(executed);
		result.append(')');
		return result.toString();
	}

} //Transition_executed_ValueImpl
