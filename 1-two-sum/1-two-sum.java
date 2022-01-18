class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[]{-1, -1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length; i++){
               map.put(nums[i], i); 
        }
        for(int i=0;i<nums.length; i++){
            if(map.containsKey(target - nums[i]) && i!= map.get(target- nums[i]))  
            {
                ans[0] =i;
                ans[1]= map.get(target - nums[i]);
                break;
            }
        }
        return ans;
        
    }
}