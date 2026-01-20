package object_class;

public class Dummy {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		
		Dummy d1 = new Dummy();
		Dummy d2 = new Dummy();
		
		
		System.out.println(a == b); // in case of primitive it will compare the values
		System.out.println(d1 == d2); // in case of non primitive it will compare the address
		
		
		System.out.println(d1.equals(d2)); // in case of equals also it checks the object reference. but we can override equals() method according to our need.
	}
}
