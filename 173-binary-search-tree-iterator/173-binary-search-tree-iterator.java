/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    Queue<Integer> inorder = new LinkedList<>();
    int i=0;
    int s=0;
    public BSTIterator(TreeNode root) {
        recinorder(root);
        s=inorder.size();
    }
    
    private void recinorder(TreeNode root){
        if(root==null)
            return;
        recinorder(root.left);
        inorder.offer(root.val);
        recinorder(root.right);
    }
    public int next() {
        return inorder.poll();
    }
    
    public boolean hasNext() {
        return inorder.size()>0;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */