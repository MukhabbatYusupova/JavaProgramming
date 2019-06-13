package day19_doWhileloops;
import java.util.*;
public class GuessANumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int secretNumber =83;
		int guessNumber;
		Random random = new Random(); //is used to genrate a random numb
		
		do {
			System.out.println("Guess a Number!");
			guessNumber = scan.nextInt();
			
			if (guessNumber < secretNumber) {
				System.out.println("To Small!!!");
				
			} else if (guessNumber > secretNumber);{
			System.out.println("Too large!!!");
			}
		
			
		}while (guessNumber != secretNumber);
		
		System.out.println("Congrats!!! You won!!!");

	}

}
