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
		
		Tyre[] tyre = car.getTyre();
		tyre[0].setBrand("MRF");
		tyre[0].setPrice(10000);
		
		tyre[1].setBrand("CEAT");
		tyre[1].setPrice(8000);
		
		tyre[2].setBrand("JK TYRE");
		tyre[2].setPrice(9000);
		
		System.out.println("Tyre Company: " + tyre[0].getBrand());
		System.out.println("Tyre Price: " + tyre[0].getPrice());
		
		System.out.println("Tyre Company: " + tyre[1].getBrand());
		System.out.println("Tyre Price: " + tyre[1].getPrice());
		
		System.out.println("Tyre Company: " + tyre[2].getBrand());
		System.out.println("Tyre Price: " + tyre[2].getPrice());
		
	}
}
