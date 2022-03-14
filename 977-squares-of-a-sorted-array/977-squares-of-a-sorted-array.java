class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = nums.length;
        int[] ans = new int[l];
        int i=0,j=l-1;
        int k=l-1;
        while(i<=j){
            int left = nums[i]*nums[i];
            int right = nums[j]*nums[j];
            if(left<=right){
                ans[k--]=right;
                j--;
            }else{
                ans[k--]=left;
                i++;
            }
        }
        return ans;
    }
}