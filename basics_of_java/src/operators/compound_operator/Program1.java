package operators.compound_operator;

public class Program1 {
	public static void main(String[] args) {
		
		
		int a = 10;
		a += 10;
		// Compound Assignment Operator --> implicit type casting --> double to int (data loss will be there)
		a += 10.5;
		System.out.println(a);
		
		int b = 20;
		// We have to do explicit type cast here (narrowing) --> double(8byte) to int(4byte)
		b = b + 10.5;
		
	}
}
