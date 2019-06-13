package day36_wrapperClasses_Arraylist01;

public class wrapperClasMethods {

	public static void main(String[] args) {
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE/2);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		// Convert String into Primitive
		int count = Integer.parseInt("1234");
		System.out.println("count: "+count);
		
		int count2 = Integer.valueOf("12345");
		System.out.println(count2-count);
		
		System.out.println(Character.isAlphabetic('a')); //true
		System.out.println(Character.isAlphabetic('@'));// false
		
		System.out.println(Character.isLetter('c'));
		
		System.out.println(Character.isDigit('5'));
		System.out.println(Character.isDigit('p'));
		String str = "java101";
		System.out.println(Character.isAlphabetic(str.charAt(0)));
		
		String word = "ab123cdfer1";
		for (int i = 0; i<word.length(); i++) {
			if (Character.isDigit(word.charAt(i))) {
				System.out.print(word.charAt(i));
			}
		}
		
		
	}

}
