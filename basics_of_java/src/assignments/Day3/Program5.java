package assignments.Day3;

/* Write a program to print the summation of primary diagonal values if the 2d-array is a square.
To check if a given square matrix is an identity matrix, you need to verify two conditions:
Primary diagonal elements should be 1.
All non-diagonal elements should be 0. */
public class Program5 {
	public static void checkIdentity(int[][] nums) {
		int sum = 0;
		boolean flag = true;
		for (int i=0; i<nums.length; i++) {
			for (int j=0; j<nums[i].length; j++) {
				if (i==j) {
					 sum += nums[i][j];
					 if (nums[i][j] != 1) flag = false;
				}
				else {
					// i != j
					if (nums[i][j] != 0) {
						flag = false;
					}
					
				}
			}	
		}
		
		System.out.println("Sum is "+ sum);
		System.out.println(flag == true ? "Identity Matrix" : "Not a Identity Matrix");
	}
	public static void main(String[] args) {
		int[][] nums = {{1,0,0},{0,1,0},{0,0,1}};
		
		// Edge case
		if (nums.length != nums[0].length) {
			System.out.println("Not a square matrix");
			return;
		}
		
		checkIdentity(nums);
		
		
	}
}
