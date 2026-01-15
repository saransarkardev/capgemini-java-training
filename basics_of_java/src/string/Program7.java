package string;

public class Program7 {
	public static void main(String[] args) {
		
		// The string is: P r o g r a m m i n g
		// Indexes:       0 1 2 3 4 5 6 7 8 9 10
		String s="Programming";
		
		// Returns a substring starting from index 2 up to the end of the string.
		// Index 2 = 'o', so the result is "ogramming"
		System.out.println(s.substring(2));
		
		// Returns a substring starting from index 1 up to index 5 (excluding index 5).
		// Characters at index 1 to 4 → 'r','o','g','r'
		// So the result is "rogr"
		System.out.println(s.substring(1,5));
	}
}
