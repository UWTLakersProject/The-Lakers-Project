package guimain;

import java.awt.Component;
import java.awt.Dimension;
import java.util.List;
import java.util.ArrayList;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import data.Database;
import data.Project;

/**
 * 
 * @author Thias David
 */
public class CenterPanelWithProjects extends JPanel{

	public JPanel myPanel;
	public ArrayList<Project> myProjects;
	public Database myDatabase;
	public DefaultListModel<Project> myList;
	public JList<Project> myJList;


	/**
	 * 
	 * @author Thias David
	 * @version 6/6/19
	 */
	public CenterPanelWithProjects(Database theDatabase){
		myPanel = new JPanel();
//		JFrame frame = new JFrame();
		myDatabase = theDatabase;
		
//		DefaultListModel<String> list = new DefaultListModel<>();
		myList = new DefaultListModel<>();

//		JList<String> projects = new JList<>(list); 
		myJList = new JList<>(myList);
		myJList.setVisibleRowCount(10);
		myJList.setFont(myJList.getFont().deriveFont(22.0f));

		myJList.setCellRenderer(new MyListCellRenderer());

		myJList.setVisible(true);
		
		for(Project p : myDatabase.getAllProjects()) {
			myList.addElement(p);
		}
		
		myPanel.add(myJList);
		myPanel.setSize(400, 400);
		myPanel.setVisible(true);
		myPanel.setLayout(null);
	}

	public void updateProjects(List<Project> theNewList) {
		myDatabase = new Database();
		myList.clear();
		
		
		for(Project p : theNewList) {
			myDatabase.addProject(p);
			myList.addElement(p);
		}
		myJList = new JList<>(myList);
		myJList.setVisibleRowCount(3);
		myJList.setFont(myJList.getFont().deriveFont(22.0f));

		myJList.setCellRenderer(new MyListCellRenderer());
	}




}



class MyListCellRenderer extends DefaultListCellRenderer{

	public Component getListCellRendererComponent(
			JList list, Object value, int index, 
			boolean isSelected, boolean cellHasFocus) {
		super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		Project project = (Project) value;
		String name = project.getName();
		Double cost = project.getProjectFinances().getCost();
		String diff = project.getDifficulty();
//		List<String> inst = project.getInstructions();
//		StringBuilder sb = new StringBuilder();
//		int x = 1;
//		for(String s : inst) {
//			sb.append(x);
//			sb.append(") ");
//			sb.append(s);
//			sb.append("\n");
//			x++;
//		}
//		String temp = sb.toString();
		
		String label = "<html>Project Name: " + name + "<br/>Cost: " 
		+ cost + "<br/>Difficulty: " + diff;
		setText(label);

		return this;
	}

}
