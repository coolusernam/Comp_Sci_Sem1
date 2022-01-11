import java.util.Scanner;
import java.util.Random;


class Dog {
	Random rand = new Random(); 
  String name; 
  int age; 
  String breed; 

  public Dog(){ 
    name = "Clifford";
    age = 3; 
    breed = "big red dog";
  }
  public Dog(String a){ 
    String x = a;
    name = x; 
    age = 1;    
    breed = "dog dog"; 
  }
  public Dog(String a, String b){
    String x = a; 
    String y = b; 
    name = x; 
    breed = y; 
    age = 1; 
  }
  public Dog(String a, int b){
    String x = a;
    int y = b; 
    x = name; 
    y = age; 
    breed = "dog dog"; 
  }
public void setName(String a) {
  String x = a; 
  name = x; 
  return; 
}
public void setAge(int a) {
  int x = a; 
  x = age; 
  return; 
}
public void setBreed(String a) {
  String x = a; 
  breed = x; 
  return; 
}
public String getName() {
  return name; 
}
public int getAge() {
  return age; 
}
public String getBreed() {
  return breed; 
}
public boolean isSleeping(){
  int sleep = rand.nextInt(2)+ 1;
  if(sleep == 2){
    System.out.println(name + " is sleeping.");
    return true; 
  }
  else if(sleep == 1){
    bark();
    System.out.println(name + " is not sleeping.");
    //return false; 
  }
 
 return false;  
}
public void bark(){
  System.out.println(name + " barks!");
  //System.out.println(name + " is not sleeping.");
  return; 
}
}
class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
  System.out.println("Please name your first dog.");
  String name1 = sc.nextLine(); 
  System.out.println("What is the age of your dog?");
  int age1 = sc.nextInt(); 
  Dog dog1 = new Dog(name1, age1);
  
  System.out.println("Ok, now time to create your second dog! What will you like to name your dog?");
  sc.nextLine(); 
  String name2 = sc.nextLine(); 
  System.out.println("what will your dog's breed be?");
  String breed2 = sc.nextLine(); 
  Dog dog2 = new Dog(name2, breed2); 
  
  System.out.println("Lets check if " + name1 + " is sleeping!");
  dog1.setName(name1); 
  dog1.getName(); 
  dog1.setAge(age1);  
  dog1.getAge(); 
  dog1.isSleeping(); 

  System.out.println("Lets check if " + name2 + " is sleeping!");
  
  dog2.setName(name2); 
  dog2.getName(); 
  dog2.setBreed(breed2); 
  dog2.getBreed(); 
  dog2.isSleeping(); 
  
   if((dog2.isSleeping() == true) && (dog1.isSleeping() == false )){
     dog2.bark(); 
   }
   
   if((dog2.isSleeping() == false) && (dog1.isSleeping() == false)){
     dog2.bark(); 
   }
   
  
	
	}
}
