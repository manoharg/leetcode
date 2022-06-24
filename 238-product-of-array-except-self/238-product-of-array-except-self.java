class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums==null || nums.length<=1)
            return nums;
        int n = nums.length;
        int[] left = new int[n];
        for(int i=0;i<n;i++){
            if(i>0)
            left[i] = left[i-1]*nums[i-1];
            else
            left[i]=1;
        }
        int right = 1;
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                right = 1;
            }else{
                right = right*nums[i+1];
                left[i] = left[i]*right;
            }
        }
        
        return left;
    }
}