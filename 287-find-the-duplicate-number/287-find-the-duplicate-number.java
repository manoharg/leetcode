class Solution {
    public int findDuplicate(int[] nums) {
       
        for (int n: nums){
            
            if(nums[Math.abs(n)-1] < 0){
                return Math.abs(n);
            }
              else
                  nums[Math.abs(n)-1]*= -1;
           
        }
         return 1;
        
    }
}