/**
 */
package org.irisa.diverse.videogenlmt.videoGen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mandatory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.irisa.diverse.videogenlmt.videoGen.Mandatory#getVideo <em>Video</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage#getMandatory()
 * @model
 * @generated
 */
public interface Mandatory extends Sequence {
	/**
	 * Returns the value of the '<em><b>Video</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video</em>' reference.
	 * @see #setVideo(Video)
	 * @see org.irisa.diverse.videogenlmt.videoGen.VideoGenPackage#getMandatory_Video()
	 * @model
	 * @generated
	 */
	Video getVideo();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogenlmt.videoGen.Mandatory#getVideo <em>Video</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video</em>' reference.
	 * @see #getVideo()
	 * @generated
	 */
	void setVideo(Video value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void process();

} // Mandatory
