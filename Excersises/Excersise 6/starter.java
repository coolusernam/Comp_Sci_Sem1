import java.util.Scanner;
import java.util.Random;

class Cat {
	
	String name; 
	
	public Cat() {
		name = "Garfield";
	}
	public Cat(String a) {
		name = a; 

	}
	
	public void Meow() {
		System.out.println(name  +  " meows");
		return; 
	}

	}


class starter{
	
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
	//Scanner sc = new Scanner(System.in);
	Cat test = new Cat();
	Cat x = new Cat("joe");
	test.Meow(); 
	x.Meow(); 
	
	
	}
}
