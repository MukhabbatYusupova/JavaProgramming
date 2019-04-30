package day23_Break_Continue;
import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		
Scanner scan = new Scanner (System.in);

System.out.println("Enter a number:");
int num = scan.nextInt();
String result = "";

for (int i = 2; i < num; i ++) {

	if (num % i == 0) {
	result = "not prime";
		
	}
	
	

}
if(result.equals("not prime")) {
System.out.println(num + "is not a prime number");
}else {
System.out.println(num + " is a prime number");
}

		
	}
}

