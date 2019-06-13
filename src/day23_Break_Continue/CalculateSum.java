package day23_break_Continue;
import java.util. *;
public class CalculateSum {

	public static void main(String[] args) {
		
Scanner input = new Scanner (System.in);


//calculate sum of 6 numbers
// if num is less or equals to 0 ignore 


int num = 0; 
int sum = 0;



for (int i =0; i<6; i++) {
	System.out.println("Enter a number:");

	num = input.nextInt();
	
	if(num<=0) {
		continue;
	}
	sum+=num;  // adds 6 numbers to each other
	
}
System.out.println(sum);

	}

}
