import java.util.Scanner;
import java.util.Random;

class starter {
	

	public static void toString(String a){
		String x = a; 
		System.out.println("This is using the methods!");
		System.out.println(x);
		return;
	}
	
	public static void toStringCombined(String a, String b) {
		String x = a;
		String y = b; 
		System.out.print(x);
		System.out.print(" ");
		System.out.println(y);
		
	}
	

	
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Write a sentence!");	
	String text = sc.nextLine(); //first input 
	
	System.out.println("Write a sentence!");
	String text2 = sc.nextLine(); // seccond input
	
	toString(text);
	toStringCombined(text, text2);
	
	
	
		
	
	
		
	}
}
