class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] buks = new int[101];
        for(int n: nums){
            buks[n]++;
        }
        int[] ret = new int[nums.length];
        for(int i=1;i<101;i++)
            buks[i]+=buks[i-1];
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                ret[i]=0;
            else{
                ret[i] = buks[nums[i]-1];
            }        
        }
        
        return ret;
    }
}