class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
      if(flowerbed == null || flowerbed.length ==0)
        return false;
      int length =flowerbed.length;
      for(int i=0;i<length;i++){
        if(flowerbed[i]==1)
          continue;
        boolean left = false;
        if(i-1<0 || flowerbed[i-1]==0)
          left =true;
        boolean right = false;
        if(i+1>=length || flowerbed[i+1]==0)
          right = true;
        if(left&&right){
          n--;
          flowerbed[i]=1;
          System.out.println(i);
        }
          
      }
      return n<=0 ? true: false;
    }
}