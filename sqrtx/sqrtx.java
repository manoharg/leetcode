class Solution {
    public int mySqrt(int x) {
        if(x==0)
            return 0;
        int l =1;
        int r =x;
        int ans = 1;
        while(l<=r){
            int  m= l+ (r-l)/2;
            if((long)m*m>x){
                r = m-1;
            }else{
                ans = m;
                l= m+1;
            }
        }
        return ans;
    }
}