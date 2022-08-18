class Solution {
    public int minSetSize(int[] arr) {
      Map<Integer, Integer> map = new HashMap<>();
      for(int i : arr){
        map.put(i, map.getOrDefault(i,0)+1);
      }
      int[][] temp = new int[map.size()][2];
      int i=0;
      for(Map.Entry<Integer, Integer> entry: map.entrySet()){
        temp[i++]= new int[]{entry.getValue(), entry.getKey()};
      }
      
      Arrays.sort(temp, (int[] a, int[] b) -> b[0]-a[0]); 
      int len = arr.length;
      int target = len/2;
      i=0;
      int c=0;
     // System.out.println(Arrays.deepToString(temp));
      while(len>target&& i<map.size()){
        len = len - temp[i][0]; 
        
        c++;i++;
      }
      
      return c;
    }
}