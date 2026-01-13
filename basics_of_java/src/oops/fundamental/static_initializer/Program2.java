package oops.fundamental.static_initializer;

public class Program2 {
//	Before main method .....initializers are executed first.
//	All the static initializers will execute first line by line before executing the main method.
	
	static int i = 20; // Single line initializer
	
	static { // Multi line initializer
		i = 30;
		System.out.println(i);
		System.out.println("Static Initilaizer");
		i = test1();
	}
	public static void main(String[] args) {
		System.out.println("Main Start");
		System.out.println(i);
		System.out.println("Main End");
	}
	public static int test1() {
		System.out.println("Test1");
		System.out.println(i);
		return 10;
	}
	
	static {
		System.out.println("Static Initializer Block 2");
	}
}
