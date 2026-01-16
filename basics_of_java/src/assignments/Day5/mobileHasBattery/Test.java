package assignments.Day5.mobileHasBattery;

public class Test {
	
	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		mobile.setCompany("Apple");
		mobile.setModel("14 plus");
		mobile.setPrice(60000);
		
		System.out.println("Company: "+ mobile.getCompany());
		System.out.println("Model: "+ mobile.getModel());
		System.out.println("Price: "+ mobile.getPrice());
		
		// mobile.getBattery will return the reference of the battery object.
		Battery battery = mobile.getBattery();
		battery.setName("Lithium");
		battery.setCapacity(4000);
		
		System.out.println("Battery Name: " + battery.getName()); 
		System.out.println("Battery Capacity: "+ battery.getCapacity());
	}
	
}
