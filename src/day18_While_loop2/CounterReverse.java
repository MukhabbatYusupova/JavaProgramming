package day18_while_loop2;

public class CounterReverse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int num = 1;
		 
		while (num <=10) {
		System.out.print(num + ", ");
		num++;
		
		//Thread.sleep(1000); // makes slow in printing , 1000millisecond
		}
		
		System.out.println();
		int num2 = 10;
		
		while (num2 >= 1) {
			System.out.print( num2 + ", ");
			num2 --;
		}
		
		
	}

}
