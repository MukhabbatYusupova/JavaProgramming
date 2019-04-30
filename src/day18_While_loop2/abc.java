package day18_While_loop2;

public class abc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		char letter = 'a';
		
		
		
		while (letter <='z') {
		System.out.print(letter+" ");
		letter++;	
		//Thread.sleep(456);
		}
		System.out.println();
		char capitalLetter = 'A';
		
		while (capitalLetter <= 'Z') {
			System.out.print(capitalLetter+ " ");
			capitalLetter ++;
		}
		System.out.println();
		char reverse = 'z';
		
		while (reverse >= 'a');{
		System.out.print(reverse + " ");
		reverse --;
		}
		
	}

}
