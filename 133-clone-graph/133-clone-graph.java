/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {

    public Node cloneGraph(Node node) {
    
        Map<Integer, Node> map = new HashMap<>();
        return dfs(node, map);
    }

    Node dfs(Node node, Map<Integer, Node> map) {
      if(node==null) return null;
        if(map.containsKey(node.val)) return map.get(node.val);
        Node nodeClone = getClone(node);
        map.put(node.val, nodeClone);
        for (Node child : node.neighbors) {
            nodeClone.neighbors.add(dfs(child, map));
        }
        return nodeClone;
    }

    Node getClone(Node node) {
        Node clone = new Node(node.val);
        return clone;
    }
}
