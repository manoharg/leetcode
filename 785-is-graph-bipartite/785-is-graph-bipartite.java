class Solution {
    public boolean isBipartite(int[][] graph) {
        int v = graph.length;
        boolean[] visited = new boolean[v];
        int[] colors = new int[v];
        Arrays.fill(colors, 0);
        for(int i=0;i<v;i++) {
            if(visited[i]==false){
                dfs(graph, visited,  i, colors);
              //  visited[i]=true;
            }
        }
        System.out.println(Arrays.toString(colors));
        for(int i=0;i<v;i++){
            int edges= graph[i].length;
            int x = colors[i];
            for(int j=0;j<edges;j++){
               if(colors[graph[i][j]]==x)
                   return false;
            }
        }
        return true;
        
    }
    void dfs (int[][] graph, boolean[] visited, int v, int[] colors){
        
        if(visited[v]==true){
            return;
        }
        visited[v]=true;
        for(int i=0;i<graph[v].length;i++){
        //    System.out.println(graph[v][i]+ "color of parent " +v +" is"+ colors[v]);
            if(visited[graph[v][i]]==false){
                if(colors[v]==0)
                colors[graph[v][i]]=1;
                else
                colors[graph[v][i]]=0;
                  //visited[graph[v][i]] = true;
                dfs(graph, visited, graph[v][i], colors);
              
            }
        }
      //  visited[v]=true;
            
    }
}