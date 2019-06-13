package day50_inheritance03;

public class AdminUser extends SlackUser{
	
	public AdminUser(String name) {
		super (name);
	}

	@Override
	public void sendMsg(String msg){
		System.out.println("Add chanel");
		System.out.println(getName()+" is sending a message <"+msg+">");
	}
	
}
