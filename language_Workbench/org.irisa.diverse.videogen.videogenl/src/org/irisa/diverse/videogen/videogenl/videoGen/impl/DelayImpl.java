/**
 */
package org.irisa.diverse.videogen.videogenl.videoGen.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.irisa.diverse.videogen.videogenl.videoGen.Delay;
import org.irisa.diverse.videogen.videogenl.videoGen.Transition;
import org.irisa.diverse.videogen.videogenl.videoGen.VideoGen;
import org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.impl.DelayImpl#getNextTransition <em>Next Transition</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.impl.DelayImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.impl.DelayImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.impl.DelayImpl#getVideoGen <em>Video Gen</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.impl.DelayImpl#getExecuted <em>Executed</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.impl.DelayImpl#getCallnextTransition <em>Callnext Transition</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.impl.DelayImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DelayImpl extends NamedElementImpl implements Delay {
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
	 * The default value of the '{@link #getSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelected()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SELECTED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelected()
	 * @generated
	 * @ordered
	 */
	protected Boolean selected = SELECTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVideoGen() <em>Video Gen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen()
	 * @generated
	 * @ordered
	 */
	protected VideoGen videoGen;

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
	 * The default value of the '{@link #getCallnextTransition() <em>Callnext Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallnextTransition()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CALLNEXT_TRANSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCallnextTransition() <em>Callnext Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallnextTransition()
	 * @generated
	 * @ordered
	 */
	protected Boolean callnextTransition = CALLNEXT_TRANSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VALUE_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Integer value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoGenPackage.Literals.DELAY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VideoGenPackage.DELAY__NEXT_TRANSITION, oldNextTransition, nextTransition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.DELAY__NEXT_TRANSITION, oldNextTransition, nextTransition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.DELAY__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSelected() {
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(Boolean newSelected) {
		Boolean oldSelected = selected;
		selected = newSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.DELAY__SELECTED, oldSelected, selected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen getVideoGen() {
		if (videoGen != null && videoGen.eIsProxy()) {
			InternalEObject oldVideoGen = (InternalEObject)videoGen;
			videoGen = (VideoGen)eResolveProxy(oldVideoGen);
			if (videoGen != oldVideoGen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VideoGenPackage.DELAY__VIDEO_GEN, oldVideoGen, videoGen));
			}
		}
		return videoGen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen basicGetVideoGen() {
		return videoGen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVideoGen(VideoGen newVideoGen) {
		VideoGen oldVideoGen = videoGen;
		videoGen = newVideoGen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.DELAY__VIDEO_GEN, oldVideoGen, videoGen));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.DELAY__EXECUTED, oldExecuted, executed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getCallnextTransition() {
		return callnextTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallnextTransition(Boolean newCallnextTransition) {
		Boolean oldCallnextTransition = callnextTransition;
		callnextTransition = newCallnextTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.DELAY__CALLNEXT_TRANSITION, oldCallnextTransition, callnextTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Integer newValue) {
		Integer oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.DELAY__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void execute(VideoGen videoGen) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void finishExecute(VideoGen videoGen) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VideoGenPackage.DELAY__NEXT_TRANSITION:
				if (resolve) return getNextTransition();
				return basicGetNextTransition();
			case VideoGenPackage.DELAY__ACTIVE:
				return getActive();
			case VideoGenPackage.DELAY__SELECTED:
				return getSelected();
			case VideoGenPackage.DELAY__VIDEO_GEN:
				if (resolve) return getVideoGen();
				return basicGetVideoGen();
			case VideoGenPackage.DELAY__EXECUTED:
				return getExecuted();
			case VideoGenPackage.DELAY__CALLNEXT_TRANSITION:
				return getCallnextTransition();
			case VideoGenPackage.DELAY__VALUE:
				return getValue();
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
			case VideoGenPackage.DELAY__NEXT_TRANSITION:
				setNextTransition((Transition)newValue);
				return;
			case VideoGenPackage.DELAY__ACTIVE:
				setActive((Boolean)newValue);
				return;
			case VideoGenPackage.DELAY__SELECTED:
				setSelected((Boolean)newValue);
				return;
			case VideoGenPackage.DELAY__VIDEO_GEN:
				setVideoGen((VideoGen)newValue);
				return;
			case VideoGenPackage.DELAY__EXECUTED:
				setExecuted((Boolean)newValue);
				return;
			case VideoGenPackage.DELAY__CALLNEXT_TRANSITION:
				setCallnextTransition((Boolean)newValue);
				return;
			case VideoGenPackage.DELAY__VALUE:
				setValue((Integer)newValue);
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
			case VideoGenPackage.DELAY__NEXT_TRANSITION:
				setNextTransition((Transition)null);
				return;
			case VideoGenPackage.DELAY__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
				return;
			case VideoGenPackage.DELAY__SELECTED:
				setSelected(SELECTED_EDEFAULT);
				return;
			case VideoGenPackage.DELAY__VIDEO_GEN:
				setVideoGen((VideoGen)null);
				return;
			case VideoGenPackage.DELAY__EXECUTED:
				setExecuted(EXECUTED_EDEFAULT);
				return;
			case VideoGenPackage.DELAY__CALLNEXT_TRANSITION:
				setCallnextTransition(CALLNEXT_TRANSITION_EDEFAULT);
				return;
			case VideoGenPackage.DELAY__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case VideoGenPackage.DELAY__NEXT_TRANSITION:
				return nextTransition != null;
			case VideoGenPackage.DELAY__ACTIVE:
				return ACTIVE_EDEFAULT == null ? active != null : !ACTIVE_EDEFAULT.equals(active);
			case VideoGenPackage.DELAY__SELECTED:
				return SELECTED_EDEFAULT == null ? selected != null : !SELECTED_EDEFAULT.equals(selected);
			case VideoGenPackage.DELAY__VIDEO_GEN:
				return videoGen != null;
			case VideoGenPackage.DELAY__EXECUTED:
				return EXECUTED_EDEFAULT == null ? executed != null : !EXECUTED_EDEFAULT.equals(executed);
			case VideoGenPackage.DELAY__CALLNEXT_TRANSITION:
				return CALLNEXT_TRANSITION_EDEFAULT == null ? callnextTransition != null : !CALLNEXT_TRANSITION_EDEFAULT.equals(callnextTransition);
			case VideoGenPackage.DELAY__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(", selected: ");
		result.append(selected);
		result.append(", executed: ");
		result.append(executed);
		result.append(", callnextTransition: ");
		result.append(callnextTransition);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //DelayImpl
