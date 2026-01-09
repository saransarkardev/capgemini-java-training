package looping_statements.dowhile_loop;

public class Program2 {
	public static void main(String[] args) {
		int n = 26;
		
		if (n <= 1) {
			System.out.println("not perfect");
			
		}
		int sum = 1;
		int i = 2;
		while (i*i <= n) {
			if (n%i == 0) {
				sum += i;
				if (n/i != i) {
					sum += n/i;
				}
			}
			i++;
		}
		
//		int sum = 1;
//		for (int i=2; i*i<=n; i++) {
//			if (n%i == 0) {
//				sum += i;
//				if (n/i != i) {
//					sum += n/i;
//				}
//			}
//		}
		
		if (sum == n) {
			System.out.println("pefect");
		}
		else 
			System.out.println("not perfect");
	}
}
