package methods;

public class Program2 {
	// Recursion --> Stack overflow Error  --> Inside JVM there is stack area and when the memory.
	// Local variable and function will be executed in stack area.
	public static void main(String[] args) {
		System.out.println("Main Start");
		test();
		System.out.println("Main End");
	}
	public static void test() {
		System.out.println("Test Start");
		test(); // Infinite Recursion --> No base case
		System.out.println("Test End");
	}
}
// Types of return type
// void 
// primitive --> int, char, long, byte, short etc
// non primitive -> String

// return data --> value returned by the method.
// return type --> Data type of the value return by the method.