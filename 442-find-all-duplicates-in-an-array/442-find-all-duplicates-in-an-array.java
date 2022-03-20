class Solution {
    /**
    Cyclic sort
    1. arr elements are from 1..n
    
    */
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int correct= nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }else
                i++;
      //      System.out.println("index "+i);
        }
     //   System.out.println(Arrays.toString(nums));
        
        for( i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                res.add(nums[i]);
            }
        }
        return res;
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]=temp;
    }
}