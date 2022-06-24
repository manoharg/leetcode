class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] ret = new int[n];
        for(int i=0;i<n;i++){
            if(i==0|| ret[i-1]+ nums[i]<nums[i])
                ret[i] = nums[i];
            else{
                ret[i] = ret[i-1]+ nums[i];
            }
                
        }
       // System.out.println(Arrays.toString(ret));
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            ans = Math.max(ans, ret[i]);
        }
        return ans;
    }
}