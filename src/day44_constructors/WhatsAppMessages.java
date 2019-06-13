package day44_constructors;

public class WhatsAppMessages {
	
public static void main(String[] args) {
	
	
	WhatsApp msg1 = new WhatsApp("571-665-1700", "Good for you!");
	System.out.println(msg1.getMessage());
	System.out.println(msg1.getToNumber());
	
	WhatsApp msg2 = new WhatsApp("347-689-1200");
	
}

}
