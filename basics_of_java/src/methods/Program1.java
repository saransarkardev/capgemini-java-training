package methods;

public class Program1 {
	public static void main(String[] args) {
		
		// No argument method
		demo(); //method signature
		
		// Parameterized Method
		test(10); // --> actual argument
		
		//Formal Argument --> declaring variable. (accepting parameter in function)
		// Actual Argument ---> calling a method.
	}
	public static void demo() {
		
	}
	public static void test(int a) {
		System.out.println("Test");
	}
}
