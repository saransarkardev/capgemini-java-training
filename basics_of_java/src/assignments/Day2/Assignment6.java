package assignments.Day2;

//Capgemini Training Day 2 --> Assignment 6

//WAP to check if a number is evil no. or not. 

public class Assignment6 {
	public static void main(String[] args) {
		int n = 10; //1010

		int count =  0;
		while (n > 0) {
			int digit = n%2;
			if (digit == 1) count++;
			n /= 2;
		}
		
		// No. of 1's is even then it is evil no.
		if (count%2 == 0) 
			System.out.println("It is an Evil No.");
		else 
			System.out.println("It is not an Evil No.");
			
	}
}
