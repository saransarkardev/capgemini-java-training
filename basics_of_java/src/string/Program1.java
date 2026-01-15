package string;

public class Program1 {
	// we do not need to import String, System class to use it as it is automatically imports the java.lang package.
	public static void main(String[] args) {
		
		// We can declare a Stirng in two ways
		
		String str = "IIT Uem"; // It will be created in heap area inside String constant pool area.
		
		String s2 = new String("IIT Dholakpur"); // It will be created in heap area (not in String constant pool area).
		
		// a object is created as hello as character array in heap area (String constant pool) and it will return an object reference and it will be stored in s.
		String s = "Hello";
		
		// Here another object is created as "hi" in String constant pool and now it will return an object reference and now s will be updated with new object reference "hi".
		s = "Hi";
		
		
		// Here Hello object is already present in String constant pool , therefore, now no more "Hello" will be created in string constant pool area ....and it will return the previous object reference which it already had and s1 will store the object refernce.
		String s1 = "Hello";
	}
}
