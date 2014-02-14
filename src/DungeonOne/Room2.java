package DungeonOne;

import Enemies.EnemyRat;

public class Room2 {
	
	public static boolean room2Active;
	public static boolean combatDone;
	
	public static void room2()
	{
	
		
		EnemyRat enemy = new EnemyRat();
		
		if (combatDone = false) {
			System.out.printf("\n > You step in to a large room with high ceilings supported by stone arches.\n");
			System.out.printf("\n > You see a rat!\n");
			enemy.combatinitialize();
		} 
		else
			Room2.afterCombat();
		
		
	}
	
	public static void afterCombat() {
		
		System.out.printf("\n > yay.\n");
		
	}
	
}
