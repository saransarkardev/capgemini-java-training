package methods;

public class Program3 {
	public static void main(String[] args) {
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));
	}
	// Method Overloading
	//	Rules
	/*
	 	method should be same name
	 	change in formal argument
	 		* length
	 		* order of declaration
	 
	 
	 */
	public static int add(int a, int b) {
		return a+b;
	}
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
}
