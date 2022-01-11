import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Wizard[] joe = new Wizard[100]; 
		Warrior[] bob = new Warrior[100]; 
		int c = 0; 
		while(c < 100){
			joe[c] = new Wizard("Gimli"); 
			bob[c] = new Warrior("Gandolf"); 
			c++;
		}
		c = 0; 
		while((joe[99].isDead() != true) || (bob[99].isDead() != true) ) {
			while(joe[c].isDead() == false || bob[c].isDead() == false && c <= 99){
				joe[c].attack(bob[c]);
				joe[c].isDead();
				if(joe[99].isDead() == true){
					break; 
				}
				else if(joe[c].isDead() == true && c < 100){
					c++; 
				}
				bob[c].attack(joe[c]);
				bob[c].isDead();
				if(bob[99].isDead() == true){
					break; 
				}
				else if(bob[c].isDead() == true && c< 100){
					c++;
				}
				}
			}
			int left = 100 - c; 
			if(joe[99].isDead() != true){
				System.out.println("The wizards won with " + left + " left in their army.");
			}
			else{
				System.out.println("The warriors won with " + left + " left in their army.");
			}
		
	}
}
