class Solution {
    int[][] dir = new int[][]{{-1,0}, {1,0},  {0,1}, {0,-1}};
    public boolean exist(char[][] board, String word) {
        int r= board.length;
        int c = board[0].length;
        boolean[][] vis = new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(board, word, 1, i,j,vis))
                        return true;
                    else{
                        //reset vis
                        for(int k=0;k<r;k++)
                            Arrays.fill(vis[k], false);
                        
                    }
                }
            }
        }
        return false;
    }
    boolean dfs(char[][] board, String word, int ind, int i, int j, boolean[][] vis){
        if(ind==word.length())
            return true;
        vis[i][j]= true;
        
        for(int k=0;k<4;k++){
            int nx = i+dir[k][0];
            int ny= j+ dir[k][1];
            if(nx>=0&&nx<board.length&&ny>=0&&ny<board[0].length && !vis[nx][ny]){
                if(board[nx][ny]==word.charAt(ind)){
                   // System.out.println(word.charAt(ind+1)+ "nx " + nx + "ny "+ ny);
                    if(dfs(board, word, ind+1, nx, ny, vis))
                        return true;
                }
            }
        }
                vis[i][j]= false;

        return false;
    
    }
}