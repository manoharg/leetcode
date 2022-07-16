import java.util.*;
public class Trie {
    TrieNode root;
    public Trie() {
        // Write your code here.
        root = new TrieNode();
    }

    public void insert(String str) {
        // Write your code here.
        TrieNode cur = root;
        for (int i = 0; i < str.length(); i++) {
            if (cur.getNode(str.charAt(i)) == null) {
                cur.putNode(str.charAt(i), new TrieNode());
            }
            cur = cur.getNode(str.charAt(i));
            cur.cp++;
        }
        cur.terminating = true;
        cur.end++;
    }

    public int countWordsEqualTo(String s) {
        // Write your code here.
        TrieNode cur = root;
        for (int i = 0; i < s.length(); i++) {
            if(cur.getNode(s.charAt(i))==null)
                return 0;
            cur = cur.getNode(s.charAt(i));
        }

        return cur.end;
    }

    public int countWordsStartingWith(String s) {
        // Write your code here.
         TrieNode cur = root;
        for (int i = 0; i < s.length(); i++) {
            if(cur.getNode(s.charAt(i))==null)
                return 0;
            cur = cur.getNode(s.charAt(i));
        }
        return cur.cp;
    }

    public void erase(String s) {
        // Write your code here.
        TrieNode cur = root;
        for (int i = 0; i < s.length(); i++) {
            cur.getNode(s.charAt(i)).cp--;
            cur = cur.getNode(s.charAt(i));
        }
        if(cur!=null)
        cur.end--;
    }

}
class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean terminating; // not required
    int end; // words ending with
    int cp; // count prefixes

    TrieNode getNode(Character ch){
        return children.get(ch);
    }
    void putNode(Character ch, TrieNode node){
        children.put(ch, node);
    }
}
