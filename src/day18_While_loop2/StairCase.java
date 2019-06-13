package day18_while_loop2;

public class StairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String stairs = "*";
//		int num = 1;
//		while (num <=10) {
//			System.out.println(stairs);
//			stairs += "*";
//			num ++;
//		}
//
//		// using length
//		
//		stairs = "*";
//		while (stairs.length()<=10) {
//			System.out.println(stairs);
//			stairs += "*";
//		}
		
		int num = 10;
		stairs= "**********";
		while (num >= 1) {
			
			System.out.println(stairs);
			stairs=stairs.substring(0,stairs.length()-1);
			num--;
			
		}
		
	}

}
