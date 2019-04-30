package day15_String_Manipulation;

public class indexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                      //012345
		String word1 = "github"; 
		System.out.println(word1.indexOf('g')); // u can use "" too
		System.out.println(word1.indexOf("th")); // it gives only 1 number first letter t is located. 
		System.out.println(word1.indexOf("hub")); // gives just 3 h is located
		
		System.out.println(word1.indexOf("java")); // whenever it  doesnt find it gives -1
		
		String url = "www.okta.com";
		int i = url.indexOf(".");
		System.out.println("position of . is " + i); // 3
		System.out.println(url.charAt(i+1)); // next character after the i is location it prints "o"
		
		
		
		String title = "Java|- Google Search";
		int dash = title.indexOf('-');  //u can use single qute' in int
		
		
		System.out.println(title.charAt(dash-1));  // one character before |
		System.out.println(title.charAt(dash+2)); // second character after the dash
		
		String country = "United States of America";
		int states = country.indexOf("States");
		System.out.println("Position of states : " + states); // it gives me only one number where states start
	
	
	String word2 = "java, c++";
	
	if (word2.indexOf("c++") > -1) { //if variable includes stuff we asked it gives some number bigger than -1
		System.out.println("found");
	}
	
	
	
	
	
	
	}
	
	
	}
