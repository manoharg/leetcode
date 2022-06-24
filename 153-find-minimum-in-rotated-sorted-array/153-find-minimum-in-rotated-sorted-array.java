class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l =0;
        int r= n-1;
        int ans =1;
        while(l<=r){
            int m = l+(r-l)/2;
            if(nums[m]<=nums[n-1]){
                ans = nums[m];
                r=m-1; 
            }else{
                l= m+1;
            }
        }
        return ans;
    }
}