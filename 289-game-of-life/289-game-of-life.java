class Solution {
    int[] rows = new int[]{-1,-1,0,1,1,1,0, -1};
    int[] cols = new int[]{0,1,1,1,0,-1,-1, -1};
    
    public void gameOfLife(int[][] board) {
       int lr = board.length;
        int lc = board[0].length;
          for(int i=0;i<lr;i++){
            for(int j=0;j<lc;j++){
                getCount(board, i,j);
            }
          }
        // System.out.println(Arrays.deepToString(board));
          for(int i=0;i<lr;i++){
            for(int j=0;j<lc;j++){
                int act = board[i][j]%10;
                if(act==1){
                  if(board[i][j]/10<2 || board[i][j]/10>3)
                   board[i][j]=0;
                else
                    board[i][j]=1;  
                }else{
                     if(board[i][j]/10==3)
                         board[i][j]=1;
                    else
                        board[i][j]=0;
                }
               
            }
          }
    }
    public void getCount(int[][] board, int r, int c){
        int lr = board.length;
        int lc = board[0].length;
        int count=0;
        for(int i=0;i<rows.length;i++) {
           
                if(isValid(lr,lc, r+rows[i], c+cols[i]) && board[r+rows[i]][c+cols[i]]%10 >= 1) { 
                    count = count +1; 
                
            }
        }
        
        board[r][c]=board[r][c]+count*10;
      //   System.out.println("End r is "+ r + "c is "+c + "neigh "+ board[r][c]);
        
    }
    public boolean isValid(int r, int c, int i,int j){
        if(i<0||j<0||i>=r||j>=c)
            return false;
        return true;
    }
}