package day42_customClasses_encapsulation;
import java.util.*;
public class DSWshoesStore {
	
	public static void main(String[] args) {
		
   Shoes shoe1 = new Shoes();
   shoe1.setShoesData("ALDO", 6.5);
   
   System.out.println(shoe1.getShoesData());
		
		
		
		Shoes shoe2 = new Shoes();
		   shoe2.setShoesData("MK", 8.5);
		   
		   Shoes shoe3 = new Shoes();
		   shoe3.setShoesData("Coach", 7.0);
		   
		   //Array
		   Shoes [] shoesArr =new Shoes[3];
		   
		   shoesArr[0] = shoe1;
		   shoesArr[1] = shoe2;
		   shoesArr[2] = shoe3;
		   
		   System.out.println(shoesArr[0].getShoesData());
		   System.out.println(shoesArr[1].getShoesData());
		   System.out.println(shoesArr[2].getShoesData());
		   
		   System.out.println(shoesArr[1].brand); // returns only brand of the exact shoe
		   
		   //Arraylist
		   
		   ArrayList <Shoes> myShoes = new ArrayList<>();
		   
		   myShoes.add(shoe1);
		   myShoes.add(shoe2);
		   myShoes.add(shoe3);
		   
		   System.out.println(myShoes.get(0).getShoesData());
   
		  System.out.println(myShoes.get(2).brand);
		  
		  System.out.println(myShoes.get(1).size);
		  
		 // storing one element from list into another variable <Shoes> type
		  Shoes redShoes = myShoes.get(1);
		  
		  System.out.println(redShoes.getShoesData());
		  
		  //using for each loop for getting info from each element
		  for (Shoes sh : myShoes) {
			 
			  System.out.println(sh.getShoesData());
		  }
		   
		  for (Shoes sh : myShoes) {
				 if (sh.size>=7) {
			  System.out.println("the larger sized shoes are: "+sh.brand);
		  }
		  }
	}
	

}
