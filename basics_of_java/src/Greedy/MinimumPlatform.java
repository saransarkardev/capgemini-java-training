package Greedy;

import java.util.Arrays;

public class MinimumPlatform {
	public static int findPlatform(int[] Arrival, int[] Departure) {

		int n = Arrival.length;

		Arrays.sort(Arrival);
		Arrays.sort(Departure);

		int i = 0, j = 0;
		int ans = 1, count = 0;

		while (i < n && j < n) {
			if (Arrival[i] <= Departure[j]) {
				count++;
				i++;
			} else {
				count--;
				j++;
			}
			ans = Math.max(ans, count);
		}

		return ans;

	}
	public static void main(String[] args) {
		int[] Arrival = {900, 940, 950, 1100, 1500, 1800};
		int[] Departure = {910, 1200, 1120, 1130, 1900, 2000};
		
		System.out.println(findPlatform(Arrival, Departure));
	}
}
