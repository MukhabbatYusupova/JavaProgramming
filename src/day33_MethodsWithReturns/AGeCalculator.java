package day33_MethodsWithReturns;

public class AGeCalculator {
	
	public static void main (String []args) {
		
		int myAge = calculateAge(1983);
		
		System.out.println("you are "+ myAge + " years old");
		
		//if (int num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) {
		//	System.out.println(""* short");
		}
	
public static int calculateAge(int year) {
	int currentYear = 2019;
	int age = currentYear - year;
	
	if (age <0|| age>100) {
		return 0;
	}
	else if (age<=14) {
		System.out.println("child");
		}
	else if (age<=25) {
		System.out.println("youngster");
	}
	else if (age <=64) {
		System.out.println("adult");
	}
	else if (age > 65) {
		System.out.println("Senior");
	}

	return age;
}
	
	
	
}
