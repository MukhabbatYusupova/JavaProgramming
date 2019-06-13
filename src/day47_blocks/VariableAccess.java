package day47_blocks;

public class VariableAccess {
	//instnace var
	int myInstanceVar = 40;
	
	//static var
	static int myStaticVar = 55;
	
	public static void main(String[] args) {
		
		// System.out.println(myInstanceVar); <== NOT works 
		                                     // static mathod accepts ponly static var
		System.out.println(myStaticVar);
		
		//create object of VariableAccess and print myInstanceVar
		
		VariableAccess var1 = new VariableAccess();
		System.out.println(var1.myInstanceVar);
		
		System.out.println(var1.myStaticVar); // access static var using object
		System.out.println(VariableAccess.myStaticVar); // access stat var using class name
	}

}
