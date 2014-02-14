package Actions; //Package

	import java.util.Random; //Import Random Function 

import DungeonOne.Room1;

public class LightTorch //Create Class
{
	public static boolean wet; //Public Wet Variable (LightTorch.wet)

	public void lightTorch() //Create LightTorch Method
	{
	
		int chance; //Declare chance Variable
	
	Random rnd = new Random(); 
	chance = rnd.nextInt(10) + 1;  //Randomize chance Variable
	
		if (wet == true) { //Check if Wet Is True
			if (chance >= 4){
				Room1.torchlit = true;
				System.out.printf("\n > You light your torch!\n"); }//See If You Light The Torch
			else if (chance < 4)  {
				System.out.printf("\n > You fail to light your torch!\n");  
					Room1.torchlit = false; }
				} //Close Wet = True
		else if (wet == false) { //Check If 
			System.out.printf("Because conditions are dry, your torch light without a problem!"); } //Close Wet = False
		
	} // Close Method
	
} //Close Class
				