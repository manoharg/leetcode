class Solution {
    public String getSmallestString(int n, int k) {
        char[] res= new char[n];
        Arrays.fill(res,'a');
        k=k-n;
        int l =n-1;
        while(k>0){
            res[l--]+= Math.min(25,k);
            k=k-Math.min(25,k);
        }
        return new String(res);
    }
}