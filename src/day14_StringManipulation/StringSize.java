package day14_StringManipulation;

public class StringSize {

	public static void main(String[] args) {
		String str1 = "Good Morning";

		if (str1.contentEquals("Good Morning")) {
			System.out.println("match");
		} else {
			System.out.println("not match");
		}
		if (str1.equalsIgnoreCase("good morning")) {
			System.out.println("match - ignore case");
		} else {
			System.out.println("not match");
		}
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1); // it stays as old calue, not caplock
		
if (str1.toLowerCase().equals("good morning")) {  // converting first and matching 
	System.out.println("Chained method: match");
} else { System.out.println("Chained method: not match");
}

String myName = "Muhabbat Osman";
System.out.println(myName.length());

int length = myName.length();
System.out.println("My name's length: " + length);


String userName = "muhabbat";    // when we check index we start frm 0, but when we check the length it starts frm 1
if (userName.length() <= 8) {
	System.out.println("Good User Name");
} else { 
	System.out.println("Invalid");
}

String password = "WoodenSpoon";
if (password.length() >= 6) {
	System.out.println("Valid Password");
} else {
	System.out.println("Change Your Password");
}

	int passwordLength = password.length();
	 if (passwordLength <6) {
		 System.out.println("Invalid Password. too short");
	 } else {
		 System.out.println("Valid Password");
	 }
	
	
	}
}
