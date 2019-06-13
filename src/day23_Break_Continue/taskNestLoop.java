package day23_break_Continue;

public class taskNestLoop {

	public static void main(String[] args) {
		
		// print 5 lines of a to z and *** between the lines

		for (int i = 1; i <= 3; i++) {
			for (char letter = 'a'; letter <= 'z'; letter++) {
				System.out.print(letter + " ");

			}
			System.out.println();
			System.out.println("***************************************************");
		}

	int j;
		for ( j = 1; j<=5; j++);{
			if (j%2==0) {
				for (char letter = 'a'; letter <= 'z'; letter++) {
					System.out.print(letter + " ");
					System.out.println();
			}
		}else {
			for (char letter = 'z'; letter <= 'a'; letter--) {
				System.out.print(letter + " ");
			}
		}
		
	
	
	
		}
	
	
	}

}
