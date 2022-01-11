import java.util.Scanner;
import java.util.Random;



class starter{
	
	public static void main(String args[]) {
	Random rand = new Random(); 
	String[] array = new String[40];
	array[0] = "   _________________________";
	array[1] = "  //                      \\";
	array[2] = " //                        \\";
	array[3] = "//        (  0   0  )       \\";
	array[4] = "\\       -     v    -       //";
	array[5] = " \\      \\          //    //";
	array[6] = "  \\______________________//";
	
	int counter = 0; 
	while(counter < 7){
		System.out.println(array[counter]);
		counter++; 
	}
	
	
	}
}
