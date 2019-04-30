package day13_ternary_strings_intro;
import java.util.*;
public class LaptopPrice {
	public static void main(String[] args) {
	    double price = 0;
			String storageType, screenType, cpu, screenResolution;
			int ram = 0 ;
			int memorySize;
			Scanner scan = new Scanner(System.in);
	    //WRITE YOUR CODE HERE
	    
	    System.out.println("Select screen size:");
	    
	    screenType = scan.next();
	    switch (screenType){
	      case "13.3":
	      price = price +200;
	      break;
	      case "15.0":
	      price = price + 300;
	      break;
	      case "17.3":
	        price = price + 400;
	      break;
	          
	    }
	      System.out.println("Select CPU type:");
	      cpu = scan.next();
	      
	      switch (cpu){
	      case "i3":
	        price = price + 150;
	      break;
	      case "i5":
	        price = price + 250;
	      break;
	      case "i7":
	        price = price + 350;
	      break;
	      
	      }
	      
	      System.out.println("Select RAM size:");
	      ram = scan.nextInt();
	      price = price + 50 * (ram /4);
	        
	      System.out.println("Select storage type:");
	      storageType = scan.next();
	      
	      System.out.println("Enter memory size");
	      memorySize = scan.nextInt();
	      
	      if (storageType.equals("SSD")){
	        price = price + 100 * (memorySize / 500);
	      } else if (storageType.equals("HDD")){
	        price = price + 50 * (memorySize / 500);
	      }
	        
	      System.out.println("Enter screen resolution:");
	     screenResolution = scan.next();
	      if (screenResolution.equals("FULLHD")){
	        price = price + 100;
	      } else if (screenResolution.equals("4K")) {
	        price = price + 200;
	      }
	      
	      System.out.println("Laptop price is: $" + price);
	    
	    
	    
	    
	  }
	
}
