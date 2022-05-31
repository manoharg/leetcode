class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0 ;i<n;i++){
           map.put( i, new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            if(map.get(manager[i])==null)
                map.put(manager[i], new ArrayList<>());
            map.get(manager[i]).add(i);
        }
       // System.out.println(map.get(headID));
         return dfs(headID, map, informTime );
    }
    int dfs(int root, Map<Integer, List<Integer>> map,int[] informTime){
        
        int ans=0;
        for(Integer i: map.get(root)){
            ans= Math.max(ans, dfs(i, map, informTime));
        }
        return ans+informTime[root];
    }
}