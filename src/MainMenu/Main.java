package MainMenu; //Package

import java.util.Scanner;

import CharacterStuff.Statistics;
import DungeonOne.Room1;

public class Main { //Main Class

	public static void main (String[] args) { //Set Main As Main Class
		
	boolean classSelected;
		
	classSelected = false;
	String userAction;
	
	Statistics charStats = new Statistics(); //Create Stats Object
	
		System.out.printf("\nX----------------------------------------------------X\n");
		System.out.printf(  "|             o SOME TEXT RPG TEST THING o           |\n");
		System.out.printf(  "X----------------------------------------------------X\n");
		
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner (System.in); //Create New Scanner Input
		
		System.out.printf("\n > Enter your name adventurer: ");
		Statistics.charName = userInput.nextLine();  //Find out What The User Does
		
		
		do {
		    classSelected = false;
		    	System.out.printf("\n > Name Your Class (Type Class List For List of Classes): ");
		    	userAction = userInput.nextLine();  //Find out What The User Does
			
		    	if (userAction.equals("Class List")) { 
				System.out.printf("\n > Warrior: Excels in the use of close combat, wields swords and sheild, is strong and durable.");
				System.out.printf("\n > Rogue: Sneaky and agile, Rogues use their wit a prowess to aid them in their adventures. They prefer the use of small weapons and bows to strike their enemies.");
				System.out.printf("\n > Mage: Mages use magic and staffs to bend the wills of the elements around them to overcome obstacles. They are wise a intelligent.\n");
				}
		    	
		    	if (userAction.equals("Warrior")) { 
		    		classSelected = true;
		    		Statistics.strength = 18;
		    		Statistics.constitution = 16;
		    		Statistics.agility = 14;
		    		Statistics.charisma = 12;
		    		Statistics.wisdom = 10;
		    		Statistics.intelligence = 9;
		    		Statistics.Health = 14; 
		    		Statistics.charClass="Warrior";
		    		charStats.statistics();
				}
		    	
		    	if (userAction.equals("Mage")) { 
		    		classSelected = true;
		    		Statistics.strength = 8;
		    		Statistics.constitution = 10;
		    		Statistics.agility = 10;
		    		Statistics.charisma = 16;
		    		Statistics.wisdom = 11;
		    		Statistics.intelligence = 19;
		    		Statistics.Health = 6;
		    		Statistics.charClass = "Mage";
		    		charStats.statistics();
				}
		    	
		    	if (userAction.equals("Rogue")) { 
		    		classSelected = true;
		    		Statistics.strength = 11;
		    		Statistics.constitution = 12;
		    		Statistics.agility = 18;
		    		Statistics.charisma = 12;
		    		Statistics.wisdom = 16;
		    		Statistics.intelligence = 10;
		    		Statistics.Health = 9;
		    		Statistics.charClass = "Rogue";
		    		charStats.statistics();
				}
		    	
		    	System.out.printf("\n > Confirm Class Selection (Yes/No): ");
		    	userAction = userInput.nextLine();  //Find out What The User Does
		    	
		    		if (userAction.equals("Yes")) {
		    			classSelected = true; }
		    		else if (userAction.equals("No")) {
		    			classSelected = false; }
		    	
			} while (classSelected == false);
		
		Room1 Room1Object = new Room1(); //Create Room1 Object
		Room1Object.room1(); //Access Room1 Class

	} //Close Method
	
} //Close Class
