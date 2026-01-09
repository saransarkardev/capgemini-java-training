package operators.increment_decrement_operator;

public class Program2 {
	public static void main(String[] args) {
		// Post increment --> print/perform operations/store after that incement the value.
		int a = 2;
		int b = a++ + 30;
		int c = b++ + a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
}
