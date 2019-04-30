package day34_Method06;

public class MethodOverLoading {

	public static void main(String[] args) {
		
	add(3,6);
	add(3.0,4);
	add("1","2");
	
	}
	
	public static void add (int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public static void add (double num1, double num2) {
		System.out.println(num1+num2);
	}
	
	public static void add (String str1, String str2) {
		System.out.println(str1+str2);
	}
}
