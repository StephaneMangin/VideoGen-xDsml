/**
 * Copyright (C) 2006 Free Software Foundation
 */
package PlayList.impl;

import PlayList.PlayList;
import PlayList.PlayListFactory;
import PlayList.PlayListPackage;
import PlayList.Video;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlayListPackageImpl extends EPackageImpl implements PlayListPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see PlayList.PlayListPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PlayListPackageImpl() {
		super(eNS_URI, PlayListFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PlayListPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PlayListPackage init() {
		if (isInited) return (PlayListPackage)EPackage.Registry.INSTANCE.getEPackage(PlayListPackage.eNS_URI);

		// Obtain or create and register package
		PlayListPackageImpl thePlayListPackage = (PlayListPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PlayListPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PlayListPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePlayListPackage.createPackageContents();

		// Initialize created meta-data
		thePlayListPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePlayListPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PlayListPackage.eNS_URI, thePlayListPackage);
		return thePlayListPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayList() {
		return playListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayList_Video() {
		return (EReference)playListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideo() {
		return videoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideo_Duration() {
		return (EAttribute)videoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideo_Description() {
		return (EAttribute)videoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideo_Path() {
		return (EAttribute)videoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideo_Mimetype() {
		return (EAttribute)videoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideo_Thumbnail() {
		return (EAttribute)videoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayListFactory getPlayListFactory() {
		return (PlayListFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		playListEClass = createEClass(PLAY_LIST);
		createEReference(playListEClass, PLAY_LIST__VIDEO);

		videoEClass = createEClass(VIDEO);
		createEAttribute(videoEClass, VIDEO__DURATION);
		createEAttribute(videoEClass, VIDEO__DESCRIPTION);
		createEAttribute(videoEClass, VIDEO__PATH);
		createEAttribute(videoEClass, VIDEO__MIMETYPE);
		createEAttribute(videoEClass, VIDEO__THUMBNAIL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(playListEClass, PlayList.class, "PlayList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlayList_Video(), this.getVideo(), null, "video", null, 0, -1, PlayList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(videoEClass, Video.class, "Video", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVideo_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVideo_Description(), ecorePackage.getEString(), "description", null, 0, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVideo_Path(), ecorePackage.getEString(), "path", null, 0, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVideo_Mimetype(), ecorePackage.getEString(), "mimetype", null, 0, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideo_Thumbnail(), ecorePackage.getEString(), "thumbnail", null, 0, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PlayListPackageImpl
