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
    public List<Double> averageOfLevels(TreeNode root) {
          List<Double> result = new ArrayList<>();
      if(root==null)
          return result;
    Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while( !qu.isEmpty()){
            double temp= 0.0;
            int size = qu.size();
            int x =size;
            while(size>0){
                TreeNode node= qu.poll();
            temp+=node.val;
                if(node.left!=null)
                    qu.add(node.left);
                if(node.right!=null)
                    qu.add(node.right);
                size--;
            }
            temp = temp/x;
            result.add(temp);
        }
        return result;
    }
}