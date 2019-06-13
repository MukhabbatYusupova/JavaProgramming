package day57_interfaces;

public interface Pet {
	boolean friendly = true; //== public static final boolean friendly = true;
	
    void keepAsPet();// == public abstract void keepAsPet();
    
    public default void play() {
    	System.out.println("Pet is playing");
    }
    
    public static void feed(String food) {
    	System.out.println("feeding a pet with " + food);
    }

}


interface Callable{
	void respond();
	
	
}