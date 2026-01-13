package methods;

// Pattern 1

public class Program10 {
	// Rectangle Pattern
	public static void pattern1(int n) {
		for (int row=1; row<=n; row++) {
			for (int col=1; col<=2*n-1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*
	 	*****
	 	 ***
	 	  *
	 */
	public static void pattern2(int n) {
		for (int row=1; row<=n; row++) {
			for (int col=1; col<=2*n-1; col++) {
				if (row <= col && row+col <= 2*n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	/*
 		*   *
 		** **
 		*****
 	*/
	public static void pattern3(int n) {
		for (int row=1; row<=n; row++) {
			for (int col=1; col<=2*n-1; col++) {
				if (row >= col || row+col >= 2*n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	/*
		*****
		** **
		*   *
	*/
	
	public static void main(String[] args) {
//		pattern1(3);
		pattern2(3);
		pattern3(3);
	}
}
