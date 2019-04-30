package day24_Array;

public class forEachLoop {

	public static void main(String[] args) {
		
		String[] cities = { "Washington D.C.", "Kiev", "Tashkent", "Istanbul", "Baku", "Vienna", "Tokio" };
		
		for (String city: cities) {
			System.out.println(city);
			
			// instead of declaring and initializing a loop counter variable(i), we declare a variable
			// that is the same type as the base type of the array
			//in the value u can use the loop variable u created rather than using the index of element in the array
		}
		
		
		char[]values = {'a', 'b', 'c'};
		for (char value: values) {
			System.out.println(value);
		}
		
		
		String str = "Wooden spoon";
		// this method to CharArray() converts string into array of characters
		
		char[]chars = str.toCharArray();
		for (char c:chars) {
			System.out.print(c+"_");
		}
		
		System.out.println();
		

		for (int i = chars.length-1; i>=0; i-- ) {
			System.out.print(chars[i]);
		}
		
		
		System.out.println();

		for (char c: chars) {
			if (c=='o') {
				System.out.print('*');
			} else {
				System.out.print(c);
			}
		}
				
				
		
		
	}

}
