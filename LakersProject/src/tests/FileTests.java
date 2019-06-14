package tests;

import junit.*;

import static org.junit.Assert.assertEquals;

import data.Database;
import guimain.ImportExportHelper;


/**
 * Testing JUnit for import and export.
 * @author Grant S.
 */

class FileTests {
   public ImportExportHelper testData;
   public Database testDatabase;
   
   final void setup() {
      testData = new ImportExportHelper(testDatabase);
   }
   
   final void testUSerName(){
      testData.setUserName("TESTNAME");
      assertEquals("TESTNAME", testData.getUserName());
   }
   
   final void testUserEamail(){
      testData.setEmail("TEST@EMAIL.COM");
      assertEquals("TEST@EMAIL.COM", testData.getEmail());
   }
}
