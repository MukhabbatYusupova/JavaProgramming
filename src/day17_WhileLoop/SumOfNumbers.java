package day17_whileLoop;
import java.util. *;
public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int total = 0;
		System.out.println("Enter an integer: ");
		int nextNum = sc.nextInt();
		
		while (nextNum > 0) {               // add the numbers till i enter the negative number which is below than 0
			total = total + nextNum;
			nextNum = sc.nextInt();        // keep entering numbers till u enter -number it receives input from u and when u enter - number it calculates all positives
	}	
	System.out.println("The total sum of the numbers: " + total);
		
		

	}

}
