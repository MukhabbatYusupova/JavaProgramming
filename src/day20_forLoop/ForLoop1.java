package day20_forLoop;

public class ForLoop1 {

	public static void main(String[] args) throws InterruptedException {
		// print lovejava 10 times
		
		for (int i=1; i <=10; i++) { // i++ doesnt work at first running, it increases in second time
			System.out.println("LoveJAVA!!!");
		}
		
		
		for (int i=5; i >=1; i--) {
			System.out.println("Java is Fun!!!"); // from 5 it is decreasing checking the condition
		}
		
		for (int i=1; i <=10; i+=2) {  //i increases by 2 times
			System.out.print("Love Yourself!!!  ");
		}
		System.out.println();
		
		for (int i=5; i <=15; i++) { 
			System.out.println(i);
		}
		
		System.out.println();
		
		for (int num = 20; num>=10; num--) {
			System.out.println(num);
			Thread.sleep(456); //slows down the print
		}
	}

}
