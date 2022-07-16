class MAX_XOR {
    public static void main(String[] args) {
        int[] arr = new int[] {9,5,6};
        int x = 5;
        Trie trie = new Trie();
        for(int num: arr){
            trie.insert(num);
        }
        System.out.println(trie.getMax(x));
    }
}

/**
 * Insert all numbers into trie in the form of bits(31st, 30th ....0)
 * How do you get max ?
 * Most index bits should be 1 to get max 
 * x =      10001
 * a[i] =   0
 * -------------
 * maxAns=  1_____
 * 
 * We need inversion bit of x to get max xor
 */
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
