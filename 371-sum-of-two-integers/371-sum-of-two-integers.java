class Solution {

    public int getSum(int a, int b) {
     
        if(a==0)
            return b;
        if(b==0)
            return a;
        while(b!=0){
            int t = (a&b)<<1;
            a = a^b;
            b= t;
        }
        return a;
    }
}
