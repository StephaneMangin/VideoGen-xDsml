/**
 */
package org.istic.idm.xtext.videogen.videoGen.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.istic.idm.xtext.videogen.videoGen.VideoGen;
import org.istic.idm.xtext.videogen.videoGen.VideoGenFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Video Gen</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VideoGenTest extends TestCase {

	/**
	 * The fixture for this Video Gen test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoGen fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VideoGenTest.class);
	}

	/**
	 * Constructs a new Video Gen test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGenTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Video Gen test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(VideoGen fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Video Gen test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoGen getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VideoGenFactory.eINSTANCE.createVideoGen());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //VideoGenTest
