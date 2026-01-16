package user_input;
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// After same it will not take the other strings in the line.
		String s = sc.next();
		System.out.println(s);
		
		// nextLine will take the whole sentence until space is entered.
		String s1 = sc.nextLine();
		System.out.println(s1);
		
		
		// next().charAt(0) --> here Method chaining is used...in this way we can take character input.
		char ch = sc.next().charAt(0);
		
		
		
	}
}
