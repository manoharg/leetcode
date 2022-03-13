class Solution {
    public int totalFruit(int[] fruits) {
    // same as longest  substring with atnost k unique charactres 
    // here k=2
     int k=2;
    int i=0,j=0;
        int l=fruits.length;
        Map<Integer,Integer> map = new HashMap<>();
        int ans = Integer.MIN_VALUE;
        while(j<l){
            map.put(fruits[j], map.getOrDefault(fruits[j],0)+1);
            if(map.size()<=k){
                ans=Math.max(ans, j-i+1);
                j++;
                
            }else if(map.size()>k){
                while(map.size()>k){
                   int f = fruits[i];
                    map.put(f, map.get(f)-1);
                    if(map.get(f)==0)
                        map.remove(f);
                    i++;
                }
                j++;
            }
        }
        
        return ans==Integer.MIN_VALUE?0:ans;
    }
}