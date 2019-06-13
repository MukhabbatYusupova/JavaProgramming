package day50_inheritance03;

public class Google extends SearchEngine {
	@Override
	public int search(String item) {
		System.out.println("Google Searching for : "+ item);
		int resultsCount = item.length();
		return resultsCount;
	}
	
	protected void search(String item, String item2) {
		System.out.println(" Google Searching for : "+ item + ", "+ item2);
		int resultsCount = item.length()+ item2.length();
		System.out.println("Total count: " + resultsCount);
		
	}
	
	
}
