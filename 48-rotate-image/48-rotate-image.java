class Solution {
    public void rotate(int[][] matrix) {
        transport(matrix);
      reverseCol(matrix);
    }
  
  private void reverseCol(int[][] mat){

    for(int[] r: mat){
      int e = r.length-1;
      int l =0;
      while(l<=e){
        int temp = r[e];
        r[e]=r[l];
        r[l]=temp;
        l++;
        e--;
      }
    }
  }
  private void transport(int[][] mat){
    int r = mat.length;
    int c = mat[0].length;
    for(int i=0;i<r;i++){
      for(int j=i;j<c;j++){
        // swap mat[i][j] with mat[j][i]
        
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
      }
    }
  }
}