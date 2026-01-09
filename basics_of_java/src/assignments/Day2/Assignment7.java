package assignments.Day2;

//Capgemini Training Day 2 --> Assignment 7

// int num = 5  ----> until the given number what are series are available to print all those.
//o/p:-  0 1 1 2 3

public class Assignment7 {
	public static void main(String[] args) {
		int num = 8;
		
		if (num <= 0) {
            System.out.println("Input must be greater than 0");
            return;
        }
		
		int first = 0;
		if (first < num) System.out.println(first);
		int second = 1;
		if (second < num) System.out.println(second);
		int last = first + second;
		while (last < num) {
			System.out.println(last);
			first = second;
			second = last;
			last = first+second;
		}
	}
}
