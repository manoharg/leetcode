class Solution {
    public double findMaxAverage(int[] nums, int k) {
     double ans = Integer.MIN_VALUE;
        long sum=0;
        int i=0,j=0;
        int l=nums.length;
        while(j<l){
            sum+=nums[j];
            if(j-i+1<k)
                j++;
            else if(j-i+1==k){
               // System.out.println("start "+ i+ " end "+j + "sum "+ sum);
                
                ans= Math.max(ans,sum);
                sum=sum-nums[i];
                i++;
                j++;
            }
        }
        return ans/k;
    }
}