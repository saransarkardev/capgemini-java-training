package array;

import java.util.Arrays;
import java.util.Scanner;

public class Program13 {
	public static void main(String[] args) {
		int[] arr = {101,102,104,105,106};
		int n = arr.length;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to insert: ");
		int num = sc.nextInt();
		
		int[] ans = new int[n+1];
		
		int i = 0;
		int pos = 0;
		while (i < n) {
			if (arr[i] <= num) {
				pos = i;
			}
			else if (arr[i] > num) break;
			i++;
		}
		
		for (i=0; i<=pos; i++) {
			ans[i] = arr[i];
		}
		ans[i] = num;
		for (i=pos+1; i<arr.length; i++) {
			ans[i+1] = arr[i];
		}
 
		System.out.println(Arrays.toString(ans));
		
		
	}
}
