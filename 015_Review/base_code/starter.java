import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		System.out.println("What is your title?");
		String title = sc.nextLine();
		
		System.out.println("Would you like to be Wizard, Warrior, or Rogue?");
		String role = sc.nextLine();
		
		if(role.equals("Wizard"))
		{
			System.out.println("You've chosen Wizard!");
		}
		
		else if(role.equals("Warrior"))
		{
			System.out.println("You've chosen Warrior!");
		}
		else if(role.equals("Rogue"))
		{
			System.out.println("You've chosen Rogue!");
			
		}
		else
		{
			System.out.println("You've decided not to choose a role. Return program.");
		}
		
		
		System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend then wisely.");
		
		
		System.out.println("Choose Strength(1-10)");
		int strength = sc.nextInt();
		int answer = (25 - strength); 
		if(strength == 0)
		{
			System.out.println("Imagine choosing to be a weakling!");
			System.out.println("You have " + answer + " left to spend");
		}
		else if(strength<=10)
		{
			System.out.println("You have " + answer + " left to spend.");
		}
		else 
		{
			System.out.println("Please input a smaller number.");
			int num = sc.nextInt();
			int num1 = 25 - num;
			System.out.println("You have " + num1 + " left to spend");
		}
		
		System.out.println("Choose Dexterity(1-10)");
		int dexterity = sc.nextInt();
		int answer1 = (answer - dexterity);
		if(dexterity == 0)
		{
			System.out.println("Have fun slow poke!");
			System.out.println("You have " + answer1 + " left to spend.");
		}
		else if(dexterity<=10) 
		{
			System.out.println("You have " + answer1 + " left to spend.");
		}
		else
		{
			System.out.println("Please input a smaller number.");
			int smaller = sc.nextInt();
		}
	
		System.out.println("Choose Intelligence(1-10)");
		int intelligence = sc.nextInt();
		int answer2 = (answer1 - intelligence);
		if(intelligence == 0)
		{
			System.out.println("Have fun being dumb.");
			System.out.println("You have " + answer2 + " left to spend.");
		}
		else if(intelligence<=10)
		{
			System.out.println("You have " + answer2 + " left to spend.");
		}
		else
		{
			System.out.println("Please input a smaller number.");
			int smaller1 = sc.nextInt();
			int uh = answer1 - smaller1;
			System.out.println("You have " + uh + " left to spend.");
		}
		
		System.out.println("Choose Constitution(1-10)");
		int constitution = sc.nextInt();
		int answer3 = (answer2 - constitution);
		if(constitution<=10)
		{
			System.out.println("You have " + answer3 + " left to spend.");
		}
		else
		{
			System.out.println("Please input a smaller number.");
			int smaller2 = sc.nextInt();
			int uh1 = answer2 - smaller2;
			System.out.println("You have " + uh1 + " left to spend.");
		}
		
		System.out.println("Choose Charisma(1-10)");
		int charisma = sc.nextInt();
		int answer4 = (answer3 - charisma);
		if(charisma<=10)
		{
			System.out.println("You have " + answer4 + " left to spend.");
		}
		else 
		{
			System.out.println("Please input a smaller number.");
			int smaller3 = sc.nextInt();
			int uh2 = answer3 - smaller3; 
			System.out.println("You have " + uh2 + " left to spend.");
		}
		
		
		System.out.println("Name: " + name);
		System.out.println("Title: " + title);
		System.out.println("Role: " + role);
		System.out.println("Strength: " + strength);
		System.out.println("Dexterity: " + dexterity);
		System.out.println("Intelligence: " + intelligence);
		System.out.println("Constitution: " + constitution);
		System.out.println("Charisma: " + charisma);
		
		if(answer4 > 0)
		{
			System.out.println("You have " + answer4 + " points for next time.");
		}
		
		
		
		
		
		
		
		
		
	}
}
