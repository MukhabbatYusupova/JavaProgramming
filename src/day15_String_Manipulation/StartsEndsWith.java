package day15_String_Manipulation;

public class StartsEndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String word1 = "eclipse";
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("eclipse"));
		
		
		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("se"));
		System.out.println(word1.endsWith("eclipse"));
		
		String name = "Mrs. Osman";
		
		if (name.startsWith("Mr.")) {
			System.out.println("man");
			} else if (name.startsWith("Mrs.")) {
				System.out.println("married woman");
					} else if (name.startsWith("Ms.")) {
						System.out.println("single women");
					}else { System.out.println("No more");}
		
	}

}
