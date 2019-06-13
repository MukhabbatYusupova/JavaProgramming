package day40_customClassesAndMethods;

public class MyContacts {
	
	public static void main(String[] args) {
		
		Contacts contactA = new Contacts();
		
		contactA.name = "Mukhabbat";
		contactA.phoneNumber = "(571)665-1700";
		contactA.email = "studentnuuz@gmail.com";
		
		contactA.call();
		contactA.sendMessage();
		contactA.sendEmail();
		
Contacts contactB = new Contacts();
		
		contactB.name = "Gulnar";
		contactB.phoneNumber = "(571)373-9299";
		contactB.email = "gulkesha@gmail.com";
		
		
		System.out.println("Name: "+ contactB.name);
		System.out.println("Tel: "+ contactB.phoneNumber);
		System.out.println("Email: "+ contactB.email);
		
		System.out.println();
		
		contactB.call();
		contactB.sendMessage();
		contactB.sendEmail();
		
	}

}
