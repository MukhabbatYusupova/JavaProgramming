package day43_encapsulation_constructors;

public class Tesla {
	
	private String model;
	private int range;
	private double zeroTo60;
	private double price;
	private boolean selfDriving;
	
	
	
	public String toString() {
		return "Tesla [model=" + model + ", range=" + range + ", zeroTo60=" + zeroTo60 + ", price=" + price
				+ ", selfDriving=" + selfDriving + "]";
	}

	public void setModel(String model) {
		if (isValidModel(model)) {
			this.model = model;
		} else {
			System.out.println("Invalid model - "+ model);
			this.model ="Unknown";
		}
		
		
		
	}

	public String getModel() {
		return model;
	}
	
	public void setRange (int range) {
		this.range = range;
	}
	
	public int getRange() {
		return range;
	}
	
	public void setZeroto60(double zeroTo60) {
		this.zeroTo60 = zeroTo60;
	}
	
	public double getZeroto60() {
		return zeroTo60;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isSelfDriving() {   // FOR BOOLEAN U DONT USE GET, U ADD IS
		return selfDriving;
	}

	public void setSelfDriving(boolean selfDriving) {
		this.selfDriving = selfDriving;
	} 
	
	public boolean isValidModel(String model) {
//		    if (model.equalsIgnoreCase("Model s") ||
//				model.equalsIgnoreCase("Model 3") ||
//				model.equalsIgnoreCase("Model x") ||
//				model.equalsIgnoreCase("Model y") ||
//				model.equalsIgnoreCase("Roadster")) {
//			return true;
//		}
//		return false;
//	}
	
		// OR  
//		return model.equalsIgnoreCase("Model s")  ||
//				model.equalsIgnoreCase("Model 3") ||
//				model.equalsIgnoreCase("Model x") ||
//				model.equalsIgnoreCase("Model y") ||
//				model.equalsIgnoreCase("Roadster");
		
		//OR
		
		switch (model.toLowerCase()) {
			case "model s":
			case "model 3":
			case "model x":
			case "model y":
			case "roadster":
				return true;
			default:
				return false;
		}
	}
	
	public void setTeslaInfo (String model, int range, double zeroTo60, double price,boolean selfDriving ) {
		
		// this.model = model;
		
		setModel(model);
		setRange(range);
		setZeroto60(zeroTo60);
		setPrice(price);
		setSelfDriving(selfDriving);
		
	}
	
	
}
