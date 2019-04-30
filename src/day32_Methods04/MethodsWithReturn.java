package day32_Methods04;

public class MethodsWithReturn {

	public static void main(String[] args) {

	System.out.println(giveMe10$());
	int i = giveMe10$();
	System.out.println(i);
	
	System.out.println();
	
	System.out.println(giveMeYourName());
	
	
	
	
	}		

	
	// this method returns int value
	public static int giveMe10$() {   // instead of void u need data type
	System.out.println("Returning 10 from method");
		return 10;


	}
	
	public static String giveMeYourName() {
		String name = "Mukhabbat";
		return name;
		
	}
	
	
	
	

}
