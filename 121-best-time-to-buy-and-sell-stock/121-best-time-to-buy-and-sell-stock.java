class Solution {
    public int maxProfit(int[] prices) {
       if(prices==null||prices.length==1)
           return 0;
        int l = prices.length;
        int ans=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<l;i++){
            ans =Math.max(ans, prices[i]-min);
            min=Math.min(prices[i],min);
        }
        return ans;
    }
}