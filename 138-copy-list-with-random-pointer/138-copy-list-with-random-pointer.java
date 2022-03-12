/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
            return head;
        Map<Node,Node> map=new HashMap<>();
        Node cur=head;
        while(cur!=null){
            Node copy=getCopy(cur);
            map.put(cur, copy);
            cur=cur.next;
        }
        cur=head;
        while(cur!=null){
            Node copy = map.get(cur);
            copy.next = cur.next==null? null:map.get(cur.next);
            copy.random = cur.random==null? null: map.get(cur.random);
            cur=cur.next;
        }
        
        return map.get(head);
    }
    private Node getCopy(Node a){
        Node newNode = new Node(a.val);
        return newNode;
    }
}