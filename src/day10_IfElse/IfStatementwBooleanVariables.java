package day10_ifElse;

public class IfStatementwBooleanVariables {

	public static void main(String[] args) {
		
		boolean isBreaktime = true;
		
		if(isBreaktime == true) {
			System.out.println("Let's take 15 minutes break!");
		} else {
			System.out.println("Not break time yet");
		}
		
		// second version
		
		if(isBreaktime) {                                // even tho we dont put == java already understands from variable above that it is true
			System.out.println("Break till 8:35PM");
		} else {
			System.out.println("Not break time yet");
		}

	boolean classTime = true;
	if (classTime) {
		System.out.println("Come back on time");
		System.out.println("Stop talking");
		System.out.println("Code Java");
	} else {
		System.out.println("Take a walk and have some water");
			}
	
	boolean qualified = false; // send a msg if condition is not qualified
	if (qualified == false) {           // we need to check if qualified variable contains false 
		System.out.println("Your application was not approved, thank you"); // condition is true
	}
	
	
	}
	

}
