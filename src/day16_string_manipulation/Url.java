package day16_string_manipulation;
import java.util.*;

public class Url {
public static void main(String[]args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter url:");
	String url = scan.next();
	// check www.
	String start = url.substring(0,3);
	if (url.startsWith("www.")) {
		System.out.println("www.is present!");
		
	} else {
		System.out.println("Invalid url entered!");
		return;
	}
	 // check for . before extension
	// find out the length
	// do -4 and using charAt get the character
	// than compare if it is '.'
	// length we starts with 1
	int dotIndex = url.length() - 4;
	url.lastIndexOf(".");
	/*
	if (url.charAt(dotIndex)== '.') {
		System.out.println("'.' is there" );		
	}else {
		System.out.println("'.' is mismatched");
	}*/
	
	 if (url.charAt(url.length()-4) == '.'){
	  System.out.println("valid extension");
	 }else { System.out.println("invalid!");
	}
	String domain = url.substring(4, dotIndex);
	System.out.println("domain:" + domain);
	
	String extension = url.substring(dotIndex+1, url.length());
	System.out.println("Extension: " + extension );
	
	System.out.println(start+"."+domain+"."+extension);
	
}
}
	
	
