//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        Map<Character, Integer> map = new HashMap<>();
        int start=0,end=0;
        int need=k;
        int ans = -1;
        while(end<s.length()){
            char ch = s.charAt(end);
            map.put(ch, map.getOrDefault(ch,0)+1);
            if(map.size()==k){
                ans= Math.max(ans,end-start+1);
            }
            while(map.size()>k){
                char x=s.charAt(start);
                map.put(x, map.get(x)-1);
                if(map.get(x)==0)
                    map.remove(x);
                start++;        
            }
            if(map.size()==k){
                ans= Math.max(ans,end-start+1);
            }
           end++; 
        }
        return ans;
    }
}