class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int evenPointer = 0;
        int oddPointer = 1;
        int len = nums.length;
        while(evenPointer<len && oddPointer<len){
            while(evenPointer<len&& nums[evenPointer]%2==0)
                evenPointer+=2;
            
            while(oddPointer<len&& nums[oddPointer]%2!=0)
                oddPointer+=2;
            
            if(evenPointer<len && nums[evenPointer]%2!=0 || oddPointer<len&& nums[oddPointer]%2==0){
                swap(nums, evenPointer, oddPointer);
            }
        }
        return nums;
    }
    private void swap(int[] nums, int l, int r){
        int temp= nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
        return;
    }
}