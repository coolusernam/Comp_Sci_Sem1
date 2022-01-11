import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in); 
		MyCharacter x = new MyCharacter();
		x.myToString();
		System.out.println("---------------------------");
		System.out.println("What class with you like to be?");
		String WhatClass = sc.nextLine(); 
		
		System.out.println("Choose Strength(1-10)");
		int Strength = sc.nextInt(); 
		System.out.println("Choose Dexterity(1-10)");
		int Dexterity = sc.nextInt(); 
		System.out.println("Choose Intelligence(1-10)");
		int Intelligence = sc.nextInt(); 
		System.out.println("Choose Constitution(1-10)");
		int Constitution = sc.nextInt(); 
		System.out.println("Choose Charisma(1-10)");
		int Charisma = sc.nextInt();
		
		
		
		MyCharacter uh = new MyCharacter(WhatClass, Strength, Dexterity, Intelligence, Constitution, Charisma); 
		

		System.out.println(uh.setAll(WhatClass, Strength, Dexterity, Intelligence, Constitution, Charisma)); 
	
	
		uh.myToString(); 
		
		


		
	}
}
