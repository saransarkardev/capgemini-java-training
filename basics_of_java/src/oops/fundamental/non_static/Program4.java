package oops.fundamental.non_static;

public class Program4 {
	// static members will load in class static area.
	// non static members will load inside a object.
	int i=3; // non static member..
	static String s = "Hello"; // static member.
	public static void main(String[] args) {
		
		Program4 obj1 = new Program4();
		
		Program4 obj2 = new Program4();
		
		// Equality operator == is used to check the references of objects. 
		System.out.println(obj1 == obj2); // Output --> false
		//obj1 and obj2 will have different reference values.
		
		
		// we can access static members with the help of object also but it is not recommended.
		// Accessing static members with className is recommended.
		//static members are shared
		// non static members(example--> instance variables) are not shared.(Every object will have its own instance variable)
	}
}
