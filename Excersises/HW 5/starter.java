import java.util.Scanner;
import java.util.Random;




class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	System.out.println("------------------------------------------------------- ");
	System.out.println("Slot machine rules:");
	System.out.println("1. Each player starts with $100.");
	System.out.println("2. Input a wager less than your total amount of money.");
	System.out.println("3. The slot machine will roll 3 numbers from 1 to 10");
	System.out.println("  a. If three numbers match, you double your money.");
	System.out.println("  b. if three numbers match, you triple your  money.");
	System.out.println("  c. If none match, you lose your money.");
	System.out.println("------------------------------------------------------- ");
	
	int money = 100; 
	int wager = 0;
	
	int answer2 = money; 
	
	while(true) {
	
		int counter = 1; 
		int count = money; 
	
	
		int number1 = rand.nextInt(10)+ 1; // three rolls 
		int number2 = rand.nextInt(10)+ 1; 
		int number3 = rand.nextInt(10)+ 1;
		if(answer2 == 0)
		{
			System.out.println("Didn't win this time, better luck next time!");
			break;
		}
	
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
		String play = sc.nextLine();
		
		
		if(counter == 1){
		if((play.equals("Yes")) || (play.equals("yes")) || (play.equals("Y")) || (play.equals("y"))) {
			System.out.println("You have " + count + "." +  " How much will you like to wager?");
			wager = wager; 
			wager = sc.nextInt();
		} 
		}
		
		System.out.println("Great! Let's play!!!");
		System.out.println("Your rolls are:");
		System.out.println("_____________________");
		System.out.println("    | " + number1 + " | " + number2 + " | " + number3  + " | ");
		System.out.println("_____________________");	
		
	/*	if(answer2 == 0)
		{
			System.out.println("Didn't win this time, better luck next time!");
			break;
		}  */
		int loss = money - wager; 
		int jackpot = wager * 3; 
		int won = wager * 2; 
		if((number1 != number2) && (number1 != number3) && (number2 != number3 )) {
			System.out.println("Didn't win this time, better luck next time!");
			loss = money - wager; 
			System.out.println("You have "  + loss + " left to spend.");
		}
		else if((number1 == number2) && (number1 == number3) && (number2 == number3)){
			System.out.println("JACKPOT! You're wager has been tripled!");
			jackpot = wager * 3 + count; 
			System.out.println("You have " + jackpot + " left to spend.");
		}
		else {
			System.out.println("You won! You're wager has now been douled!");
			won = wager * 2 + count; 
			System.out.println("You have " + won + " left to spend.");
	
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
		play = sc.nextLine();
		
		}
		/*
		if(true){ 
		if((play.equals("Yes")) || (play.equals("yes")) || (play.equals("Y")) || (play.equals("y")))
			System.out.println("You have " + loss + jackpot + won + "." +  " How much will you like to wager?");
			wager = wager; 
			wager = sc.nextInt();}*/
		
		count = money - loss * jackpot * won;  
		counter = counter + 1; 
		
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
