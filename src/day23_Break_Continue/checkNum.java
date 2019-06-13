package day23_break_Continue;

public class checkNum {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;         // it stops the iteration when it comes to 5 print 1-4, if u dont use break it printd out till 10!!!
			}
			System.out.println("Number " + i);
		}

		System.out.println();
		// instead of break if u put continue it prints out till 100
		
		
		for (int i = 1; i <= 10; i++) {
			if (i == 15) {
				continue;
			}
		System.out.println(i);
		}
		System.out.println();
		// printing only even numbers
		for (int i = 1; i <= 10; i++) {
			if (i %2 >0) {
				continue;
			} 
			System.out.println(i + " is even number");
			}
	}

}
 