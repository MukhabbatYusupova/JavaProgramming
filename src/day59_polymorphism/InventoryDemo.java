package day59_polymorphism;

public class InventoryDemo {
	
	public static void main(String[] args) {
		
		HairSpray hp = new HairSpray();
		hp.catchFire();
		
		Flameable hairSp =  new HairSpray();
		hairSp.catchFire();
		
	 // Interface            implementing class/ sub class
		Flameable pTank =  new PropaneTank();
		pTank.catchFire();
		
		Flameable item;
		item = new HairSpray();
		item.catchFire();
		//item.placeInDep();
		item = new PropaneTank();
		item.catchFire();
		
		Inventory hhh = new HairSpray();
		hhh.placeInDep();
		Flameable hhh2 = new HairSpray();
		//hhh2.placeInDep(); it doesnt work cuz in Fl interface 
		//we dont have this method and it didnt inherited it
		
		
		
		
		
		
	}

}
