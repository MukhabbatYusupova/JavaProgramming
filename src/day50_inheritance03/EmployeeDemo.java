package day50_inheritance03;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		FulltimeEmployee e2 = new FulltimeEmployee();
		Contructor e3 = new Contructor();
		
		e1.calculatePay(40, 40);
		e2.calculatePay(40, 45);
		e3.calculatePay(40, 55);
		
	}
}
