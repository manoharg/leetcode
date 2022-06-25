class Solution {
    public int lengthOfLIS(int[] nums) {
        int n= nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        for(int i=n-2;i>=0;i--){
            for(int j=i+1;j<n;j++){
                if(nums[i]<nums[j])
                    dp[i]= Math.max(dp[i], 1+dp[j]);
            }
        }
        int ans = Integer.MIN_VALUE;
        for(int i : dp)
            ans = Math.max(ans,i);
        return ans;
    }
}