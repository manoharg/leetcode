class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        int i=0;
        while(i+1<len&& nums[i]<=nums[i+1])
            i++;
        // array is sorted
        if(i==len-1)
            return 0;
        int j=len-1;
        while(j-1>=0&& nums[j-1]<=nums[j]){
            j--;
        }
        //System.out.println("before "+ i+" "+j);
        int min=Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        for(int k=i;k<=j;k++){
            min= Math.min(min, nums[k]);
            max= Math.max(max, nums[k]);
        }
        while(i>0&&nums[i-1]>min)
            i--;
        while(j<len-1&&nums[j+1]<max)
            j++;
       // System.out.println("after "+ i+" "+j);
        return j-i+1;
    }
}