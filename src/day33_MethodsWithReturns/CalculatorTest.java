package day33_MethodsWithReturns;

public class CalculatorTest {

	public static void main(String[] args) {
	
System.out.println(addNums.add(3, 1));
System.out.println(addNums.multiply(5, 6));
System.out.println(addNums.minus(40, 12));
System.out.println(addNums.divide(100, 2));
	
	int addResult=addNums.add(21, 41);
	int mResult = addNums.multiply(50, 40);
	int mnResult = addNums.minus(3000, 200);
	int dResult = addNums.divide (455, 5);
	
	System.out.println("addResult: "+ addResult);
	System.out.println("multiplyResult: "+ mResult);
	System.out.println("mnResult: "+ mnResult);
	System.out.println("dResult: "+ dResult);
	
	
	int a = 10, b=5;
	int myResult = addNums.minus(a, b);  // we can pass variables 
	System.out.println("My Result: "+ myResult);
	
	int [] dNums = {2, 4};
	int result2 = addNums.multiply(dNums[0], dNums[1]);
	System.out.println();
	
	if (addNums.add(10, 16)==26 ) {
		System.out.println("Add Unit Test Passed");
	} else {
		System.out.println("Test Failed!");
	}
	
	
	
	}

}
