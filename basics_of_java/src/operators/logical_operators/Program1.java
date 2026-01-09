package operators.logical_operators;

public class Program1 {
	public static void main(String[] args) {
		// Logical AND --> && --> depends on a false value
		System.out.println(true && false && true);
		
		int a = 5;
		// once any condition will get false...it will not check the other conditions on the right side.
		// If we get a condition false then control flow will come out.
		System.out.println(a>10 && ++a>a);
	}
}
