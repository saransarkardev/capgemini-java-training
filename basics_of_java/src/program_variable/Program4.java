package program_variable;

public class Program4 {
	public static void main(String[] args) {
		
		// Type Casting --> Implicit
        // Implicit Type casting (Widening) --> conveting from smaller datatype capacity to bigger datatype capacity. (By Compiler)
        byte a = 10; // 1 byte
        int b = a; // 4 byte
        System.out.println(b);

      
        // Explicit Type casting (Narrowing) --> conveting from bigger datatype capacity to smaller datatype capacity.
        int c = 10; // 4 byte
        byte d = c;
        // System.out.println(d); --> Compilation error.
	}
}
