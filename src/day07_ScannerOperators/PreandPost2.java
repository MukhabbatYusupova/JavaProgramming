package day07_ScannerOperators;

public class PreandPost2 {
	public static void main(String[] args) {
		
		int msg =10;
		msg++;
		++msg;
		System.out.println("Messages: "+ msg);
		
		int redmsg = --msg;
		System.out.println("Read messages: " + redmsg );
		System.out.println("Messages" + msg);
		
		int unreadmsg = redmsg--; //11
		System.out.println("Unread Messages " + unreadmsg);
		System.out.println("Unread Messages " + redmsg);
		
		int total = unreadmsg++ - redmsg--; // 1
		
		int count = 20; //21 +22 
		int count2 = 10;
		int totalcount = ++count + --count2; //30 
		
		int myCount = count++ + ++count; //21 + 23 = 44
		System.out.println(count);
		System.out.println(myCount);
		
		
	}

}
