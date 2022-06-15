class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        helper(nums, 0, nums.length, new ArrayList<>(), ret);
        return ret;
    }
    private void helper(int[] nums, int i, int n, List<Integer> temp, List<List<Integer>> ret){
        if(i>=n){
            ret.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        helper(nums, i+1, n,temp, ret);
        temp.remove(temp.size()-1);
        helper(nums, i+1,n, temp, ret);
    
    }
}