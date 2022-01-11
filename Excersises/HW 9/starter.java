import java.util.Scanner;
import java.util.Random;



class starter {
	public static void main(String args[]) {
	Random rand = new Random();
	
	int[] array = new int[20];
	int[] array2 = new int[20];
	
	int counter = 0; 
	int counter2 = 19; 
	System.out.println("These are the 20 numbers");
	while(counter < array.length){
	  int num = rand.nextInt(50) + 1; 
	  array[counter] = num; 
	  array2[counter2] = array[counter];
	  System.out.print(array[counter] + " ");
	  counter = counter + 1; 
	  counter2 = counter2 -1; 
	}
	int counter3 = 0; 
	System.out.println(" ");
  System.out.println("These are those numbers backwards");
  while(counter3 < array2.length){
    System.out.print(array2[counter3] + " ");
    counter3 = counter3 + 1; 
  }
  
	
	}
}
