package program_variable;

public class Program2 {
	
	// Global variables (JVM will assign default values)
	//Declaration purpose
	static byte by;
	static short s;
	static int i;
	static long l;
	static double d;
	static float f;
	static char c;
	static boolean bo;
	
	
	public static void main(String[] args) {
//		Default value given by jvm to these variables.
//		Numeric types --> Output = 0 or 0.0
//		char types --> null character 
//		boolean types --> false;
//		object types --> null
		System.out.println(by);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(d);
		System.out.println(f);
		System.out.println(c);
		System.out.println(bo);
		
	}
}
