package day50_inheritance03;

public class SlackChannel {
	
	public static void main(String[] args) {
		
		SlackUser user1 = new SlackUser("Nadir");
		AdminUser admin1 = new AdminUser("Florian");
		
		user1.sendMsg("This Thursday, we will summarize Jira management tool, and focus on Jira Xray plug in / add on. Please prepare your questions on Jira. Also, we will continue reviewing testing types, and specifically go over smoke test suite and see the example.");
		admin1.sendMsg("Thank you.");
		
		
	}

}
