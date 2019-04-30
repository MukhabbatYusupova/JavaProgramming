package day16_string_manipulation;
import java.util. *;
public class ReplaceThem {
	public static void main(String []args) {
		String sentence = "Coding is fun, it is my hobby!!!";
		String withNoSpces = sentence.replace(" ", "");
		System.out.println(sentence);
		System.out.println(withNoSpces);
		
		sentence=sentence.replace(",", "!!!");
			
	System.out.println(sentence);
	
	String mix = "@#$%^&*()ja-v|a(*&^%$";
    //mix = mix.replace("@#$%^&*()ja-v|a(*&^%$", "java");
	
	mix = mix.replace("@#$%^&*", ""); // to get rid of the unnessary stuff u use just ""
	
	// u can chain all replace things in one statement.
	
	mix = mix.replace ("$", "").replace("-", "").replace("|", "");
	
	
	
	
	String result = "About 150,000,000 results (0.66 seconds)";
	// using replace, get number of results
	
	
	result = result.replace("About ", "");
	result = result.substring(0, result.indexOf(" "));
	System.out.println(result);

	result = result.replace(",", " ");
	System.out.println(result);
	
	result = result.replaceFirst(",", " ");
	System.out.println(result);
	
	//replaceFirst practice at home
	
	
	}

}
