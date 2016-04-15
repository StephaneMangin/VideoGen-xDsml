/**
 */
package org.irisa.diverse.videogen.videoGen.tests;

import junit.textui.TestRunner;

import org.irisa.diverse.videogen.videoGen.Generate;
import org.irisa.diverse.videogen.videoGen.VideoGenFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Generate</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenerateTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GenerateTest.class);
	}

	/**
	 * Constructs a new Generate test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Generate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Generate getFixture() {
		return (Generate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VideoGenFactory.eINSTANCE.createGenerate());
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

} //GenerateTest
