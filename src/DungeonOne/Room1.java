package DungeonOne; //Package

import java.util.Scanner; //Import Scanner Utility

import Actions.LightTorch;
import Actions.SearchBookShelves;
import CharacterStuff.Inventory;
import CharacterStuff.Statistics;

public class Room1 //Room1 Class
{
	public static boolean torchlit;
	
	public void room1() //Create Room1 Method
	{ 
		torchlit = false;
		
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner (System.in); //Create New Scanner Input

		LightTorch lightTorch = new LightTorch(); //Create lightTorch Object
		SearchBookShelves searchShelves = new SearchBookShelves(); //Create searchShelves Object
		Statistics skills = new Statistics(); //Create Skills Object
		Inventory inventory = new Inventory();
		
		LightTorch.wet = true; //Set LightTorch wet Variable
	
		
		String userAction; //Create userAction String
		boolean nextRoom;

		nextRoom = false;
		
		do {
			System.out.printf("\n > You wake up in a small dark room, there is very little light. You can feel the cold stone floor and walls. What do you do next?");
				System.out.printf("\n\n A) Light a torch.");
				System.out.printf("\n B) Feel around some more.");  //Room Description Stuff
				System.out.printf("\n C) Leave.");
	
					System.out.printf("\n\n Action: "); //Prompt Action
					userAction = userInput.next( );  //Find out What The User Does
		
					if (userAction.equals("A")) {  //If They Light Their Torch
						lightTorch.lightTorch(); //Access LightTorch Class
					} // Close Light Torch
		
					 if (userAction.equals("B")) { //If They Choose To Feel Around
						System.out.printf("\n > You trip and fall on your face,  you get up slightly dazed.\n"); //Make Them Fall Over Lol
					} //Close Feel Around
		
					if (userAction.equals("C")) { //If They Choose To "Try" To Leave
						System.out.printf("\n > As you head for the exit, metal bars slide over the opening. As you step away they open again.\n"); //Block Them From leaving Lololol
					} //Close Leave
					
					if (userAction.equals("Stats")) { //If They Choose To Look At Stats
						skills.statistics(); // Show Stats
					} //Close Stats
					
					if (userAction.equals("Inventory")) { //If They Choose To Look At Inventory
						inventory.inventory(); // Show Inventory
					} //Close Stats
					
		} while (torchlit == false);
			
			if (torchlit == true) { //See If Torch is Lit, If So, Light Room
				System.out.printf("\n > The room is suddenly alight with an orange glow, in the room you can now see a bookshelf, and a door directly in front of you heading north. What do you do next?");
				System.out.printf("\n\n A) Go through the north door.");
				System.out.printf("\n B) Look through bookshelves.");  //Room Description Stuff
				System.out.printf("\n C) Leave.");
				
					System.out.printf("\n\n Action: "); //Prompt Action
					userAction = userInput.next( );  //Find out What The User Does
					
					if (userAction.equals("A")) { //If They Go Through Door
						nextRoom = true;
						Room2 Room2Object = new Room2(); //Create Room2 Object
						Room2Object.room2(); //Access Room2 Class
					} //Close Leave Room
					
					if (userAction.equals("B")) { //If They look Through Book Shelves
						searchShelves.searchBookShelves(); //Access SearchBookShelves Class
					} //Close Look Through Book Shelves
					
					if (userAction.equals("C")) { //If They Choose To "Try" To Leave
						System.out.printf("\n > As you head for the exit, metal bars slide over the opening. As you step away they open again.\n"); //Block Them From leaving Lololol
					} //Close Leave
				
					if (userAction.equals("Stats")) { //If They Choose To Look At Stats
						skills.statistics(); // Show Stats
					} //Close Stats
					
					if (userAction.equals("Inventory")) { //If They Choose To Look At Inventory
						inventory.inventory(); // Show Inventory
					} //Close Stats
					
				} // Close Torch Lit
		
		if (nextRoom == false) {
		do {
			System.out.printf("\n > You are in a small lit room, the room is lit only by your torch, theres a small bookshelf and a door headed north. What do you do next?");
			System.out.printf("\n\n A) Go through north door.");
			System.out.printf("\n B) Look through bookshelves.");  //Room Description Stuff
			System.out.printf("\n C) Leave.");

				System.out.printf("\n\n Action: "); //Prompt Action
				userAction = userInput.next( );  //Find out What The User Does
				
				if (userAction.equals("A")) { //If They Go Through Door
					nextRoom = true;
					Room2 Room2Object = new Room2(); //Create Room2 Object
					Room2Object.room2(); //Access Room2 Class
				} //Close Leave Room
				
				if (userAction.equals("B")) { //If They look Through Book Shelves
					searchShelves.searchBookShelves(); //Access SearchBookShelves Class
				} //Close Look Through Book Shelves
				
				if (userAction.equals("C")) { //If They Choose To "Try" To Leave
					System.out.printf("\n > As you head for the exit, metal bars slide over the opening. As you step away they open again.\n"); //Block Them From leaving Lololol
				} //Close Leave
				
				if (userAction.equals("Stats")) { //If They Choose To Look At Stats
					skills.statistics(); // Show Stats
				} //Close Stats
				
				if (userAction.equals("Inventory")) { //If They Choose To Look At Inventory
					inventory.inventory(); // Show Inventory
				} //Close Stats
				
		} while (nextRoom == false);
		}
					
	} //Close Method
} //Close Class
