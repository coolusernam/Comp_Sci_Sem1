import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your first number.");
		int x = sc.nextInt();
		
		System.out.println("Please enter your second number.");
		int y = sc.nextInt();
		
		if(x==y)
		{
			System.out.println("Your numbers are the same!");
		}
		
		if(x!=y)
		{
			System.out.println("Your numbers are different!");
		}
		
		
	}
}
