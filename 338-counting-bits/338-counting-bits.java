class Solution {
    public int[] countBits(int n) {
     int[] ans = new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i]= getbits(i);
        }
        return ans;
    }
    int getbits(int n){
        int c =0;
        while(n>0){
            n=n&(n-1);
            c++;
        }
        return c;
            
    }
}