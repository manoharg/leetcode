class Solution {
    public int minEatingSpeed(int[] piles, int h) {
     int start =1;
     int end =Integer.MAX_VALUE;
    int ans = Integer.MAX_VALUE;
      int i=1;
      while(start<=end){
        int mid = start+ (end-start)/2;
         if(isPossible(piles, mid, h)){
           ans = mid;
           end=mid-1;
         }else{
           start=mid+1;
         }
      }
      return ans;
     
    }
  private boolean isPossible(int[] piles, int k, int h){
      long required =0;
    for(int n: piles){
      int div = n/k;
      
      required+= div;
      if(n%k!=0)
        required++;
        
    }
   // System.out.println("req "+ required + "k "+ k);
    if(required<=h)
      return true;
    return false;
    
  }
}