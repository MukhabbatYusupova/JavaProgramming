package day33_MethodsWithReturns;

public class addNums {

	public static void main(String[] args) {
	addVoid(10,20);	 
	// in void method we can not assign it or print it, 
	//cuz it is void type it doesnt have return value Sysout(addVoid(3,4)) not right
	System.out.println(add(11,12));
	int result = add(11,22);
	System.out.println("Result: "+result);
	
	
	System.out.println(minus(10, 4));
	System.out.println(multiply(3, 11));
	System.out.println(divide (24, 2));
	
	
	
	}

public static void addVoid(int num1, int num2){ // <==VOID
	//System.out.println(num1+num2);
	int sum = num1+num2;
	System.out.println("Sum is: "+sum);
}	
	
public static int add(int num1, int num2) {
	int sum = num1+ num2;
	return sum;
}	
	
	
	public static int multiply(int num1, int num2) {
		int result = num1*num2;
		return result;
		//return num1*num2;
	
	}
	
	public static int minus(int num1, int num2) {
		return num1-num2;
	
	}
	
	public static int divide(int num1, int num2) {
		if (num2==0) {
			System.out.println("ERROR: can not / by 0");
		}
			return num1/num2;
	}
}
