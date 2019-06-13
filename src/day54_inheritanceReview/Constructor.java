package day54_inheritanceReview;

//1st class
class example1{
	
	example1(){
		System.out.println("No args Constructor");
	}
	example1(int num){
		System.out.println("Constructor 1");
	}
	 
	example1(double a){
		this(300); // 
	}
	
	example1(float a){
		
		//this('y');  
	}
	
	example1(char a){
		this(20f);
	}
}
//2nd class
class example2{
	
private example2() {
	
}	
	
	
	
	
	
}
public class Constructor {
	
	/* 
	 * Constructor: special method. belongs to the object.
			 
				 1. Every class MUST have constructor. 
				 		(if there isn't any, compiler will give no-arg constructor by default)
				 
				 2. Constructor method cannot have return-type or specifiers
				 			return-types: primitives, wrapper class, objects,...
				 			specifiers: final, static, abstract
				 			
				 3. Constructor' name MUST be same with the ClassName
				 
				 4. constructor' execution depends on the creation of the object
				 
				 5. constructor can only be called in other constructor. 
				 				( methods or blocks cannot call constructor)
				 
				 6. constructor cannot be called by constructor-name, MUST be called with this or super keyword
				 				this(): calls the class' constructor
				 				super(): calls the super class' constructor
				 				
				 7. constructor cannot call or contain itself
				 
				 8. A constructor cannot call more than one constructor
				 
				 9. constructor' body constructor call needs to be at first step
				 
				 10. class' object MUST be created with existing and visible constructor(s)
				 
				 11. super class' no-arg constructor is called in sub class' constructorS by default
				 
				 12. super class' constructor ( if there isn't deafult constructor) MUST be called in sub class
				  		(if there is more than one constructor in super class, only one of them needs to be calld)
				  

	 * */

	public static void main(String[] args) {
		new example1();
		// new example2();  doesnt work cuz const is not visible! rule#10
		
		
	}
}
