class Solution {
    public int findMin(int[] nums) {
        /*
        Find the first false
        if mid > last num -> T
        [3,4,5,1,2] -> T T T F F
        [1,2,3,4] -> F F F F
        [4,3,2,1] -> T T T F // n = infinity
    
        */
        
        int l=0;
        int r=nums.length-1;
        int n = nums.length-1;
        int ans =-1;
        while(l<=r){
            int m = l+(r-l)/2;
            if(nums[m]>nums[n]){
                l=m+1;
            }else{
                ans=nums[m];
                r=m-1;
            }
        }
        return ans;
    }
}