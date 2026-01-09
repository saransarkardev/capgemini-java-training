package operators.logical_operators;

public class Program2 {
	public static void main(String[] args) {
		// Logical OR --> || --> depends on a true value
		System.out.println(true && false && true);
		
		int a = 5;
		// once any condition will get true...it will not check the other conditions on the right side.
		// If we get a condition true then control flow will come out.
		System.out.println(a>10 && ++a>a);
	}
}
