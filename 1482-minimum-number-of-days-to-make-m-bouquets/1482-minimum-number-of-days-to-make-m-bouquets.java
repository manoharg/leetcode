class Solution {
  // TC: O(N*log(M)) where n is the bloomDay length and m is [l,r] inclusive.
    public int minDays(int[] bloomDay, int m, int k) {
    
    int max = Integer.MIN_VALUE;
      for(int i=0;i<bloomDay.length;i++){
        max = Math.max(max, bloomDay[i]);
      }
      int left =1;
     int right = max; 
      int ans = -1;
     // System.out.println(left +" "+ right );
      while(left<=right){
        int mid = left + (right-left)/2;
        if(bloom(bloomDay, m, k, mid)){
         // System.out.println(mid);
          ans = mid; // ---------mid--------
          right = mid-1;
        }else{
          left = mid+1;
        }
      }
      return ans;
    }
  
  private boolean bloom(int[] bloomDay, int m , int k, int day){
    int running =0;
    for(int i=0;i<bloomDay.length;i++){
      if(bloomDay[i]>day)
        running =0;
      else
        running++;
        
      if(running==k){
        m--;
        running=0;
      }
        
      if(m==0)
        return true;
    }
    return false;
    
    
  }
}