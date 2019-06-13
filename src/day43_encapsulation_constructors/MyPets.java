package day43_encapsulation_constructors;

public class MyPets {

	public static void main(String[] args) {

		Pet pet1 = new Pet("Dog", "Poohchi");
		Pet pet2 = new Pet("Cat", "Mila");
		Pet pet3 = new Pet("Fish", "Purple");
		Pet pet4 = new Pet("Bird", "Chicka");

		System.out.println(pet1);
		String[][] arr = { { "A", "B", "C" }, { "D", "E" } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j].equals("B")) {
					break;
				}
				System.out.print(arr[i][j]);
			}
		}

		String[][] arr1 = { { "A", "B", "C" }, { "D", "E" } };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr1[i][j]);
				if (arr1[i][j].equals("B")) {
					break;
				}
			}
		}

		System.out.println();

		int x = 100;
		int a = x++;
		int b = ++x;
		int c = x++;

		int d = (a < b) ? (a < c) ? a : (b < c) ? b : c : x;
		System.out.println(d);
	}
}
