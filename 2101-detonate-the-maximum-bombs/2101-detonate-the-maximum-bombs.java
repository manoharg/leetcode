class Solution {
    private boolean inProximity(int[]  a, int[] b){
         long x= 1L*(b[0]-a[0])*1l*(b[0]-a[0]);
             long y= 1l*(b[1]-a[1])*1l*(b[1]-a[1]);
        return x+y<=1l*a[2]*a[2];
    }
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;
        Map<Integer, List<Integer>> graph = new HashMap<>();
        // List<Integer>[] graph = new List[n];

        for(int i=0;i<n;i++)
            graph.put(i, new ArrayList<>());
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int[] x = bombs[i];
                int[] y= bombs[j];
                if(i!=j&&inProximity(x,y)){
                    graph.get(i).add(j);
                }
            }
        }
        
//          for(int i = 0; i < bombs.length - 1; i++)//generate every pair
//             for(int j = i + 1; j < bombs.length; j++) {
//                 long dist = dist(bombs[i], bombs[j]);//distance between the bombs
//                 if(dist <= 1l * bombs[i][2] * bombs[i][2]) adj[i].add(j);//make a edge from i to j 
                
//                 if(dist <= 1l * bombs[j][2] * bombs[j][2]) adj[j].add(i);//make a edge from j to i
//             }
        int ans = 0;
        for(int i=0;i<n;i++){
            
            int x = dfs(graph, new boolean[n],i);
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