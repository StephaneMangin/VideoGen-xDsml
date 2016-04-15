/**
 */
package org.irisa.diverse.videogen.videoGen.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.irisa.diverse.videogen.videoGen.Generate;
import org.irisa.diverse.videogen.videoGen.Transition;
import org.irisa.diverse.videogen.videoGen.VideoGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.impl.GenerateImpl#getNextTransition <em>Next Transition</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.impl.GenerateImpl#getActive <em>Active</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenerateImpl extends NamedElementImpl implements Generate {
	/**
	 * The cached value of the '{@link #getNextTransition() <em>Next Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition nextTransition;

	/**
	 * The default value of the '{@link #getActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ACTIVE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected Boolean active = ACTIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenerateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoGenPackage.Literals.GENERATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getNextTransition() {
		if (nextTransition != null && nextTransition.eIsProxy()) {
			InternalEObject oldNextTransition = (InternalEObject)nextTransition;
			nextTransition = (Transition)eResolveProxy(oldNextTransition);
			if (nextTransition != oldNextTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VideoGenPackage.GENERATE__NEXT_TRANSITION, oldNextTransition, nextTransition));
			}
		}
		return nextTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetNextTransition() {
		return nextTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextTransition(Transition newNextTransition) {
		Transition oldNextTransition = nextTransition;
		nextTransition = newNextTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.GENERATE__NEXT_TRANSITION, oldNextTransition, nextTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(Boolean newActive) {
		Boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.GENERATE__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VideoGenPackage.GENERATE__NEXT_TRANSITION:
				if (resolve) return getNextTransition();
				return basicGetNextTransition();
			case VideoGenPackage.GENERATE__ACTIVE:
				return getActive();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VideoGenPackage.GENERATE__NEXT_TRANSITION:
				setNextTransition((Transition)newValue);
				return;
			case VideoGenPackage.GENERATE__ACTIVE:
				setActive((Boolean)newValue);
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
			case VideoGenPackage.GENERATE__NEXT_TRANSITION:
				setNextTransition((Transition)null);
				return;
			case VideoGenPackage.GENERATE__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
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
			case VideoGenPackage.GENERATE__NEXT_TRANSITION:
				return nextTransition != null;
			case VideoGenPackage.GENERATE__ACTIVE:
				return ACTIVE_EDEFAULT == null ? active != null : !ACTIVE_EDEFAULT.equals(active);
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
		result.append(" (active: ");
		result.append(active);
		result.append(')');
		return result.toString();
	}

} //GenerateImpl
