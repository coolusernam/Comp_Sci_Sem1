import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void toStringArray(int [] x){
		Random rand = new Random();
		//int[] y = new int[x]; 
		int size = rand.nextInt(149) + 50; 
		
		int[] array = new int[size]; 
		
		
		array = x; 
		int counter = 0; 
		while(size >= counter){
			int y = rand.nextInt(100)+ 1;
			System.out.println(y);
			counter = counter + 1; 
		}
		
		//System.out.println("There are " + size+ " elements." );
		//System.out.println(x.length);
		//System.out.println(y.length);
		return; 
	}
	
	public static int[] getArrayAverage(int [] x){
		Random rand = new Random(); 
		//int size = rand.nextInt(149) + 50; 
		int total = 0;
		int average = 0; 
		int count = 0; 
		while(count < x.length){
		int size = rand.nextInt(149) + 50;
		total = size + total;
		average = total / x.length; 
		count = count +1; 
		}
		System.out.println("The average of 1000 numbers:" + average); 
		return x; 
	}
	public static int getArrayMax(int [] x){
		Random rand = new Random();
		int count = 0; 
		int max = 0; 
		while(count< x.length){
			int y = rand.nextInt(100) + 1; 
			x[count] = y; 
			if(x[count]> max){
				max = x[count];
			}
			count = count + 1; 
		}
		
		System.out.println("This is the maximum of 1000 numbers:" + max);
		return max; 
	}
	public static int[] getArrayMin(int [] x){
		Random rand = new Random(); 
		int count = 0; 
		int min = 100; 
		while(count < x.length){
			int y = rand.nextInt(100) + 1; 
			x[count] = y; 
			if(x[count] < min){
				min = x[count];
			}
			count = count + 1; 
		}
		System.out.println("This is the minimum of 1000 numbers:" + min);
		return x; 
	}
	
	public static void main(String args[]) {
	Random rand = new Random(); 
		
		int size = rand.nextInt(149) + 50; 
		
		int[] array = new int[size]; 
		
	
		/*int count = 0; 
		
		int counting = count - 1; 
		int average = 0; 
		
		int min = 100; 
		int max = 0; 
		int total = 0;
		*/
		toStringArray(array);
		getArrayAverage(array); 
		getArrayMax(array);
		getArrayMin(array);
		
		


		
	}
}
