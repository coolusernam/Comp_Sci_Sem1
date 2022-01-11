import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter a name:");
	String name = sc.nextLine();
	System.out.println("How many times will you like this name to be repeated?");
	int time = sc.nextInt(); 
	
	
	int start = 1;  
	while(true)
	{
		System.out.println(name);
		if(start == time)
		{
			break;
		}
		start=start+1;
	}


		
	}
}
