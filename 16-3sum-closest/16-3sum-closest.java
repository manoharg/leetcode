class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans = Integer.MAX_VALUE;
        int ret=0;
        Arrays.sort(nums);
        int n= nums.length;
        for(int i=0;i<n-1;i++){
            int start = i+1;
            int end = n-1;
            while(start<end){
                int x = (nums[start]+nums[end]+nums[i]);
                if(Math.abs(target-x)<=ans){
                    ans=Math.abs(target-x);
                    ret=x;
                    
                }
                if(x>target){
                    end--;
                }else{
                    start++;
                }
            }
        }
        return ret;
    }
}