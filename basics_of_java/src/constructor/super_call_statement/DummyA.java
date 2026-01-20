package constructor.super_call_statement;

public class DummyA {
	
	static String a1 = "a1 variable";
	
	public static void a1() {
		System.out.println("Static a1()");
	}
	
	// non Static block
	static {
		System.out.println("Dummy static init");
	}
	String a2 = "a2 variable";
	
	public void a2(){
		System.out.println("Non-static a2()");
	}
	// non Static block
	
	{
		System.out.println("DummyA Non-static init");
	}
	public DummyA(){
		super();
		System.out.println("DummyA Const");
	}
	
	public static void main(){
		System.out.println("DummyA Main");
	}
}
