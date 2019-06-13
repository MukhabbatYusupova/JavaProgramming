package day17_whileLoop;
import java.util.*;
public class Numbers_While {

	public static void main(String[] args) {
 Scanner keyboard = new Scanner (System.in);
 
 int number = keyboard.nextInt();
 int count = 0;
 
// while (count <= number) {
//	 System.out.print(count + ", ");
//	 count++;   // it prints all numbers till the input number u put.
// }

 // to print every other number
 
 while (count <= number) {
	 System.out.println(count + "-");
	 count +=2;   // print every 5th number 0,5,10,15,==> count +=5
 }
 
 
 
 

	}

}
