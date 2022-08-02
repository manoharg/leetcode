class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] tripsCapacity = new int[1001];
      for(int[] trip: trips){
        tripsCapacity[trip[1]]+= trip[0];
        tripsCapacity[trip[2]]-= trip[0];
      }
      int cur =0;
      for(int i=0;i<tripsCapacity.length;i++){
        cur+=tripsCapacity[i];
        if(cur>capacity)
          return false;
      }
      
      return true;
    }
}