package day08_casting_conditionals;

public class Relationals {
	public static void main(String[]args) {
		
		double d1 =23.56;
		double d2 = 20.43;
		
		System.out.println(d1>=d2);
		
		boolean check = d1>=d2;
		
		System.out.println("Check: " + check);
		
		char ch1 = 'a';
		char ch2 = 'j';
		char ch3 = 'A';
		
		System.out.println(ch2 >ch1);// ture j is greater than a
		System.out.println(ch1>ch3);// true lowercase a greater than capital A. its comparing behind the number of the letter. 
		                            // a = 97   A=65
		
		boolean b = true != false;// if u put == it prints false cuz true is not equel to false
		System.out.println(b);
		
		
		
		
		
		
	}

}
