package day46_static;

public class CustomerDemo {
	
	public static void main(String[] args) {
		
		Customer c1 = new Customer("Abdallah Alies","AbdallahAlies@gmail.com" );
		Customer c2 = new Customer ("ADILET", "ADILET@yahoo.com");
		Customer c3 = new Customer ("Anastasia Zasibina","AnastZas@gmail.com" );
		
		System.out.println(c3.count);
		System.out.println(Customer.count);
		
		Customer c4 = new Customer("Gulnar","guleke@gmailcom");
		
		System.out.println(Customer.count);
		
		c1.count=10;
		System.out.println(c3.count); // shows 10 too not ++
		                              //count ++ happens only when creating objects
		System.out.println(c2.count);
		// so latest value will be shared by all objects
		
		
	}

}
