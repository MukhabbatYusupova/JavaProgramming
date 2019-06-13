package day59_polymorphism;

public interface Meltable extends Edible {

	@Override
	default void eat() {
		// TODO Auto-generated method stub
		
	}

	public abstract void melt();
}
