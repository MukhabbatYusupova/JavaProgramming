package day44_constructors;

public class WhatsApp {
	
	
	private String toNumber;
	private String message;
	private boolean delivered;
	
	public WhatsApp() {
		
		System.out.println("Hey, I am using WhatsApp");
	}
	
	public WhatsApp(String toNumber, String message) {
		this();
		System.out.println("typing... typing...");
		this.toNumber = toNumber;
		this.message = message;
		
		
	}
	
	public WhatsApp(String toNumber) {
		this(toNumber,"[]");
		System.out.println("One arg const");
		
	}
	
	public String getToNumber() {
		return toNumber;
	}
	public void setToNumber(String toNumber) {
		this.toNumber = toNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isDelivered() {
		return delivered;
	}
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	
	public String toString() {
		return "WhatsApp [toNumber=" + toNumber + ", message=" + message + ", delivered=" + delivered + "]";
	}
	
	
	

}
