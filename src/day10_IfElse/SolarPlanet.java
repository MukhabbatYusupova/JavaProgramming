package day10_IfElse;
	import java.util.*;
public class SolarPlanet {
	
	
	  public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    System.out.println("what is the farthest planet in the solar system:" );
	    System.out.println("a)venus" );
	    System.out.println("b)pluto" );
	    System.out.println("c)neptune" );
	    
	    
	    
	    //your code here
	    
	    String a = s.nextLine();
	    String b = s.nextLine();
	    String c = s.nextLine();
	    
	   if (a.equals(a)) {
	     System.out.println("a is wrong");
	   } else if (b.equals(b)) {
	     System.out.println("b is correct");
	   } else if (c.equals(c)) {
	     System.out.println("c is wrong");
	   } else {
	     System.out.println("is not valid answer");
	 
	   }
	

}
	  }
