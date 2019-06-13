package day54_inheritanceReview;

public class Parent {
	
	static int num1; // class variable
	int num2; // instance variable
	
	
	static { // belongs to the class, executes as soon as class loaded
		System.out.println("Static block");
	}
	
	{ // belongs the object, executes each time object is created
		System.out.println("Init block");
	}
	
	Parent(){ // constructor
		System.out.println("Constructor");
	}
	
	public void method1() {  // instance method
		
	}
	
	public static void method2() {  // static method
		
	}
	private void methodB() {
		//private is not inheritable, cannot be visible outside
		
		
	}
/** NOT INHERITABLE:
 * CONSTRUCTOR
 * FEATURES ARE NOT VISIBLE:
 * 					PRIVATE
 * 					DEFAULT (when sub class & super class are not in same package
 * 	ABSTRACT METHOD(IF SUBCLASS IS NOT ABSTRACT)		**/
}

 class Child extends Parent{
	public static void main(String[] args) {
	
		System.out.println();
		
//			System.out.println( num1 );
//			System.out.println(	new InheritanceReview().num2 );
//			System.out.println( new parent().num2 ); 
//				method2();
			new Child();
			
			
		}
		public void methodA() {
			num2=300; 
		}
		
		
	
}

