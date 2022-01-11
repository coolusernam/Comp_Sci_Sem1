import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("What type of Ascii art will you like?(Human, Dog, Cactus, Cat, Other");
		
		String type = sc.nextLine(); 
		
		Ascii x = new Ascii();
		Ascii y = new Ascii("Human");
		Ascii q = new Ascii("Dog",2);
		Ascii v = new Ascii("Cactus","Cactus");
		
	
		q.printArt(); 
		
		System.out.println("Let's print out a human now!");
		type = "Human";
		y.setName(type); 
		y.printArt(); 
		
		System.out.println("Let's print out a cactus now!");
		type = "Cactus";
		v.setName(type);
		v.printArt(); 
	
		System.out.println("Lets print out anohter Ascii drawing!");
		
		type = "other";
		x.printArt(); 
		


		
	}
}
