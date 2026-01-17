package inheritance;

public class B extends A{
	
	static int j = 5;
	public static void main(String[] args) {
		System.out.println(A.i);
		System.out.println(B.i);
		
		B.print();
		
	
		System.out.println(B.j);
		// System.out.println(A.j); --> A class can't access B class Memebers
	}
}

// i --> A,B --> Generalized memebers
// j --> B --> specialized member