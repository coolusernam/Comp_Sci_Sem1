import java.util.Scanner; 




class starter {
	
	public static int aMethod(int a, int b)  {
	int x = a; 
	int y = b; 
	int mult = x * y; 
	int not = 0; 
	if(mult%3 ==0) {
		System.out.println("You number is divisable by 3.");
		return mult;
	} 
	else {
		System.out.println("Your numbers are not divisable by 3.");
	}
	
	return not; 
}
	
	
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please input a interger.");
	int v = sc.nextInt(); 
	
	System.out.println("Please input a interger.");
	int z = sc.nextInt(); 
	
	
	System.out.println(aMethod(v,z));


	
	
	}
}
