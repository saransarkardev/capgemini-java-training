package methods;

// WAP to check if a number is strong number or not.

public class Method8 {
	public static int factorial(int n) {
		int fact = 1;
		for (int i=1; i<=n; i++) 
				fact *= i;
		return fact;
	}
	public static void main(String[] args) {
		int n = 144;
		int original = n;
		int sum = 0;
		while (n > 0) {
			int digit = n%10;
			sum += factorial(digit);
			n /= 10;
		}
		
		if (sum == original) {
			System.out.println("Strong number");
		}
		else {
			System.out.println("Not a strong number");
		}
	}
}
