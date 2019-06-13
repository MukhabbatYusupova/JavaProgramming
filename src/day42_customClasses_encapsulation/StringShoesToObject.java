package day42_customClasses_encapsulation;
import java.util.*;
public class StringShoesToObject {
	public static void main(String[] args) {
		
		String data = "Christian Louboutin,6.5";
		
	 String [] words = data.split(",");
	 
	 String brand = words[0];
	 double size = Double.parseDouble(words[1]);
	 
	 Shoes shoes = new Shoes();
	 shoes.setShoesData(brand, size);
	 System.out.println(shoes.getShoesData());
	 
	 
	 Scanner scan = new Scanner (System.in);
	 
	 System.out.println("What shoes brand?");
	 String shoeBrand = scan.next();
	 
	 System.out.println("What is your size?");
	 double mySize = scan.nextDouble();
	 
	 Shoes myShoes = new Shoes();
	 myShoes.setShoesData(shoeBrand, mySize);
	 System.out.println(myShoes.getShoesData());
		
		
		
		
	}

}
