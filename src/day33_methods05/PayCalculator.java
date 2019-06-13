package day33_methods05;

public class PayCalculator {
	public static void main(String [] args) {
		
		int pay = getHourlyPay(40, 50);
		System.out.println(getHourlyPay(0, 10));
		int noPay = getHourlyPay(10, 0);
		System.out.println("noPay: " + noPay);
		
		
		
	}
	
	
	public static int getHourlyPay(int hour, int rate) {
		
		if (hour<=0)  {
			System.out.println("Invalid hours");
			return 0; // exit the point and return 0
		} 
		 if (rate <=0) {
			System.out.println("Invalid rate");
			return 0;
		}
		int total = hour *rate; // it reaches here when the hour and rate is good
		return total;
	}

}
