package guimain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class ImportExportHelper {

	ArrayList<Project> myProjects;
	String myFileName;
	
	public ImportExportHelper() {
		myProjects = new ArrayList<Project>();
		myFileName = "";
	}
	
	
	public ImportExportHelper(ArrayList<Project> theProjects , String theFileName) {
		myProjects = theProjects; 
		myFileName = theFileName;
	}
	
	public void importData(String theFileName) {
		try {
			FileReader read = new FileReader(theFileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		BufferedReader readTwo = new BufferedReader(read);
		
	}
	
	public File exportData(){
		
		
		return null;
	}
	
	public void setFileName(String newName) {
		myFileName = newName;
	}
	
	public void databaseView() {
		
	}
}
