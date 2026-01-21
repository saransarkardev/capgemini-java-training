package abstraction._interface;


interface I2{
	final static int a = 10;
	
	public static void m() {
		System.out.println("m()");
	}
}

interface I3{
	final static int a = 20;
	
	public static void m() {
		System.out.println("m()");
	}
}

public class Demo implements I2 , I3{
	public static void main(String[] args) {
		
		// System.out.println(a); --> not able to access directly a as it is getting confused which a to print.
		// m(); --> not able to access directly.
		I2.m();
	}
}
