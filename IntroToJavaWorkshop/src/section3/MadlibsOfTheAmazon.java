package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		
		// Get the user to enter an adjective
String adjective=JOptionPane.showInputDialog("Enter Adjective");
		// Get the user to enter a type of liquid
String operationliquid=JOptionPane.showInputDialog("Enter Liquid");
		// Get the user to enter a body part
String operationbodypart=JOptionPane.showInputDialog("Enter Body Part");
		// Get the user to enter a verb
String verb=JOptionPane.showInputDialog("Enter Verb");
		// Get the user to enter a place
String operationplace=JOptionPane.showInputDialog("Enter Place");
JOptionPane.showMessageDialog(null,"Piranhas are more "+ adjective+" during the day, so cross the river at\n" + 
		" night. Piranhas are attracted to fresh "+ operationliquid+" and will most\n" + 
		"likely take a bite out of your "+ operationbodypart+" if you "+ verb+". Whatever\n" + 
		"you do, if you have an open wound, try to find another way to get\n" + 
		" back to the "+operationplace+". Good luck!");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

