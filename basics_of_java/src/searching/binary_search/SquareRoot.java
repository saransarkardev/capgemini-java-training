package searching.binary_search;

public class SquareRoot {
	private static int findSqrt(int n) {
		
		int low = 1, high = n, ans = -1;
		
		while (low <= high) {
			int mid = low + (high-low)/2;
			
			if (mid*mid == n) {
				return mid;
			}
			else if (mid*mid < n) {
				ans = mid;
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int n = 35;
		
		
		System.out.println(findSqrt(n));
	}
}
