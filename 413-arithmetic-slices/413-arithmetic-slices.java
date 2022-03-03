class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums==null || nums.length<3)
            return 0;
        int l=nums.length;
        int count =0;
        for(int i=0;i<l;i++){
            int diff=0;
            for(int j=i;j<l;j++){
                if(j==i)
                    continue;
                if(j==i+1){
                    diff = nums[j]-nums[j-1];
                    continue;
                }
               
                if(nums[j]-nums[j-1]==diff){
                   // System.out.println("ele "+ nums[j]+"diff "+ diff+"j "+j+"i "+i);
                    if(j-i+1>=3)
                    count++;
                }
                else
                    break;
            }
        }
        return count;
    }
}