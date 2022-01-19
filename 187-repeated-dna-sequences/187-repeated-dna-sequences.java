class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0;i<s.length(); i++) {
            int next = Math.min(s.length(), i+10);
            String dna = s.substring(i, next);
            if(!map.containsKey(dna))
                map.put(dna, new ArrayList<>());
            map.get(dna).add(dna);
        }
        
        List<String> ans = new ArrayList<>();
        for(String key : map.keySet()){
            if(map.get(key).size()>1){
                ans.add(key);
            }
        }
        
        return ans;
    }
}