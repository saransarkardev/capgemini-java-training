package assignments.Day5.mobileHasBattery;

public class Mobile {
	
	private String company;
	private String model;
	private int price;
	
	private Battery battery;
	
	// No argument constructor
	Mobile() {
		battery = new Battery();
	}
	
	
	// getters --> read the value
	public String getCompany() {
		return company;
	}
	// setters --> write the value
	public void setCompany(String company) {
		this.company = company;
	}
	
	// getters --> read the value
	public String getModel() {
		return model;
	}
	// setters --> write the value
	public void setModel(String model) {
		this.model = model;
	}
	
	// getters --> read the value
	public int getPrice() {
		return price;
	}
	// setters --> write the value
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Battery getBattery() {
		return battery;
	}
	
	
	
}
