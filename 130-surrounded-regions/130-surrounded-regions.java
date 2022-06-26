class Solution {
    int[][] dir = new int[][] { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };

    boolean isValid(int i, int j, int r, int c) {
        if (i >= 0 && i < r && j >= 0 && j < c) return true;
        return false;
    }

    public void solve(char[][] board) {
        int r = board.length;
        int c = board[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if ((i == 0 || j == 0|| i==r-1||j==c-1) && board[i][j] == 'O') {
                    dfs(board, i, j);
                }
            }
        }
        // System.out.println(Arrays.deepToString(board));
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] == 'Y') board[i][j] = 'O';
                else
                  board[i][j] = 'X';  
            }
        }
    }

    void dfs(char[][] board, int i, int j) {
        int r = board.length;
        int c = board[0].length;
        board[i][j] = 'Y';
        for (int k = 0; k < 4; k++) {
            int newx = i + dir[k][0];
            int newy = j + dir[k][1];
            if (isValid(newx, newy, r, c) && board[newx][newy] == 'O') {
                board[newx][newy] = 'Y';
                dfs(board, newx, newy);
            }
        }
    }
}
