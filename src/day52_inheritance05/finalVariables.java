package day52_inheritance05;

public class finalVariables {
	public final int ROADSTER_MAX_RANGE= 610; //<== initilizing right away
	public final int MODEL_3_MAX_SPEED;
	public final int MODEL_X_PASSANGER;

	
	public finalVariables() { // <== in the CONSTRUCTOR initilizing
		MODEL_3_MAX_SPEED=180;

	}
	/**public finalVariables(int max) { // <== in the CONSTRUCTOR passing value
		MODEL_3_MAX_SPEED=max;

	}**/
	{
		MODEL_X_PASSANGER = 7; // <== in the INIT Block initilizing
	}
	
	public static final String COMPANY_NAME = "Cybertek";
	public static final String ADMIN_USERNAME;
	
	static {
		ADMIN_USERNAME= "admin@gmail.com";	
	}
	
	
	public static void main(String[] args) {
		
		
		
	final int MAX_PASSENGERS_COUNT = 5;	
	// u can not change ==> MAX_PASSENGERS_COUNT=10; <== Wrong
	
	final double PI = 3.14;
	
	System.out.println(MAX_PASSENGERS_COUNT);
	System.out.println(PI);
	
	final int SSN;
	SSN =32145698;
	//SSN ++; <== Wrong	
	
	
	finalVariables finalVars = new finalVariables();
		System.out.println(finalVars.ROADSTER_MAX_RANGE);
		System.out.println(finalVars.MODEL_3_MAX_SPEED);
		System.out.println(finalVars.MODEL_X_PASSANGER);
	
	
		System.out.println(Integer.MAX_VALUE); // static, no need to create an object
		
		System.out.println("Company name: "+ COMPANY_NAME); // main method same class no need classname
		System.out.println("Company name: "+ finalVariables.COMPANY_NAME);
		
		
		
		
	}

}
