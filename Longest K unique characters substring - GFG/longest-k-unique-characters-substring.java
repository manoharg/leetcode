// { Driver Code Starts
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
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        int i=0,j=0;
        Map<Character,Integer> map = new HashMap<>();
        int ans = Integer.MIN_VALUE;
        int counter = map.size();
        while(j<s.length()){
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch,0)+1);
            if(map.size()==k){
                ans = Math.max(ans, j-i+1);
            }
            while(map.size()>k) {
                char start = s.charAt(i);
                if(map.containsKey(start)) {
                    map.put(start, map.get(start)-1);
                    if(map.get(start)==0)
                        map.remove(start);
                    
                }
                i++;
            }
            j++;
        }
        return ans==Integer.MIN_VALUE ? -1: ans;
    }
}