package assignments.Day2;

//Capgemini Training Day 2 --> Assignment 1
// You are given two positive integers, m and n. Find the sum of all numbers in the range from 1 to m (both inclusive) that are not divisible by n. Then, find the sum of all numbers in the same range that are divisible by n. Finally, return the difference between the sum of numbers not divisible by n and the sum of numbers divisible by n.

public class Assignment1 {
	public static void main(String[] args) {
		int m = 20;
		int n = 4;
		
		
		int i = 1;
		int sumDivisible = 0;
		int sumNotDivisible = 0;
		while (i<=m) {
			// These numbers are divisible by n.
			if (i%n == 0) {
				sumDivisible += i;
			}
			// These numbers are not divisible by n.
			else {
				sumNotDivisible += i;
			}
			i++;
		}
		
		System.out.println("Difference is " + (sumNotDivisible - sumDivisible));
	}
}
