package day13_ternary_strings_intro;
import java.util.*;

public class CarSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan = new Scanner (System.in);
	
	
	System.out.println("Select the car type:");
	 System.out.println(" 1) America\n 2) Japaneese\n 3) German\n 4) Italian");
	int carType = scan.nextInt(); 
	double averagePrice = 0.00;
	String carOptions = "";
	String carOrigin = "";
	
	switch (carType) {
	case 1:
		carOrigin = "American";
		averagePrice = 33000;
		carOptions = "Ford, Dodge, Tesla, Chevy";
	break;
	case 2: 
		carOrigin = "Japaneese";
		averagePrice = 35000;
		carOptions = "Toyota, Honda, Subaru, Mazda ";
	break;
	case 3: 
		carOrigin = "Germany";
		averagePrice = 55000;
		carOptions = "Bmw, VW, Audi, Mercedes, Porsche";
	break;
		case 4: 
			averagePrice = 85000;
			carOptions = "Alfa Romeo, Ferrari, Lamborghini, Fiat";
		break;
		
	default:
		
		System.out.println("Car type not available");
		return;
		
				}
	System.out.println("You selected " + carOrigin + " car and your car options are: " + carOptions + ".");
	System.out.println("The average price: "+ averagePrice);
		
	}

}
