package day22_review2;

public class SubstringPractice {

	public static void main(String[] args) throws InterruptedException {
	         //0123
String word = "java";
System.out.println(word.substring(0,2)); // ja


System.out.println(word.substring(0, 1));
System.out.println(word.substring(1, 2));
System.out.println(word.substring(2, 3));
System.out.println(word.substring(3));

System.out.println();
int i =0;


System.out.println(word.substring(i, i+1));
i++;                                        // i became1 , 1+1
System.out.println(word.substring(i, i+1));
i++;                                        // i 2, 2+1
System.out.println(word.substring(i, i+1));
i++;                                        //i 3, 3+1
System.out.println(word.substring(i));

System.out.println("################################");


for (int n = 0; n<=3; n++) {
	System.out.println(word.substring(n, n+1)); 
	Thread.sleep(500);
}

System.out.println("################REVERSE####################");


for (int n = 3; n>=0; n--) {   // even it is printing reverse the numbers still count like always from 2 to 3, not from 3 to 2
	String letter = word.substring(n, n+1);
	System.out.println(letter); 
	Thread.sleep(500);
}

int start = 1;
int end =5;   //01234567891011
String word2 = "UnitedStates";
System.out.println(word2.substring(start,end));
System.out.println(word2.substring(2,3)); // gives i
System.out.println(word2.substring(6)); // gives starting frm 6 till the end = states

System.out.println(word2.substring(word2.length()-1)); //gives me the last character




	}

}
