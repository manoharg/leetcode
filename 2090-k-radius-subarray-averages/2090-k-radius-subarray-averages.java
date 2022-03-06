class Solution {
    /*
    Arrays.fill(ans,-1); 
    window size= 2*k+1
    ans[j-k] = 
    */
    public int[] getAverages(int[] nums, int k) {
        int l=nums.length;
        int[] ans=new int[l];
        Arrays.fill(ans,-1);
        int i=0,j=0;
        long sum=0;
        int ws=2*k+1;
        if(l<ws)
            return ans;
        while(j<l){
            sum= sum+ nums[j];
           // System.out.println(j);
            if(j-i+1<ws)
                j++;
            else if(j-i+1==ws){
                ans[i+k]=(int)(sum/ws);
                sum=sum-nums[i];
                i++;
                j++;                   
            }
        }
        return ans;
            
    }
}