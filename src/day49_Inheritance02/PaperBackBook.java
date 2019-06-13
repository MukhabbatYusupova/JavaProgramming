package day49_Inheritance02;

public class PaperBackBook extends Book {
	
	private int pages;
	
	public String toString() {
		return "title: "+getTitle()+ " | author " + getAuthor()+ " | price: "+ getPrice();
	}
	

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	

}
