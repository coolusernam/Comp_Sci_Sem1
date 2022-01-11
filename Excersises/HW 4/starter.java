import java.util.Scanner;


class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
	Scanner sc = new Scanner(System.in);
	System.out.println("Please input a whole number.");
	int num1 = sc.nextInt(); // first number 
	System.out.println("Please input another whole number.");
	int num2 = sc.nextInt(); // second number 
	
	int x = 2;
	double y = 2.0;
	
	int three = 3;
	double t = 3.0;
	
	int four = 4;
	double f = 4.0;
	
	int five = 5;
	double fi = 5.0;
	
	
	if(num1/x == num1/y) // first number
	{
		System.out.println("Your first number is even!");
	
	}
	
	else // first number 
	{
		System.out.println("Your first number was odd!");
		
	}
	
	
	
	if(num2/x == num2/y) // second number
	{
		System.out.println("Your second number was even!");
		
	}
	
	else 
	{
		System.out.println("Your second number was odd!");
		
	}
	
	
	
	if((num1/three == num1/t) && (num1/four==num1/f) && (num1/five==num1/fi)) // number one
		{
		System.out.println("Your first number is divisable by three, four, and five.");
		}
	else if((num1/three == num1/t) && (num1/four==num1/f))
		{
			System.out.println("Your first number is divisable by three and four.");
		}
	else if((num1/three == num1/t) && (num1/five==num1/fi))
		{
			System.out.println("Your first number is divisable by three and five.");
		}
	else if((num1/four== num1/f) && (num1/five == num1/fi))
		{
			System.out.println("Your first number is divisable by four and five.");
		}
	else if(num1/three == num1/t)
		{
			System.out.println("Your first number is divisable by three.");
		}
	else if(num1/four == num1/f)
		{
			System.out.println("Your first number is divisable by four.");
		}
	else if(num1/five == num1/fi)
		{
			System.out.println("Your first numebr is divisable by five");
		}
	else  {
			System.out.println("Your first number is not divisable by three, four, or five.");
		}
		
		
		
	if((num2/three == num2/t) && (num2/four == num2/f) && (num2/five == num2/fi)) // number two
		{
			System.out.println("Your second number is divisable by three, four, and five.");
		}
	else if((num2/three== num2/t) && (num2/four == num2/f))
		{
			System.out.println("Your second number is divisable by three and four.");
		}
	else if((num2/three == num2/t) && (num2/five == num2/fi))
		{
			System.out.println("Your second number is divisable by three and five.");
		}
	else if((num2/four == num2/f) && (num2/five == num2/fi))
		{
			System.out.println("Your second number is divisable by four and five.");
		}
	else if(num2/three == num2/t)
		{
			System.out.println("Your second number is divisable by three.");
		}
	else if(num2/four== num2/f)
		{
			System.out.println("Your second number is divisable by four.");
		}
	else if(num2/five == num2/fi)
		{
			System.out.println("Your third number is divisable by five.");
		}
	else 
		{
			System.out.println("Your second number is not divisable by three, four, or five.");
		}
	
	
	
	
	
	
	
	
	
	}
}
