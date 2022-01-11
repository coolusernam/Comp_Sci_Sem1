import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random(); 
		int rand_num1 = rand.nextInt(10);
		System.out.println(rand_num1);
		
		Random rand1 = new Random();
		int rand_num2 = rand.nextInt(100)+1;
		System.out.println(rand_num2);
		
		Random rand2 = new Random();
		double rand_num3 = rand.nextDouble()+2.5;
		System.out.println(rand_num3);
		
		Random rand4 = new Random();
		double rand_num5 = rand.nextDouble();
		
		Random rand6 = new Random();
		int rand_num7 = rand.nextInt(576)+14;
		System.out.println(rand_num5 + rand_num7);
		
		
		
		
	}
}
