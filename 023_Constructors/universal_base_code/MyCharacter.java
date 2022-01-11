import pkg.*;
import java.util.Scanner;
import java.util.Random;

public class MyCharacter {
	
	public String role;
	public int Strength = 0; 
	public int Dexterity = 0; 
	public int Intelligence = 0; 
	public int Constitution = 0; 
	public int Charisma = 0; 
	

	public MyCharacter() {
		role = "No Role";
		Strength = 0; 
		Dexterity = 0; 
		Intelligence = 0; 
		Constitution = 0; 
		Charisma = 0; 
		
	}
	
	public MyCharacter(String a) {
		role = a; 
		
	}
	
	public void start(){
		System.out.println("Your role is " + role);
		System.out.println("Your strength  is " + Strength);
		System.out.println("Your dexterity is " + Dexterity); 
		System.out.println("Your intelligence is " + Intelligence);
		System.out.println("Your constitution is " + Constitution); 
		System.out.println("Your charisma is " + Charisma); 
		return; 
	}
	public void output(){
		if((role.equals("Wizard") || (role.equals("wizard"))))  {
			System.out.println("You've chosen Wizard! Excelsior!");
		}
		else if((role.equals("Warrior") || (role.equals("warrior")))) {
			System.out.println("You have chosen Warrior! For honor!"); 
		}
		else if((role.equals("Rogue") || (role.equals("rogue")))){
			System.out.println("You have chosen Rogue! How cunning!");
		}
		else{
			System.out.println("You've decided not to choose a role. Return program.");
		}
		return; 
	}
	


}
