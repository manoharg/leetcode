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
class Solution {
    int ans = Integer.MIN_VALUE;
    public int maxDepth(TreeNode root) {
        if(root==null){
           return 0; 
        }
        depth(root,1);
        return ans;
      
    }
    public void depth(TreeNode root, int dep){
        if(root==null)
            return;
        ans = Math.max(ans,dep);
        depth(root.left, dep+1);
        depth(root.right, dep+1);
        
    }
}