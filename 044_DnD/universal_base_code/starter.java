import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Warrior {
	Random rand = new Random();
	String name; 
	int health; 
	int attack = rand.nextInt(15)+1; 
	public Warrior(){
		name = "Gandolf";
		setHealth(health);
		attack(); 
	}
	public Warrior(String a){
		name = a; 
		setHealth(health);
		attack(); 
	}
	public void setHealth(int a){
		a = rand.nextInt(15)+1; 
		health = a; 
	}
	public int getHealth(){
		return health; 
	}
	public String getName(){
		return name; 
	}
	public void attack(){
		attack = rand.nextInt(attack)+1; 
		health = health - attack; 
	}
	public void printArt(){
		if(name.equals("Gandolf")){
		System.out.println("[ - _ -] this is scuffed gandolf");
		}
		else{
			System.out.println("0-0 this is paladin");
		}
	}
}
class Wizard {
	Random rand = new Random();
	String name; 
	int health; 
	int attack = rand.nextInt(15)+1; 
	public Wizard(){
		name = "Gimli";
		setHealth(health);
		attack(); 
	}
	public Wizard(String a){
		name = a; 
		setHealth(health);
		attack(); 
	}
	public void setHealth(int a){
		a = rand.nextInt(15)+1; 
		health = a; 
	}
	public int getHealth(){
		return health; 
	}
	public String getName(){
		return name; 
	}
	public void attack(){
		attack = rand.nextInt(attack)+1; 
		health = health - attack; 
	}
	public void printArt(){
		if(name.equals("Gimli")){
		System.out.println("0 - 0 /| this is even more scuffed gimli");
		}
	}
}


class starter {
	public static void main(String args[]) {
		Warrior warrior = new Warrior("Paladin");
		Wizard wizard = new Wizard();
		warrior.printArt(); 
		wizard.printArt();  
		
		

		
	}
}
