class Solution {
    public int maxProfit(int[] prices) {
       if(prices==null||prices.length==1)
           return 0;
        int l = prices.length;
        int[] lar=new int[l];
        lar[l-1]=prices[l-1];
        int max = lar[l-1];
        for(int i=l-2;i>=0;i--){
            max=Math.max(max,prices[i]);
            lar[i]=Math.max(max,prices[i]);
            
        }
        int ans =0;
        for(int i=0;i<l;i++){
            ans = Math.max(ans, lar[i]-prices[i]);
        }
        return ans;
    }
}