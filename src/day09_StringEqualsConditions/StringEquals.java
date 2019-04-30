package day09_StringEqualsConditions;

public class StringEquals {
	
	public static void main(String[]args) {
		
		String str1 = "java"; // not advised
		String str2 = "java";
		System.out.println(str1 == str2);
		System.out.println(str1 == "java");
		System.out.println(str1 == "Java");
		
		//equals method PREFERRRED WAY
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals("java"));
		System.out.println(str2.equals("Java"));
		
		
		//String month = "March";
		
		String month = new String("March");
		String month2 = new String("March");
		
		System.out.println(month == month2); // false == doesnt work  use    .equals();
		
		
		System.out.println(month.equals(month2));
		System.out.println(month.contentEquals("March"));
		
		
		
	}
}
