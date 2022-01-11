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
		MyCharacter type = new MyCharacter(WhatClass); 
		type.output();
		type.myToString(); 


		
	}
}
