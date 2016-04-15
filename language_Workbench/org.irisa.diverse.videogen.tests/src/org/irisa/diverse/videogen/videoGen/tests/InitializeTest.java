/**
 */
package org.irisa.diverse.videogen.videoGen.tests;

import junit.textui.TestRunner;

import org.irisa.diverse.videogen.videoGen.Initialize;
import org.irisa.diverse.videogen.videoGen.VideoGenFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Initialize</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InitializeTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InitializeTest.class);
	}

	/**
	 * Constructs a new Initialize test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitializeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Initialize test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Initialize getFixture() {
		return (Initialize)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VideoGenFactory.eINSTANCE.createInitialize());
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

} //InitializeTest
