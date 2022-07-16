import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("apps");
        trie.insert("apnl");
        trie.insert("bac");
        trie.insert("bat");
        System.out.println(trie.query("apple"));
        System.out.println(trie.query("app"));
        System.out.println(trie.query("apps"));
        System.out.println(trie.query("bat"));
        System.out.println("StartsWith");
        System.out.println(trie.startsWith("apnl"));
        System.out.println(trie.startsWith("abc"));
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
        }
        cur.terminating = true;
    }

    boolean query(String s) {
        TrieNode cur = root;
        for (int i = 0; i < s.length(); i++) {
            if (cur.getNode(s.charAt(i)) == null) {return false;}
            cur = cur.getNode(s.charAt(i));
        }
        return cur.terminating;
    }
  
    boolean startsWith(String s){
        TrieNode cur = root;
        for (int i = 0; i < s.length(); i++) {
            if(cur.getNode(s.charAt(i))==null)
                return false;
            cur = cur.getNode(s.charAt(i));
        }
        return  true;
    }
}

class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean terminating;

    TrieNode getNode(Character ch){
        return children.get(ch);
    }
    void putNode(Character ch, TrieNode node){
        children.put(ch, node);
    }
}
