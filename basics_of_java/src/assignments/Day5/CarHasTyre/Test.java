package assignments.Day5.CarHasTyre;

public class Test {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.setCompany("Tata");
		car.setModel("Safari");
		car.setPrice(2500000);
		
		System.out.println("Car Company: " + car.getCompany());
		System.out.println("Car Model: " + car.getModel());
		System.out.println("Car Price: " + car.getPrice());
		
		Tyre tyre = car.getTyre();
		tyre.setBrand("MRF");
		tyre.setPrice(10000);
		
		System.out.println("Tyre Company: " + tyre.getBrand());
		System.out.println("Tyre Price: " + tyre.getPrice());
		
		
	}
}
