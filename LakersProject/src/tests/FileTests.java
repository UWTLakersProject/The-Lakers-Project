import junit.*;
package test;
import guimain.ImportExportHelper;

class FileTests {
   ImportExportHelper testData;
   
   final void setup() {
      testData = new ImportExportHelper();
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
