class Solution {

    public int numberOfArithmeticSlices(int[] nums) {
        if (nums == null || nums.length < 3) return 0;
        int l = nums.length;
        int[] dp= new int[l];
        if(nums[1]-nums[0]==nums[2]-nums[1])
            dp[2]=1;
        int count=dp[2];
        for (int i = 3; i < l; i++) {
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                dp[i]= dp[i-1]+1;
                count+=dp[i];
            }       
        }
        return count;
    }
}
