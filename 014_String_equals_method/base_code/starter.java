import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Is your role a Wizard, Warrior, or Rogue? Please write your answer in lowercase.");
		
		String text = sc.nextLine();
	
		if(text.equals("wizard"))
		{
			System.out.println("You've chosen Wizard!");
		}
	
		else if(text.equals("warrior"))
		{
			System.out.println("You've chosen Warrior!");
		}
	
		else if(text.equals("rogue"))
		{
			System.out.println("You've chosen Rogue!");
		}
		
		else
		{
			System.out.println("You've decided not to choose a role. Return program.");
		}
		
	
		
		
		
		
		
			
		
		
		
		
		
	
		
		
	}
}
