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

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        helper(root, res, path, targetSum);
        return res;
    }

    private void helper(TreeNode root, List<List<Integer>> res, List<Integer> path, int target) {
        if (root == null) return;
        // Found a leaf node with target Sum
        if (root.left == null && root.right == null && root.val == target) {
            // As we are not visiting the children, add and remove the current node
            path.add(root.val);
            // IMP: Create a clone as its by reference
            res.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return;
        }
        // Action before entering a vertex.Add the node to the path
        path.add(root.val);
        // left child
        helper(root.left, res, path, target - root.val);
        // right child
        helper(root.right, res, path, target - root.val);
        // Action after exiting a vertex
        path.remove(path.size() - 1);
    }
}
