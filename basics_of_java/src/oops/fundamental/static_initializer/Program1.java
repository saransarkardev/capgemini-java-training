package oops.fundamental.static_initializer;

public class Program1 {
	
	// Before main method .....initializers are executed first. 
	// static initializers runs once when class is loaded.
	// static members(fields/variables/instance, method, initializers) --> One copy per class — not per object.
	// Access via class name: ClassName.member.
	//Before any static initializer executes, all static fields get their default values (e.g., 0, false, null)
	//Static initializers run only once per class loader (when class is initialized).
	
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
