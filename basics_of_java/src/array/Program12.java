package array;

// WAP to print all sub arrays of a array.

public class Program12 {
	public static void main(String[] args) {
		int[] nums = {3,6,7};
		
		//Approach 1
		//Time --> O(n^3) Aux Space --> O(1)
//		for (int i=0; i<nums.length; i++) {
//			for (int j=i; j<nums.length; j++) {
//				for (int k=i; k<=j; k++) {
//					System.out.print(nums[k]+" ");
//				}
//				System.out.println();
//			}
//		}
		
		
		//Approach 2: String concatenation
		//Time --> O(n^2) Aux Space --> O(n)..creating new string every time.
		for (int i=0; i<nums.length; i++) {
			String str = "";
			for (int j=i; j<nums.length; j++) {
				str = str + nums[j];
				System.out.println(str);
			}
		}
	}
}
