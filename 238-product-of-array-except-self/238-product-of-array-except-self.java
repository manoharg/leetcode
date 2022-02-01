class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left =1;
        int l = nums.length;
        int right = 1;
        int[] ans = new int[l];
        ans[0]=1;

        for(int i=1;i<l;i++){
            ans[i]= nums[i-1]*ans[i-1];

        }
        //System.out.println(Arrays.toString(ans));
        
        right = 1;
        for(int i=l-2;i>=0;i--){
            right = right*nums[i+1];
            ans[i] = right*ans[i];
            
        }
        //System.out.println(Arrays.toString(ans));
        return ans;
    }
}