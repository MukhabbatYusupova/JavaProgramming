package day19_DoWhileloops;
import java.util.*;
public class Transaction {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("What is your balance?");
		double balance = scan.nextDouble();
		int count = 0;
		
	while (balance > 0) {
		count ++; // increase transaction by1
		System.out.println("Enter the transaction #"+count+" amount:");
		double transaction = scan.nextDouble();
		balance -= transaction; //balance = balance - transaction; 
		System.out.println("Current balance "+ balance);
		
				if (transaction > balance) {
				System.out.println("Warning: your transaction is bigger than your balance!");	
				continue; // go on top of loop right away
				}
	}
	
		System.out.println("You have insufficient funds for any more transactions, your balance is " + balance);
		System.out.println("Transactions total count:" + count);
	}

}
