import java.util.Scanner;
import java.util.Random;



class starter {
	
	public static boolean checkPrime(int a)  {
	int x = a; 
	//int counter = 2; 
	int counter = 2; 
	int prime = x % counter; 
	while(counter != x) {
		if(x % counter == 0){
			return false; 
		}
		if(counter == 2) {
			break; 
		}
		counter = counter + 1; // changed from +1 to -1
	}
	return true; 
	}
	
	public static void printPrimes(int a)  {
	int x = a; 
	//int counter = 2; 
	int counter = 2; 
	
	
	while(counter <= x){
		if(counter == 1)  {
			break; 
		}
		if(checkPrime(counter)) {
			System.out.println(counter); 
		
		}
		
	counter = counter + 1; 
	}
	return; 
	}
	
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
	Scanner sc = new Scanner(System.in);
	System.out.print("Input a number to check if it's prime number:");
	int number = sc.nextInt();
	
	checkPrime(number);
	printPrimes(number);
	
	System.out.println(checkPrime(number));
	//System.out.println(printPrimes(number));
	
	}
}
