class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans =new ArrayList<>();
        Map<Character,Integer> pmap=new HashMap<>();
        for(char ch : p.toCharArray()){
            pmap.put(ch, pmap.getOrDefault(ch,0)+1);
        }
        
        int start =0;
        int end=0;
        int ws=p.length();
        int k=pmap.size();
        while(end<s.length()){
            char ch=s.charAt(end);
            if(pmap.containsKey(ch)){
                pmap.put(ch, pmap.get(ch)-1);
                if(pmap.get(ch)==0)
                    k--; // qunatitiy of one char is met
            }
            if(end-start+1<ws){
                end++;
            }else if(end-start+1==ws){
                if(k==0){
                    ans.add(start);
                }
                if(pmap.containsKey(s.charAt(start))){
                    int freq= pmap.get(s.charAt(start));
                    if(freq+1==1)
                        k++;
                    pmap.put(s.charAt(start), freq+1);
                }
                start++;
                end++;
            }
            
        }
        return ans;
    }
}