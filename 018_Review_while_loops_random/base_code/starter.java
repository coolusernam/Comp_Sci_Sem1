import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	int number = rand.nextInt(1001);
	
	System.out.println("Guess a number:");
	
	int guess = sc.nextInt();
	
	int start = 0;
	while(true)
	{
		
		if(guess==number)
		{
			break;
		}
		else if(guess>number)
		{
			System.out.println("Your a little too high!");
			guess = sc.nextInt();
		}
		else
		{
			System.out.println("Your a little too low!");
			guess = sc.nextInt();
		}
		number = number + 1;
	}
	System.out.println("You guessed the correct number!");
	



		
	}
}
