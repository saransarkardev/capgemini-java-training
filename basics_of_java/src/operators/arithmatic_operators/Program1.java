package operators.arithmatic_operators;

public class Program1 {
	// Arithmatic Operator
	public static void main(String[] args) {
		
//		NOTE: Every operator will have precedence(top to button) and Associavity(left to right).
		
//		NOTE: Every Return value and Type of the value.
		
		// Addition (+)
		// Normal, Concatenation
		int a = 10;
		int b = 30;
		
		System.out.println(a+b);
		
		System.out.println(""+10+10);
		System.out.println(10+30+"Hello"+20);
		System.out.println(10+20*2);
		System.out.println(10/30*2);
		System.out.println(5/2); // int/int = int
		System.out.println(5/2.0); // int/double = double
		
		char c = 'A';
		System.out.println(c+32);
		System.out.println('A' + 'B'); // Output = 131 (65+66)
		System.out.println("A"+"B"); // Output = AB
		
	}
}
