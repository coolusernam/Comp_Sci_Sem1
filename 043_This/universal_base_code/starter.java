import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Dwarf{
	String name; 
	int age; 
	public Dwarf(String name, int age){
		this.name = name;
		this.age = age; 
	}
	public boolean isSameName(String name){
		return false; 
	}
}
class starter {
	public static void main(String args[]) {
		Random rand = new Random(); 
		Dwarf[] x = new Dwarf[100];
		String array[] = {"Grumpy", "Dopey", "Doc", "Happy", "Bashful", "Sneezy", "Sleepy"};
		int i = 0; 
		while(i < x.length){
			x[i] = new Dwarf(array[rand.nextInt(7)], rand.nextInt(100)+1);
			i++; 
		}
		i = 0; 
		int duplicate = 0; 
		while(i < x.length-1){
			if(x[i].name == x[i+1].name){
				duplicate++; 
			}
			i++;
		}
		System.out.println(x[0].name + " was the name with " + duplicate + " matches");
		
	}
}
