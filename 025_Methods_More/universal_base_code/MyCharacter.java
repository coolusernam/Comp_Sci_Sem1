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
	public MyCharacter(String a, int b, int c, int d, int e, int f)  {
		String r = a; 
		int s  = b; 
		int dex = c; 
		int i = d; 
		int con = e; 
		int ch = f; 
		
		role = r; 
		Strength = s; 
		Dexterity = dex; 
		Intelligence = i; 
		Constitution = con; 
		Charisma = ch; 
	}
	
	public void myToString(){
		System.out.println("Your role is " + role);
		System.out.println("Your strength  is " + Strength);
		System.out.println("Your dexterity is " + Dexterity); 
		System.out.println("Your intelligence is " + Intelligence);
		System.out.println("Your constitution is " + Constitution); 
		System.out.println("Your charisma is " + Charisma); 
		
	}
	public void setRole(){
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
			System.out.println("You've decided to not choose a role. Return program.");
		}
		return; 
	}
	
	public int setStrength(int a) {
		int x = a; 
		Strength = x; 
		return Strength; 
	}
	public int setDexterity(int a) {
		int x = a; 
		Dexterity = x; 
		return Dexterity; 
	}
	
	public int setIntelligence(int a) {
		int x = a; 
		Intelligence = x; 
		return Intelligence; 
	}
	public int setConstitution(int a) {
		int x = a; 
		Constitution = x; 
		return Constitution; 
	}
	public int setCharisma(int a) {
		int x = a; 
		Charisma = x; 
		return Charisma; 
	}
	public boolean setAll(String a, int b, int c, int d, int e, int f) {
		String r = a; 
		int st = b; 
		int de = c; 
		int in = d; 
		int con = e; 
		int cha = f; 
		role = r; 
		Strength = st; 
		Dexterity = de; 
		Intelligence = in; 
		Constitution = con; 
		Charisma = cha; 
		return true; 
	}
	


}
