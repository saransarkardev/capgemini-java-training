package constructor.super_call_statement;

public class TestB extends TestA{
	public TestB() {
		super(10);
		System.out.println("Test B");
	}
	
	public static void main(String[] args) {
		TestB obj = new TestB();
		
	}
}
