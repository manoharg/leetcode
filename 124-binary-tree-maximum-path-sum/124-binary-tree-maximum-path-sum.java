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
    // Similar to diameter of a binary tree
    // Return something and compute something else.
    int ans;

    public int maxPathSum(TreeNode root) {
        if (root == null) return 0;
        ans = Integer.MIN_VALUE;
        helper(root);
        return ans;
    }

    // return the sum of nodes of a tree with root.
    private int helper(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) {
            ans = Math.max(ans, root.val);
            return root.val;
        }

        int left = helper(root.left);
        int right = helper(root.right);

        ans = Math.max(ans, Math.max(left + root.val, root.val));
        ans = Math.max(ans, Math.max(right + root.val, root.val));
        ans = Math.max(ans, left + right + root.val);
        int x = Math.max(Math.max(left + root.val, root.val), Math.max(right + root.val, root.val));
        return x;
    }
}
