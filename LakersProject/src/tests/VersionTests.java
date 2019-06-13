package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import guimain.DIYProjectMain;
import guimain.Version;
/**
 * This class implements our jUnit test for our version class
 * @author Daniel Loony, Garhgaj S
 */

//Sets and obtains the version automatically based off of the serialized version of the class
//This class is helpful setting up our JUnit tests

class VersionTests {

	Version testVersion;
	DIYProjectMain testProject;
	
	
	@Before
	void setUp() {
		testProject = new DIYProjectMain();
		testVersion = new Version(testProject);
	}
	@Test
	void testSetVersion() {
		testVersion.setVersion();
		assertEquals(DIYProjectMain.myVersion, testVersion.getVersion());
	}

}
