package association;

public class Car {
		//Association, Composition, Aggregation
	
		// HAS-A Relationship (Association)
		// Meaning: One class has an object of another class.
		// Car HAS-A Engine
	
		private String brand;//null
		private double price;//0.0
		
		
		private Engine engine;//null
		
		Car(){
			engine = new Engine();
		}
		
		public String getBrand() {
			return brand;
		}
		
		public double getPrice() {
			return price;
		}
		
		public Engine getEngine() {
			return engine;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public void setEngine(Engine engine) {
			this.engine = engine;
		}
}
