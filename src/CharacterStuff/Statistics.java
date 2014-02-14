package CharacterStuff;

public class Statistics {

	public static int strength = 10;
	public static int constitution = 10;
	public static int agility = 10;
	public static int wisdom = 10;
	public static int intelligence = 10;
	public static int charisma = 10;
	
	public static int strengthMod;
	public static int constitutionMod;
	public static int agilityMod;
	public static int wisdomMod;
	public static int intelligenceMod;
	public static int charismaMod;
	
	public static int Health = 0;
	public static int Sleep = 100;
	public static String Hunger = "Full";
	
	public static String charName;
	public static String charClass;
	public static String charAlignment = "Neutral";
	
	public void statistics() {
		
		strengthMod = ((strength - 10) / 2);
		constitutionMod = ((constitution - 10) / 2);
		agilityMod = ((agility - 10) / 2);
		wisdomMod = ((wisdom - 10) / 2);
		intelligenceMod = ((intelligence - 10) / 2);
		charismaMod = ((charisma - 10) / 2);
		
		
		System.out.printf("                                          \n");
		System.out.printf("      X----------------------------------X\n");
		System.out.printf("      |             o Info o             |\n");
		System.out.printf("      X----------------------------------X\n");
		System.out.printf("                                          \n");
		System.out.printf("             Name:        %s              \n", charName);
		System.out.printf("             Class:       %s              \n", charClass);
		System.out.printf("             Allignment:  %s              \n", charAlignment);
		System.out.printf("                                          \n");
		System.out.printf("      X----------------------------------X\n");
		System.out.printf("      |           o Abilities o          |\n");
		System.out.printf("      X----------------------------------X\n");
		System.out.printf("                                          \n");
		System.out.printf("           Stength:       %d (+%d)         \n", strength, strengthMod);
		System.out.printf("           Constitution:  %d (+%d)         \n", constitution, constitutionMod);
		System.out.printf("           Agility:       %d (+%d)         \n", agility, agilityMod);
		System.out.printf("           Wisdom:        %d (+%d)         \n", wisdom, wisdomMod);
		System.out.printf("           Intelligence:  %d (+%d)         \n", intelligence, intelligenceMod);
		System.out.printf("           Charisma:      %d (+%d)         \n", charisma, charismaMod);
		System.out.printf("                                          \n");
		System.out.printf("      X----------------------------------X\n");
		System.out.printf("      |          o Attributes o          |\n");
		System.out.printf("      X----------------------------------X\n");
		System.out.printf("                                          \n");
		System.out.printf("             Health:        %d            \n", Health);
		System.out.printf("             Sleep:         %d            \n", Sleep);
		System.out.printf("             Hunger:        %s            \n", Hunger);
		System.out.printf("                                          \n");
		System.out.printf("      X----------------------------------X\n");
	
	}
	
}
