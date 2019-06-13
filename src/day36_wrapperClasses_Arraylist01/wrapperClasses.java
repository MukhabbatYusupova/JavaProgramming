package day36_wrapperClasses_Arraylist01;

public class wrapperClasses {

	public static void main(String[] args) {
		int n1 = 10;
		
		Integer n2 = new Integer(20);
		
		System.out.println(n1);
		System.out.println(n2);
		 
		double d1 = 44.9;
		Double d2 = new Double (123.9);
		Double d3 = new Double ("5.2");
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		System.out.println(d1+d2+d3);
		
		char ch = 'a';
		Character ch2 = new Character('b');
		System.out.println(ch);
		System.out.println(ch2);
		
		byte b1 = 100;
		Byte b2 = new Byte((byte)10);
		Byte b3 = new Byte ("-55");
		System.out.println(b1+b2+b3);
		
		Integer num1 = Integer.valueOf(1234);// or "1234" works as well
		Boolean bool1 = Boolean.valueOf(true); // or "true"
		System.out.println(num1 +" "+ bool1);
		
		

	}

}
