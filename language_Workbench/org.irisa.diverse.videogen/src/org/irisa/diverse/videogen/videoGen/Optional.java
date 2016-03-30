/**
 */
package org.irisa.diverse.videogen.videoGen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.Optional#getProbability <em>Probability</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.Optional#getVideo <em>Video</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getOptional()
 * @model
 * @generated
 */
public interface Optional extends Sequence {
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(Integer)
	 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getOptional_Probability()
	 * @model default="0" required="true"
	 * @generated
	 */
	Integer getProbability();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videoGen.Optional#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(Integer value);

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
	 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getOptional_Video()
	 * @model
	 * @generated
	 */
	Video getVideo();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videoGen.Optional#getVideo <em>Video</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video</em>' reference.
	 * @see #getVideo()
	 * @generated
	 */
	void setVideo(Video value);

} // Optional
