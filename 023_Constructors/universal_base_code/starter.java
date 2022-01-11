import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	MyCharacter test = new MyCharacter(); 
	test.start(); 
	System.out.println("---------------------------");
	System.out.println("What class with you like to be?");
	String WhatClass = sc.nextLine(); 
	MyCharacter type = new MyCharacter(WhatClass); 
	type.output();
	type.start(); 



		
	}
}
