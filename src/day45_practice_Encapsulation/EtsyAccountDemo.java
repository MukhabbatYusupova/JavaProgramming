package day45_practice_Encapsulation;

public class EtsyAccountDemo {
	public static void main(String[] args) {
		
	
	
	EtsyAccount acct1 = new EtsyAccount();
	System.out.println(acct1.toString());
	
	acct1.setEmail("email@gmail.com");
	acct1.setFirstName("Muha");
	acct1.setPassword("uzb123");
	
	System.out.println(acct1.toString());
	
	
	EtsyAccount acct2 = new EtsyAccount("email2@gmail.com","Helena","uzb1123" );
	System.out.println(acct2);
	
	System.out.println("###INVALID###");
	
	EtsyAccount acct3 = new EtsyAccount("email2gmail.com","1elena","uz11" ); // invalid
	System.out.println(acct3);
	
	
	EtsyAccount acct4 = new EtsyAccount("email23gmail.com", "Aylin");
	System.out.println(acct4);
	
	}
}
