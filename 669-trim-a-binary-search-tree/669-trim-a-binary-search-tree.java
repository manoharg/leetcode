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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root==null)
            return root;
        if(root.val<low)
            return trimBST(root.right, low, high);
        else if(root.val>high)
            return trimBST(root.left, low, high);
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
    
        return root;
    }
    
     public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
            return null;
       
            if(root.left!=null && root.right!=null){
                // 2 children
                int max= findMax(root.left);
                root.val = max;
                root.left = deleteNode(root.left, max);
            }else if (root.left!=null&& root.right ==null){
                //left child
                return root.left;
            }else if(root.right!=null&& root.left==null){
                // right child
                return root.right;
            }else{
                return null;
            }
        
        return root;
    }
    
    public int findMax(TreeNode node){
        if(node.right!=null)
            return findMax(node.right);
        return node.val;
    }
}