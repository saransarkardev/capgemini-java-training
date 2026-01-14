package oops.fundamental.non_static.initializer;

public class Program1 {
	
	static {
		System.out.println("Static Block 1");
	}
	
	// Non-static Initializer
	{
		System.out.println("New object has been created");
	}
	
	public static void main(String[] args) {
		System.out.println("Main");
		new Program1();
		new Program1();
		new Program1();
		new Program1();
	}
	static {
		System.out.println("Static Block 2");
	}
}
