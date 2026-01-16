package encapsulation;

public class Demo {
	
	// We can use private variable for global variable, method, constructor
	// class Initializer not used.
	// Encapsulation --> Data hiding.
	private int a;
	
	private Demo() {
		
	}
	
	// Factory method.
	static Demo object; // null/ref --> This will help us to create only 1 object.
	public static Demo getA() {
		if (object == null) {
			object = new Demo();
		}
		return object;
	}

	// Read a value --> getter method.
	public int getValueA() {
		return a;
	}
	
	// write a value --> setter method.
	public void setValueA(int a) {
		this.a = a;
	}
}
