package day16_String_manipulation;
import java.util.*;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan  =new Scanner (System.in);

System.out.println("enter words:");

String word = scan.nextLine();

System.out.println(word.replace("a", "y"));

System.out.println(word.replace("sad", "happy"));

String word3= "Olma";
System.out.println(word3.replace("O", "E"));

	}

}
