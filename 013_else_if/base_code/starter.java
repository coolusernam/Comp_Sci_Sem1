import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		Random rand =  new Random();
		System.out.println("Guess a number between 1 and 1000.");
		
		int text = sc.nextInt();
		
		int r = rand.nextInt(1001);
	
	
	
		if(text==r)
		{
			System.out.println("You guessed the right number! Congrats!");
		}
		else if(text<r)
		{
			System.out.println("Your guess was smaller than the number. The number was " + r + ".");
		}
		else 
		{
			System.out.println("Your guess was bigger than the number. The number was " + r + ".");
		}
	}
}
