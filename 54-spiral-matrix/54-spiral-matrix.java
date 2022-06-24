class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        int dir = 0;
        int r = matrix.length;
        int c = matrix[0].length;
        int rs = 0, cs = 0;
        int re = r - 1, ce = c - 1;
        List<Integer> ans = new ArrayList<>();
        while (ans.size()<r*c) {
            if (dir == 0) {
                for (int i = cs; i <= ce; i++) {
                    ans.add(matrix[rs][i]);
                }
                rs++;
                dir = 1;
            } else if (dir == 1) {
                for (int i = rs; i <= re; i++) {
                    ans.add(matrix[i][ce]);
                }
                ce--;
                dir = 2;
            } else if (dir == 2) {
                for (int i = ce; i >= cs; i--) {
                    ans.add(matrix[re][i]);
                }
                re--;
                dir = 3;
            } else if (dir == 3) {
                for (int i = re; i >= rs; i--) {
                    ans.add(matrix[i][cs]);
                }
                cs++;
                dir = 0;
            }
        }
        return ans;
    }
}
