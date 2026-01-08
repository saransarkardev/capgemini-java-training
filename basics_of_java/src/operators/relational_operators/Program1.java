package operators.relational_operators;

public class Program1 {
	public static void main(String[] args) {
		// 'A' --> ASCII
		// "A" --> hashCode --> hashFunction
		
		boolean res = 10<20;
		System.out.println(res);
		
		res = 'A' < 'B';
		System.out.println(res);
		
		res = "A" == "B";
		System.out.println(res);
		
		res = "A" != "B";
		System.out.println(res);
		
		res = true != false;
		System.out.println(res);
		
		// byte, short, int, long, char --> >,<,>=,<=,==,!= 
		// String, boolean --> ==, !=.
	}
}
