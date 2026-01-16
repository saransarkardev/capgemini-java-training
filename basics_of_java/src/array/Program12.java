package array;

public class Program12 {
	public static void main(String[] args) {
		int[] nums = {3,6,7};
		
		for (int i=0; i<nums.length; i++) {
			for (int j=i; j<nums.length; j++) {
				System.out.print(j);
			}
		}
	}
}
