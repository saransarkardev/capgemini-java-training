package oops.fundamental.non_static;

public class Program1 {
	int a;
	public static void main(String[] args) {
		// Every time we use new keyword a new memory block will be created in the heap memory.
		
		//After creating a object in heap memory it will return a object reference as className@hexaDecimal
		//Every Object will have different reference value.
		System.out.println(new Program1());
//		Program1@3b94d659 --> Object Reference value
		System.out.println(new Program1());
//		Program1@24b1d79b --> Object Reference value
		
		Program1 p1 = new Program1();
		System.out.println(p1.a);
	}
}
