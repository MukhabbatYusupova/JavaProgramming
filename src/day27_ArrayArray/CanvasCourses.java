package day27_ArrayArray;

import java.util.Arrays;

public class CanvasCourses {

	public static void main(String[] args) {
		
String url = "https://learn.cybertekschool.com/courses/149";
 String[] urlArr = url.split("/");
 
 System.out.println(urlArr[urlArr.length-1]);
 System.out.println(Arrays.toString(urlArr));// <== REMEMBER!!!
 
 int courseId = Integer.parseInt(urlArr[urlArr.length-1]); //<== REMEMBER!!!
 
 
 switch (courseId) {
 case 147:
	System.out.println("Java programming");
	break;
 case 149:
	 System.out.println("SDLC");
	 break;
 case 204:
	System.out.println("Mentoring Session");
	break;
 case 152:
	System.out.println("QA testing");
	break;
default:
	System.out.println("Invalid url");
 }
	 
/* 
 * 147 -> Java programming
204 -> Mentoring sessions
149 -> SDLC
152 -> QA Testing
144 -> Team activity
143 -> Welcome Kit*/




	}

}
