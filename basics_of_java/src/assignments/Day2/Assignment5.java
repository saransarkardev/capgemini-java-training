package assignments.Day2;

//Capgemini Training Day 2 --> Assignment 5

//WAP to check whether a number is Automorphic no. of not.

public class Assignment5 {
	public static void main(String[] args) {
		int n = 25;
		int sq = n*n;
		boolean flag = false;
		
		while (n > 0) {
			int digit1 = sq%10;
			int digit2 = n%10;
			
			if (digit1 != digit2) {
				flag = true;
				break;
			}
			n /= 10;
			sq /= 10;
		}
		
		if (flag == true) 
			System.out.println("Not a automorphic no.");
		else 
			System.out.println("a automorphic no.");
		
	}
}
