package day52_inheritance05;

public class EqualsMethod {
	
	
	private String model;
	private String color;
	
	public boolean equals(EqualsMethod other) {
		if (model.contentEquals(other.model)&& 
				color.contentEquals(other.color)) {
			return true;
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return "EqualsMethod [model=" + model + ", color=" + color + "]";
	}
	public EqualsMethod(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
