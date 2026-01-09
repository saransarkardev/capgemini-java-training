package assignments.Day2;

//Capgemini Training Day 2 --> Assignment 4

//WAP to check whether a number is Neon number or not.

public class Assignment4 {
	public static void main(String[] args) {
		int n = 9;
		int square = n*n;
		int sum = 0;
		while (square > 0) {
			int digit = square%10;
			sum += digit;
			square /= 10;
		}
		
		if (sum == n) {
			System.out.println("Neon Number");
		}
		else {
			System.out.println("Not a Neon Number");
		}
	}
}
