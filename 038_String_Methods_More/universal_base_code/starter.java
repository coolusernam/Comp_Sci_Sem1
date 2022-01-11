import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first name with and last name with a space in the middle.");
		String name = sc.nextLine();
		name.length();
		name.indexOf(" ");
		System.out.print("The last name is:");
		System.out.println(name.substring(name.indexOf(" ") + 1,name.length()));
		


		
	}
}
