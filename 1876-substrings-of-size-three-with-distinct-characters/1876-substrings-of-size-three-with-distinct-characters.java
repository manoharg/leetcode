class Solution {
    public int countGoodSubstrings(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int k=3;
        int c=0;
        int start=0,end=0;
        while(end<s.length()){
            map.put(s.charAt(end), map.getOrDefault(s.charAt(end),0)+1);
            if(end-start+1<k)
                end++;
            else if(end-start+1==k){
                if(map.size()==k)
                    c++;
                if(map.containsKey(s.charAt(start))){
                    map.put(s.charAt(start), map.getOrDefault(s.charAt(start), 0)-1);
                    if(map.get(s.charAt(start))==0)
                        map.remove(s.charAt(start));
                }
                start++;
                end++;
                
            }
        }
        return c;
    }
}