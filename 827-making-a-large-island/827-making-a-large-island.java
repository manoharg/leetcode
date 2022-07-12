class Solution {
    int[][] dir = new int[][] { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };

    public int largestIsland(int[][] grid) {
        if (grid == null || grid[0].length == 0) return 0;

        int r = grid.length;
        int c = grid[0].length;
        Map<Integer, Integer> map = new HashMap<>();
        int islandId = 2; // 0 and 1 are reserved
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1) {
                    int size = dfs(grid, i, j, islandId);
                    map.put(islandId++, size);
                    ans = Math.max(ans, size);
                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 0) {
                    Set<Integer> set = new HashSet<>();
                    for (int k = 0; k < dir.length; k++) {
                        int ni = i + dir[k][0];
                        int nj = j + dir[k][1];
                        if (ni < 0 || nj < 0 || ni >= grid.length || nj >= grid[0].length) {} else {
                            set.add(grid[ni][nj]);
                        }
                    }
                    int x = 1;
                    for (Integer temp : set) {
                        x += map.getOrDefault(temp,0);
                    }
                    ans = Math.max(ans, x);
                }
            }
        }

        return ans;
    }

    private int dfs(int[][] grid, int i, int j, int islandId) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1) return 0;
        grid[i][j] = islandId;
        int count = 1;
        for (int k = 0; k < dir.length; k++) {
            int ni = i + dir[k][0];
            int nj = j + dir[k][1];
            count += dfs(grid, ni, nj, islandId);
        }
        return count;
    }
}
