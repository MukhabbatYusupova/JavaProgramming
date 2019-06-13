package day50_inheritance03;

public class SlackUser {
	private String name;
	
	public SlackUser (String name) {
		this.name = name;
	}
	
	
	public void sendMsg(String msg) {
		System.out.println(name + " is sending a message < "+ msg + ">");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
