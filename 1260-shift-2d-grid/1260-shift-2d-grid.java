class Solution {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int r = grid.length;
        int c = grid[0].length;
        List<List<Integer>> res = new ArrayList<>();
        int[][] ans = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int oned = (getoned(i, j, c) + k) % (r * c);
                int ni = gettwodrow(oned, c);
                int nj = gettwodcol(oned, c);
                ans[ni][nj] = grid[i][j];
            }
        }
        for (int i = 0; i < r; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < c; j++) {
                row.add(ans[i][j]);
            }
            res.add(row);
        }
        return res;
    }

    private int getoned(int i, int j, int cols) {
        return i * cols + j;
    }

    private int gettwodrow(int i, int cols) {
        return i / cols;
    }

    private int gettwodcol(int i, int cols) {
        return i % cols;
    }
}
