class Solution {

    int[] dx = new int[] { -1, 1, 0, 0 };
    int[] dy = new int[] { 0, 0, -1, 1 };
    
    
    boolean isValid(int i, int j, int r, int c) {
        if (i >= 0 && i < r && j >= 0 && j < c) return true;
        return false;
    }
    
    public int[][] updateMatrix(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == 1) mat[i][j] = -1; else q.offer(new int[] { i, j });
            }
        }

        bfs(mat, q);
        return mat;
    }

    void bfs(int[][] mat, Queue<int[]> q) {
        int level = 0;
        int r = mat.length;
        int c = mat[0].length;
        while (!q.isEmpty()) {
            int sz = q.size();
           // System.out.println(q.size());
            for (int i = 0; i < sz; i++) {
                int[] temp = q.poll();
                for (int k = 0; k < 4; k++) {
                    int nx = temp[0] + dx[k];
                    int ny = temp[1] + dy[k];
                    if (isValid(nx, ny, r, c) && mat[nx][ny] == -1) {
                        mat[nx][ny] = level + 1;
                       // System.out.println("nx "+ nx + " ny "+ ny + "lev "+ level+1);
                        q.offer(new int[] { nx, ny });
                    }
                }
            }
            level++;
        }
    }
}
