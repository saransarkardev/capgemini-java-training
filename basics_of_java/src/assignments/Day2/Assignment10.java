package assignments.Day2;

////Capgemini Training Day 2 --> Assignment 10
// Write a program to check a given number is an Armstrong Number or not, and return a suitable message.

public class Assignment10 {
	public static void main(String[] args) {
		int n = 153;
		
		if (n <= 0) {
			System.out.println("Not a Armstrong number");
			return;
		}
		
		int count = 0;
		int temp = n;
		while (temp > 0) {
			temp /= 10;
			count++;
		}
		
		temp = n;
		int sum  = 0;
		while (temp > 0) {
			int digit = temp%10;
			
			// Calculating the digit^count
		    int product = 1;
		    for (int i = 0; i < count; i++) {
		    	product *= digit;
		    }
		    
		    sum += product;
		    
			temp /= 10;
		}
		
		if (n == sum) {
			System.out.println("It is an Armstrong number");
		}
		else {
			System.out.println("It is an not Armstrong number");
		}
	}
}
