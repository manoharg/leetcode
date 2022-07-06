class Solution {
    public int[][] dir = new int[][] { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };

    public int maxAreaOfIsland(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        boolean[][] vis = new boolean[r][c];
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) {
                    int temp = dfs(grid, i, j, vis);
                   // System.out.println(temp);
                    maxArea = Math.max(maxArea,temp );
                }
            }
        }
        return maxArea == Integer.MIN_VALUE ? 0: maxArea;
    }

    int dfs(int[][] grid, int i, int j, boolean[][] vis) {
        vis[i][j] = true;
        int area = 1;
        for (int k = 0; k < 4; k++) {
            int nx = i + dir[k][0];
            int ny = j + dir[k][1];
            if (nx >= 0 && nx < grid.length && ny >= 0 && ny < grid[0].length && !vis[nx][ny] && grid[nx][ny] == 1) area = area  + dfs(grid, nx, ny, vis);
        }
        return area;
    }
}
