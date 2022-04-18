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
    int find;
    int ans;
    public int kthSmallest(TreeNode root, int k) {
        find = k;
        ans =0;
        inorder(root);
        return ans;
    }
    void inorder(TreeNode node){
        if(node==null)
            return;
        inorder(node.left);
        find--;
        if(find==0){
            ans = node.val;
            return;
        }
        inorder(node.right);
    }
}