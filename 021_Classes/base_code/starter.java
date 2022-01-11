import java.util.Scanner;
import java.util.Random;


class MyCharacter {
	public String role = "Wizard";
	public int Strength = 5; 
	public int Dexterity = 5; 
	public int Intelligence = 5; 
	public int Constitution = 5; 
	public int Charisma = 5; 
	
	public MyCharacter(){
		
	}
	public MyCharacter(String a){
		String role = a; 
	}
}


class starter {
	public static void main(String args[]) {
		// Your code goes below here
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
