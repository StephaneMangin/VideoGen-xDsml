/**
 */
package videoGen.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import videoGen.Alternatives;
import videoGen.Optional;
import videoGen.Sequence;
import videoGen.VideoGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alternatives</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link videoGen.impl.AlternativesImpl#getNextSibling <em>Next Sibling</em>}</li>
 *   <li>{@link videoGen.impl.AlternativesImpl#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlternativesImpl extends NamedElementImpl implements Alternatives {
	/**
	 * The cached value of the '{@link #getNextSibling() <em>Next Sibling</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextSibling()
	 * @generated
	 * @ordered
	 */
	protected Sequence nextSibling;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Optional> options;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternativesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoGenPackage.Literals.ALTERNATIVES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getNextSibling() {
		if (nextSibling != null && nextSibling.eIsProxy()) {
			InternalEObject oldNextSibling = (InternalEObject)nextSibling;
			nextSibling = (Sequence)eResolveProxy(oldNextSibling);
			if (nextSibling != oldNextSibling) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VideoGenPackage.ALTERNATIVES__NEXT_SIBLING, oldNextSibling, nextSibling));
			}
		}
		return nextSibling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence basicGetNextSibling() {
		return nextSibling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextSibling(Sequence newNextSibling) {
		Sequence oldNextSibling = nextSibling;
		nextSibling = newNextSibling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.ALTERNATIVES__NEXT_SIBLING, oldNextSibling, nextSibling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Optional> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<Optional>(Optional.class, this, VideoGenPackage.ALTERNATIVES__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void process() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideoGenPackage.ALTERNATIVES__OPTIONS:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VideoGenPackage.ALTERNATIVES__NEXT_SIBLING:
				if (resolve) return getNextSibling();
				return basicGetNextSibling();
			case VideoGenPackage.ALTERNATIVES__OPTIONS:
				return getOptions();
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
			case VideoGenPackage.ALTERNATIVES__NEXT_SIBLING:
				setNextSibling((Sequence)newValue);
				return;
			case VideoGenPackage.ALTERNATIVES__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends Optional>)newValue);
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
			case VideoGenPackage.ALTERNATIVES__NEXT_SIBLING:
				setNextSibling((Sequence)null);
				return;
			case VideoGenPackage.ALTERNATIVES__OPTIONS:
				getOptions().clear();
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
			case VideoGenPackage.ALTERNATIVES__NEXT_SIBLING:
				return nextSibling != null;
			case VideoGenPackage.ALTERNATIVES__OPTIONS:
				return options != null && !options.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case VideoGenPackage.ALTERNATIVES___PROCESS:
				process();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AlternativesImpl
