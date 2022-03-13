class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0;
        Map<Character,Integer> map=new HashMap<>();
        int l=s.length();
        int ans = Integer.MIN_VALUE;
        while(j<l){
            char ch=s.charAt(j);
            map.put(ch, map.getOrDefault(ch,0)+1);
            if(map.size()==j-i+1){
                //System.out.println(s.substring(i, j+1));
                ans = Math.max(ans, j-i+1);
                
            }else if(map.size()<j-i+1){
                while(map.size()<j-i+1){
                    ch=s.charAt(i);
                    map.put(ch, map.get(ch)-1);
                    if(map.get(ch)==0)
                        map.remove(ch);
                    i++;    
                }
                
            }
            j++;
        }
        return ans==Integer.MIN_VALUE?0:ans;
    }
}