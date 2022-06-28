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
    int sum;
    public int findTilt(TreeNode root) {
        sum=0;
        helper(root);
        return sum;
        
    }
    int helper(TreeNode node){
        if(node==null)
            return 0;
        int l = helper(node.left);
        int r = helper(node.right);
        sum+=Math.abs(l-r);
        return node.val+l+r;
    }
    
}