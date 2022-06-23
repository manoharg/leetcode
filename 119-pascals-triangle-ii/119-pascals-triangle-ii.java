class Solution {
    public List<Integer> getRow(int rowIndex) {
          List<List<Integer>> triangle = new ArrayList<List<Integer>>();
       
        for (int i=0; i<=rowIndex; i++){
            List<Integer> row =  new ArrayList<Integer>();
            for (int j=0; j<i+1; j++){
                if (j==0 || j==i){
                    row.add(1);
                } else {
                    row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
                }
            }
            triangle.add(row);
        }
        return triangle.get(rowIndex);
    }
}