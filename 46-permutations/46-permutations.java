class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, new ArrayList<>(), ans, new HashMap<>());
        return ans;
    }
    void helper(int[] nums, List<Integer> temp, List<List<Integer>> ans, Map<Integer,Integer> map){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
        }
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(i)){
                map.put(i, nums[i]);
                temp.add(nums[i]);
                helper(nums, temp, ans, map);
                temp.remove(temp.size()-1);
                map.remove(i);
                    
            }
        }
    }
}