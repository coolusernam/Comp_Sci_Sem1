import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word.");
		String word = sc.nextLine(); 
		
		int counter = 0; 
		System.out.println("Letter by letter:");
		
		while(word.length()>counter){  
			System.out.print(counter + " ");
			System.out.println(word.substring(counter,counter+1));
			counter = counter + 1;
		}
		


		
	}
}
