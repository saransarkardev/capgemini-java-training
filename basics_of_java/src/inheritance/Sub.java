package inheritance;

public class Sub extends Super{
	
	// i
	// print()
	
	static int j = 20;
	
	static {
		System.out.println("Sub class Static block");
	}
	
	public static void test() {
		System.out.println("test()");
	}
	
	public static void main(String[] args) {
		
	}
	
}	

//super class will always load first then the sub class.
// private members(variable, methods) can not be inherited.
