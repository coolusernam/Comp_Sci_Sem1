import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first number.");
		int x = sc.nextInt();
		System.out.println("Please enter your second number.");
		int y = sc.nextInt();
		System.out.println("Please enter your third number.");
		int q = sc.nextInt();
	
	
		if((x>y) && (x> q))
		{
			System.out.println("Your first number is the largest of the three!"); 
				
		}
		
		if((y>x) && (y>q))
		{
			System.out.println("Your second number is the largest of the three!");
				
		}
		
		if((q>x) && (q>y))
		{
			System.out.println("Your third number is the largest of the three!");
		
		}
		
		
		
		if((x<y) && (x<q))
		{
			System.out.println("Your first number is the smallest of the three!");
		}
		
		if((y<x) && (y<q))
		{
			System.out.println("Your second number is the smallest of the three!");
		}
		
		if((q<x) && (q<y))
		{
			System.out.println("Your third number is the smallest of the three!");
		}
		
		
	}
}
