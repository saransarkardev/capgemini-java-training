package flowControlStatement.Decision_statement;

public class Program4 {
	public static void main(String[] args) {
		// WAP to check whether a number is special number or not.
		
		int num = 29;
		int temp = num;
		int last = num%10;
		int first = num/10;
		int sum = last+first;
		int product = last*first;
		if((sum+product) == temp)
			
				System.out.println("Special 2 digit Number");
		else 
			System.out.println("Not a Special 2 digit Number");
	}
}
