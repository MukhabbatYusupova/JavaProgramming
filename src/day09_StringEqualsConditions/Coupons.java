package day09_StringEqualsConditions;
import java.util.*;
public class Coupons {
	public static void main(String[]args) {
int numberOfCoupons, numberOfGumballs, numberOfCandies;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter number of coupons:");
    numberOfCoupons = scan.nextInt();
    numberOfCandies = numberOfCoupons / 10;
    numberOfCoupons = numberOfCoupons % 10;
    numberOfGumballs = numberOfCoupons / 3;
   // numberOfCoupons = numberOfCoupons % numberOfGumballs;
   
    System.out.println("Number of Candies: "+ numberOfCandies);
    System.out.println("Number of Gumballs:" + numberOfGumballs);

}
}