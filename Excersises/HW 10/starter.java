import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void getNum(int[] array){
	Random rand = new Random();
	System.out.println("--------------------------------------------");
	System.out.println("These are the 20 numbers");
	array = new int[20];
	int target = rand.nextInt(10)+ 1; 
	String dup_loc = ""; // duplicate index 
	String i = ""; // what duplicate index gets equal at end(stores value)
	int counter = 0; 
	int num_dup = 0; // number of duplicates
	int two_in_row = 0; // number that was two in a row
	
	while(counter < 20){
  	int num = rand.nextInt(10)+ 1; 
  	array[counter] = num;
  	if(array[counter] == target){
  		dup_loc = i + "|" +  counter + "|"; 
  		i = dup_loc; 
  		num_dup++; 
  	}
  
  	System.out.print(array[counter] + " ");
  	counter++; 
	}
	System.out.println("");
	System.out.println("--------------------------------------------");
	System.out.println("The random number to look for is " + target);
	System.out.println("Duplicate found at index " + dup_loc);
	System.out.println("Total number of duplicates for " + target + " is " + num_dup);
	System.out.println("--------------------------------------------");
	System.out.println("Looking for two in a row:");
	counter = 0; 
	int counter2 = 0 ;
	while(counter < 20){
		if((counter > 0)&& (array[counter] == array[counter-1])){
			two_in_row = array[counter];
			counter2 = counter -1; 
			System.out.println("Two in a row found at indexes " + counter2 + " and " + counter + ". The number is " + two_in_row);
		}
		counter++; 
	}
	return;
	}
	
	public static void printAll(){ // literal useless method, just felt like making this idk
		int[] array = new int[20];
		getNum(array);
	
	}
	
	public static void main(String args[]) {
	Random rand = new Random();
	
	
	printAll(); 
	
	}
}
