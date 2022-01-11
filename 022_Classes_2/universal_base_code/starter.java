import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		MyCharacter test = new MyCharacter(); 
	
		MyCharacter x = new MyCharacter(); 
		MyCharacter str = new MyCharacter(); 
		MyCharacter dex = new MyCharacter(); 
		MyCharacter intel = new MyCharacter(); 
		MyCharacter cons = new MyCharacter(); 
		MyCharacter chari = new MyCharacter();

		
		System.out.println("Your role is " + x.role);
		System.out.println("Your strength trait is " + str.Strength);
		System.out.println("Your dexterity trait is " + dex.Dexterity);
		System.out.println("Your intelligence trait is " + intel.Intelligence);
		System.out.println("YOur constitution trait is " + cons.Constitution); 
		System.out.println("Your charisma trait is " + chari.Charisma);

		
	}
}
