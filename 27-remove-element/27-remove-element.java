class Solution {
    public int removeElement(int[] nums, int val) {
        int nonTarget =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[nonTarget++]=nums[i];
            }
        }
        return nonTarget;

    }
}