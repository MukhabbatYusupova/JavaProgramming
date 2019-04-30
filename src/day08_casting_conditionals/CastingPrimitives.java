package day08_casting_conditionals;

public class CastingPrimitives {
public static void main(String[] args) {
	
	int i = (int) 3.4; //3.4 is double value thats why we can assign it to int but if we use (int) we convert it to int.
	                   // 3.4 will be 3 
	System.out.println("i is " + i);
	
	double price = 230.50;
	int dollars = (int) price;
	
	System.out.println("price is: " +price);
	System.out.println("I pay " + dollars +" $ in dollars");
	
	int count = 44;
	byte byteCode = (byte)count; 
	System.out.println(byteCode);
	
	long Value = 345645L;
			int intvalue = (int)Value;
	
			System.out.println(Value);
			System.out.println(intvalue);
			
	int large = 5678;
	short small = (short) large;
	System.out.println(small);
	
	int result = (int)(500.4 / 2.0); // u want first divide than change to  (int)
	
	byte b = 123;
	int ii = b; // it will automatically casted no need to put (int) 
	           // implicit casting fromsmaller to bigger amount. from byte into int, short to long
}

}
