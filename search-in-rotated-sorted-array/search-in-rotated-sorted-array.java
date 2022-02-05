class Solution {
    public int search(int[] nums, int target) {
     int l =0;
        int r = nums.length-1;
        while(l<=r){
            int m = l+(r-l)/2;
            if(nums[m]==target){
                return m;
            }
            
            //left is sorted
            if(nums[l]<=nums[m]){
                // element exists in left
                if(target<=nums[m] && target>=nums[l])
                r=m-1;
                else
                   l= m+1; 
            }else{
                // exists in right part
                if(target>=nums[m]&&target<=nums[r])
                l=m+1;
                else
                r=m-1;
            }
        }
        
        return -1;
    }
}