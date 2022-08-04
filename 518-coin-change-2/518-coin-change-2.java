class Solution {
// no of subsets/combinations = target
 // unbounded knapsack 
    public int change(int amount, int[] coins) {
        int l = coins.length;
        int[][] dp = new int[l + 1][amount + 1];

        for (int i = 0; i < l + 1; i++) {
            for (int j = 0; j < amount + 1; j++) {
                if (i == 0) continue;
                  else if (j == 0) { // empty subset
                    dp[i][j] = 1;
                } else {
                    if (coins[i - 1] <= j) { // take the coin + don't take the coin
                        dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j]; // + as we need ways
                    } else
                      dp[i][j] = dp[i - 1][j]; // don't take the coin
                }
            }
        }
      // System.out.println(Arrays.deepToString(dp));

        return dp[l][amount];
    }
}
