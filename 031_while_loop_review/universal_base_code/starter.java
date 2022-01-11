import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random(); 
		//int[] number = new int[100];
		
		int counter = 1; 
		while(counter < 100) {
			int number = rand.nextInt(100) +1; 
			
			System.out.println(number); 
			
			counter = counter + 1; 
		}
		


		
	}
}
