class Solution {

    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        boolean firstRow = false;
        for (int i = 0; i < c; i++) {
            if (matrix[0][i] == 0) firstRow = true;
        }
        boolean firstCol = false;
        for (int j = 0; j < r; j++) {
            if (matrix[j][0] == 0) firstCol = true;
        }
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) if (matrix[i][j] == 0) {
                matrix[0][j] = 0;
                matrix[i][0] = 0;
            }
        }

        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) matrix[i][j] = 0;
            }
        }
        if (firstRow) {
            for (int i = 0; i < c; i++) {
                matrix[0][i] = 0;
            }
        }
        if (firstCol) {
            for (int j = 0; j < r; j++) {
                matrix[j][0] = 0;
            }
        }

        return;
    }
}
