package day12_switch_ternary;
import java.util. *;
public class ThreeNums {
	
	public static void main(String[]args) {
		int n1, n2, n3;
	Scanner scan = new Scanner (System.in);	
	n1 = scan.nextInt();
	n2 = scan.nextInt();
	n3 = scan.nextInt();
		
		if(n1 >= n2 && n1 >= n3) { // = can fix the problem if any of the number are equal
			//if() use if u wanna clear answer in 2-3 number equal cases
			System.out.println("n1 is bigger");
		}else if (n2 >= n1 && n2 >= n3) {
			System.out.println("n2 is bigger");
		}
	}

}
/* -if n1 and n2 are equal, it should say "n1 and n2 are equal"
 * if all are equal "n1 and n2 and n3 are equal"
 * if n1 and n3 are equal "n1 and n3 are equal" */
 
/*if(n1 > n2 && n1 > n3) {
			System.out.println("n1 is bigger");
		}else if(n2 > n3 ) {
			System.out.println("n2 is bigger");
		}else {
			System.out.println("n3 is bigger");
		} */