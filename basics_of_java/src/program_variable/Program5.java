package program_variable;

public class Program5 {
	public static void main(String[] args) {
        // Type Casting
        // Implicit Type casting (Widening) --> conveting from smaller datatype capacity to bigger datatype capacity. (By compiler
        char a = 'A'; // 2 byte
        int b = a; // 4 byte
        System.out.println(b); // Output --> 65

        
        // Explicit Type casting (Narrowing) --> conveting from bigger datatype capacity to smaller datatype capacity.
        int c = 65; // 4 byte
        char d = c; // 2 byte
        // System.out.println(d); --> Compilation error.
    }
}
