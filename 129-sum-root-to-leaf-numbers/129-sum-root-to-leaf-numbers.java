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
    int ans =0;
    public int sumNumbers(TreeNode root) {
        ans =0;
        helper(root,0);
        return ans;
    }
    public void helper(TreeNode root, int  path){
        if(root==null)
            return;
      
        if(root.left==null&& root.right==null){
        //    System.out.println(path);
            path = path*10 + root.val;
            ans = ans + path;
        }
        
        helper(root.left, path*10+ root.val );
        helper(root.right, path*10+root.val);
       // No need to revert the calcualtion as its not passed by referencee.
    }
}