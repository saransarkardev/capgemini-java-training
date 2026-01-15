package stringbuilder;

public class Program1 {
	public static void main(String[] args) {
		
		// StringBuilder is a class
		StringBuilder sb = new StringBuilder();
		// The default capacity of the StringBuilder object will be 16.
		// If the length of the characters of the stringBuilder object changes then the capacity will increase to (old capacity x 2) + 2. 
		sb.append("123445667788");
	}
}
