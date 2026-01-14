package oops.fundamental.non_static;

public class Program2 {
	
	// Instance variable or object variable. (non static members)
	int a;
	double d;
	byte b;
	String s;
	
	public static void main(String[] args) {
		// We are accessing both a and d from two different objects.
		System.out.println(new Program2().a);
		System.out.println(new Program2().d);
		System.out.println(new Program2().b);
		System.out.println(new Program2().s);
		
		//In obj1 ...object reference will be stored.
		// Inside reference variable/non primitive data type we can store object reference and null only.
		Program2 obj1 = new Program2();
		System.out.println(obj1);

	}
}
