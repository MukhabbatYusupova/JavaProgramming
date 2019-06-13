package day59_polymorphism;

public class HairSpray extends Inventory implements Flameable {

	@Override
	public void catchFire() {
		System.out.println("Be careful, don't use hairspray next to open fire!");}
	@Override
	public void placeInDep() {
		System.out.println( "HairSpray is in Hairproducts department!");}
	
	

}
