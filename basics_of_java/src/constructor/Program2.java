package constructor;

public class Program2 {
	
	Program2() {
		System.out.println("Program2 constructor");
	}
	public static void main(String[] args) {
		new Program2();
	}
	{
		System.out.println("Non static block");
	}
}
