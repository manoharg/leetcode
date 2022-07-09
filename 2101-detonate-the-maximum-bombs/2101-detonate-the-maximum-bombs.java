class Solution {
    private boolean inProximity(int[]  a, int[] b){
         long x= 1L*(b[0]-a[0])*1l*(b[0]-a[0]);
             long y= 1l*(b[1]-a[1])*1l*(b[1]-a[1]);
        return x+y<=1l*a[2]*a[2];
    }
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i=0;i<n;i++)
            graph.put(i, new ArrayList<>());
        boolean[] vis = new boolean[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int[] x = bombs[i];
                int[] y= bombs[j];
                if(i!=j&&inProximity(x,y)){
                    graph.get(i).add(j);
                }
            }
        }
        
        int ans = 0;
        for(int i=0;i<n;i++){
            vis = new boolean[n];
            int x = dfs(graph, vis,i);
            ans = Math.max(ans, x);
            
        }
        return ans;
        
    }
    int dfs(Map<Integer,List<Integer>> graph, boolean[] vis, int source){
        vis[source]=true;
        List<Integer> adj = graph.get(source);
        int count =1;
        for(int i: adj){
            if(!vis[i])
            count+=dfs(graph, vis, i);
        }
        return count;
    } 
}