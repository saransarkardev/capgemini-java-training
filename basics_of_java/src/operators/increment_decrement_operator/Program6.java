package operators.increment_decrement_operator;

public class Program6 {
	public static void main(String[] args) {
		
		// Mix of post increment, pre increment, post decrement and pre decrement.
		int a = 5;
		int b = a++ + --a + a--;
		int c = b++ + ++a + a-- + --b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
