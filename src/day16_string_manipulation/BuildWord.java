package day16_String_manipulation;

public class BuildWord {

	public static void main(String[] args) {
		

		

//makeTags("i", "Yay") → "<i>Yay</i>"
//makeTags("i", "Hello") → "<i>Hello</i>"
//makeTags("cite", "Yay") → "<cite>Yay</cite>"
		
		String chars = "<<>>";
		String word = "Yay";
		
		 String result = chars.substring(0,2)+ word + chars.substring(2);
		 System.out.println(result);
		 
		//
		 System.out.println();
		 //
		 
		 String str = "java";
		 String myresult = "";
		 
		 if (str.length()== 2) {
			 myresult = str+str+str;
		 } else {
			 myresult = str.substring(str.length()-2);
			 myresult = myresult +myresult +myresult;
		 }
		
		System.out.println(myresult);
		
	

	
	}

}
