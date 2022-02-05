class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lb= lowerbound(nums, target);
        if(lb==-1){
            return new int[]{-1,-1};
        }
        int ub= upperbound(nums,target);
        return new int[]{lb,ub};
    }
    public int upperbound(int[] nums, int x){
        int l =0;
        int r=nums.length-1;
        int ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]<=x){
                ans=m;
                l=m+1;
            }else{
                r=m-1;
            }
        }
        
         if(ans!=-1&&nums[ans]==x){
            return ans;
        }
        return -1;
    }
    public int lowerbound(int[]  nums, int target){
        int l =0;
        int r=nums.length-1;
        int ans =-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]>=target){
                ans = m;
                r=m-1;
            }else{
                l=m+1;
            }
        }
        if(ans!=-1&&nums[ans]==target){
            return ans;
        }
        return -1;
    }
}