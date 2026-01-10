package methods;

public class Program2 {
	// Recursion --> Stack overflow Error  --> Inside JVM there is stack area and when the memory.
	// Local variable and function will be executed in stack area.
	public static void main(String[] args) {
		System.out.println("In the main method");
		test();
	}
	public static void test() {
		System.out.println("In the test method");
		test();
	}
}
