class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // Cycle sort
        // when array contains 1...n , cycle sort can be used
        int cur=0;
        while(cur<nums.length){
            int expectedIndex = nums[cur]-1;
            if(nums[expectedIndex]!=nums[cur]){
                swap(nums, cur, expectedIndex);
            }else
                cur++;
            
        }
        // System.out.println(Arrays.toString(nums));
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1)
                ans.add(i+1);
        }
        return ans;
            
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
        return;
    }
}