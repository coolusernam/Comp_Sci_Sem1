import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Dwarf {
	Random rand = new Random(); 
	String name; 
	int age; 
	public Dwarf(){
		name = "";
		age = 0; 
	}
	public void setName(String a[]){
		name = a[rand.nextInt(7)];
	}
	public String getName(){
		return name; 
	}
	public void setAge(int b){
		age = b; 
	}
	public int getAge(){
		return age; 
	}
}
class starter {
	public static void main(String args[]) {
		Random rand = new Random(); 
		Dwarf[] x = new Dwarf[100];
		String array[] = {"Grumpy", "Dopey", "Doc", "Happy", "Bashful", "Sneezy", "Sleepy"};
		int c = 0; 
		while(c < x.length){
			int age = rand.nextInt(100)+1; 
			x[c] = new Dwarf(); 
			x[c].setName(array);
			x[c].setAge(age);
			c++; 
		}
		c = 0; 
		int i = 1; 
		while(c < x.length){
			System.out.println("Dwarf " + i + ": " + x[c].getName() + " is " + x[c].getAge() + " years old!");
			c++;
			i++; 
		}


		
	}
}
