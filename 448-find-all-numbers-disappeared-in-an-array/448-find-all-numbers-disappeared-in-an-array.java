class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int j= nums[i]-1;
            if(nums[i]!=nums[j]){
                int temp = nums[j];
                nums[j]= nums[i];
                nums[i]=temp;
            }else
                i++;
        }
        for(i=0;i<nums.length;i++){
            if(i+1!=nums[i])
                ret.add(i+1);
        }
        return ret;
    }
}