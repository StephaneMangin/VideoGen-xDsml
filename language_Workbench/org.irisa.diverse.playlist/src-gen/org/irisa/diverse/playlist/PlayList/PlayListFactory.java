/**
 */
package org.irisa.diverse.playlist.PlayList;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.irisa.diverse.playlist.PlayList.PlayListPackage
 * @generated
 */
public interface PlayListFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlayListFactory eINSTANCE = org.irisa.diverse.playlist.PlayList.impl.PlayListFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Play List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Play List</em>'.
	 * @generated
	 */
	PlayList createPlayList();

	/**
	 * Returns a new object of class '<em>Video</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video</em>'.
	 * @generated
	 */
	Video createVideo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PlayListPackage getPlayListPackage();

} //PlayListFactory
