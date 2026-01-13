package oops.fundamental.static_initializer;

public class Program1 {
	
//	Before main method .....initializers are executed first. 
	
	static int i = test();
	
	public static void main(String[] args) {
		System.out.println("Main Start");
		System.out.println(i);
		System.out.println("Main End");
	}
	
	/*
	 	*Loading of class
	 	*Before execution of main method
	 	*Single line initializer
	 	*Multi line initializer
	 */
	public static int test() {
		System.out.println("Test");
		System.out.println(i);
		return 10;
	}
}
