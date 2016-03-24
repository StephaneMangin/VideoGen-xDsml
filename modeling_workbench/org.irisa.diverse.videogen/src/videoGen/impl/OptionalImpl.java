/**
 */
package videoGen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import videoGen.Optional;
import videoGen.Sequence;
import videoGen.Video;
import videoGen.VideoGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link videoGen.impl.OptionalImpl#getNextSibling <em>Next Sibling</em>}</li>
 *   <li>{@link videoGen.impl.OptionalImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link videoGen.impl.OptionalImpl#getVideo <em>Video</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OptionalImpl extends NamedElementImpl implements Optional {
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
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROBABILITY_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected Integer probability = PROBABILITY_EDEFAULT;

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
	protected OptionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoGenPackage.Literals.OPTIONAL;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VideoGenPackage.OPTIONAL__NEXT_SIBLING, oldNextSibling, nextSibling));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.OPTIONAL__NEXT_SIBLING, oldNextSibling, nextSibling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(Integer newProbability) {
		Integer oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.OPTIONAL__PROBABILITY, oldProbability, probability));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VideoGenPackage.OPTIONAL__VIDEO, oldVideo, video));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.OPTIONAL__VIDEO, oldVideo, video));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VideoGenPackage.OPTIONAL__NEXT_SIBLING:
				if (resolve) return getNextSibling();
				return basicGetNextSibling();
			case VideoGenPackage.OPTIONAL__PROBABILITY:
				return getProbability();
			case VideoGenPackage.OPTIONAL__VIDEO:
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
			case VideoGenPackage.OPTIONAL__NEXT_SIBLING:
				setNextSibling((Sequence)newValue);
				return;
			case VideoGenPackage.OPTIONAL__PROBABILITY:
				setProbability((Integer)newValue);
				return;
			case VideoGenPackage.OPTIONAL__VIDEO:
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
			case VideoGenPackage.OPTIONAL__NEXT_SIBLING:
				setNextSibling((Sequence)null);
				return;
			case VideoGenPackage.OPTIONAL__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case VideoGenPackage.OPTIONAL__VIDEO:
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
			case VideoGenPackage.OPTIONAL__NEXT_SIBLING:
				return nextSibling != null;
			case VideoGenPackage.OPTIONAL__PROBABILITY:
				return PROBABILITY_EDEFAULT == null ? probability != null : !PROBABILITY_EDEFAULT.equals(probability);
			case VideoGenPackage.OPTIONAL__VIDEO:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (probability: ");
		result.append(probability);
		result.append(')');
		return result.toString();
	}

} //OptionalImpl
