package looping_statements.while_loop;

//WAP to reverse the number

public class Program2 {
	public static void main(String[] args) {
		int n = 1384;
		int sum = 0;
		while (n > 0) {
			int digit = n%10;
			sum = sum*10 + digit;
			n = n/10;
		}
		
		System.out.println(sum);
	}
}
