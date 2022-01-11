import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in); 
	System.out.println("Enter a sentence.");
	String x = sc.nextLine();
	
	int counter = 0; 
	int c = 0; 
	int counting = 0;
	String i = "";
	String y = "";
	while(x.indexOf(" ") != -1){
		i = x.substring(c,x.indexOf(" "));
		y = " " + i + y; 
		x = x.substring(x.indexOf(" ")+1,x.length()); // i
		c = 0;
		counter = counter + 1; 
	}
	System.out.println(y);
	
	
	
	
	
	}
}
