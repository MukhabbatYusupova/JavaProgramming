package day46_static;

public class CompanyDemo {
	public static void main(String[] args) {
		
		System.out.println(Company.cName);
		System.out.println(Company.cName.toUpperCase());
		
		
		Company c = new Company();
		System.out.println(c.cName);
		c.companyInfor();
		Company.companyInfor();
	}

}
