import pkg.*;
import java.util.Scanner;
import java.util.Random;



class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		
		int[] number = new int[1000];
		int count = 0; 
		while(count < 1000) {
			number[count] = rand.nextInt(99) + 1; 
			System.out.println(number[count]);
		
			count = count + 1; 
		}


		
	}
}
