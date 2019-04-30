package day15_String_Manipulation;

public class GoogleSearchTest {
	
	public static void main (String []args) {
		String searchItem = "java";
		String pageTitle = searchItem + " - Google Search";
		
		if (pageTitle.startsWith(searchItem)){      //nested started {
			
			if (pageTitle.endsWith("Google Search")){
				System.out.println(pageTitle);
		}else{
			System.out.println("error");
		}
	} // nested end }
		
		
		
		
	}

}
