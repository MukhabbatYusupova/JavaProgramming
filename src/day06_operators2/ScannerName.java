package day06_operators2;
import java.util.Scanner;
public class ScannerName {
	public static void main(String[] args) {
		
			   Scanner scan = new Scanner(System.in);
			    int areaCode = scan.nextInt();
			    int localNumber = scan.nextInt();
			    
			    int phoneNumber =  areaCode + localNumber;
			    
			    System.out.println("Calling number " + phoneNumber); //printing only localNumber why???
		
		
		
	}

}
