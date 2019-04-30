package day23_Break_Continue;

public class break_continue {

	public static void main(String[] args) {

// print numbers from 1 to 20, and skip numbers that are the range from 5 to 10

		for (int i = 1; i <= 20; i++) {
			if (i >= 5 && i <= 10) {
				continue;
			}
			System.out.println(i);
		}

	}

}
