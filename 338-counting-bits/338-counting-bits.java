class Solution {
    public int[] countBits(int n) {
     int[] ans = new int[n+1];
        int offset =1;
        for(int i=0;i<=n;i++){
            if(i==0)
            ans[i]=0;
            else{
                 if(i==offset<<1)
                    offset=i;
                ans[i] = 1+ans[i-offset];
    
            }
        }
        return ans;
    }
   
}