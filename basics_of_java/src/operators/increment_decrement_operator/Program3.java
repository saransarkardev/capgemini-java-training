package operators.increment_decrement_operator;

public class Program3 {
	public static void main(String[] args) {
		// Pre increment --> update the value and after that print/perform operations/store.
		int a = 3;
		int b = ++a + a++;
		int c = b++ + ++a + b++ + a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
