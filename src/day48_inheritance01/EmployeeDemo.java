package day48_inheritance01;

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
	    emp1.name = "Kiki";
	    emp1.age = 26;
	    emp1.jobTitle = "HR";
	    emp1.gender= 'f';
	    
	    emp1.work();
	    emp1.eat("chicken kabob");
	    emp1.walk();
	    emp1.sleep(9);
	    
	    System.out.println(emp1);
	
	
	}
}
