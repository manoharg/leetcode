class Solution {
    public void sortColors(int[] nums) {
        int l =0;
        int m =0;
        int h = nums.length-1;
        /*
        a[0...l-1] -> 0
        a[l..m-1] -> 1
        a[h+1...] -> 2
        */
        while(m<=h){
            if(nums[m]==0){
                swap(nums, l,m);
                    l++;m++;
            }else if(nums[m]==1){
                m++;
            }else if(nums[m]==2){
               swap(nums, h,m);
                h--;
            }
        }
    }
    
    private void swap(int[] nums, int l, int h){
        int temp = nums[l];
        nums[l] = nums[h];
        nums[h] = temp; 
        return;
    }
}