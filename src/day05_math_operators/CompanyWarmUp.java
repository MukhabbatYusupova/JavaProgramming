package day05_math_operators;

public class CompanyWarmUp {
	public static void main(String[] args) {
		
	String companyName;
	String address;
	int numberOfEmployees;
	long revenue;
	boolean isTechCompany;

	
	companyName = "Facebook";
	address = "Silicon Valley, CA";
	numberOfEmployees = 10000;
	revenue = 4000000;
	isTechCompany = true;
	

	
	System.out.print("Company name is " + companyName+". ");
	System.out.print("Company adress is " + address+". ");
	System.out.println("There are more than " + numberOfEmployees + " people work in " + companyName+". ");
	System.out.println("Revenue of " + companyName + " is " + revenue+". ");
	System.out.println("Is it tech company? " + isTechCompany);
	
	String aboutCompany = "Company " + companyName+ " is a big company.  \n \t It is located at "+ address+"." ;
	System.out.println();
	System.out.println(aboutCompany);
	
	
	
	
}

}
