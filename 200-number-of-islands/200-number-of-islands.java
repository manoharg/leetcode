class Solution {
    int[] x = new int[] { -1, 1, 0, 0 };
    int[] y = new int[] { 0, 0, -1, 1 };

    boolean isValid(char[][] grid, int i, int j) {
        int r = grid.length;
        int c = grid[0].length;
        if (i >= 0 && i < r && j >= 0 && j < c) return true;
        return false;
    }

    void dfs(char[][] grid, int i, int j, boolean[][] vis) {
        vis[i][j] = true;
        for (int t = 0; t < x.length; t++) {
            int newx = i + x[t];
            int newy = j + y[t];
            if (isValid(grid, newx, newy) && grid[newx][newy] == '1' && !vis[newx][newy]) {
                vis[newx][newy] = true;

                dfs(grid, newx, newy, vis);
            }
        }
    }

    public int numIslands(char[][] grid) {
        int com = 0;
        int r = grid.length;
        int c = grid[0].length;
        boolean[][] vis = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (!vis[i][j] && grid[i][j] == '1') {
                    //  System.out.println("newx " + i +"newy "+ j);

                    dfs(grid, i, j, vis);
                    com++;
                }
            }
        }
        // System.out.println(Arrays.deepToString(vis));

        return com;
    }
}
