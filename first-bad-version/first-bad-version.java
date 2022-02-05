/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
      int left =0;
        int right =n;
        /*
        F F  F T T T -> Find the first true
        */
        int ans =-1;
        while(left<=right){
            int m = left + (right-left)/2;
            if(isBadVersion(m)){
                ans = m;
                right = m-1;
            }else{
                left = m+1;
            }
        }
        return ans;
    }
}