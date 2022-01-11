import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random(); 
		
		int size = rand.nextInt(149) + 50; 
		
		int[] array = new int[size]; 
		
	
		System.out.println("There are " + size+ " elements." );
		int count = 0; 
		
		int counting = count - 1; 
		int average = 0; 
		
		int min = 100; 
		int max = 0; 
		int total = 0;
		while(count< array.length){
			int x = rand.nextInt(100) + 1;
			array[count] = x;
			total = x + total;
			average = total / array.length; 
				if(array[count] < min) {
					min = array[count];
				}
				if(array[count] > max) {
				max = array[count];
			}
			count = count + 1; 
			counting = counting + 1; //counting does not serve any purpose 
		}
		
		System.out.println("This is your minimum: " + min);
		System.out.println("This is your maximum: "+ max); 
		System.out.println("Your average is " + average);
		
		
	
	}
}
