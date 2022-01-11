import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
		System.out.println("what is your first name?");
		String text = sc.nextLine(); 
		
		System.out.println("What is your age?");
		int number = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("What is your birthday month?");
		String x  = sc.nextLine(); 
		
		System.out.println("What is your birtday day?");
		int y  = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("What is your birthday year?");
		int z = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("How much is a buck fifty?");
		double v = sc.nextInt();
		
		
	}
}
