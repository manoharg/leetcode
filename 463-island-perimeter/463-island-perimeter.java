class Solution {
    public int islandPerimeter(int[][] grid) {
      int r = grid.length;
      int c = grid[0].length;
        boolean[][] vis = new boolean[r][c];
      int ans=0;
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
          if(grid[i][j]==1 && !vis[i][j]){
            ans = perimeter(grid, i, j, vis);
          break;
          }
            
        }
      }
      return ans;
    }
  
  private int perimeter(int[][] grid, int i, int j, boolean[][] vis){
    if(i<0 || j<0 || i>=grid.length || j>=grid[0].length ||grid[i][j]==0)
      return 1;
    if(vis[i][j])
      return 0;
    int count =0;
    vis[i][j] = true;
    count+=perimeter(grid, i-1,j,vis);
    count+=perimeter(grid, i+1,j,vis);
    count+=perimeter(grid, i,j-1,vis);
    count+=perimeter(grid, i,j+1,vis);
    return count;
  }
}