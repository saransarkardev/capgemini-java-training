package methods;

//WAP to check if a number is sunny number or not.

public class Method7 {
	public static void main(String[] args) {
		int n = 3;
		checkSunnyNumber(n+1);
	}
	public static void checkSunnyNumber(int n) {
		if (n <= 1) {
			System.out.println("Not sunny number");
			return;
		}
		for (int i=1; i*i<=n; i++) {
				if (i*i == n) {
					System.out.println("Sunny Number");
					return;
				}
		}
		System.out.println("Not sunny number");
	}
}
