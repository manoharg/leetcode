class Solution {
    public int coinChange(int[] coins, int amount) {
      int l = coins.length;
       int[][] dp = new int[l+1][amount+1];
      for(int i=0;i<l+1;i++){
        for(int j=0;j<amount+1;j++){
          if(i==0){
            dp[i][j]= Integer.MAX_VALUE-1;
            
          }else if(j==0){
            dp[i][j]=0;
            
          }else{
            if(coins[i-1]<=j){
              dp[i][j]= Math.min(dp[i-1][j], 1+dp[i][j-coins[i-1]]);
            }else{
              dp[i][j]=dp[i-1][j];
            }
          }
        }
      }
      return dp[l][amount] == Integer.MAX_VALUE-1 ? -1: dp[l][amount];
    }
}