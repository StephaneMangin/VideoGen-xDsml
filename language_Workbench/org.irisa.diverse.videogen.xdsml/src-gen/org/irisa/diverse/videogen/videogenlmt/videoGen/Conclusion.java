/**
 */
package org.irisa.diverse.videogen.videogenlmt.videoGen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Conclusion#getVideogen <em>Videogen</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage#getConclusion()
 * @model
 * @generated
 */
public interface Conclusion extends Sequence {
	/**
	 * Returns the value of the '<em><b>Videogen</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGen#getConclusion <em>Conclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Videogen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Videogen</em>' reference.
	 * @see #setVideogen(VideoGen)
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage#getConclusion_Videogen()
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGen#getConclusion
	 * @model opposite="conclusion"
	 * @generated
	 */
	VideoGen getVideogen();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Conclusion#getVideogen <em>Videogen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Videogen</em>' reference.
	 * @see #getVideogen()
	 * @generated
	 */
	void setVideogen(VideoGen value);

} // Conclusion
