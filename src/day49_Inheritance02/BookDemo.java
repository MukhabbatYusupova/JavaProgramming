package day49_Inheritance02;

public class BookDemo {
	public static void main(String[] args) {
		EBook ebook = new EBook();
		
		ebook.setTitle("Introduction to Java Programming");
		ebook.setAuthor("Savitch");
		ebook.setPages(1051);
		ebook.setPrice(170.0);
		ebook.setSize(500);
		ebook.setType("Tech book");
		
		System.out.println(ebook.getTitle() + " | "+ ebook.getAuthor());
		
		ebook.readEBook(10);
		
		AudioBook audiobook = new AudioBook();
		
		audiobook.setTitle("OCA prepration");
		audiobook.setAuthor("Jeanne");
		audiobook.setNarrator("Master");
		
		audiobook.listen();
		
		PaperBackBook book = new PaperBackBook();
		book.setAuthor("Haled Hussaini");
		book.setTitle("Kite Runner");
		book.setPrice(20.0);
		
		System.out.println(book.toString());
		
		
		
		
	}

}
