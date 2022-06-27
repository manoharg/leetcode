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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        helper(root, new ArrayList<>(), ans);
        return ans;
    }
    void helper(TreeNode node, List<Integer> path, List<String> ans){
        if(node==null)
            return;
        if(node.left==null && node.right==null){
            StringBuilder sb = new StringBuilder();

            for(int i:path){
                sb.append(i);
                sb.append("->");
            }
            sb.append(node.val);
            //sb.deleteCharAt(sb.length()-1);
            //sb.deleteCharAt(sb.length()-1);
            ans.add(sb.toString());
            return;
        }
        
    
        path.add(node.val);    
        // System.out.println("before" + path);
        helper(node.left, path, ans);
        helper(node.right, path, ans); 
        path.remove(path.size()-1);
       // System.out.println("after" + path);

        
    }
}