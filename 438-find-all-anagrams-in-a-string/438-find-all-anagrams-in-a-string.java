class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans =new ArrayList<>();
        Map<Character,Integer> pmap=new HashMap<>();
        for(char ch : p.toCharArray()){
            pmap.put(ch, pmap.getOrDefault(ch,0)+1);
        }
        
        int start =0;
        int end=0;
        int k=p.length();
        Map<Character,Integer> smap=new HashMap<>();
        while(end<s.length()){
            char ch=s.charAt(end);
            if(pmap.containsKey(ch)){
                smap.put(ch, smap.getOrDefault(ch,0)+1);
            }
            if(end-start+1<k){
                end++;
            }else if(end-start+1==k){
                if(smap.equals(pmap)){
                    ans.add(start);
                }
                if(smap.containsKey(s.charAt(start))){
                    int freq= smap.get(s.charAt(start));
                    if(freq-1==0)
                        smap.remove(s.charAt(start));
                    else
                        smap.put(s.charAt(start), freq-1);
                }
                start++;
                end++;
            }
            
        }
        return ans;
    }
}