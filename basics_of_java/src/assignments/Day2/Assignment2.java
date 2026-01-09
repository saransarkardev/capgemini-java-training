package assignments.Day2;

//Capgemini Training Day 2 --> Assignment 2

// WAP to convert Binary to Decimal
public class Assignment2 {
	public static void main(String[] args) {
		int n = 10; //1010
		int mul = 1;
		int sum = 0;
		while (n > 0) {
			int digit = n%2;
			sum = sum + digit*mul;
			n /= 2;
			mul *= 10;
		}
		System.out.println(sum);
	}
}
