package Enemies;

import java.util.Scanner;
import java.util.Random; //Import Random Function
import DungeonOne.Room2;
import CharacterStuff.Statistics;

public class EnemyRat {	

private static int enemyHealth = 4;

public static void combatinitialize() {
	
	int enemyInit; //enemies Initiative
	int playerInit; //Players Initiative 
	
	Random rnd = new Random();
	
	do{
	enemyInit = rnd.nextInt(10) + 3;  //Randomize chance Variable for enemy Initiative
	playerInit = rnd.nextInt(10) + 1;  //Randomize chance Variable for Player Initiative
	} while (enemyInit == playerInit);
	
	if (enemyInit > playerInit)
		EnemyRat.enemyturn();
	else if (playerInit > enemyInit);
		EnemyRat.playerturn();	
}

public static void enemyturn() {	
	
	int enemyHitChance; //enemies Hit Chance
	int enemyAttack; //enemies Attack
	
	Random rnd = new Random();
	
	EnemyRat RatTurn = new EnemyRat(); 
	
	if (enemyHealth > 0 && Statistics.Health > 0) {
		enemyHitChance = rnd.nextInt(20) + 3;
			if (enemyHitChance > 12) {
				enemyAttack = rnd.nextInt(3) + 1;
				Statistics.Health -= enemyAttack;
				System.out.printf("\n Rat(%d HP): You are hit for -%d damage!\n", enemyHealth, enemyAttack);
				EnemyRat.playerturn(); }
			else if (enemyHitChance <= 12)  {
				System.out.printf("\n Rat(%d HP): The Rat misses you!\n", enemyHealth);
				EnemyRat.playerturn(); } 
			}
	else if (enemyHealth <= 0) {
		System.out.printf("\n > You have killed the Rat!\n");
		Room2.combatDone = true;
		Room2.afterCombat();	
		}
	}
		
public static void playerturn() {
	
	Room2 room2 = new Room2();
	
	EnemyRat playerTurn = new EnemyRat(); 
	
	@SuppressWarnings("resource")
	Scanner userInput = new Scanner(System.in);
	Random rnd = new Random();
	
	int playerHitChance;
	int playerAttack;
	
	String playerAction;
	
	if (enemyHealth > 0 && Statistics.Health > 0);
	System.out.printf("\n Action: "); //Currently: Run Or Attack
	playerAction = userInput.nextLine();
		if (playerAction.equals("Attack")) { 
			playerHitChance = rnd.nextInt(20) + 3;
			if (playerHitChance > 10) { 
				playerAttack = rnd.nextInt(4) + 1;
				enemyHealth -= playerAttack;
				System.out.printf("\n Player(%d HP): You hit the enemy for -%d damage!\n", Statistics.Health, playerAttack);
				EnemyRat.enemyturn(); 
				}
			else if (playerHitChance <= 10) {
				System.out.printf("\n Player(%d HP): You Miss The Rat and chop off a tuft of its fur! \n", Statistics.Health);
				EnemyRat.enemyturn(); }
		}
		else if (!(playerAction.equals("Attack"))) {
			EnemyRat.playerturn();
			}
		else if (Statistics.Health <= 0) {
			System.out.printf("\n > You have been slain!\n");
			Room2.afterCombat();
			}
				
	}// End PlayerTurn

} // End Class