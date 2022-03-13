class Solution {
    public int characterReplacement(String s, int k) {
        if(s==null)
            return 0;
        if(s.length()==1)
            return 1;
        Map<Character, Integer> map = new HashMap<>();
        int i=0,j=0, l=s.length();
        int ans= Integer.MIN_VALUE;
        int alt= Integer.MIN_VALUE;
        while(j<l){
            char ch=s.charAt(j);
            map.put(ch, map.getOrDefault(ch,0)+1);
            alt= Math.max(alt, getMax(map));
            int ws=j-i+1;
            if(ws-alt<=k){
                ans = Math.max(ans, ws);
            }else if((j-i+1)-alt>k){
                while((j-i+1)-alt>k){
                    ch=s.charAt(i);
                    map.put(ch, map.get(ch)-1);
                    alt=getMax(map);
                    i++;
                }
            }
            j++;
        }
        
        return ans;
    }
    private int getMax(Map<Character, Integer> map){
        int ans = Integer.MIN_VALUE;
        for(Character ch: map.keySet()){
            ans = Math.max(ans, map.get(ch));
        }
        return ans ==Integer.MIN_VALUE?0:ans;
    }
}