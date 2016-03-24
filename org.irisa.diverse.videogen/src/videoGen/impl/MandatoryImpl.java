/**
 */
package videoGen.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import videoGen.Mandatory;
import videoGen.Sequence;
import videoGen.Video;
import videoGen.VideoGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mandatory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link videoGen.impl.MandatoryImpl#getNextSibling <em>Next Sibling</em>}</li>
 *   <li>{@link videoGen.impl.MandatoryImpl#getVideo <em>Video</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MandatoryImpl extends NamedElementImpl implements Mandatory {
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
	 * The cached value of the '{@link #getVideo() <em>Video</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideo()
	 * @generated
	 * @ordered
	 */
	protected Video video;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MandatoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoGenPackage.Literals.MANDATORY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VideoGenPackage.MANDATORY__NEXT_SIBLING, oldNextSibling, nextSibling));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.MANDATORY__NEXT_SIBLING, oldNextSibling, nextSibling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Video getVideo() {
		if (video != null && video.eIsProxy()) {
			InternalEObject oldVideo = (InternalEObject)video;
			video = (Video)eResolveProxy(oldVideo);
			if (video != oldVideo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VideoGenPackage.MANDATORY__VIDEO, oldVideo, video));
			}
		}
		return video;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Video basicGetVideo() {
		return video;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVideo(Video newVideo) {
		Video oldVideo = video;
		video = newVideo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.MANDATORY__VIDEO, oldVideo, video));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VideoGenPackage.MANDATORY__NEXT_SIBLING:
				if (resolve) return getNextSibling();
				return basicGetNextSibling();
			case VideoGenPackage.MANDATORY__VIDEO:
				if (resolve) return getVideo();
				return basicGetVideo();
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
			case VideoGenPackage.MANDATORY__NEXT_SIBLING:
				setNextSibling((Sequence)newValue);
				return;
			case VideoGenPackage.MANDATORY__VIDEO:
				setVideo((Video)newValue);
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
			case VideoGenPackage.MANDATORY__NEXT_SIBLING:
				setNextSibling((Sequence)null);
				return;
			case VideoGenPackage.MANDATORY__VIDEO:
				setVideo((Video)null);
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
			case VideoGenPackage.MANDATORY__NEXT_SIBLING:
				return nextSibling != null;
			case VideoGenPackage.MANDATORY__VIDEO:
				return video != null;
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
			case VideoGenPackage.MANDATORY___PROCESS:
				process();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //MandatoryImpl
