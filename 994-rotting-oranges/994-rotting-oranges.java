class Solution {
    int[][] dir = new int[][]{{-1,0},{1,0}, {0,1},{0,-1}};
    public int orangesRotting(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
            }
        }
        
        int level =0;
        while(!q.isEmpty()){
            
            int sz= q.size();
            boolean flag =false;
            while(sz-- >0){
                int[] cur = q.poll();
                for(int k=0;k<4;k++){
                    int x = cur[0] + dir[k][0];
                    int y= cur[1]+ dir[k][1];
                    if(x>=0&&y>=0&&x<r&&y<c){
                        if(grid[x][y]!=0&&grid[x][y]!=2){
                            grid[x][y]=2;
                            q.offer(new int[]{x,y});
                            flag=true;
                        }
                    }
                }
                
            }
            if(flag)
            level++;
        }
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return level;
    }
}