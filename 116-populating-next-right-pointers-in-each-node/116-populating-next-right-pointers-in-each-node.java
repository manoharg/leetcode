/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null)
            return root;
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        root.next=null;
        Node prev=null;
        while(!queue.isEmpty()){
           
            int s = queue.size();
            for(int i=0;i<s;i++){
                Node temp = queue.poll();
           // temp.next=null;
             if(prev!=null&&i>0)
                prev.next=temp;
            if(temp.left!= null)
                queue.add(temp.left);
            if(temp.right!=null)
                queue.add(temp.right);
             prev=temp; 
            }
           
        }
        return root;
        
    }
}