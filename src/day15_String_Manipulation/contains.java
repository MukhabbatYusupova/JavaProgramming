package day15_String_Manipulation;

public class contains {
public static void main(String []args) {
	
	String email = "test@gmail.com";
	email.contains("@");
	System.out.println(email.contains("@"));
	
	
	
	String list = "potatoes, apples, tomatoes, eggs, milk, butter, meat";
	if (list.contains("milk")) {
		System.out.println("milk is there!");
	} else {
		System.out.println("lets add!");
	}
	
	boolean hasEggs = list.contains("eggs");
	System.out.println("contains eggs: " + hasEggs);
	
	boolean hasCucumbers = list.contains("cucumbers");// we can use list.toLowerCase().contains("cucumbers")
	System.out.println("contains cucumbers: "+ hasCucumbers);
	
	email = "name@yahoo.com";
	if (email.contains("yahoo")) {
		System.out.println("yahoo account");
	} else if (email.contains("gmail")) {
		System.out.println("Gmail account");
	}
	
	String name = "Muhabbat";
	if (name.contains("a") || name.contains("e")) {
		System.out.println("it has 'a' or 'e'");
	} else {
		System.out.println("change your name :)");
	}
	
	// we can use variables to inside () after .contains()
	
	String str = "bb";
	if (name.contains(str)) {
		System.out.println(name);
	} else {
		System.out.println("Not included");
	}
	
	
}
}
