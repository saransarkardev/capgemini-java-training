package methods;

public class Program6 {
	public static void main(String[] args) {
		/* 
		 * Compile Time Binding
		 * Static Bindng
		 * Compile Time Polymorphism
		 */
		
		/* 
			Compiler will check for:-
				* Similar type.
				* If not found compiler will go for widening.
		 */
		
		num(1,2);
		num('A',20.5);
		
		// Compiler --> Actual Argument
		/* Process of binding between method call
		 	statement and implementation of the method 
		 	during complilation by the compiler based on 
		 	actual argument.
		 */
	}
	public static void num(int a, int b) {
		// It is not method body ...
		// It is method Implementation
		System.out.println("int, int");
	}
	public static void num(double a, double b) {
		System.out.println("double, double");
	}
//	public static void num(int a, char b) {
//		System.out.println("int, char");
//	}
//	public static void num(double a, char b) {
//		System.out.println("double, char");
//	}
}

