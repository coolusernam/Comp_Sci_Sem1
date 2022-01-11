import java.util.Scanner;
import java.util.Random;

class starter {
	
	
	public static int pow(int a, int b) {
		int x = a; 
		int y = b;
		int answer = x;
		int count = 0;
		while(count != y){
			answer = (answer * x); 
			if((y-2)==count){
				System.out.print("Your answer is ");
				break; 
			}
			count = count + 1; 
		}
		return answer; 
	}
		
	
		
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);

	System.out.println("What is your base number?"); // base number 
	int base = sc.nextInt(); 

	System.out.println("what is your exponents number?"); // expontent number 
	int exponent = sc.nextInt(); 
	
	int pow = pow(base, exponent); // stores numbers
	System.out.println(pow);
		
	}
}
