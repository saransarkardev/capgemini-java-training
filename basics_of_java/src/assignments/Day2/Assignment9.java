package assignments.Day2;

//Capgemini Training Day 2 --> Assignment 9.

// WAP to check whether a number is Tech number or not.

public class Assignment9 {
	public static void main(String[] args) {
		int n = 2025;
		
		if (n <= 0) {
		    System.out.println("Not a Tech number");
		    return;
		}
		
		// First find the length of the number
		int count = 0;
		int temp = n;
		while (temp > 0) {
			temp /= 10;
			count++;
		}	
		
		// No. is not of even size . Therefore, this is not a Tech number.
		if (count%2 != 0) {
			System.out.println("This is not a Tech no.");
			return;
		}
		count = count/2;
		
		int num2 = 0;
		int mul = 1; 
		int num1 = n;
		while (count > 0) {
			int digit = num1%10;
			num2 = num2 + digit*mul;
			num1 /= 10;
			mul *= 10;
			count--;
		}
		
		// We go two separate halves..num1, num2.
		int sum = num1+num2;
		int square = sum*sum;
		
		if (square == n) 
			System.out.println("It is a Tech number");
		else 
			System.out.println("It is not a Tech number");
		
		
	}
}
