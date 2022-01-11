import pkg.*;
import java.util.Scanner;
import java.util.Random;

public class Hangman{
	private String guesssingWord;
	private int numTries; 
	
	public Hangman(){
		generateWord(); 
		tries = 5; 
	}
	public Hangman(int x){
		generateWord(); 
		tries = x; 
	}
	public int guessCheck(String x, int y){
		if(guessingWord.indexOf(x) == false){
			return -1; 
		}
		return guessingWord.indexOf(x);
	}
	public boolean checkWin(boolean[]){
		
	}
}
class starter {
	public static void main(String args[]) {
		// Your code goes below here
	
		
	}
}
