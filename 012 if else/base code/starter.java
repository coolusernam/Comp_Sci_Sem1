import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Guess a number betweeen 1 - 1000.");
		int text = sc.nextInt();
		
		int u = rand.nextInt(1001); 
		
		if(u==text)
		{
			System.out.println("You guessed the correct number! Congrats!");
		
		}
		else
		{
			System.out.println("Your number was not the random number. The random number was " + u );
		}
		
		
	
		
	}
}
