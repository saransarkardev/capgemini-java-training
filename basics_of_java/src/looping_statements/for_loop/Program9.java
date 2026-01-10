package looping_statements.for_loop;

public class Program9 {
	public static void main(String[] args) {
		int n = 3;
		for (int row=1; row<=n; row++) {
			for (int col=1; col<=n; col++) {
				if (row+col <= n+1) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
