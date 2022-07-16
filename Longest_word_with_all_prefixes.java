import java.util.*;
class Solution {

  /**
  Problem Statement
Ninja developed a love for arrays and strings so this time his teacher gave him an array of strings,
‘A’ of size ‘N’. Each element of this array is a string. The teacher taught Ninja about prefixes in the past, so he wants to test his knowledge.
A string is called a complete string if every prefix of this string is also present in the array ‘A’. 
Ninja is challenged to find the longest complete string in the array ‘A’.If there are multiple strings with the same length, return the lexicographically smallest one and if no string exists, return "None".
  */
  //TC: O(N) * O(len)
  public static String completeString(int n, String[] a) {
    // Write your code here.
     Trie trie = new Trie();
      for(String s: a){
          trie.insert(s);
      }
      String ans = "";
      for(String s: a){
          if(trie.checkIfAllPrefixExists(s)){
              if(s.length()>ans.length())
                  ans = s;
              else if(s.length()==ans.length()){                  
                  if(s.compareTo(ans)<0)
                      ans =s;

              }
          }
      }
      if(ans.length()==0)
          return "None";
      return ans;
  }
}
class Trie {
    TrieNode root;
    Trie(){
        root = new TrieNode();
    }
    void insert(String str) {
        TrieNode cur = root;
        for (int i = 0; i < str.length(); i++) {
            if (cur.getNode(str.charAt(i)) == null) {
                cur.putNode(str.charAt(i), new TrieNode());
            }
            cur = cur.getNode(str.charAt(i));
            cur.end++;
        }
        cur.terminating = true;
        //cur.end++;
    }
     boolean checkIfAllPrefixExists(String word){
        TrieNode cur = root;
        for (int i = 0; i < word.length(); i++) {
            if(cur.getNode(word.charAt(i))!=null) {
                cur = cur.getNode(word.charAt(i));
                if(!cur.terminating)
                    return false;
            }else{
                return false;
            }
        }

        return true;
    }
}
class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean terminating;
    int end;

    TrieNode getNode(Character ch){
        return children.get(ch);
    }
    void putNode(Character ch, TrieNode node){
        children.put(ch, node);
    }
}
