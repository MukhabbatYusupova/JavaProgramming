package day52_inheritance05;

public class EqualsMethodDemo {
	
	public static void main(String[] args) {
		
		EqualsMethod computer1 = new EqualsMethod("iMac", "silver");
		EqualsMethod computer2 = new EqualsMethod("iMac", "silver");
		EqualsMethod computer3 = computer2; // pointing to the same object
		
		System.out.println(computer1 == computer2); // false cuz fifferent location in the memory
		System.out.println(computer1.equals(computer2));
		
		System.out.println(computer3 == computer2);
		System.out.println(computer3.equals(computer2));
		
		
		
	}

}
