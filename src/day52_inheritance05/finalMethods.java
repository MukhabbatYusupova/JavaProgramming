package day52_inheritance05;

public class finalMethods {

	
	public final void method1() {
		System.out.println("Final method 1");
	}
	
	final public static void staticMethod(String str) {
		System.out.println("Static method "+ str);
	}
	
	class Sub extends finalMethods{
//		public final void method1() {
//			System.out.println("Override is IMPOSSIBLE final method!!!");
//		}
		
		// OVERLOADING is Possible!!!
		
		public final void method1(String str) {
			System.out.println("Final method 1 " + str);
		}
			
		
		
		
	}
}
