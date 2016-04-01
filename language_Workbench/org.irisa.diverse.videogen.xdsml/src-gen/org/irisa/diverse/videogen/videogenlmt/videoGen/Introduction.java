/**
 */
package org.irisa.diverse.videogen.videogenlmt.videoGen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Introduction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Introduction#getVideogen <em>Videogen</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage#getIntroduction()
 * @model
 * @generated
 */
public interface Introduction extends Sequence {
	/**
	 * Returns the value of the '<em><b>Videogen</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGen#getIntroduction <em>Introduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Videogen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Videogen</em>' reference.
	 * @see #setVideogen(VideoGen)
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage#getIntroduction_Videogen()
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGen#getIntroduction
	 * @model opposite="introduction"
	 * @generated
	 */
	VideoGen getVideogen();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.Introduction#getVideogen <em>Videogen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Videogen</em>' reference.
	 * @see #getVideogen()
	 * @generated
	 */
	void setVideogen(VideoGen value);

} // Introduction
