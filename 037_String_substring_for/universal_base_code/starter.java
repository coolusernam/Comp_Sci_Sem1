import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a word.");
		
		int c = 0; 
		
		for(String word = sc.nextLine(); word.length()>c; c++)
		{	
			if(c == 0){
				System.out.println("Letter by letter:");
			}
			System.out.print(c + " ");
			System.out.println(word.substring(c, c+ 1));
		}
		
		


		
	}
}
