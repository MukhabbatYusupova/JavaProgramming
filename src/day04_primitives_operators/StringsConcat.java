package day04_primitives_operators;

public class StringsConcat {
	public static void main(String[] args) { 
		String firstName = "Muhabbat";
				System.out.println("My name is " + firstName);
				
		String city = "Tashkent";
				System.out.println("I was born in " + city);
				
		String job = "SDET";
		String company = "\"Apple\"";
		String company2 = "\"Google\"";
				System.out.println("I will work as " + job + " in " + company + " or " + company2);
				
		int zipcode = 22180;
				System.out.println("I live in " + zipcode + " zipcode");
				
		int num1 = 10;
		int num2 = 20;
				System.out.println(num1 + ""+ num2); //use "" if u don wanna get number 30, but 10 and 20
				
		
		
	}

}
