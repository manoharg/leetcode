class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int rows = mat.length;
        int[][] sol = new int[rows][1];
         for(int i=0;i<rows;i++){
            int c=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1)
                    c++;
            }
            sol[i]=new int[]{c,i};
        }
        Arrays.sort(sol,  new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(a[0]==b[0])
                    return a[1]-b[1];
                return a[0]-b[0];
            }
        });
        
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i]=sol[i][1];
        }
        return ans;
    }
}