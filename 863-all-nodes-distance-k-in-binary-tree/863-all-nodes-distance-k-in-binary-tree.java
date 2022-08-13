/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
  Map<TreeNode, TreeNode> tree;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        tree= new HashMap<>();
        buildTree(root, null);
      
      List<Integer> ans = new ArrayList<>();
      Queue<TreeNode> q = new LinkedList<>();
      Set<TreeNode> vis = new HashSet<>();
      q.offer(target);
      vis.add(target);
      
      while(!q.isEmpty() && k>0){
        int s= q.size();
        boolean flag=false; 
        for(int i=0;i<s;i++){
          TreeNode cur = q.poll();
          
          if(cur.left!=null && !vis.contains(cur.left)) {
            q.offer(cur.left); 
            vis.add(cur.left);
            flag=true;
          }
          
          if(cur.right!=null && !vis.contains(cur.right)){
            q.offer(cur.right);
            vis.add(cur.right);
            flag=true;
          }
          
          if(tree.get(cur)!=null && !vis.contains(tree.get(cur))){
            q.offer(tree.get(cur));
            vis.add(tree.get(cur));
            flag=true;
          }
          
        }
        if(flag)
          k--;
        
      }
      
      while(!q.isEmpty()){
        ans.add(q.poll().val);
      }
      
      return ans;
    }
    private void buildTree(TreeNode root, TreeNode prev){
      if(root==null) return;
      
        tree.put(root, prev);
      
        buildTree(root.left, root);
        buildTree(root.right, root);
      }
      
    
}