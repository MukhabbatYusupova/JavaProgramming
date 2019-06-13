package day50_inheritance03;
 
public class AppDemo {
	
	public static void main(String[] args) {
		
		iPhoneApp app1 = new iPhoneApp();
		iPhoneApp app2 = new iPhoneApp("Uber");
		
		//AndroidApp app3 = new AndroidApp();
		AndroidApp app4 = new AndroidApp("Lyft");
		
	  System.out.println(app1.getName());
	  System.out.println(app2.getName());
	  System.out.println(app4.getName());
	  
	  // Static try
	  App.count = 33;
	  iPhoneApp.count = 55;
	  
	  System.out.println(App.count);  // count ==55 now!!! Shared value
	  AndroidApp.count = 100;
	  System.out.println(App.count);
	  System.out.println(iPhoneApp.count); // count ==100 for all of them!
	  
	  
	  App.build("Swift");
	  iPhoneApp.build("Objective C");
	  AndroidApp.build("Java");
	  
	  
		
	}

}
