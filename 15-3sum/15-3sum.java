class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
  
        if(nums==null || nums.length <3)
          return ans;
        Arrays.sort(nums);
        int sum=0;
       // System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length-2;i++){
            // skip duplicates 
            if(i>0 && nums[i]== nums[i-1])
                continue;
            int j = i+1;
            search(nums, -nums[i], j,ans);
            
        }
        return ans;
    }
    
    private void search(int[] arr, int target, int start, List<List<Integer>> ans){
        int end=arr.length-1;
        while(start<end){
            if(arr[start]+arr[end]==target){
                ans.add(Arrays.asList(-target, arr[start], arr[end]));
                start++;
                end--;
                
                
            while(start<end&&arr[end]==arr[end+1])
                end--; //skip duplicates
            while(start<end&&arr[start]==arr[start-1])
                start++;    //skip duplicates
                
            }else if(arr[start]+arr[end]<target)
                start++;
            else
                end--;
        }
        return;
    }
}