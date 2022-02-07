class Solution {
    public int findMin(int[] nums) {
        
           int l=0;
        int r=nums.length-1;
        int n = nums.length-1;
        int ans =-1;
        // [3,1,3]
        // [5,1,3]
        // [3,3,1,3]
        while(l<=r){
           
            while(l<r && nums[l]==nums[r]) l++;
             int m = l+(r-l)/2;
            //while(m<r&& nums[m]==nums[r]) r--;
          //  System.out.println("l "+l+"r "+r);
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