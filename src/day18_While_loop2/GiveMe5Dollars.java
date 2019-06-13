package day18_while_loop2;
import java.util.*;
public class GiveMe5Dollars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		int dollars = 0;
		
		while (dollars != 5) {
			System.out.println("Give me 5 Dollars!");
			dollars = scan.nextInt();
		}
		
		System.out.println("thank you!");
	}

}
