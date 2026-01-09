package assignments.Day2;

//Capgemini Training Day 2 --> Assignment 8

//Write a program to find the Square Root Of a given number.

public class Assignment8 {
	public static void main(String[] args) {
		int n = 17;
		
		if (n < 0) {
		    System.out.println("Square root does not exist for negative numbers.");
		    return;
		}
		
		boolean flag = false;
		
		for (int i=0; i*i <= n; i++) {
			if (i*i == n) {
				System.out.println(i);
				flag = true;
			}
		}
		// Square root of n does not exists.
		if (flag == false) {
			System.out.println("Square root of "+ n + " does not exists.");
		}
	}
}
