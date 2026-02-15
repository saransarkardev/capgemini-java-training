package dp;
import java.util.Arrays;
public class ZeroOneknapsackMemoization {
    private static int knapsack(int[] wt, int[] val, int n, int capacity, int[][] dp) {

        if (n == 0 || capacity == 0) {
            return 0;
        }

        if (dp[n][capacity] != -1) return dp[n][capacity];

        if (wt[n-1] <= capacity) {
            return dp[n][capacity] = Math.max(val[n-1] + knapsack(wt, val, n-1, capacity-wt[n-1], dp),
            knapsack(wt, val, n-1, capacity, dp));
        }
        return dp[n][capacity] =  knapsack(wt, val, n-1, capacity, dp);
    }
    public static int knapsack01(int[] wt, int[] val, int n, int W) {
        int[][] dp = new int[n+1][W+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return knapsack(wt, val, n, W, dp);
    }
    public static void main(String[] args) {
		
    	int[] val = {10, 40, 30, 50};
    	int[] wt = {5, 4, 6, 3};
    	int n = 4;
    	int W = 10;
    	System.out.println(knapsack01(wt, val, n, W));
	}
}
