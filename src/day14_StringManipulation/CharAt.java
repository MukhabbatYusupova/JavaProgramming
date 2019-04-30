package day14_StringManipulation;

public class CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String word = "Computer";
   System.out.println(word.length());
System.out.println(word.charAt(0));
System.out.println(word.charAt(1));
System.out.println(word.charAt(2));
System.out.println(word.charAt(3));
System.out.println(word.charAt(4));
System.out.println(word.charAt(5));
System.out.println(word.charAt(6));
System.out.println(word.charAt(7));

//

String word2 = "Java";
 if(word2.charAt(0) == 'J');{
System.out.println("J is first character");
} 
 
 String word3 = "civic";
 char first = word3.charAt(0);  // index always zero
 char last = word.charAt(4);  

if (first == last) {
	System.out.println("FIrst and last match");
} else {
	System.out.println(" not match");
}
// always print the last character no matter the length

String word4 = "abcdefghijklmnopqrstuvwxyz";

char lastChar = word4.charAt(word4.length()-1);

System.out.println("last character of the word " + word4 + " is " + lastChar);






	}

}
