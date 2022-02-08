class Solution {
    public int searchInsert(int[] nums, int target) {
        int l =0;
        int h= nums.length-1;
        while(l<=h){
            int m = l+(h-l)/2;
           // System.out.println("l is "+ l + "h is " + h+ "value of mid " +nums[m]);
            if(nums[m]==target)
                return m;
            if(nums[m]<target)
                l=m+1;
            else
                h=m-1;
        }
        
        return l;
    }
}