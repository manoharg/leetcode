class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] right = new int[n];
        right[n-1]=0;
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]+nums[i+1];
        }
        int left=0;
        for(int i=0;i<n;i++){
            if(i>0)
            left  = left+ nums[i-1];
            if(left==right[i])
                return i;
        }
        return -1;
    }
}