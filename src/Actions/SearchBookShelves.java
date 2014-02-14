package Actions;

import java.util.Random; //Import Random Utility

public class SearchBookShelves { //Create Class
	
	//store public variables HERE
	
	public void searchBookShelves() { //Create Method
		
		int searchResults;
		
		Random rnd = new Random(); 
		searchResults = rnd.nextInt(3) + 1;  //Randomize searchResults Variable
		
		if (searchResults == 1) {
			System.out.printf("\n > You find some rat bones covered in dust.\n"); }
		else if (searchResults == 2) {
			System.out.printf("\n > You find some dust covered books.\n"); }
		else if (searchResults == 3) {
			System.out.printf("\n > You find nothing of interest.\n"); }
			}
		}
		
