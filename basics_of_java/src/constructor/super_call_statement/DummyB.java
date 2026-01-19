package constructor.super_call_statement;

public class DummyB extends DummyA{
	static String b1 = "b1 variable";
	
	public static void b1(){
		System.out.println("Static b1()");
	}
	static{
		System.out.println("DummyB static init");
	}
	String b2 = "b2 variable";
	public void b2(){
		System.out.println("Non-static b2()");
	}
	{
		System.out.println("DummyB Non-static init");
	}
	public DummyB(){
		// super(); --> by default added by compiler
		System.out.println("DummyB Const");
	}
	
	
	public static void main(String[] args){
		System.out.println("DummyB Main");
	}
}
