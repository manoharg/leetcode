class Solution {
    public int findPeakElement(int[] nums) {
        /*
        a[m]>a[m-1]
        TTTTFFF -> Find last true
        1 2 3 4 -> T TTTT 
        4 3 2 1 -> TFFFF
        */
        int l=0;
        int r =nums.length-1;
        int ans =-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(m==0||nums[m]>nums[m-1]){
                ans = m;
                l = m+1;
            }else{
                r=m-1;
            }
        }
        return ans;
    }
}