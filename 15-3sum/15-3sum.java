class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
           //     System.out.println(Arrays.toString(nums));

        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i-1]==nums[i]){
                continue;
            }
            search(nums, -nums[i], i+1, nums.length-1, ans);      
        }
        return ans;
    }
    private void search(int[] nums, int tar, int l, int r,List<List<Integer>> ans){
       // System.out.println(tar);
        while(l<r){
            if(nums[l]+nums[r]==tar){
                ans.add(Arrays.asList(nums[l],  nums[r], -tar));
                l++;
                r--;
            
                while(l<r&&nums[l]==nums[l-1]){
                    l++;
                }
                while(l<r&&nums[r]==nums[r]+1){
                    r--;
                }
            }else if(nums[l]+nums[r]<tar)
                l++;
            else
                r--;
        }
        return;
        
    }
}