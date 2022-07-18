class Solution {
    public int maxProfit(int[] prices) {
        int buy =prices[0];
        int ans = Integer.MIN_VALUE;
      for(int i=1;i<prices.length;i++){
        ans = Math.max(ans, prices[i]-buy);
        buy = Math.min(buy, prices[i]);
      }
      if(ans<=0)
        return 0;
      return ans;
    }
}