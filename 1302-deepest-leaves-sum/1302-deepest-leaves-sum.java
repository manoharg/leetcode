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
    
    public int deepestLeavesSum(TreeNode root) {
        Map<TreeNode,Integer> depth= new HashMap<>();
        dfs(root,depth, null);
        int ret=0;
        int max= Integer.MIN_VALUE;
        for(TreeNode node: depth.keySet()){
            // System.out.println("Node "+ node.val + "depth "+depth.get(node));
            if(depth.get(node)>max)
                max=depth.get(node);
        }
        
        
        for(TreeNode node: depth.keySet()){
            if(depth.get(node)==max)
                ret+=node.val;
        }
        
        return ret;
    }
    void dfs(TreeNode root, Map<TreeNode,Integer> depth, TreeNode parent){
        if(root==null)
            return;
        depth.put(root, parent==null?0:depth.get(parent)+1);
        dfs(root.left, depth, root);
        dfs(root.right, depth, root);
    }
}