package day11_logical_nestingif;

public class TruthTables {
	
	public static void main(String [] args) {
		
		System.out.println("#### TRUTH TABLE FOR && OPERATOR ####");
		System.out.println();
		System.out.println("When true  && true - result is " + (true && true));
		System.out.println("When true  && false - result is " + (true && false));
		System.out.println("When false && true - result is " + (false && true));
		System.out.println("When false && false - result is " + (false && false));
		
		
		System.out.println();// adds empty line
		
		System.out.println("When true  || true - result is " + (true  || true));
		System.out.println("When true  ||false - result is " + (true  || false));
		System.out.println("When false || true - result is " + (false || true));
		System.out.println("When false ||false - result is " + (false ||false));
		
		System.out.println();
		
		System.out.println(" ### TRUTH TABLE FOR ! (NOT) OPERATOR ####");
		
		System.out.println("When !true - result is " + (! true));
		System.out.println("When !false - result is " + (! false));
		
	
	//
		String yourLaptop = "MacBook";
		String yourPhone = "iPhone";
		
				
		if (yourLaptop.equals("MacBook") && yourPhone.equals("iPhone")) {
			System.out.println(true);
		} else if (yourLaptop.equals("Windows") && yourPhone.equals("iPhone")) {
			System.out.println(false);
		} else if (yourLaptop.equals("MacBook") || yourPhone.equals("Android")) {
			System.out.println(true);
		} else if (yourLaptop.equals("MacBook") || yourPhone.equals("iPhone")) {
			System.out.println(true);
			
		}
	
	}
	}
	


