package dp;

public class ZeroOneKnapsackTabulation {
	    public static int knapsack(int[] weight, int[] value, int W, int n) {
    
	        // dp[i][w] = max value using first i items with capacity w
	        int[][] dp = new int[n + 1][W + 1];

	        // Build table dp[][] in bottom-up manner
	        for (int i = 1; i <= n; i++) {
	            for (int w = 0; w <= W; w++) {

	                // If current item's weight is less than or equal to capacity
	                if (weight[i - 1] <= w) {

	                    // Take OR not take the item
	                    dp[i][w] = Math.max(
	                        value[i - 1] + dp[i - 1][w - weight[i - 1]], // take
	                        dp[i - 1][w]                                // not take
	                    );
	                } 
	                else {
	                    // Cannot take item
	                    dp[i][w] = dp[i - 1][w];
	                }
	            }
	        }

	        return dp[n][W]; // final answer
	    }

	    public static void main(String[] args) {

	        int[] weight = {2, 3, 4, 5};
	        int[] value  = {3, 4, 5, 6};

	        int W = 5;               // Knapsack capacity
	        int n = weight.length;  // Number of items

	        System.out.println("Maximum value: " + knapsack(weight, value, W, n));
	    }
}

