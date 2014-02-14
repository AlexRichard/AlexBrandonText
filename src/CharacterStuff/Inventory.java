package CharacterStuff;

import java.util.ArrayList;

public class Inventory {

	public static ArrayList<String> itemsInventory = new ArrayList<String>();
	public static double goldPieces = 0;
	public static double silverPieces = 0;
	public static double copperPieces = 0;
	
	public void inventory() {
		
		
		itemsInventory.add("Matches");
		itemsInventory.add("Torch");
		itemsInventory.add("Iron Dagger");
		
		for(int i = 0; i<itemsInventory.size(); i++) {
		
		System.out.printf("                                              \n");
		System.out.printf("      X----------------------------------X    \n");
		System.out.printf("      |          o Coin Purse o          |    \n");
		System.out.printf("      X----------------------------------X    \n");
		System.out.printf("                                              \n");
		System.out.printf("             Gold:        " + goldPieces + "  \n");
		System.out.printf("             Silver:      " + silverPieces + "\n");
		System.out.printf("             Copper:      " + copperPieces + "\n");
		System.out.printf("                                              \n");
		System.out.printf("      X----------------------------------X    \n");
		System.out.printf("      |            o BackPack o          |    \n");
		System.out.printf("      X----------------------------------X    \n");
		System.out.printf("        %s\n", itemsInventory.get(i)); }
		System.out.printf("      ------------------------------------    \n");
		System.out.printf("                                              \n");
		
		
	}
	
}
