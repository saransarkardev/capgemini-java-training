package assignments.Day2;

//Capgemini Training Day 2 --> Assignment 3

public class Assignment3 {
// perfect square program
//1- 100 print no. of perfect square 1 to 100
//	1,4,9,16,25,36,49,64,81,100
	public static void main(String[] args) {
		
		int i=1;
		while (i*i<=100) {
			int square = i*i;
			System.out.print(square + " ");
			i++;
		}
	}
}
