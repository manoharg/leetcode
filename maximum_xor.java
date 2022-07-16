
import java.util.ArrayList;
import java.util.*;
public class Solution 
{
  /**
  You are given two arrays of non-negative integers say ‘arr1’ and ‘arr2’. 
  Your task is to find the maximum value of ( ‘A’ xor ‘B’ ) where ‘A’ and ‘B’ are any elements from ‘arr1’ and ‘arr2’ respectively and ‘xor’ represents the bitwise xor operation.
  */
  

	public static int maxXOR(int n, int m, ArrayList<Integer> arr1, ArrayList<Integer> arr2) 
	{
        Trie trie = new Trie();
	    // Write your code here.   
        for(Integer num: arr1){
            trie.insert(num);
        }
         int ans = Integer.MIN_VALUE;
          for(Integer num: arr2){
             ans = Math.max(ans, trie.getMax(num));
        }
        return ans;
	}
}
class Trie {
    Node root;

    Trie() {
        root = new Node();
    }

    int getMax(int n){
        Node cur = root;
        int max=0;
        for (int i = 31; i >=0 ; i--) {
            int bit = (n>>i)&1;
            if(cur.bits[1-bit]!=null){
                max = max | 1<<i;
                cur = cur.bits[1-bit];
            }else{
                cur = cur.bits[bit];
            }

        }
        return max;
    }
    void insert(int n) {
        Node cur = root;
        for (int i = 31; i >=0; i--) {
            int bit = (n >> i) & 1;
             if(cur.bits[bit]==null)
                 cur.bits[bit] = new Node();
             cur = cur.bits[bit];
        }
    }
}

    class Node {
        Node[] bits = new Node[2];
    }
